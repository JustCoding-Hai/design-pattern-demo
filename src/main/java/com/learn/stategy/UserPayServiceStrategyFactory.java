package com.learn.stategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public class UserPayServiceStrategyFactory {
    private static Map<String,UserPayService> services = new ConcurrentHashMap<String,UserPayService>();

    public  static UserPayService getByUserType(String type){
        return services.get(type);
    }

    public static void register(String userType,UserPayService userPayService){
        services.put(userType,userPayService);
    }
}
