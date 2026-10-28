# Write your MySQL query statement below
select sell_date,count(Distinct product) as num_sold,
GROUP_CONCAT(Distinct product separator ',') as products
from Activities group by sell_date;