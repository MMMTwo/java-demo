package strategy

/**
 * @Author:夏立学
 * @ClassName:WangYiEmail
 * @Date:2020 /1/16/13:59
 * @Comment 网易邮箱
 */
class WangYiEmail extends Message{
    @Override
    void sendMessage() {
        println '网易邮箱发送消息'
    }

    @Override
    void readMessage() {
        println '网易邮箱读取消息'
    }

    @Override
    void delMessage() {
        println '网易邮箱删除消息'
    }
}
