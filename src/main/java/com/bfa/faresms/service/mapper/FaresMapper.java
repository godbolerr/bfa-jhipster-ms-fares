package com.bfa.faresms.service.mapper;

import com.bfa.faresms.domain.*;
import com.bfa.faresms.service.dto.FaresDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Fares and its DTO FaresDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FaresMapper {

    FaresDTO faresToFaresDTO(Fares fares);

    List<FaresDTO> faresToFaresDTOs(List<Fares> fares);

    Fares faresDTOToFares(FaresDTO faresDTO);

    List<Fares> faresDTOsToFares(List<FaresDTO> faresDTOs);
}
