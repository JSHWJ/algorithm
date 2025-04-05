SELECT u.USER_ID, u.NICKNAME, CONCAT(u.CITY," ", u.STREET_ADDRESS1," ", u.STREET_ADDRESS2) AS '전체주소', 
CONCAT(
    SUBSTRING(u.TLNO, 1, 3), '-',
    SUBSTRING(u.TLNO, 4, 4), '-',
    SUBSTRING(u.TLNO, 8)) AS 'TLNO'
FROM USED_GOODS_BOARD b
INNER JOIN USED_GOODS_USER u ON u.USER_ID = b.WRITER_ID
GROUP BY u.USER_ID
HAVING COUNT(u.USER_ID) >= 3
ORDER BY u.USER_ID DESC;
