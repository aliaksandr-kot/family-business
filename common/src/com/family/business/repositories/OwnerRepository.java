package com.family.business.repositories;

import com.family.business.obj.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long>
{

}
