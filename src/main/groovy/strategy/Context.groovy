package strategy

/**
 * @Author:夏立学
 * @ClassName:Context
 * @Date:2020 /1/16/14:03
 * @Comment 策略类
 */
class Context {
    Message message

    public Context(Message message1){
        this.message = message1
    }


    public void contextInfo(){
        message.sendMessage()
        message.readMessage()
        message.delMessage()
    }
}
