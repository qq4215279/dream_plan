package com.gobestsoft.java_base.access.protected_;

/**
 * ProtectedDemo
 *
 * @author liuzhen
 * @version 1.0.0 2021/10/8 8:41
 */
public class ProtectedDemo {

    /**
     * 修饰符       当前类       同 包	     子 类       其他包
     * public	     √           √       	  √           √
     * protected     √           √       	  √           ×
     * default    	 √           √            ×           ×
     * private       √           ×            ×        	  ×
     */

    protected String name;

    public ProtectedDemo(String name) {
        this.name = name;
    }
}
