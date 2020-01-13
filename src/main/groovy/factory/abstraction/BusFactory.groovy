package factory.abstraction

/**
 * @Author:夏立学
 * @ClassName:BusFactory
 * @Date:2020 /1/13/16:01
 * @Comment 公交车销售部
 */
class BusFactory implements CarFactoty{

    @Override
    Car createCar() {
        return new BusCar()
    }

}
