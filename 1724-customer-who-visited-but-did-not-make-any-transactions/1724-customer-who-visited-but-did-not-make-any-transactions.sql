# Write your MySQL query statement below

SELECT  Visits.customer_id,COUNT(*) AS count_no_trans
from Visits
LEFT JOIN Transactions
ON visits.visit_id=transactions.visit_id
WHERE transactions.transaction_id IS NULL
group by visits.customer_id;