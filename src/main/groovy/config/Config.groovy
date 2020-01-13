package config

/**
 * @Author:夏立学
 * @ClassName:Config
 * @Date:2020 /1/13/13:58
 * @Comment 配置类
 */
class Config {

    enum UrlConfig{
        RedisClientUrl('redis','112.74.160.66',6379,'mmm123'),
        ActiveMQClientUrl('activeMQ','tcp://127.0.0.1',61616,'')
        String code //连接对象
        String url //连接路径
        Integer port //连接端口
        String pwd //连接密钥
        UrlConfig(String code,String url,Integer port,String pwd){
            this.code = code
            this.url = url
            this.port = port
            this.pwd = pwd
        }
    }

}