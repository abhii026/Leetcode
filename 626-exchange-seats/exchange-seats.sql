# Write your MySQL query stateme    

with exchange as (
    select id,
    case 
        when mod(id,2)=1 then COALESCE(Lead(student) Over(order by id) ,student)
        else Lag(student) over(order by id)
    END as student from Seat
) select * from exchange;