SELECT ROUND((SUM(COALESCE(LENGTH, 10)) / COUNT(ID)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;