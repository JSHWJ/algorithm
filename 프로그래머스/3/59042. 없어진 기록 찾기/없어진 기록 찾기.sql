SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_INS i
RIGHT JOIN ANIMAL_OUTS o ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.INTAKE_CONDITION IS NULL
ORDER BY o.ANIMAL_ID ASC;