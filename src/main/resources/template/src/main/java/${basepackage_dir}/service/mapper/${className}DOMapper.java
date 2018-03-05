<#include "/java_copyright.include">
<#assign className = table.className>
package ${basepackage}.service.mapper.auto;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ${basepackage}.service.mapper.dataobject.${className}DO;
import org.apache.ibatis.features.jpa.mapper.JpaMapper;

/**
 * 
 * ${table.remarks}mybatis表操作mapper
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
@Mapper
public interface ${className}DOMapper extends JpaMapper<${className}DO, ${table.idColumn.simpleJavaType}> {
}
