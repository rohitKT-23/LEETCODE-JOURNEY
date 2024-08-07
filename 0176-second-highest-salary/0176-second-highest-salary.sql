# Write your MySQL query statement below
select
    max(Salary) 
    as SecondHighestSalary 
from
    Employee
where
    Salary
not in(
    select max(Salary) 
    from Employee
)