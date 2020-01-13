package factory.abstraction

/**
 * @Author:夏立学
 * @ClassName:SedanFactory
 * @Date:2020 /1/13/16:05
 * @Comment 小轿车销售部
 */
class SedanFactory implements CarFactoty{

    @Override
    Car createCar() {
        return new SedanCar()
    }

}
