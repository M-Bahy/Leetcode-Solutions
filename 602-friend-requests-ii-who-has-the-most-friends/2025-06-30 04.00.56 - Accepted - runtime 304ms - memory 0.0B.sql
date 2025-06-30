# Write your MySQL query statement below

select t.friends as id,count(*) as num
from (SELECT requester_id AS friends FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS friends FROM RequestAccepted) t
group by friends
order by num desc
limit 1
