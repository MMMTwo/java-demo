package mq

import config.Config
import org.apache.activemq.ActiveMQConnectionFactory

import javax.jms.*

/**
 * @Author:夏立学
 * @ClassName:ActiveMQConsumer
 * @Date:2020 /1/10/15:17
 * @Comment MQ消息消费者
 */
class ActiveMQConsumer {


    //从消息中心读取消息
    static void main(String[] args) {

        String url = Config.UrlConfig.ActiveMQClientUrl.url+':'+Config.UrlConfig.ActiveMQClientUrl.port

        //创建连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory (url)

        //创建连接
        Connection connection = activeMQConnectionFactory.createConnection()

        //打开连接
        connection.start()

        //创建会话
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE)

        //创建队列目标,并标识队列名称，消费者根据队列名称接收数据
        Destination destination  = session.createQueue('myQueue')

        //创建一个消费者
        MessageConsumer consumer = session.createConsumer(destination);

        // 创建消费的监听
        consumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                TextMessage textMessage = (TextMessage) message;
                try {
                    println('消费信息:' + textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        //关闭连接
        connection.close()
    }
}
