package com.yupi.maker;

import com.yupi.maker.generator.main.MainGenerator;

/**
 * 主要
 *
 * @author JiangJie
 * @date 2024/01/04
 */
public class Main {
    public static void main(String[] args) {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}