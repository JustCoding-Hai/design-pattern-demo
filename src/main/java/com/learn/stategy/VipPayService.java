package com.learn.stategy;

import java.math.BigDecimal;

/**
 *
 * 普通会员打9折，消费超100打8折
 *
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public class VipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.compareTo(new BigDecimal("100")) > 1) {
            return new BigDecimal("8");
        }
        return new BigDecimal("9");
    }

    public void myShow(){
        System.out.println("myShow method invoke----->");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.VIP.getValue(), this);
    }

}
