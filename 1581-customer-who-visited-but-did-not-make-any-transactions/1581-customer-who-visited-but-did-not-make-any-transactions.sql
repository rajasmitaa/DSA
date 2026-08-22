# Write your MySQL query statement below
select a.customer_id, count(a.visit_id) AS count_no_trans from Visits a
LEFT JOIN Transactions t 
ON a.visit_id = t.visit_id  
WHERE t.amount IS NULL 
GROUP BY a.customer_id; 