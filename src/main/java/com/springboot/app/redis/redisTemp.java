package com.springboot.app.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

public class redisTemp {

    @Autowired
    StringRedisTemplate stringRedisTemplate;        //操作字符串

    @Autowired
    RedisTemplate  redisTemplate;       //对象<k.v>

    /*
     * redis常见5中类型
     * String(字符串) list(列表)  set(集合) hash(散列)  zset(有序集合)
     *
     * stringRedisTemplate.opsForValue()    操作字符串
     * stringRedisTemplate.opsForList()         操作列表
     * stringRedisTemplate.opsForSet()     集合
     * stringRedisTemplate.opsForHash()   散列
     * stringRedisTemplate.opsForZSet()   有序集合
     * */
    public void  testA(){
        stringRedisTemplate.opsForValue().append("msg","aa");
        stringRedisTemplate.opsForValue().get("msg");
    }

    public void  testB(){
        redisTemplate.opsForValue().append("msg","aa");
        redisTemplate.opsForValue().get("msg");
    }

}
