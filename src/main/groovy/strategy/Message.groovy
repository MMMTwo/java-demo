package strategy

/**
 * @Author:夏立学
 * @ClassName:Message
 * @Date:2020 /1/16/13:57
 * @Comment 消息服务器
 */
abstract class Message {

    //发送消息
    abstract void sendMessage()

    //读取消息
    abstract void readMessage()

    //删除消息
    abstract void delMessage()

}
