/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.model;

/**
 * 论文
 * @author feixuan.fx
 * @version $Id: Paper.java, v 0.1 2018-05-02 18:00 feixuan.fx Exp $
 */
public class Paper {

    /**
     * 论文 id
     */
    private long id;
    /**
     * 论文名
     */
    private String name;

    /**
     * Getter method for property <b>id</b>.
     *
     * @return property value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for property <b>id</b>.
     *
     * @param id value be assigned to id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for property <b>name</b>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <b>name</b>.
     *
     * @param name value be assigned to name
     */
    public void setName(String name) {
        this.name = name;
    }
}