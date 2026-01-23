# Write your MySQL query statement below
select product_name,year,price
from Sales e 
LEFT JOIN Product o ON e.product_id = o.product_id;