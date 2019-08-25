package com.silence.arts.pattern.construct.facade;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author ziyou<br>
 * <b>Date：</b>2019-08-05 16:11<br>
 * <b>Desc：</b>无<br>
 */
public class FacadeDemo {

    public static void main(String[] args) {
        CPU cpu = new CPU();
        SSD ssd = new SSD();
        Memory memory = new Memory();
        ComputerFacade computer = new ComputerFacade(cpu, ssd, memory);
        computer.open();
        System.out.println("使用了很久很久很久之后。。。");
        computer.close();
    }
}
