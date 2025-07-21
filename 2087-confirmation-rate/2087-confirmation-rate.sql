# Write your MySQL query statement below
#why i taken this column is, we have to count total no of requests at the same time we have to group.so 
with total_and_confirmed as (
select s.user_id,
       count(s.user_id) as total_requests,
       sum(case when c.action='confirmed' then 1 else 0 end) as confirmed_requests
from 
       Signups s
left join 
      Confirmations c
on 
      s.user_id=c.user_id
group by s.user_id
)

select user_id,ifnull(round(confirmed_requests/total_requests,2),0) as confirmation_rate
from total_and_confirmed; 
