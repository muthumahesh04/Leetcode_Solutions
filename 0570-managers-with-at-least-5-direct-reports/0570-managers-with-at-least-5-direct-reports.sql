# Write your MySQL query statement below


-- | id  | name  | department | managerId |
-- | --- | ----- | ---------- | --------- |
-- | 101 | John  | A          | null      |
-- | 102 | Dan   | A          | 101       |
-- | 103 | James | A          | 101       |
-- | 104 | Amy   | A          | 101       |
-- | 105 | Anne  | A          | 101       |
-- | 106 | Ron   | B          | 101       |
-- ------------------------------------------------------------------------------------------
select e1.name
from Employee e1
join Employee e2
on e1.id=e2.managerId
group by e1.id
having count(e1.id)>=5; 
-- | id  | name | department | managerId | id  | name  | department | managerId |
-- | --- | ---- | ---------- | --------- | --- | ----- | ---------- | --------- |
-- | 101 | John | A          | null      | 102 | Dan   | A          | 101       |
-- | 101 | John | A          | null      | 103 | James | A          | 101       |
-- | 101 | John | A          | null      | 104 | Amy   | A          | 101       |
-- | 101 | John | A          | null      | 105 | Anne  | A          | 101       |
-- | 101 | John | A          | null      | 106 | Ron   | B          | 101       |
-- -----------------------------------------------------------------------------------------
-- select e2.name
-- from Employee e1
-- inner join Employee e2
-- on e1.managerId=e2.id
-- group by e2.id
-- having count(e2.id)>=5;
-- | id  | name  | department | managerId | id  | name | department | managerId |
-- | --- | ----- | ---------- | --------- | --- | ---- | ---------- | --------- |
-- | 106 | Ron   | B          | 101       | 101 | John | A          | null      |
-- | 105 | Anne  | A          | 101       | 101 | John | A          | null      |
-- | 104 | Amy   | A          | 101       | 101 | John | A          | null      |
-- | 103 | James | A          | 101       | 101 | John | A          | null      |
-- | 102 | Dan   | A          | 101       | 101 | John | A          | null      |