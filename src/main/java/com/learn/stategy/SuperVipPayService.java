package com.learn.stategy;

import java.math.BigDecimal;

/**
 *
 * 超级会员打8折
 *
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public class SuperVipPayService implements UserPayService , InitializingBean  {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return new BigDecimal("8");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.SUPERVIP.getValue(),this);
    }
}
