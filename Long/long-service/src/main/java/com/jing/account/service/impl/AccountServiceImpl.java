package com.jing.account.service.impl;

import com.jing.account.dao.AccountDao;
import com.jing.account.po.AccountPO;
import com.jing.account.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;


    public AccountPO findByNamePwd(AccountPO accountPO) {
        return accountDao.findByNamePwd(accountPO);
    }

    /**
     * 查找单个
     *
     * @param id
     * @return account
     */
    public AccountPO find(Serializable id) {
        return accountDao.find(id);
    }

    /**
     * 查找所有
     *
     * @return List<AccountPO>
     */
    public List<AccountPO> findAll() {
        return accountDao.findAll();
    }

    /**
     * 创建
     *
     * @param po
     */
    public void create(AccountPO po) throws Exception {

        if (po != null)
            accountDao.create(po);
    }

    /**
     * 修改
     *
     * @param po
     */
    public void update(AccountPO po) throws Exception {

        if (po != null)
            accountDao.update(po);

    }

    /**
     * 删除
     *
     * @param id
     */
    public void delete(Serializable id) throws Exception {
        accountDao.delete(id);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deletes(Serializable[] id) throws Exception {
        accountDao.deletes(id);
    }

}