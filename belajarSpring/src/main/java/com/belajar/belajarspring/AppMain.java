import com.belajar.belajarspring.AppConfiguration;
import com.belajar.belajarspring.SetterBasedInjection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextIOC = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SetterBasedInjection messageService  = contextIOC.getBean(SetterBasedInjection.class);
        messageService.processMessage("HALO GEIS");
    }
}
