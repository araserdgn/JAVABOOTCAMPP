--Select
-- AnsII
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers -- kolonların ismini değiştrdk
													-- arakda gizli liste olusturuyo
Select * from Customers where City = 'Berlin' -- Customerden sadece sehri BERLİN olanı getir demek

--Case İnsentivite yani HER YAZI SEK. ile yazılır
Select * from Products where CategoryID=1 or CategoryID=3  -- * burda kolonu temsil eder

-- products daki bütün seyleri sırala demek

Select * from Products where CategoryID=1 and UnitPrice>10

Select * from Products order by UnitPrice desc -- ORDER BY sırala demek
											-- asc Artan desc Düşen
Select * from Products where CategoryID=1 order by UnitPrice asc

Select count(*) from Products -- butun PROD. kaç kateg. var onu say demek

Select count(*) from Products where CategoryID=2 -- PROD. ADETİNİ VER CATEG. 2 OLAN SAYISI

Select categoryID, count(*) from products group by CategoryID -- select yanı group by onundeki isimden olmalı
-- 1 num. kategoryde 12 ürün var görüyoruz calıstırınca

Select categoryID, count(*) from products where UnitPrice>20
group by CategoryID having count(*) <10
-- sayısı 10 adetten kucuk olan ve unitleri 20 den buyuk olanları listele demek

Select Products.ProductID, Products.ProductName,Categories.CategoryID 
from Products inner join Categories -- pro ve cate bir araya getir demek, eşleşmeyenleri getirmz
on Products.CategoryID= Categories.CategoryID -- ON şartında demek
where Products.UnitPrice>10

--DTO Data Transformation Object

Select * from Products p left  join [Order Details] od -- solda olup sgda olmayanları getir
on p.ProductID= od.ProductID

Select * from Customers c left join Orders o -- solda olup sagda olmayan
on c.CustomerID=o.CustomerID -- şart kısmı
where o.CustomerID is null -- ID olmayan yani satın alım yapmayan

Select * from Orders o  right join  Customers c -- sağda olup solda olmayan
on c.CustomerID=o.CustomerID -- şart kısmı
where o.CustomerID is null -- ID olmayan yani satın alım yapmayan

Select * from Products p inner join [Order Details] od
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID






											

