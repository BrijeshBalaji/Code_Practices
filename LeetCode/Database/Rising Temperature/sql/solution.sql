select w.id from weather w join weather t on datediff(w.recordDate,t.recordDate)=1 and w.temperature > t.temperature;
