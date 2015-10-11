package com.family.business.obj;

import java.util.Date;

public interface EmployerWork extends Base
{
    Enterprise getEnterprise();

    Person getPerson();

    Date getWorkDate();
}
