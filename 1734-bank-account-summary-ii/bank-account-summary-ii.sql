# Write your MySQL query statement below
select u.name , sum(amount) as balance from 
Users u inner join Transactions  t
on u.account=t.account 
group by u.account
having balance>10000;