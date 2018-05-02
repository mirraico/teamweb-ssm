/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.service.impl;

import cn.edu.uestc.dal.dao.PaperDAO;
import cn.edu.uestc.model.Paper;
import cn.edu.uestc.service.PaperService;
import cn.edu.uestc.template.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 * @author feixuan.fx
 * @version $Id: PaperServiceImpl.java, v 0.1 2018-05-02 23:08 feixuan.fx Exp $
 */
public class PaperServiceImpl implements PaperService {

    /**
     * 服务模板
     */
    @Autowired
    private ServiceTemplate serviceTemplate;

    /**
     * 论文 DAO
     */
    @Autowired
    private PaperDAO paperDAO;

    /**
     * 添加一篇论文
     *
     * @param papers 论文
     * @return 结果
     */
    @Override
    public ServiceResult addPapers(final List<Paper> papers) {

        final ServiceResult result = new ServiceResult();
        serviceTemplate.execute(new ServiceCallback() {
            @Override
            public boolean check() throws Exception {
                return true;
            }

            @Override
            public void service() {
                for (int i = 0; i < papers.size(); i++) {
                    if (i > 2) {
                        throw new ServiceException(ServiceResultCodeEnum.FAIL, "一次性插入超过3条数据");
                    }
                    paperDAO.insertPaper(papers.get(i));
                }
            }
        }, result, true);

        return result;
    }

}