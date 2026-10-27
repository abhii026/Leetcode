# Write your MySQL query statement below
select c.customer_id from Customer c
inner join Product p on
c.product_key =p.product_key
GROUP BY customer_id
HAVING COUNT(DISTINCT p.product_key) = (
    SELECT COUNT(*) 
    FROM Product
); ;
