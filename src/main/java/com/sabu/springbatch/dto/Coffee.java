package com.sabu.springbatch.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/27
 */
@Getter
@Setter
public class Coffee {

    private String brand;

    private String origin;

    private String characteristics;

    public Coffee(String brand, String origin, String characteristics) {
        this.brand = brand;
        this.origin = origin;
        this.characteristics = characteristics;
    }
}
