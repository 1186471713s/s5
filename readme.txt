CREATE TABLE USER
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(20),
  birthday DATE,
  money DOUBLE
);


======================================================

分页步骤：

1. 创建一个bean： Page 

2. 在dao层添加2个方法：
	a. int getRowCount() 获取总行数
	b. List<User> find(int , int) 获取分页数据
	
3. 在业务层添加一个方法：
	a. Page findPageData(int p, int size);
