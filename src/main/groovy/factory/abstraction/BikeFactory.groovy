package factory.abstraction

/**
 * @Author:夏立学
 * @ClassName:BikeFactory
 * @Date:2020 /1/13/16:04
 * @Comment 自行车销售部
 */
class BikeFactory implements CarFactoty{

    @Override
    Car createCar() {
        return new BikeCar()
    }
}
