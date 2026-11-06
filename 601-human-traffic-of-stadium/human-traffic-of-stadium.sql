# Write your MySQL query statement below
WITH cte AS (
    SELECT
        *,
        id - ROW_NUMBER() OVER(ORDER BY id) AS grp
    FROM Stadium
    WHERE people >= 100
),
temp AS (
    SELECT grp
    FROM cte
    GROUP BY grp
    HAVING COUNT(*) >= 3
)
SELECT
    c.id,
    c.visit_date,
    c.people
FROM cte c
JOIN temp t
    ON c.grp = t.grp
ORDER BY c.visit_date;