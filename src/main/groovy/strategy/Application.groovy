package strategy

/**
 * @Author:夏立学
 * @ClassName:Application
 * @Date:2020 /1/16/14:05
 * @Comment 启动测试类
 */
class Application {

    static void main(String[] args) {
        Context c = new Context(new QQEmail())
        c.contextInfo()
        Context c1 = new Context(new WangYiEmail())
        c1.contextInfo()
    }
}
