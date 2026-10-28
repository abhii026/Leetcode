# Write your MySQL query statement below

select p.product_name,SUM(o.unit) as unit from Products p  join Orders o 
on p.product_id=o.product_id where MONTH(order_date)=2 and Year(order_date)=2020
group by product_name having sum(unit)>=100;