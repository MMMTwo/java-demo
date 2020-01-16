package strategy

/**
 * @Author:夏立学
 * @ClassName:QQEmail
 * @Date:2020 /1/16/14:01
 * @Comment QQ邮箱
 */
class QQEmail extends Message{
    @Override
    void sendMessage() {
        println 'QQ邮箱发送消息'
    }

    @Override
    void readMessage() {
        println 'QQ邮箱读取消息'
    }

    @Override
    void delMessage() {
        println 'QQ邮箱删除消息'
    }
}
