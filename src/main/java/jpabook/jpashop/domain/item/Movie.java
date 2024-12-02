package jpabook.jpashop.domain.item;

import jakarta.persistence.Entity;
import jpabook.jpashop.domain.Item;

@Entity
public class Movie extends Item {

    private String director;
    private String actor;
}
