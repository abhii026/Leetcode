# Write your MySQL query statement below
select Date_format(trans_date,'%Y-%m') as month,country ,Count(state) as trans_count,
SUM(if(state="approved",1,0)) as approved_count,
SUM(amount) as trans_total_amount,
sum(if(state="approved",amount,0))as approved_total_amount 
from Transactions group by country ,month ;