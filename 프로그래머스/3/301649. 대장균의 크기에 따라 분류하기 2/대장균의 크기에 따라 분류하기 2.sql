-- 코드를 작성해주세요

WITH temp AS (
    SELECT ID, SIZE_OF_COLONY,
    PERCENT_RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) AS rank_value
    FROM ECOLI_DATA
    )
    
select ID,
CASE 
    WHEN rank_value <= 0.25 THEN 'CRITICAL'
    WHEN rank_value <= 0.5 THEN 'HIGH'
    WHEN rank_value <= 0.75 THEN 'MEDIUM'
    WHEN rank_value <= 1.0 THEN 'LOW'
END AS COLONY_NAME
FROM temp
ORDER BY ID ASC;
