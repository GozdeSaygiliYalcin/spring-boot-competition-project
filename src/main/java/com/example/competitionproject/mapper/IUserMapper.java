package com.example.competitionproject.mapper;

import com.example.competitionproject.dto.request.RegisterRequestDto;
import com.example.competitionproject.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    /**
     *
     * User servicede yorumda olan kodlar
     * diğer bir yöntemdir
     */
    User toUser(RegisterRequestDto dto);
}
