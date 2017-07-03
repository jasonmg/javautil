package com.jason.common.util;

import java.util.Random;

public class RandomUtils {
    public static Random random = new Random();

    public static String getRandom(int length) {
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < length; ++i) {
            boolean isChar = random.nextInt(2) % 2 == 0;
            if (isChar) {
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                ret.append((char) (choice + random.nextInt(26)));
            } else {
                ret.append(Integer.toString(random.nextInt(10)));
            }
        }

        return ret.toString();
    }

    public static String getRandomNumberCode(int length) {
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < length; ++i) {
            ret.append(Integer.toString(random.nextInt(10)));
        }

        return ret.toString();
    }

    /**
     * 返回随机数
     * start < 随机数 < end
     */
    public static int getRandomNumber(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("start cannot larger than end");
        }

        int randomInt = random.nextInt((end - start));
        return randomInt + start;
    }

}
