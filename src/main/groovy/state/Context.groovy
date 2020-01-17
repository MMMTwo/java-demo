package state

/**
 * @Author:夏立学
 * @ClassName:Context
 * @Date:2020 /1/17/11:13
 * @Comment 状态代理类
 */
class Context {
    //状态类
    private State state

    public Context(State state1) {
        this.state = state1
    }

    State getState() {
        return state
    }

    void setState(State state) {
        this.state = state
    }

    //状态代理
    public void method() {
        //根据不同的状态执行不同的业务代码
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();

        }
    }
}
