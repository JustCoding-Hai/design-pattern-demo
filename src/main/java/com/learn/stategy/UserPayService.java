package com.learn.stategy;

import java.math.BigDecimal;

/**
 * @author huangjinhai
 * @date 2021\10\12 0012
 */
public interface UserPayService {
    /**
     * 计算应付价格
     */
    public BigDecimal quote(BigDecimal orderPrice);
}
