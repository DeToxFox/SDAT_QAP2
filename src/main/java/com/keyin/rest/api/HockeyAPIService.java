package com.keyin.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "hockey", path = "hockey")
public interface HockeyAPIService extends JpaRepository<Hockey, Long> {
    public List<Hockey> findByTeam(@Param("code")String code);
    public List<Hockey> findByHeadCoach(@Param("code")String code);
    public List<Hockey> findByTeamCaptain(@Param("code")String code);




}
