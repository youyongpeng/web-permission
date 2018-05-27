package com.yyp.sys.controller;

import com.yyp.common.controller.AbstractController;
import com.yyp.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by youyongpeng on 18/5/27.
 */
public class SysUserController extends AbstractController {

    @Autowired
    SysUserService sysUserService;

    public void  list() {
       /// sysUserService.
    }

}
