package factory.abstraction
/**
 * @Author:夏立学
 * @ClassName:CarFactoty
 * @Date:2020 /1/13/16:02
 * @Comment 销售总部
 */
interface CarFactoty {

    //用户选购车辆，分配到具体的销售部门再通知制造商
   public Car createCar()

}