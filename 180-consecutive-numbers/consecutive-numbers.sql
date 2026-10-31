# Write your MySQL query statement below
with Consecutive as (
    select num,
    Lead(num,1) Over (order by id) as next,
    Lead(num,2) Over (order by id ) as next_next
    from Logs
) select Distinct num as ConsecutiveNums  from Consecutive
where num=next and num=next_next;