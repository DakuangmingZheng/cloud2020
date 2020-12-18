package com.atguigu.springcloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：DaDa
 * @description：Json封装体
 * @date ：2020/12/17 17:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 返回代码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;
    /**
     * @author: DaDa
     * @description: 考虑返回数据为null时的情况
     * @date: 2020/12/17 17:37
     * @param code
     * @param message
     * @return null
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
