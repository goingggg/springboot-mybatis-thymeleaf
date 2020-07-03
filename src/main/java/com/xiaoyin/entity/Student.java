package com.xiaoyin.entity;

import javax.persistence.*;

@Table(name = "student")
public class Student {
    @Id
    private Integer sno;

    private String sname;

    private Integer sage;

    private String saddress;

    /**
     * @return sno
     */
    public Integer getSno() {
        return sno;
    }

    /**
     * @param sno
     */
    public void setSno(Integer sno) {
        this.sno = sno;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return sage
     */
    public Integer getSage() {
        return sage;
    }

    /**
     * @param sage
     */
    public void setSage(Integer sage) {
        this.sage = sage;
    }

    /**
     * @return saddress
     */
    public String getSaddress() {
        return saddress;
    }

    /**
     * @param saddress
     */
    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
}