package com.jing.account.controller;


import com.jing.account.po.AccountPO;
import com.jing.account.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    /**
     * account 跳转到登录页
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ModelAndView addAccountActoin(ModelAndView modelAndView) {
        try {
            modelAndView.setViewName("account/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    /**
     * account 登陆方法
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean loginActoin(AccountPO accountPO) {
        boolean result = false;
        try {
            AccountPO po = accountService.findByNamePwd(accountPO);
            if (po != null && !"".equals(po.getId())) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * account 跳转到首页
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView indexActoin(ModelAndView modelAndView) {
        try {
            modelAndView.setViewName("account/index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }


    /**
     * account 查找
     *
     * @param
     * @return
     *//*
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView addAccountActoin(String id, ModelAndView model) {

        try {
            AccountPO accountPO = accountService.find(id);
            model.addObject("account", accountPO);
            model.setViewName("account/index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }*/

}