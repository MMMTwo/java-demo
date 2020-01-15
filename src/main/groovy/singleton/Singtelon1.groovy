package singleton

/**
 * @Author:夏立学
 * @ClassName:Singtelon1
 * @Date:2020 /1/15/10:44
 * @Comment 测试单例
 */
class Singtelon1 {

    //定义一个对象
    private static Singtelon1 singtelon1

    //用于记录当前对象的实例次数
    public static Integer num = 0

    //私有化构造器这样对外就不能通过构造器来创建当前对象的实例
    private Singtelon1(){}

    //提供但前对象的实例
    public static Singtelon1 getSingtelonObject(){
        //如果对象是空的就创建当前对象的实例
        if(singtelon1 == null){
            print('创建实例')
            num++;
            singtelon1 = new Singtelon1()
        }
        return singtelon1
    }
}
