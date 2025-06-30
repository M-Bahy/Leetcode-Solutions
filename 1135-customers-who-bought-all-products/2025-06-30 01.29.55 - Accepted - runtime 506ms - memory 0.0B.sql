# Write your MySQL query statement below
select c.customer_id
from Customer c  
group by c.customer_id
having count( DISTINCT c.product_key) = (select count(*) from Product)