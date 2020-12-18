package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 支付模块持久层
 * @author ：DaDa
 * @date ：2020/12/18 10:49
 */
public interface PaymentDao {
    /**
     * 对payment表插入一条数据
     * @author:
     * @date: 2020/12/18 11:20
     * @param payment
     * @return int
     */
    int creat(Payment payment);
   /**
    * 按照id潮汛payment表中的一条数据
    * @author:
    * @date: 2020/12/18 11:21
    * @param id
    * @return com.atguigu.springcloud.entities.Payment
    */
    Payment getPayment(@Param("id") long id);
}
