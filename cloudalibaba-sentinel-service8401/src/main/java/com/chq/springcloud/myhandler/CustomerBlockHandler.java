package com.chq.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chq.springcloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}