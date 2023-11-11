package com.hyun.portfolio7.entities.reference;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class UserName {
    private String firstName;
    private String lastName;
}
