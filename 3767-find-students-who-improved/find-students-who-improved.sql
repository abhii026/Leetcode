# Write your MySQL query statement below
SELECT
    first.student_id,
    first.subject,
    first.score AS first_score,
    latest.score AS latest_score
FROM (
    SELECT
        student_id,
        subject,
        score,
        exam_date,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date ASC
        ) AS asc_rn
    FROM Scores
) AS first
JOIN (
    SELECT
        student_id,
        subject,
        score,
        exam_date,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date DESC
        ) AS desc_rn
    FROM Scores
) AS latest
    ON first.student_id = latest.student_id
    AND first.subject = latest.subject
WHERE first.asc_rn = 1
    AND latest.desc_rn = 1
    AND first.score < latest.score;