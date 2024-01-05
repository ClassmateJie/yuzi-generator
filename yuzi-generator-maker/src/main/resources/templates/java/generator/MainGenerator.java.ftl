package ${basePackage}.generator;

import ${basePackage}.model.DataModel;

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
        String inputRootPath = "${fileConfig.inputRootPath}";
        String outputRootPath = "${fileConfig.outputRootPath}";

        String inputPath;
        String outputPath;
	<#list fileConfig.files as fileInfo>
    
    	inputPath = new File(inputRootPath, "${fileInfo.inputPath}").getAbsolutePath();
    	outputPath = new File(outputRootPath, "${fileInfo.outputPath}").getAbsolutePath();
    	<#if fileInfo.generateType == "static">
        StaticGenerator.copyFileByHutool(inputPath, outputPath);
    	<#else>
        DynamicGenerator.doGenerate(inputPath, outputPath, model);
    	</#if>
	</#list>
    }
}