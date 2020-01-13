package factory.abstraction
/**
 * @Author:夏立学
 * @ClassName:SedanCar
 * @Date:2020 /1/13/15:14
 * @Comment 小轿车制造部门
 */
class SedanCar implements factory.abstraction.Car{

    @Override
    void modelCar() {
        println '制造小轿车'
    }
}
