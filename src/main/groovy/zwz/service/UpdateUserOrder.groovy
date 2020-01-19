package zwz.service

/**
 * @Author:夏立学
 * @ClassName:UpdateUserOrder
 * @Date:2020 /1/19/09:33
 * @Comment 修改被保人保单信息
 */
class UpdateUserOrder extends OrderOpertion{

    @Override
    void rufundOrder() {
        this.checkOrder()
        println '修改被保人保单信息流程'
        //执行这个退保流程特有的校验规则
        //业务代码
    }

    @Override
    int getTypeValue() {
        return 2
    }

}
