Q1.https://leetcode.com/problems/big-countries
# Write your MySQL query statement below
select area,population,name
from world
where area>=3000000
union
select area,population,name
from world
where population>=25000000
  
Q2.https://leetcode.com/problems/swap-salary/
  
# Write your MySQL query statement below
update salary
set sex = (case when sex = 'f' then 'm' else 'f'  end);

Q3.https://leetcode.com/problems/not-boring-movies/description/
# Write your MySQL query statement below

select * from Cinema
 where id % 2 = 1 and description != 'boring'
 order by rating desc
  
Q4.https://leetcode.com/problems/duplicate-emails/description/
  
SELECT DISTINCT P1.Email FROM Person P1,Person P2 

WHERE P1.id <> P2.id AND P1.Email=P2.Email

Q5.https://leetcode.com/problems/combine-two-tables/submissions/

# Write your MySQL query statement below
SELECT P.firstName, P.lastName, A.city, A.state
FROM Person P LEFT JOIN Address A
on P.personId = A.personId

Q6.https://leetcode.com/problems/employees-earning-more-than-their-managers/description/
SELECT EMP.name AS Employee FROM Employee EMP,Employee MGR
WHERE EMP.managerId=MGR.id AND EMP.salary>MGR.salary

Q7.https://leetcode.com/problems/customers-who-never-order
# Write your MySQL query statement below
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);
Q8.https://leetcode.com/problems/delete-duplicate-emails/submissions/1157309781/
delete p2 from Person p1, Person p2
where p1.Email = p2.Email and p2.id > p1.id;
Q9.https://leetcode.com/problems/rising-temperature/submissions/1157312305/
# Write your MySQL query statement below
SELECT w2.id from Weather w1 JOIN Weather w2
ON w2.temperature > w1.temperature AND
datediff(w2.recordDate,w1.recordDate) = 1;

Q10.https://leetcode.com/problems/classes-more-than-5-students/description/
# Write your MySQL query statement below
select class from Courses group by class having count(*) >=5;

Q11. https://leetcode.com/problems/second-highest-salary/
# Write your MySQL query statement below
select ifnull((select distinct salary 
              from Employee order by 
              salary desc limit 1
              offset 1),null)
              as SecondHighestSalary;
Q12.https://leetcode.com/problems/second-highest-salary/submissions/1157318566/
# Write your MySQL query statement below
SELECT  MAX(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY <>(SELECT MAX(SALARY) FROM EMPLOYEE);

Q13.https://leetcode.com/problems/classes-more-than-5-students/description/
# Write your MySQL query statement below
select class from Courses group by class having count(*) >=5;



  
