CREATE TABLE USER
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(20),
  birthday DATE,
  money DOUBLE
);


======================================================

��ҳ���裺

1. ����һ��bean�� Page 

2. ��dao�����2��������
	a. int getRowCount() ��ȡ������
	b. List<User> find(int , int) ��ȡ��ҳ����
	
3. ��ҵ������һ��������
	a. Page findPageData(int p, int size);
