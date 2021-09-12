package com.example.mongo.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;

public interface Specification<T> {

    Predicate toPredicate(Root<T> root, CriteriaQuery query, CriteriaBuilder cb);
}

//interface Specification<T>{
//
//    Predicate toPredicate(Root<T> root,
//                          CriteriaQuery<?> query,
//                          CriteriaBuilder criteriaBuilder);
//
//}