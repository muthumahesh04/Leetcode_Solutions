# Write your MySQL query statement below

SELECT  Visits.customer_id,
        COUNT(*) AS count_no_trans
from Visits
LEFT JOIN Transactions
ON visits.visit_id=transactions.visit_id
group by visits.customer_id;