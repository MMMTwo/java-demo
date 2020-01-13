package redis

import config.Config
import redis.clients.jedis.Jedis

/**
 * @Author:夏立学
 * @ClassName:RedisClient
 * @Date:2020 /1/7/10:47
 * @Comment Redis连接demo
 */
class RedisClient {

    static Jedis jedis

    static void main(String[] args) {
        try{
            jedis = new Jedis(Config.UrlConfig.RedisClientUrl.url,Config.UrlConfig.RedisClientUrl.port)
            jedis.auth(Config.UrlConfig.RedisClientUrl.pwd)
            //jedis.set('name','张三')
            jedis.del('name')
        }catch(Exception e){
            System.err.println('redis连接操作错误')
            e.printStackTrace()
        }finally{
            close(jedis)
        }
    }


    //关闭连接方法
    static void close(Jedis jedis1){
        //如果redis已经创建连接了在最后要关闭连接
        if(jedis1 != null)jedis1.close()
    }



}
