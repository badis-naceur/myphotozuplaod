package com.badisnaceur.photoz.clone.repository;

import com.badisnaceur.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository <Photo, Integer> {
}
