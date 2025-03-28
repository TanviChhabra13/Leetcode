WITH SalaryRank AS (
    SELECT salary, 
           DENSE_RANK() OVER (ORDER BY salary DESC) AS r
    FROM employee
)
SELECT max(salary) AS SecondHighestSalary 
FROM SalaryRank 
WHERE r = 2;
