# Write your MySQL query statement below
select date_id,make_name,count(Distinct lead_id ) as unique_leads,
count(Distinct partner_id  ) as unique_partners
from DailySales
group by date_id,make_name;