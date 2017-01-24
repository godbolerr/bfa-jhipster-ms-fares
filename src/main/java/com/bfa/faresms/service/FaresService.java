package com.bfa.faresms.service;

import com.bfa.faresms.service.dto.FaresDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Service Interface for managing Fares.
 */
public interface FaresService {

    /**
     * Save a fares.
     *
     * @param faresDTO the entity to save
     * @return the persisted entity
     */
    FaresDTO save(FaresDTO faresDTO);

    /**
     *  Get all the fares.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<FaresDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" fares.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    FaresDTO findOne(Long id);

    /**
     *  Delete the "id" fares.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
