package com.hyun.portfolio7.entities.reference;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
public class UserName {
    private String firstName;
    private String lastName;
}
