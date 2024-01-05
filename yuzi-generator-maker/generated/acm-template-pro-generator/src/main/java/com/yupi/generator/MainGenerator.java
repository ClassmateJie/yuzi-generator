package com.yupi.generator;

import com.yupi.model.DataModel;

import java.io.File;
import java.io.IOException;
import lombok.SneakyThrows;
/**
 * 核心生成器
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    @SneakyThrows
    public static void doGenerate(Object model){
        String inputRootPath = "F:/yuzi-generator/yuzi-generator-demo-projects/acm-template-pro";
        String outputRootPath = "generated";

        String inputPath;
        String outputPath;
    
    	inputPath = new File(inputRootPath, "src/com/yupi/acm/MainTemplate.java.ftl").getAbsolutePath();
    	outputPath = new File(outputRootPath, "src/com/yupi/acm/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerate(inputPath, outputPath, model);
    
    	inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
    	outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
        StaticGenerator.copyFileByHutool(inputPath, outputPath);
    
    	inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
    	outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
        StaticGenerator.copyFileByHutool(inputPath, outputPath);
    }
}