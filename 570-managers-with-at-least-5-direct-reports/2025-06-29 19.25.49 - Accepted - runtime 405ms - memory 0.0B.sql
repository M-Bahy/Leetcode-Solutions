# Write your MySQL query statement below

select e2.name
from Employee e2
where e2.id in (
                select e1.managerId
                from Employee e1
                group by e1.managerId
                having count(*) >= 5
                )
