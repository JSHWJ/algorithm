
SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;

-- 두 개 이상의 기준을 사용하여 정렬하려면, ORDER BY 절에 여러 컬럼을 지정하면 됩니다.