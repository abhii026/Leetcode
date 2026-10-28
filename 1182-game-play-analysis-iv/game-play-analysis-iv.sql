# Write your MySQL query statement below

SELECT ROUND(
    COUNT(DISTINCT CASE
        WHEN DATEDIFF(a.event_date, (
            SELECT MIN(b.event_date)
            FROM Activity b
            WHERE b.player_id = a.player_id
        )) = 1
        THEN a.player_id
    END) /
    (SELECT COUNT(DISTINCT player_id) FROM Activity),
    2
) AS fraction
FROM Activity a;