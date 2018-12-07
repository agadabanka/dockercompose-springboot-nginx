package com.cnc.springboot;

import com.cnc.springboot.PlayerProtos.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PlayerWrapper
{
    private static final Logger logger = LoggerFactory.getLogger(PlayerWrapper.class);

    public PlayerWrapper()
    {

    }

    public Player createPlayer()
    {
        logger.info("creating player");
        return Player.newBuilder().setId("123").setName("abc").setLevel(11).setToken("token-11").build();
    }
}