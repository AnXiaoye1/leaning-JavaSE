package xyz.anxiaoye.face_object_code.class_inner.class_is_x;

import xyz.anxiaoye.face_object_code.class_inner.Body;

/**
 * @ClassName TestMain
 * Create by zhuye on 2020/2/8.
 */
public class TestMain {
    public static void main(String[] args) {
        /**创建一个英雄角色*/
        Hero hero=new Hero();
        //为英雄设置名称、年龄
        hero.setName( "李逍遥" );
        hero.setAge( 20 );

        //创建一个武器对象
        Weapon weapon=new Weapon("镇魂剑");
        //为英雄配备武器
        hero.setWeapon( weapon );

        //设置英雄技能【使用单独定义的实现类】
        hero.setSkill( new SkillImpl() );
        hero.attack();

        //同时使用【匿名内部类】和【匿名对象】来实现
        hero.setSkill( new Skill() {
            @Override
            public void use() {
                System.out.println("Duang~Duang~Duang~");
            }
        } );
        //发起攻击
        hero.attack();
    }
}
