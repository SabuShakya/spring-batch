package com.sabu.springbatch.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/27
 */
@Getter
@Setter
@ToString
public class Coffee implements Serializable {

    private String brand;

    private String origin;

    private String characteristics;

    public Coffee() {
    }

    public Coffee(String brand, String origin, String characteristics) {
        this.brand = brand;
        this.origin = origin;
        this.characteristics = characteristics;
    }
}
