package main.java.core.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import main.java.core.BaseDriver;
import main.java.core.drivers.BaseDriverImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverModule extends AbstractModule {

    protected final static Logger MODULE_LOGGER = LoggerFactory.getLogger("ModuleLogger");


    @Override
    protected void configure() {
        MODULE_LOGGER.info("Initialising modules.....");
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/application.properties"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        Names.bindProperties(binder(), props);
        bind(BaseDriver.class)
                .to(BaseDriverImpl.class)
                .in(Scopes.SINGLETON);
        bind(BaseDriverImpl.class).in(Scopes.SINGLETON);
        MODULE_LOGGER.info("All instanced up and running.");
    }
}
