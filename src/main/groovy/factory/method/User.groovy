package factory.method

/**
 * @Author:夏立学
 * @ClassName:User
 * @Date:2020 /1/13/15:20
 * @Comment 用户操作类
 */
class User {

   static void main(String[] args) {
       opertionCar()
    }

    //用户选购汽车
    public static opertionCar(){
        Car car = new CarFactory().createBike()
        Car car2 = new CarFactory().createBus()
        Car car3 = new CarFactory().createSedan()
        car.modelCar()
        car2.modelCar()
        car3.modelCar()
    }
}
