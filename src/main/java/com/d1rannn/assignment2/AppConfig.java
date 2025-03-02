// Configuration Class
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }
}