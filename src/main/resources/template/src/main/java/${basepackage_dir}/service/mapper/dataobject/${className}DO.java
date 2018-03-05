<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.mapper.auto.dataobject;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lombok.Data;
import org.apache.ibatis.features.jpa.annotation.Entity;
import org.apache.ibatis.features.jpa.annotation.Table;
import org.apache.ibatis.features.jpa.annotation.Id;
import org.apache.ibatis.features.jpa.annotation.Column;


/**
 * 
 * ${table.remarks} 数据库表映射
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
@Data
@Entity
@Table(name="${table.sqlName}")
public class ${className}DO {

    <#list table.columns as column>
    /**
     * ${column.remarks}
     */
    <#if column.pk>
    @Id
    <#else>
    @Column<#if !column.updatable || column.columnName == "CreateTime" && column.columnName == "LastUpdateTime" && column.columnName == "Id">(updatable=false, insertable=false)</#if>
    </#if>
    private ${column.simpleJavaType} ${column.columnNameLower};
    </#list>

}
