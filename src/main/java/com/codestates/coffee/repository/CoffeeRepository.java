package com.codestates.coffee.repository;

import com.codestates.coffee.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

    Optional<Coffee> findByCoffeeCode(String coffeeCode);

    @Query(value = "SELECT c FROM Coffee c WHERE c.coffeeId = :coffeeId") //  ‘SELECT c’ 생략 가능
    Optional<Coffee> findByCoffee(long coffeeId);

    //Optional<Coffee> findByCoffeeId(long coffeeId); // 위 메서드랑 같은거
}
