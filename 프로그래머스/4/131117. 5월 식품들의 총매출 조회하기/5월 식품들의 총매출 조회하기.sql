SELECT p.PRODUCT_ID, p.PRODUCT_NAME, SUM(o.AMOUNT * p.PRICE) AS TOTAL_SALES
FROM FOOD_PRODUCT p
INNER JOIN FOOD_ORDER o ON o.PRODUCT_ID = p.PRODUCT_ID
WHERE o.PRODUCE_DATE LIKE '2022-05-%'
GROUP BY p.PRODUCT_ID, p.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, p.PRODUCT_ID ASC;