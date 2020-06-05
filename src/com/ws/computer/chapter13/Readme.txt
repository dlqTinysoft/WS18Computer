
===================上节课内容===============
6.4 Collection集合遍历
定义：Iterator接口是Java集合框架中的一员，主要用于迭代访问（即遍历）Collection中的元素，
              因此Iterator对象也被称为迭代器;
   Iterator遍历集合时，内部采用指针的方式来跟踪集合中的元素。在调用next()方法之前，索引位于第一个元素之前，
              不指向任何元素。
 Iterator使用示列：
6.5 Set接口概述
    Set接口和List接口一样，同样继承自Collection接口。
    Set接口中的元素无序，并且都会以某种规则保证存入的元素不出现重复
    Set的接口有两个重要的实现类，HashSet和TreeSet
    1)HashSet集合
        
    2)TreeSet集合
==================本节课内容=================
6.6 Map接口概述
            定义：
          Map接口是一种双列集合，它的每个元素都包含一个键对象Key和值对象Value，
                       键和值对象之间存在一种对应关系，称为映射。
  
     Map集合特点：
          Map中的映射关系是一对一的，一个键对象Key对应唯一一个值对象Value，其中键对象Key和值对象Value可以是任意数据类型，并且键对象Key不允许重复，
                       这样在访问Map集合中的元素时，只要指定了Key，就能找到对应的Value。
           向Map集合中添加指定键值映射的元素:void put(Object key , Object value)
                       返回指定键所映射的值，如果此映射不包含该键的映射关系，则返null:
          Object get(Object key)
          
    1)HashMap集合
    
    2)TreeMap集合
    
    3)Properties
    
   HashMap和TreeMap的区别
      1)HashMap:适用于在Map中插入、删除和定位元素。
      
      2)HashMap通常比TreeMap快一点（树和哈希表的数据结构使然），
                  建议多使用HashMap,在需要排序的Map时候才用TreeMap。
                  
      3) HashMap的结果是没有排序的，而TreeMap输出的结果是排好序的。
   
   
    
    
    
    
    
    
    
  
     