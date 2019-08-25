package com.silence.arts.pattern.construct.facade;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author ziyou<br>
 * <b>Date：</b>2019-08-05 15:56<br>
 * <b>Desc：</b>无<br>
 */
public class ComputerFacade {

    private CPU cpu;
    private SSD ssd;
    private Memory memory;


    public ComputerFacade(CPU cpu, SSD ssd, Memory memory) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.memory = memory;
    }

    /**
     * 开机
     */
    public void open() {
        cpu.openCpu();
        ssd.openSSD();
        memory.openMemory();
    }


    /**
     * 关机
     */
    public void close() {
        cpu.closeCpu();
        ssd.closeSSD();
        memory.closeMemory();
    }
}
