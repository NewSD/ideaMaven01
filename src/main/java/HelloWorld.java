import cn.niu.service.MessageService;
import org.apache.log4j.Logger;

/**
 * Created by ami on 2018/10/30.
 */
public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        String message = messageService.getMessage();

        LOGGER.info("收到信息: "+message);
    }
}
