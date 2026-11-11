# Write your MySQL query statement below
select user_id as buyer_id ,
u.join_date
,count(o.order_date ) as orders_in_2019 
from Users u left join 
Orders o on u.user_id=o.buyer_id and  Year(o.order_date)='2019'
group by u.user_id ;
 