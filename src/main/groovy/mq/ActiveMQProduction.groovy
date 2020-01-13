package mq

import org.apache.activemq.ActiveMQConnectionFactory

import javax.jms.*

/**
 * @Author:����ѧ
 * @ClassName:ActiveMQProduction
 * @Date:2020 /1/10/13:45
 * @Comment ActiveMQ��ϰdemo(��Ϣ�ṩ��)
 */
class ActiveMQProduction {

    //������Ϣ����Ϣ����
    static void main(String[] args) {
        //�������ӹ���
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory (ActiveMQConfig.url)

        //��������
        Connection connection = activeMQConnectionFactory.createConnection()

        //������
        connection.start()

        //�����Ự
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE)

        //��������Ŀ��,����ʶ�������ƣ������߸��ݶ������ƽ�������
        Destination destination  = session.createQueue('myQueue')

        //����һ��������
        MessageProducer producer = session.createProducer(destination);

        TextMessage message = session.createTextMessage('demoTest')

        //������Ϣ
        producer.send(message)

        //�ر�����
        connection.close()
    }
}
