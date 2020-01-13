#运行MQ的示例需要先在本地将ActiveMQ启动以下是MQ的安装教程

###### window下安装
```
    第一步去官网下载mq：http://activemq.apache.org/components/classic/download/
    第二步启动:启动脚本在下载文件解压后的bin目录下的win64的activemq.bat文件
    此时浏览器端就可以访问了
    访问地址http://127.0.0.1:8161 
```

###### 注意事项
```
浏览器端访问是:http://127.0.0.1:8161 
使用java代码连接时是tcp协议:tcp://127.0.0.1:61616 且端口是61616
```