/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.service;

import cn.edu.uestc.model.Paper;
import cn.edu.uestc.template.ServiceResult;

import java.util.List;

/**
 *
 * @author feixuan.fx
 * @version $Id: PaperService.java, v 0.1 2018-05-02 22:38 feixuan.fx Exp $
 */
public interface PaperService {

    /**
     * 添加一篇论文
     *
     * @param papers 论文
     * @return 结果
     */
    ServiceResult addPapers(List<Paper> papers);

}