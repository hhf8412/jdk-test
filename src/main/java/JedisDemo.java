import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.17.130",6379);
        String pong = jedis.ping();
        System.out.println("连接成功："+pong);
        jedis.close();

    }
}
