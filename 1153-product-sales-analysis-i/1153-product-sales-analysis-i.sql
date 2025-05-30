# Write your MySQL query statement below

select P.product_name,S.year,S.price
from Product as P,Sales as S
where P.product_id=S.product_id