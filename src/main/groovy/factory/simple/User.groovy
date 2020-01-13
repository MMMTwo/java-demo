package factory.simple

/**
 * @Author:夏立学
 * @ClassName:User
 * @Date:2020 /1/13/15:20
 * @Comment 用户操作类
 */
class User {

   static void main(String[] args) {
       opertionCar('bike')
       opertionCar('bus')
       opertionCar('sedan')
    }

    //用户选购汽车
    public static opertionCar(String carType){
        Car car = new CarFactory().createCar(carType)
        car.modelCar()
    }
}
