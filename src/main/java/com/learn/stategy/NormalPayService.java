package com.learn.stategy;

import java.math.BigDecimal;

/**
 *
 * TODO:要在Spring容器下运行：https://www.cnblogs.com/lisingshen/p/11782250.html
 *
 * 普通会员不打折原价
 *
 * 实现InitializingBean接口，容器启动后会调用afterPropertiesSet()方法，往工厂里写入打折策略
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public class NormalPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return new BigDecimal("10");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register(UserPayServiceEnum.NORMAL.getValue(), this);
    }

}
