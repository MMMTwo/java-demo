package factory.simple

/**
 * @Author:夏立学
 * @ClassName:CarFactory
 * @Date:2020 /1/13/15:15
 * @Comment 4S销售中心
 */
class CarFactory {

    public Car createCar(String carType){
        if(carType == 'bus'){
            return new BusCar()
        }else if(carType == 'bike'){
            return new BikeCar()
        }else if(carType == 'sedan'){
            return new SedanCar()
        }else{
            println '暂无此类汽车生产'
            return null
        }
    }
}
