# Write your MySQL query statement below
with moving_av as (
    select
    visited_on,SUM(amount) as total_amount,ROW_NUMBER() Over (order by visited_on ) as rnk
     from Customer group by visited_on  order by visited_on
),
rolling_total as(
    select visited_on,sum(total_amount) Over (order by visited_on 
    Rows Between 6 PRECEDING  and CURRENT ROW) as amount,rnk from moving_av
)select visited_on,amount,Round(amount/7,2) as average_amount  from rolling_total where rnk>=7 order by visited_on;