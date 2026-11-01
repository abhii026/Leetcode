# Write your MySQL query statement below
with top2 as(
    select d.name  as Department,e.name  as Employee,e.salary as Salary, DENSE_RANK() Over (
        Partition by d.name order by e.salary desc
    ) as rnk
    from Employee e join Department d on e.departmentId =d.id 
)
select Department,Employee,Salary
from top2 where rnk <=3; 