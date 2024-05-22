package com.example.minitest1.configuration;


////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////
////@SpringBootApplication
////public class AppConfiguration {
////    public static void main(String[] args) {
////        SpringApplication.run(AppConfiguration.class, args);
////    }
////}
//
//
//
//        import com.example.minitest1.service.HibernateCarService;
//        import org.springframework.beans.BeansException;
//        import org.springframework.beans.factory.annotation.Value;
//        import org.springframework.context.ApplicationContext;
//        import org.springframework.context.ApplicationContextAware;
//        import org.springframework.context.annotation.Bean;
//        import org.springframework.context.annotation.ComponentScan;
//        import org.springframework.context.annotation.Configuration;
//        import org.springframework.context.annotation.PropertySource;
//        import org.springframework.web.multipart.commons.CommonsMultipartFile;
//        import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//        import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//        import org.thymeleaf.spring5.SpringTemplateEngine;
//        import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//        import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//        import org.thymeleaf.templatemode.TemplateMode;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.example.minitest1.controller")
//@PropertySource("classpath:upload_file.properties")
//public class AppConfiguration implements WebMvcConfigurer, ApplicationContextAware {
//    private ApplicationContext applicationContext;
//
//    @Value("${upload}")
//    private String upload;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("/WEB-INF/views/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        templateResolver.setCharacterEncoding("UTF-8");
//        return templateResolver;
//    }
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//        return viewResolver;
//    }
//    @Bean
//    public HibernateCarService hibernateCarService(){
//        return new HibernateCarService();
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/img/**").addResourceLocations("file:" + upload);
//    }
//    @Bean(name = "multipartResolver")
//    public CommonsMultipartResolver getResolver() {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSizePerFile(52428800);
//        return multipartResolver;
//    }
//
//}


//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class AppConfiguration {
//    public static void main(String[] args) {
//        AppConfiguration.run(AppConfiguration.class, args);
//    }
//}

