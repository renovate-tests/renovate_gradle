@SpringBootApplication(exclude = { EmbeddedMongoAutoConfiguration.class })
@EnableRabbit
public class DatawarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatawarehouseApplication.class, args);
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver r = new AcceptHeaderLocaleResolver();
        r.setDefaultLocale(Locale.FRANCE);
        return r;
    }

}
