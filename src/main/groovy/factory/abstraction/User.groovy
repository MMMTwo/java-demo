package factory.abstraction


import factory.method.CarFactory

/**
 * @Author:夏立学
 * @ClassName:User
 * @Date:2020 /1/13/15:20
 * @Comment 用户操作类
 */
class User {

   static void main(String[] args) {
       CarFactoty carFactoty1 = new BusFactory()
       CarFactoty carFactoty2 = new BikeFactory()
       CarFactoty carFactoty3 = new SedanFactory()

       Car car1= carFactoty1.createCar()
       Car car2= carFactoty2.createCar()
       Car car3= carFactoty3.createCar()

       car1.modelCar()
       car2.modelCar()
       car3.modelCar()
   }

}
