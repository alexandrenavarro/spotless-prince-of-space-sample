package com.github.alexandrenavarro.spotlessprinceofspacesample;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.jspecify.annotations.Nullable;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public final class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final Integer yearOfBirth;
    private final DriverLicense driverLicense;
}
