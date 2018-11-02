package cn.niu.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ami on 2018/10/30.
 */
public class MessageServiceTest2 {

    private MessageService messageService;

    @Before
    public void setUp() throws Exception {
        messageService = new MessageService();
    }

    @Test
    public void getMessage() throws Exception {
        assertEquals("你好,世界!",messageService.getMessage());
    }

}