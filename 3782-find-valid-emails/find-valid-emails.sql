# Write your MySQL query statement below
select
    user_id,
    email
from Users
where email regexp '^[A-Za-z0-9_]+@[A-Za-z]+\\.com' and email like '%.com'
order by user_id asc;