# Write your MySQL query statement below
select "Low Salary" as category, count(case when income<20000 then 1 end) as accounts_count 
from Accounts
union all
select "Average Salary",count(case when income between 20000 and 50000 then 1 end)
from Accounts
union all
select "High Salary",count(case when income>50000 then 1 end) 
from Accounts;
