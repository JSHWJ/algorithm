SELECT p.PRODUCT_CODE, SUM(o.SALES_AMOUNT * p.PRICE) AS SALES
FROM PRODUCT p
JOIN OFFLINE_SALE o ON o.PRODUCT_ID = p.PRODUCT_ID
GROUP BY o.PRODUCT_ID
ORDER BY SALES DESC, p.PRODUCT_CODE ASC;