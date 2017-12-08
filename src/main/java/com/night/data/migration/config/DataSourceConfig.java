package com.night.data.migration.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月4日 上午10:03:41
 */
@Configuration
//@PropertySource(value = {"classpath:/application.properties", "C:/Users/Administrator/Desktop/application.properties"}, ignoreResourceNotFound = true)
public class DataSourceConfig {
	
	@Bean(name = "hotelDataSource")
	@Qualifier("hotelDataSource")
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource() {
		if(System.getProperties().keySet().size() > 0) {
			DruidDataSource ds = new DruidDataSource();
			ds.setUrl(System.getProperty("spring.datasource.primary.url"));
			ds.setName(System.getProperty("spring.datasource.primary.username"));
			ds.setPassword(System.getProperty("spring.datasource.primary.password"));
			ds.setDriverClassName(System.getProperty("spring.datasource.primary.driver-class-name"));
			return ds;
		}else {
			return DataSourceBuilder.create().build();
		}
    }
	
	@Bean(name = "aliyuanDataSource")
	@Qualifier("aliyuanDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
		if(System.getProperties().keySet().size() > 0) {
			DruidDataSource ds = new DruidDataSource();
			ds.setUrl(System.getProperty("spring.datasource.secondary.url"));
			ds.setName(System.getProperty("spring.datasource.secondary.username"));
			ds.setPassword(System.getProperty("spring.datasource.secondary.password"));
			ds.setDriverClassName(System.getProperty("spring.datasource.secondary.driver-class-name"));
			return ds;
		}else {
			return DataSourceBuilder.create().build();
		}
    }

	@Bean(name = "hotelJdbcTemplate")
    public JdbcTemplate hotelJdbcTemplate(@Qualifier("hotelDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "aliyuanJdbcTemplate")
    public JdbcTemplate aliyuanJdbcTemplate(@Qualifier("aliyuanDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
