# Write your MySQL query statement below
with friends as (
    SELECT requester_id AS id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM RequestAccepted
) select id as id,count(*) as num from friends group by id order by num desc limit 1;