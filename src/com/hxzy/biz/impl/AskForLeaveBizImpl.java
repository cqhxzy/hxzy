package com.hxzy.biz.impl;

import com.hxzy.bean.AskForLeave;
import com.hxzy.biz.AskForLeaveBiz;
import com.hxzy.dao.AskForLeavaDao;
import com.hxzy.dao.impl.AskForLeavaDaoImpl;


public class AskForLeaveBizImpl implements AskForLeaveBiz {
    private AskForLeavaDao dao = new AskForLeavaDaoImpl();
    @Override
    public int add(AskForLeave askForLeave) {
        return dao.add(askForLeave);
    }

    @Override
    public int update(AskForLeave askForLeave) {
        return dao.update(askForLeave);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public AskForLeave queryOne(int id) {
        return dao.queryOne(id);
    }

    @Override
    public AskForLeave queryByEId(int eId) {
        return dao.queryByEId(eId);
    }
}
