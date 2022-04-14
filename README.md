# SpringBoot-Reactive-Security-Basic


### add public resources 

```java

    // WebFluxConfigurer
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/public/");
    }

    // WebFluxSecurity
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
            .authorizeExchange()
            .pathMatchers("/resources/**").permitAll()
            .anyExchange().authenticated()
        return http.build();
    }
    
    // Resources folder
    resources 
      public
        hello.txt

    // Access url
    http://localhost:8080/resources/hello.txt

```