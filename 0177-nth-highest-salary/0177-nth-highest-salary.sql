CREATE FUNCTION 
getNthHighestSalary(n INT) 
RETURNS INT
BEGIN
declare r int;
set r = n - 1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct
            Salary
        from
            Employee
        order by
            Salary desc
        limit
            r, 1
  );
END