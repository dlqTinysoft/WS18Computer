
======================上节课回顾===================
第五章： java常用类
 5.1 String类
 5.2 Scanner类
 5.3 Math和Random类
 5.4 日期类
 5.5 StringBuffer类
 5.6 包装类(重点)
 
 ====================本节课内容==============
 第六章：集合
 6.1 集合的概述
         1.Java中的集合就像一个容器，专门用来存储Java对象；
	     2. 集合对象可以是任意的数据类型，并且长度可变
 
 6.2 Collection接口的主要方法
                 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
                 * `public void clear()` :清空集合中所有的元素。
                 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
                 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
                 * `public boolean isEmpty()`: 判断当前集合是否为空。
                 * `public int size()`: 返回集合中元素的个数。
                 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 6.3 1)List接口概述
    	1.List集合中允许出现重复元素，所有的元素是以一种线性方式进行存储的，
                       在程序中可以通过索引（类似于数组中的元素角标）来访问集合中的元素；
        2.List集合中允许出现重复元素，所有的元素是以一种线性方式进行存储的，
                       在程序中可以通过索引（类似于数组中的元素角标）来访问集合中的元素
        3. `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
           `public E get(int index)`:返回集合中指定位置的元素。
           `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
           `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
     2)ArrayList的常见API及原理
        1.`java.util.ArrayList`集合数据存储的结构是数组结构。
        2.元素增删慢，查找快，由于日常开发中使用最多的功能为查询数据、遍历数据，
                    所以`ArrayList`是最常用的集合。
     3)LinkedList的常见API及原理
         java.util.LinkedList`集合数据存储的结构是双向链表结构。方便元素添加、删除的集合。
        `java.util.LinkedList`集合数据存储的结构是链表结构。方便元素添加、删除的集合
         * `public void addFirst(E e)`:将指定元素插入此列表的开头。
         * `public void addLast(E e)`:将指定元素添加到此列表的结尾。
         * `public E getFirst()`:返回此列表的第一个元素。
         * `public E getLast()`:返回此列表的最后一个元素。
         * `public E removeFirst()`:移除并返回此列表的第一个元素。
         * `public E removeLast()`:移除并返回此列表的最后一个元素。
         * `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
         * `public void push(E e)`:将元素推入此列表所表示的堆栈。
         * `public boolean isEmpty()`：如果列表不包含元素，则返回true。
总结：
    ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构
	对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针
	对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。 
   
===================下节课内容===============
6.4 Iterator迭代器遍历集合

6.5 1)Set接口概述
    
    2)HashSet集合
    
    3)TreeSet集合
     
     