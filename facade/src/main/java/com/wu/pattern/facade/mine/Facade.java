package com.wu.pattern.facade.mine;

/**
 * @Title: Facade
 * @Package: com.wu.pattern.facade.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Facade {

    private FileCode fileCode;
    private FileReader fileReader;
    private FileEncrypt fileEncrypt;

    public Facade(FileCode fileCode, FileReader fileReader, FileEncrypt fileEncrypt) {
        this.fileCode = fileCode;
        this.fileReader = fileReader;
        this.fileEncrypt = fileEncrypt;
    }

    public void process(){
        fileReader.reader();
        fileCode.code();
        fileEncrypt.encrypt();
    }

}
