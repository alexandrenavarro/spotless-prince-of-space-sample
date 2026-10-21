package com.github.alexandrenavarro.spotlessprinceofspacesample;

public final class Demo {
    static void main() {
        /* Input
        final Person person = Person //
            .builder().firstName("John").lastName("Doe").driverLicense(DriverLicense //
            .builder().id("id").build())
            .build();
       */
        // Result
        final Person person = Person
            .builder()
            .firstName("John")
            .lastName("Doe")
            .driverLicense(DriverLicense
                .builder()
                .id("id")
                //
                .build())
            //
            .build();
    }

}
