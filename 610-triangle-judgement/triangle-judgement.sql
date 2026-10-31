# Write your MySQL query statement below
select x,y,z, 
case
when x+y>z and x+z>y and y+z>x then "Yes"
else "No" 
END as  triangle  from Triangle;