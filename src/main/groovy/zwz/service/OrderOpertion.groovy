package zwz.service

/**
 * @Author:夏立学
 * @ClassName:OrderOpertion
 * @Date:2020 /1/19/09:27
 * @Comment 保单操作类
 */
abstract class OrderOpertion {

    //退保方法
   abstract void rufundOrder();

    //退保校验方法
    void checkOrder(){
        println '公共退保'
        //所有退保通用的校验
    }

    //获取退保类型   1、直接退保 2、修改被保人保单信息
    abstract int getTypeValue()
}
