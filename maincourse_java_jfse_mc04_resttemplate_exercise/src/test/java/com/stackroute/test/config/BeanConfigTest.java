package com.stackroute.test.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Bean;
import java.lang.reflect.Method;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class BeanConfigTest {
    private String parameterClassName;

    @Test
    void getRestTemplate() throws ClassNotFoundException {
        Method[] methodArray=Class.forName("com.stackroute.config.BeanConfig").getDeclaredMethods();
        for(Method method: methodArray){
            if ((method.getAnnotation(Bean.class))!=null){
                parameterClassName= method.getReturnType().getName();

            }
        }
        assertThat(parameterClassName).isEqualTo("org.springframework.web.client.RestTemplate");
    }
}
