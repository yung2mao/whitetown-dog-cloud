package cn.whitetown.auths.config;

import cn.whitetown.dogbase.db.factory.BeanTransFactory;
import cn.whitetown.dogbase.db.factory.DefaultBeanTransFactory;
import cn.whitetown.dogbase.db.factory.DefaultQueryConditionFactory;
import cn.whitetown.dogbase.db.factory.QueryConditionFactory;
import cn.whitetown.dogbase.wache.WhiteExpireMap;
import cn.whitetown.dogbase.wache.wmil.MultiWhiteExpireMap;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author taixian
 * @date 2020/09/09
 **/
@Configuration
@ComponentScan("cn.whitetown")
@MapperScan("cn.whitetown.**.mappers")
public class AuthBaseConfig {
    /**
     * 初始化缓存容器
     * @return
     */
    @Bean
    public WhiteExpireMap whiteExpireMap(){
        return new MultiWhiteExpireMap(4);
    }

    /**
     * 初始化数据库查询条件工厂
     * @return
     */
    @Bean
    public QueryConditionFactory queryConditionFactory(){
        return new DefaultQueryConditionFactory();
    }

    /**
     * 初始化bean转换工厂
     * @return
     */
    @Bean
    public BeanTransFactory beanTransFactory(){
        return new DefaultBeanTransFactory();
    }
}
