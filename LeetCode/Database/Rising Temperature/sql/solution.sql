# Write your MySQL query statement below
select t.id from weather y join weather t on
datediff(t.recordDate,y.recordDate)=1
and t.temperature > y.temperature;