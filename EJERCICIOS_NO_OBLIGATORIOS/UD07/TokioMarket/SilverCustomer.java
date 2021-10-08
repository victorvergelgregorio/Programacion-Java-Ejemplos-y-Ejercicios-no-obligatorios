package com.tokioschool.tokiomarket.domain;

import java.time.LocalDate;

public class SilverCustomer extends AbstractCustomer {

    public SilverCustomer(String name, String surname, LocalDate birthDate, String address, String province, String city, float discount) {
        super(name, surname, birthDate, address, province, city, discount);
    }

    @Override
    public void pay() {

    }
}
