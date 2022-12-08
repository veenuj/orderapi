package com.order.OrderItem.entity;

import javax.persistence.*;

@Entity
@Table(name="order_table")
public class order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String pName;
    @Column(name="category")
    private String cat;
    @Column(name="amount")
    private int amt;

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", cat='" + cat + '\'' +
                ", amt=" + amt +
                ", qt=" + qt +
                '}';
    }

    @Column(name="quantity")
    private int qt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public order(String pName, String cat, int amt, int qt) {
        this.pName = pName;
        this.cat = cat;
        this.amt = amt;
        this.qt = qt;
    }

    public order(){

    }


}
