package com.mdd.serviceImpl;

import com.mdd.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by xwl on 2017/10/12.
 */
@Service
public class DemoServiceImpl implements DemoService {

    public String getName() {
        return "hello xwl";
    }
}
