SELECT queryword, COUNT(*) AS count
FROM userquerylog WHERE querypage = 1 
GROUP BY queryword ORDER BY COUNT(*) DESC