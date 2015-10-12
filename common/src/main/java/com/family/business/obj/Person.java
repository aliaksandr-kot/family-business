package com.family.business.obj;

import java.util.Collection;
import java.util.Date;

public interface Person extends Base
{
    String getFirstName();

    String getMiddleName();

    String getLastName();

    Date getBirthDay();

    String getPassportShort();

    String getPassportLong();

    String getAddress();

    String getPhone();

    String getPhoto();

    Collection<EmployerWork> getEmployerWorks();
}
