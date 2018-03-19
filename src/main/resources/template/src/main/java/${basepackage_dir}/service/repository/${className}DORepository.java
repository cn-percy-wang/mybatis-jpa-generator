<#include "/java_copyright.include">
<#assign className = table.className>
package ${basepackage}.service.repository;

import org.springframework.data.mybatis.repository.support.MybatisRepository;
import ${basepackage}.service.repository.dataobject.${className}DO;
import org.springframework.stereotype.Repository;

/**
 * 
 * ${table.remarks}mybatis表操作mapper
 * 
 * @author generator
 * @version ${now?string('yyyy-MM-dd HH:mm:ss')}
 *
 */
@Repository
public interface ${className}DORepository extends MybatisRepository<${className}DO, ${table.idColumn.simpleJavaType}> {
}
