package com.bshop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator;
import org.springframework.webflow.security.SecurityFlowExecutionListener;


public class WebFlowConfig /*extends AbstractFlowConfiguration*/ {

/*
	@Bean
	public FlowExecutor flowExecutor(){
		return getFlowExecutorBuilder(flowRegistry())
				.addFlowExecutionListener(new SecurityFlowExecutionListener(),"*")
				.build();
	}

	
	@Bean
	public FlowDefinitionRegistry flowRegistry(){
		return getFlowDefinitionRegistryBuilder(flowBuilderServices())
				.setBasePath("/WEB-INF")
				.addFlowLocationPattern("/**-flow.xml").build();
	}
	
	@Bean
	public FlowBuilderServices flowBuilderServices(){
		return getFlowBuilderServicesBuilder()
				.setViewFactoryCreator(m)
	}
	
	@Bean
	public MvcViewFactoryCreator mvcViewFactoryCreator(){
		MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
		factoryCreator.setViewResolvers();
	}
	*/
}
