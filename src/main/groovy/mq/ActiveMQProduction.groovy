package mq

import config.Config
import org.apache.activemq.ActiveMQConnectionFactory

import javax.jms.*

/**
 * @Author:夏立学
 * @ClassName:ActiveMQProduction
 * @Date:2020 /1/10/13:45
 * @Comment ActiveMQ练习demo(消息提供方)
 */
class ActiveMQProduction {

    //发送消息到消息中心
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

        //创建一个生产者
        MessageProducer producer = session.createProducer(destination);

        TextMessage message = session.createTextMessage('demoTest')

        //发送消息
        producer.send(message)

        //关闭连接
        connection.close()
    }
}
