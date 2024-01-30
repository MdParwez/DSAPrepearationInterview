#SQL - https://leetcode.com/problems/managers-with-at-least-5-direct-reports/description/?envType=featured-list&envId=leetcode-curated-sql-70?envType=featured-list&envId=leetcode-curated-sql-70
select e1.name
from employee e1
inner join employee e2
on e1.id =  e2.managerId
group by e2.managerId
having count(e2.managerId) >= 5

  /*
select m.name 
from employee as e
inner join employee as m
on e.managerId = m.id
group by e.managerId
having count(e.id)>=5
*/
