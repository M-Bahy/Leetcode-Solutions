# Write your MySQL query statement below
-- select round(    count(   IF ( d.order_date  = d.customer_pref_delivery_date ,1,Null)             )   /COUNT(DISTINCT customer_id)     ,2) as immediate_percentage
-- from Delivery d
select round(  ( count(      IF ( tmp.order_date  = tmp.customer_pref_delivery_date ,1,Null)         )     /  count(*)  ) *100  ,2)  as immediate_percentage
from (
        SELECT *
        FROM Delivery d
        WHERE order_date = (
            SELECT MIN(order_date)
            FROM Delivery
            WHERE customer_id = d.customer_id
        )
        group BY customer_id
    ) as tmp
