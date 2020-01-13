package factory.method
/**
 * @Author:夏立学
 * @ClassName:CarFactory
 * @Date:2020 /1/13/15:15
 * @Comment 4S销售中心
 */
class CarFactory {

    //生产公交车
    public Car createBus(){
        return new factory.method.BusCar()
    }

    //生产小轿车
    public Car createSedan(){
        return new SedanCar()
    }

    //生产自行车
    public Car createBike(){
        return new BikeCar()
    }

}
