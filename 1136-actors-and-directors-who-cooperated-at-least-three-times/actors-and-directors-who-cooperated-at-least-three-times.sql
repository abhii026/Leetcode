# Write your MySQL query statement below
select actor_id,director_id from ActorDirector
group by actor_id,director_id
having  count(director_id)>=3 or count(actor_id)>=3;