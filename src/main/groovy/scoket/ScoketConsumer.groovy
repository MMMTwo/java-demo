package scoket

import com.sun.xml.internal.bind.v2.TODO
import groovy.json.internal.Byt

/**
 * @Author:夏立学
 * @ClassName:ScoketConsumer
 * @Date:2019 /12/31/11:05
 * @Comment Socket客户端
 */
class ScoketConsumer {
    static void main(String[] args) {
        try {
            //创建scoket连接
            Socket socket = new Socket("127.0.0.1",8080);
            //向服务端写入数据
            def map = [:]
            map["userId"] = 1
            map["name"] = "张三"
            String clientName = '张三'
            socket.getOutputStream().write(clientName.getBytes());
            //关闭socket连接
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
