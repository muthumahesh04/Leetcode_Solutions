-- # Write your MySQL query statement below
-- with processing_time_per_machine AS 
-- (
--     select a.machine_id,round(AVG(sum(b.timestamp-a.timestamp)),3) as processing_time
--     from Activity a inner join Activity b
--     on 
--        a.process_id=b.process_id and
--        a.activity_type='start' and
--        b.activity_type='end'
-- )
-- select machine_id,processing_time
-- from processing_time_per_machine
-- group by machine_id;
SELECT b.machine_id, 
       ROUND(AVG(b.timestamp - a.timestamp), 3) AS processing_time
FROM Activity a JOIN Activity b 
ON a.machine_id = b.machine_id AND 
   a.process_id = b.process_id AND 
   a.activity_type = 'start'   AND 
   b.activity_type = 'end'
GROUP BY a.machine_id;
