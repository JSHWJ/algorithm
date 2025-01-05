SELECT FLOOR(PRICE / 10000) * 10000 AS PRICE_GROUP, COUNT(PRODUCT_CODE) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP ASC;

-- 0부터 시작하면 위와 같이 하면 되고
-- 1부터 시작하면 시작값에 -1 해줘야한다. 
-- 그리고 10000으로 나눈다는 건 0 ~ 9999 까지를 뜻한다. 
-- 만약에 10000까지 포함하고 싶으면 시작값에 -1 해주면 된다.