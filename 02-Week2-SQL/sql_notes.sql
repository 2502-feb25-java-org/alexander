--- comment
select '1'as 'col1'
---'2'as 'col2'

sp_help 'HumanResources.Department'

select [DepartmentID],[Name],[GroupName],[ModifiedDate] from HumanResources.Department

create table #tempTable(
	[dept id] int not null)

	insert into #tempTable
	values(1)

	select [dept id] from #tempTable

	sp_help 'Production.Product'

select ProductID as ID,Name,Color,'Batch1' as Batch,StandardCost as cost,Style from Production.Product

select SCHEMA_NAME(SCHEMA_ID) as 'schema', name
	from sys.tables
	order by 'schema'

sp_help 'sales.vStoreWithAddress' -- alt + F1
select * from sales.vStoreWithAddresses

select BusinessEntityID,Name,AddressLine1+ ' '+AddressLine2,City+' '+City+' '+StateProvinceName+' '+PostalCode+
' '+CountryRegionName as Address from sales.vStoreWithAddresses

sp_help 'Sales.SalesOrderDetail'

select sod.ProductID, sod.UnitPrice as p, sod.OrderQty as q, (sod.UnitPrice*sod.OrderQty) as Total
from Sales.SalesOrderDetail as sod

-- local variables
declare @name varchar(max);
set @name = 'Pushpinder Kaur';
select @name as Name;

declare @table table(
	id int not null,
	name varchar(max) null)

insert into @table
values(1, 'Pushpinder Kaur')
--go
select id, name from @table -- to run this it should run in a batch

select JobTitle,BusinessEntityID,HireDate from [HumanResources].[Employee]
where HireDate < '2009-05-14' and HireDate > '2009-01-12' or JobTitle='Research and Development Manager'

select JobTitle,BusinessEntityID, HireDate
from HumanResources.Employee
where not JobTitle = 'Research and Development Manager' -- <>

select JobTitle
from HumanResources.Employee
order by JobTitle

select distinct JobTitle
from HumanResources.Employee
	
select AddressLine1,AddressLine2,City,StateProvinceID,PostalCode from [Person].[Address]
select count(AddressLine2) from Person.Address
select distinct AddressLine2 from Person.Address
select count(distinct AddressLine2) from Person.Address
select count(*) from Person.Address

select top(1) Rate from [HumanResources].[EmployeePayHistory]

select top(1) * from [HumanResources].[EmployeePayHistory]
where Rate !=
(select top(1) [Rate] from [HumanResources].[EmployeePayHistory]
order by Rate desc)
order by rate desc

select Rate from [HumanResources].[EmployeePayHistory]
order by rate


select FirstName+' '+LastName as Name, Department, StartDate from [HumanResources].[vEmployeeDepartmentHistory]
where StartDate='2007-12-05'
order by StartDate

select top(2) with ties FirstName+' '+LastName as Name, Department, StartDate from [HumanResources].[vEmployeeDepartmentHistory]
where StartDate='2009-01-02'
order by StartDate

select top(2) with ties FirstName+' '+LastName as Name, Department, StartDate from [HumanResources].[vEmployeeDepartmentHistory]
where StartDate='2009-01-02'
order by StartDate

--GROUP BY CLAUSE

select ProductID, OrderQty
from Sales.SalesOrderDetail
where ProductID=707

select ProductID, specialofferid, OrderQty
from Sales.SalesOrderDetail
where ProductID=779

select ProductID,sum(OrderQty) as totalQty from [Sales].[SalesOrderDetail]
group by ProductID
order by ProductID

select ProductID, SpecialOfferID, sum(OrderQty) as totalByOrderQty
from Sales.SalesOrderDetail as sod
---where sum(OrderQty) > 100
group by SpecialOfferID, ProductID
having sum(OrderQty) > 100
order by SpecialOfferID, ProductID

select * from [Production].[Product] -- 504 row
select * from [Sales].[SalesOrderDetail] -- 121317 row

select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
inner join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID -- 121317 row

select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
left join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID -- 121555 row
order by sod.SalesOrderDetailID

select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
left join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID --238 rows
where sod.ProductID is null
order by sod.SalesOrderDetailID

select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
left join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID 
where sod.OrderQty > 2
order by sod.SalesOrderDetailID

select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
left join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID 
where sod.OrderQty > 2
order by sod.SalesOrderDetailID

-- predicate placement is ON which takes ?????????
select p.ProductID,sod.SalesOrderDetailID,sod.CarrierTrackingNumber,sod.OrderQty
from Production.Product as p
left join Sales.SalesOrderDetail sod
on p.ProductID=sod.ProductID 
where sod.OrderQty > 2 and
	sod is null
order by sod.SalesOrderDetailID

---cross join -> multiplications of tables
select count(*) from [HumanResources].[Employee]
select count(*) from [HumanResources].[EmployeeDepartmentHistory]

select e.BusinessEntityID, edh.StartDate, e.JobTitle
from [HumanResources].[Employee] as e
cross join [HumanResources].[EmployeeDepartmentHistory] as edh -- 85840 rows

select (290*296) as Math

--self join
select * from [HumanResources].[Employee]

alter table [HumanResources].[Employee]
add ManagerID int null
go

update [HumanResources].[Employee]
set ManagerID = 1
where BusinessEntityID <> 1

select e.BusinessEntityID, m.JobTitle, e.ManagerID, e.HireDate
from [HumanResources].[Employee] as e
left outer join [HumanResources].[Employee] as m
on e.ManagerID = m.ManagerID

--clean up
alter table [HumanResources].[Employee]
drop column managerID

--union and union all
select productid, unitprice from [Sales].[SalesOrderDetail] order by ProductID
select productid, unitprice from [Sales].[SalesOrderDetail]

select productid, unitprice from [Sales].[SalesOrderDetail] as s1
where s1.ProductID between 1 and 799
union
select s2.productid, s2.unitprice from [Sales].[SalesOrderDetail] as s2
where s2.ProductID between 800 and 1000

select productid, unitprice from [Sales].[SalesOrderDetail] as s1
where s1.ProductID between 1 and 799
union all
select s2.productid, s2.unitprice from [Sales].[SalesOrderDetail] as s2
where s2.ProductID between 800 and 1000
