package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author ：DaDa
 * @description：支付模块实体类
 * @date ：2020/12/17 11:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 主键id
     */
    private long id;
    /**
     * 订单流水号
     */
    private String serial;
}
