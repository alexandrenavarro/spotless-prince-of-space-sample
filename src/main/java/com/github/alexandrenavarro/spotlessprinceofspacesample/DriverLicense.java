package com.github.alexandrenavarro.spotlessprinceofspacesample;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
public final class DriverLicense {
    private final String id;
}
