package com.maven.util;


import org.springframework.core.convert.converter.Converter;

/**
 * Created by admin on 2018/1/19.
 */
public class IntConvertor implements Converter<String,Integer> {

    @Override
    public Integer convert(String s) {
        if(s != null && s.length() > 0){
            try {
                return Integer.parseInt(s);
            }catch (Exception e){
                return 0;
            }
        }
        return 0;
    }
}
