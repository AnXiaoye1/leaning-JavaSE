package xyz.anxiaoye.face_object_code.class_inner.class_is_x;

/**
 * @ClassName Hero 英雄角色类
 * Create by zhuye on 2020/2/8.
 */
public class Hero {

    private String name;//英雄名称
    private int age;//英雄年龄
    private Weapon weapon;//英雄武器
    private Skill skill;//英雄技能


    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon, Skill skill) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.skill = skill;
    }

    public void attack() {
        System.out.println( "年龄为" + age + "的" + name + "使用" + weapon.getCode() + "在释放技能：" );
        skill.use();
        System.out.println("释放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
