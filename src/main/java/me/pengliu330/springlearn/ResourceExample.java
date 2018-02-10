package me.pengliu330.springlearn;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by peng on 18/2/10.
 */
public class ResourceExample {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beans.xml");
        try {
            InputStream ins = resource.getInputStream();
            System.out.println(resource.getFilename());
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
