-- 코드를 작성해주세요

select ITEM_INFO.ITEM_ID, ITEM_INFO.ITEM_NAME
from ITEM_INFO
inner join ITEM_TREE
on ITEM_INFO.ITEM_ID = ITEM_TREE.ITEM_ID	
where ITEM_TREE.PARENT_ITEM_ID is null
order by ITEM_ID asc; 
