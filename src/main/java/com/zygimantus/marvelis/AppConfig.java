package com.zygimantus.marvelis;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zygimantus
 */
@Service
@Sources("classpath:app.properties")
public interface AppConfig extends Config {

    String publicKey();

    String privateKey();

}
