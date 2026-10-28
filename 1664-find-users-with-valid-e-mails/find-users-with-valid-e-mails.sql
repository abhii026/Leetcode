# Write your MySQL query statement below
select * from Users where mail REGEXP  '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
and mail Like binary '%@leetcode.com' ;