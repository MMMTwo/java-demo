package state

/**
 * @Author:夏立学
 * @ClassName:State
 * @Date:2020 /1/17/11:00
 * @Comment 状态类
 */
class State {
    //状态
    private String value

    String getValue() {
        return value
    }

    void setValue(String value) {
        this.value = value
    }

    //状态1执行的方法
    void method1(){
        println '方法一'
    }

    //状态2执行的方法
    void method2(){
        println '方法二'
    }
}
