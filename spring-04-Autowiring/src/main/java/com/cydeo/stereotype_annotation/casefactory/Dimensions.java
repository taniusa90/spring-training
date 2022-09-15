package com.cydeo.stereotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

