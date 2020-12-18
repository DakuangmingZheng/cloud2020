package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：DaDa
 * @date ：2020/12/18 15:18
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    /**
     * 插入payment表一条数据
     * @param payment
     * @return com.atguigu.springcloud.CommonResult
     * @author: DaDa
     * @date: 2020/12/18 15:29
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public CommonResult<?> create(@ModelAttribute Payment payment) {
        int result = paymentService.create(payment);
        log.info("******插入結果：" + result);
        return result > 0 ? new CommonResult<>(200, "插入数据成功", result) : new CommonResult<>(444, "插入数据失败", null);

    }

    /**
     * 根据id获取payment表的一条数据
     * @param id
     * @return com.atguigu.springcloud.CommonResult
     * @author: DaDa
     * @date: 2020/12/18 15:41
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<?> getPayment(@PathVariable long id) {
        Payment payment = paymentService.getPayment(id);
        log.info("******插入結果：" + payment);
        return payment != null ? new CommonResult<>(200, "查询数据成功", payment) : new CommonResult<>(444, "查询数据失败，查询id："+id, null);

    }
}
