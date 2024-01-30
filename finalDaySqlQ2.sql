# https://leetcode.com/problems/customers-who-bought-all-products/description/?envType=featured-list&envId=leetcode-curated-sql-70?envType=featured-list&envId=leetcode-curated-sql-70
# Write your MySQL query statement below

SELECT customer_id
FROM Customer 
group by customer_id 
HAVING count(distinct product_key) = (select count(distinct product_key) FROM Product );
