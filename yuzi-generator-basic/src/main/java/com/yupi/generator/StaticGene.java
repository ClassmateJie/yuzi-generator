package com.yupi.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGene {
    public static void main(String[] args) {
        //获取项目路径
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径：ACM 示例代码模板目录
        String inputPath = new File(parentFile, "yuzi-generator-demo-projects/acm-template").getAbsolutePath();

        //调用静态方法进行文件拷贝 输出路径：直接输出到项目的根目录
        copyFileByHutool(inputPath, projectPath);
    }

    //定义静态方法
    public static void copyFileByHutool(String inputPath, String outputPath){
        //使用hutool工具包进行文件拷贝
        FileUtil.copy(inputPath, outputPath, true);

    }
    /**
     * 递归拷贝文件（递归实现，会将输入目录完整拷贝到输出目录下）
     * @param inputPath
     * @param outputPath
     */
    public static void copyFileByRecursion(String inputPath, String outputPath) {
        File file = new File(inputPath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                //如果是文件夹，则递归调用
                copyFileByRecursion(f.getAbsolutePath(), outputPath + "/" + f.getName());
            } else {
                //如果是文件，则进行拷贝
                FileUtil.copy(f.getAbsolutePath(), outputPath + "/" + f.getName(), true);
            }
        }
    }
}
