# Write your MySQL query statement below

select EU.unique_id,E.name
from EmployeeUNI as EU right JOIN 
Employees as E on
EU.id=E.id;
