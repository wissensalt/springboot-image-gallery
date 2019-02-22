package com.wissensalt.rnd.springbootimagegallery.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created on 2/22/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Getter
@Setter
@Entity
@Table(name ="image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "path")
    private String path;
}
