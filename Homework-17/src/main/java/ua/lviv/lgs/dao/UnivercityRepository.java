package ua.lviv.lgs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import ua.lviv.lgs.domain.Univercity;

public interface UnivercityRepository extends JpaRepository<Univercity, Long> {

	List<Univercity> findByName(String name);

	List<Univercity> findByAddress(String address);

}
