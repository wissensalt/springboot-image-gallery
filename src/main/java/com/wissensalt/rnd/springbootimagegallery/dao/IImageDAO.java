package com.wissensalt.rnd.springbootimagegallery.dao;

import com.wissensalt.rnd.springbootimagegallery.data.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2/22/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Repository
public interface IImageDAO extends JpaRepository<Image, Integer> {
}
