package com.xx.hbm.start.util;

import java.util.UUID;

/**
 * Created by wxiao on 2016.10.10.
 *
 * 32位UUID生成器
 *
 */
public class UUIDGenerator {

    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
