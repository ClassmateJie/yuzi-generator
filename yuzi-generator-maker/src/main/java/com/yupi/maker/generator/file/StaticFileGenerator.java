package com.yupi.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * 静态文件生成器
 *
 * @author JiangJie
 * @date 2024/01/05
 */
public class StaticFileGenerator {

    //定义静态方法
    public static void copyFileByHutool(String inputPath, String outputPath){
        //使用hutool工具包进行文件拷贝
        FileUtil.copy(inputPath, outputPath, true);

    }
}
