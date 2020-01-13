package factory.method
/**
 * @Author:夏立学
 * @ClassName:BusCar
 * @Date:2020 /1/13/15:12
 * @Comment 公交车制造部门
 */
class BusCar implements factory.method.Car{
    @Override
    void modelCar() {
        println '制造公交车'
    }
}
