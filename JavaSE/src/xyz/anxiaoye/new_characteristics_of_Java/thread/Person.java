package xyz.anxiaoye.new_characteristics_of_Java.thread;

/**
 * @ClassName Person
 * Create by zhuye on 2020/2/24.
 */
public class Person {
    private String name;

    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println(name+"-->"+i);
        }
    }
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
