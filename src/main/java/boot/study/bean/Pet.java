package boot.study.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
public class Pet {
    private String name;
    private Double weight;
}
