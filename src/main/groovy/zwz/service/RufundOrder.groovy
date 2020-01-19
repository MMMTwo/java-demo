package zwz.service

/**
 * @Author:夏立学
 * @ClassName:RufundOrder
 * @Date:2020 /1/19/09:34
 * @Comment 直接退保
 */
class RufundOrder extends OrderOpertion{

    @Override
    void rufundOrder() {
        this.checkOrder()
        println '直接退保流程'
        //执行这个退保流程特有的校验规则
        //业务代码
    }

    @Override
    int getTypeValue() {
        return 1
    }
}
