package com.study;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @program: study-redis
 * @description:
 * @author: lihangyu
 * @create: 2020-12-09 19:35
 */
public class TestPing {

    public static void main(String[] args) {



        //1、new Jedis 对象

//        Jedis jedis = new Jedis("39.99.236.185",6379);

        Jedis jedis = new Jedis("39.99.144.135",6379);
        jedis.auth("aaa");
        //jedis

        System.out.println(jedis.ping());
        //jedis.get("");
        jedis.setnx("panhu","1");
        jedis.setnx("panhu","2" );
        System.out.println(jedis.get("panhu"));
        jedis.del("panhu");
        System.out.println(jedis.exists("panhu"));

    }
}
