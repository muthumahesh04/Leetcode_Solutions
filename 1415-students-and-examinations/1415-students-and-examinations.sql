# Write your MySQL query statement below
select s.student_id,s.student_name,sub.subject_name,count(e.subject_name) as attended_exams #this e.subject_name avoids the null.
from Students s cross join Subjects sub
left join Examinations e #we are left joing with the cross joined table.
on s.student_id=e.student_id and sub.subject_name=e.subject_name
group by s.student_id,s.student_name,sub.subject_name 
--  1          | Alice        | Math         
-- | 1          | Alice        | Math         
-- | 1          | Alice        | Math we are grouping like  1          | Alice        | Math  so 
order by s.student_id,sub.subject_name; #in question they said