package com.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @Title
 * <p>Description:
 * 显示api文档列表</P>
 * @author tan.bin
 * @date   2016年9月23日
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	  	@Bean
	    public Docket createRestApi() {
	        ApiInfo apiInfo = new ApiInfoBuilder()
	                .title("构建 bf-cloud-provider  APIs")
	                .description("客户端与服务端接口文档")
	                .termsOfServiceUrl("com.boot")
	                .version("1.0.0")
	                .build();

	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.boot.controller"))
	                .paths(PathSelectors.any())
	                .build();
	    }
}
