package com.springevents.SpringEventProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springevents.SpringEventProject.entity.Favorites;

public interface EventRepository extends JpaRepository<Favorites, Integer>{

}
