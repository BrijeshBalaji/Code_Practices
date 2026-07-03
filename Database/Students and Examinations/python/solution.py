on s.student_id = e.student_id
left join examinations e
and
su.subject_name = e.subject_name
group by s.student_id,s.student_name,su.subject_name
order by s.student_id,su.subject_name;
Students s cross join Subjects su
select s.student_id,s.student_name,su.subject_name,count(e.subject_name) as attended_exams from 
# Write your MySQL query statement below
