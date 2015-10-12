package com.family.business.obj;

import java.util.Date;

public interface EmployerPost extends Base
{
    Enterprise getEnterprise();

    Person getPerson();

    Date getStartWorkDate();

    Date getEndWorkDate();

    String getPost();
}
