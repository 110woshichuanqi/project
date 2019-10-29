package com.qf;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Demo {
    @Test
    public void test1(){
        Jedis jedis = new Jedis("192.168.12.137",6379);
        String passwprd= jedis.get("password");
        System.out.println(passwprd);
        jedis.close();
    }

}
