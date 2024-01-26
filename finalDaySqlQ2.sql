# https://leetcode.com/problems/customers-who-bought-all-products/description/?envType=featured-list&envId=leetcode-curated-sql-70?envType=featured-list&envId=leetcode-curated-sql-70
# Write your MySQL query statement below

SELECT c.customer_id
FROM Customer c
group by customer_id 
HAVING count(distinct c.product_key) = (select count(distinct p.product_key) FROM Product p);
