package com.company.kotlinapp_apis.model.courier;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_disable")
    private Boolean isDisable;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String location;

    private String familyPhoneNumber;
    private Boolean star; //
    private String oneSignal;//deviceId

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String createdDate;

    private Boolean trash;

    private String trashDate;
}
