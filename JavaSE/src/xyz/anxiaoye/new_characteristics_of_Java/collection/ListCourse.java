package xyz.anxiaoye.new_characteristics_of_Java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListCourse 备选课程类
 * Create by zhuye on 2020/2/22.
 */
public class ListCourse {
    //用于存放备选课程的List
    public List coursesToSelect;

    public ListCourse() {
        //创建coursesToSelect对象的同时实例化
        this.coursesToSelect=new ArrayList();//ArrayList是List接口的一共实现类
    }

    /**
     * 用于往coursesToSelect中添加备选课程
     */
    public void addCourse(){
        //创建一个课程对象，通过add方法，添加到List中
        Course c1=new Course( 1,"数据结构与算法" );
        coursesToSelect.add( c1 );
        Course temp= (Course) coursesToSelect.get( 0 );//对象存入集合后成为Object类型，取出时需要转换类型
        System.out.println("添加的课程："+temp.getId()+":"+temp.getName());

        Course cl2=new Course( 2,"C语言" );
        //指定添加到最前面
        coursesToSelect.add( 0,cl2 );//如果下标超出界限会报下标越界错
        Course temp2= (Course) coursesToSelect.get( 0 );
        System.out.println("添加的课程："+temp2.getId()+":"+temp2.getName());

        /**
         * 添加数据方法3，通过数组添加
         * 将数组转换为List集合类型
         */
        Course[] courses={new Course( 3,"离散数学" ),new Course( 4,"汇编语言" )};
        coursesToSelect.addAll( Arrays.asList( courses ) );//将数组转换为List集合类型
        Course temp3= (Course) coursesToSelect.get( 2 );
        Course temp4= (Course) coursesToSelect.get( 3 );
        System.out.println("添加的两门课程："+temp3.getId()+temp3.getName()+"\t"+
                temp4.getId()+temp4.getName());

        Course[] courses1={new Course( 5,"计算机组成原理" ),new Course( 6,"计算机网络" )};
        coursesToSelect.addAll( 2,Arrays.asList( courses1 ) );//指定添加到第二个位置后面
        Course temp5= (Course) coursesToSelect.get( 2 );
        Course temp6= (Course) coursesToSelect.get( 3 );
        System.out.println("添加的两门课程："+temp5.getId()+temp5.getName()+"\t"+
                temp6.getId()+temp6.getName());
    }

    /**
     * 取得List中元素的方法
     */
    public void getCourse(){
        int size=coursesToSelect.size();//获取列表长度
        System.out.println("有如下课程待选(一般遍历)：");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) coursesToSelect.get( i );
            System.out.println("课程："+cr.getId()+cr.getName());
        }
    }

    /**
     * 通过【迭代器】(接口)遍历List
     * 通过List中的iterator()方法
     * 然后通过迭代器的next()方法遍历
     * 迭代器只是用来遍历集合元素的，不具备存储元素功能
     */
    public void testIterator(){
        Iterator it=coursesToSelect.iterator();
        System.out.println("有如下课程待选（迭代器方法）：");
        while (it.hasNext()){
            Course cr= (Course) it.next();
            System.out.println("课程："+cr.getId()+cr.getName());
        }
    }

    /**
     * 通过for each方法遍历
     */
    public void testForeach(){
        System.out.println("有如下课程待选（for each方法）：");
        for (Object obj:coursesToSelect) {
            Course cr= (Course) obj;
            System.out.println("课程："+cr.getId()+cr.getName());
        }
    }

    /**
     * 通过List的set()方法修改课程元素
     */
    public void testModify(){
        //将集合中下表为4的课程改为：课程 7毛概
        coursesToSelect.set( 4,new Course( 7,"毛概" ) );
    }

    /**
     * 通过List的remove方法删除元素
     */
    public void testRemove(){
        Course cr = (Course) coursesToSelect.get( 4 );//先拿到课程
        System.out.println("即将删除的课程："+cr.getId()+cr.getName());
        coursesToSelect.remove( cr );//删除课程
        System.out.println("成功删除课程");
        testForeach();//遍历一下
    }

    /**
     * 从一个集合中删除另一个较小的集合
     */
    public void testRemoveAll(){
        Course[] courses = {(Course) coursesToSelect.get( 1 ), (Course) coursesToSelect.get( 2 )};
        coursesToSelect.removeAll( Arrays.asList( courses ) );//将数组转为集合
        testForeach();//遍历
    }

    public static void main(String[] args) {
        ListCourse lc= new ListCourse();
        lc.addCourse();
        lc.getCourse();
        lc.testIterator();
        lc.testForeach();
        lc.testModify();
        lc.testForeach();
        lc.testRemove();
        lc.testRemoveAll();
    }
}
