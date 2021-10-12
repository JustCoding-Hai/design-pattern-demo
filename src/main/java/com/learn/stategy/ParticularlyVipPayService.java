package com.learn.stategy;

import java.math.BigDecimal;

/**
 *
 *  专属会员 下单消费超30打七折
 *
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public class ParticularlyVipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (orderPrice.compareTo(new BigDecimal("30"))>0) {
            return new BigDecimal("7");
        }
        return new BigDecimal("8");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.PARTICULALYVIP.getValue(),this);
    }
}
