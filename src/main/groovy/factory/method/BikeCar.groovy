package factory.method
/**
 * @Author:夏立学
 * @ClassName:BikeCar
 * @Date:2020 /1/13/15:10
 * @Comment 自行车制造部门
 */
class BikeCar implements factory.method.Car{

    @Override
    void modelCar() {
        println('制造自行车')
    }
}
