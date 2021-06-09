/*
l * AdministratorDashboardRepository.java
 *
 * Copyright (C) 2012-2021 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.administrator.dashboard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {



	@Query(value = "select STD(d.money_amount) from Dude d where d.money_currency = '€' ", nativeQuery = true)
	Double devitationmoneydude();



	@Query("select 1.0 * count(a) / (select count(b) from Dude b) from Dude a where a.shoutisdude = true")
	Double ratioshoutsdude();


}
