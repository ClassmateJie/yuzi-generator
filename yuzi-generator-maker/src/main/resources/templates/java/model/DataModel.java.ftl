package ${basePackage}.model;

import lombok.Data;

/**
 * 数据模型
 */
@Data
public class DataModel {

<#list modelConfig.models as model>
    <#if model.description??>
    /**
    * ${model.description}
    */
    </#if>
    private ${model.type} ${model.fieldName}<#if model.defaultValue??> = ${model.defaultValue?c}</#if>;
</#list>

}