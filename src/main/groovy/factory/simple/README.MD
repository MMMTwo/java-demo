###### 简单工厂模式

```
    简单工厂模式根据你需要的类型参数,创造出相对应的对象
    例如当前示例:
        用户选购（User）
        销售平台（CarFactory）
        造车公司（Car）
            造小轿车部门（SedanCar）
            造公交车部门（BusCar）
            造自行车部门（BikeCar）
         
    用户（User）跟销售平台（CarFactory）订车，销售平台（CarFactory）根据用户（User）的需求让汽车制造公司（Car）通知对应的制造部门(*Car) 此处*是（BusCat,BikeCar,SedanCar）其中的某一种,由用户传入的类型变化
    当前示例中根据用户的需要通知对应的制造部门 
```