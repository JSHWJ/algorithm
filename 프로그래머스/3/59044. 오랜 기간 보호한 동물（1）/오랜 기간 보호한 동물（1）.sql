SELECT i.NAME, i.DATETIME
FROM ANIMAL_INS i
WHERE i.ANIMAL_ID NOT IN (SELECT ANIMAL_ID 
                         FROM ANIMAL_OUTS)
ORDER BY i.DATETIME ASC
LIMIT 3;