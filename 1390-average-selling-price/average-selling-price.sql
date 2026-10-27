# Write your MySQL query statement below
select p.product_id,Round(IFNULL(SUM(p.price*u.units)/SUM(u.units),0),2) as average_price
from Prices p left join UnitsSold u
on p.product_id=u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;