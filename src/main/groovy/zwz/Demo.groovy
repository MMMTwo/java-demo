package zwz

import zwz.service.OrderOpertion
import zwz.service.RufundOrder
import zwz.service.UpdateUserOrder

/**
 * @Author:夏立学
 * @ClassName:Demo
 * @Date:2020 /1/19/09:26
 * @Comment 模拟业务入口
 */
class Demo {
    //模拟spring注入对象信息
    static List<OrderOpertion> list = []
    static {
        OrderOpertion demo1 = new RufundOrder()
        OrderOpertion demo2 = new UpdateUserOrder()
        list.add(demo1)
        list.add(demo2)
    }

    static void main(String[] args) {
        Integer opertionType = 2 //操作类型
        OrderOpertion order = list.find{it.getTypeValue() == opertionType}
        order.rufundOrder()
    }
}
