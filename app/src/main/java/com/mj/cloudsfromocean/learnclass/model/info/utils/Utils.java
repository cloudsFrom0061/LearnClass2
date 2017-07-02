package com.mj.cloudsfromocean.learnclass.model.info.utils;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
public class Utils {
    /**
     * 字符串转ASCII码
     * @param value
     * @return
     */
    public static String stringToAscii(String value)
    {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                sbu.append((int)chars[i]).append(",");
            }
            else {
                sbu.append((int)chars[i]);
            }
        }
        return sbu.toString();
    }

    /**
     * 判断输入字符串是否是数字
     * @param str
     * @return
     */
    public static boolean JudgeIfNum(String str){
        int ifNum = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           int ascii = Integer.valueOf(stringToAscii(String.valueOf(chars[i])));
            if (ascii>=48&&ascii<=57){
            }else ifNum = 1;
        }
        if (ifNum==0) return true;
        else return false;
    }
    public boolean JugHAndL(){
        return true;
    }
}
