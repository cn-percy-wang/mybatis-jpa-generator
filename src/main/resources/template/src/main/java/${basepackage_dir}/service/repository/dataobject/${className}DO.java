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
import cn.migu.music.common.dataobject.BaseDO;

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
public class ${className}DO extends BaseDO<${table.idColumn.simpleJavaType}> {

    <#list table.columns as column>
    <#if column.columnName != "CreatedTime" && column.columnName != "LastModifiedTime" && column.columnName != "Id">
    /**
     * ${column.remarks}
     */
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#if>
    </#list>

}
