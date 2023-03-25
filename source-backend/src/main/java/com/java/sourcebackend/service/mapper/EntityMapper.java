package com.java.sourcebackend.service.mapper;

import java.util.List;

public interface EntityMapper<E, D> {
    public D toDTO(E entity);
    public E toEntity(D dto);
    public List<D> toDTO(List<E> entities);
    public List<E> toEntity(List<D> dtoList);
}
