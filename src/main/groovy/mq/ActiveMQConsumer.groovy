package mq

import org.apache.activemq.ActiveMQConnectionFactory

import javax.jms.*

/**
 * @Author:����ѧ
 * @ClassName:ActiveMQConsumer
 * @Date:2020 /1/10/15:17
 * @Comment MQ��Ϣ������
 */
class ActiveMQConsumer {


    //����Ϣ���Ķ�ȡ��Ϣ
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
        MessageConsumer consumer = session.createConsumer(destination);

        // �������ѵļ���
        consumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                TextMessage textMessage = (TextMessage) message;
                try {
                    println('������Ϣ:' + textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        //�ر�����
        connection.close()
    }
}
