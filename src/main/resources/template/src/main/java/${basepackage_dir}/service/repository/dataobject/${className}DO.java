<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.repository.dataobject;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mybatis.annotations.Column;
import org.springframework.data.mybatis.annotations.Entity;


/**
 * 
 * ${table.remarks} 数据库表映射
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
@Data
@Entity(table="${table.sqlName}")
public class ${className}DO {

    <#list table.columns as column>
    /**
     * ${column.remarks}
     */
    <#if column.pk>@Id<#else><#if !column.updatable || !column.insertable || column.columnName == "CreateTime" && column.columnName == "LastUpdateTime" && column.columnName == "Id">@Column(updatable=false, insertable=false)</#if></#if>
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#list>

}
