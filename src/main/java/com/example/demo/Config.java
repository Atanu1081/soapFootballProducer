package com.example.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter
{
    @Bean
    public ServletRegistrationBean messageDispatcherServlet (ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/service/*");

    }

    @Bean(name = "footballerWSDl")
    public DefaultWsdl11Definition defaultWsdl11Definition (XsdSchema footballerSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FootballerDetailsPort");
        wsdl11Definition.setLocationUri("/service/footballer-details");
        wsdl11Definition.setTargetNamespace("https://www.howtodoinjava.com/xml/school");
        wsdl11Definition.setSchema(footballerSchema);
        return wsdl11Definition;

    }

    @Bean
    public XsdSchema footballerSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("football.xsd"));
    }

}
