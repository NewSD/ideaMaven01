package cn.niu.test;

import cn.niu.service.MessageService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ami on 2018/10/30.
 */
public class MessageServiceTest {


    private MessageService messageService;

    @Before
    public void setUp(){
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage(){
        assertEquals("你好,世界!", messageService.getMessage());
    }
}
