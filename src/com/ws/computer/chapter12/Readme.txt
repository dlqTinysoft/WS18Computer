==================上节课回顾===============
6.1 集合的概述
         1.Java中的集合就像一个容器，专门用来存储Java对象；
	     2. 集合对象可以是任意的数据类型，并且长度可变
 
 6.2 Collection接口的主要方法
              
 6.3 1)List接口概述
      ArrayList:动态数组
      LinkedList：双向链表
===================本节课内容===============
6.4 Collection集合遍历
定义：Iterator接口是Java集合框架中的一员，主要用于迭代访问（即遍历）Collection中的元素，
              因此Iterator对象也被称为迭代器;
   Iterator遍历集合时，内部采用指针的方式来跟踪集合中的元素。在调用next()方法之前，索引位于第一个元素之前，
              不指向任何元素。
 Iterator使用示列：
6.5 Set接口概述
    Set接口和List接口一样，同样继承自Collection接口。
    Set接口中的元素无序，并且都会以某种规则保证存入的元素不出现重复
    Set的接口有两个重要的实现类，HashSset和TreeSet
    1)HashSet集合
        
    2)TreeSet集合
==================下节课内容=================
6.6 Map接口概述
HashMap
TreeMap
Properties
     