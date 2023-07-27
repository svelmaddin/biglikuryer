package com.company.kotlinapp_apis.service.impl.finance;

import com.company.kotlinapp_apis.dao.finance.CourierToAdminDeptBalanceDetRepository;
import com.company.kotlinapp_apis.dto.finance.CourierToAdminDeptBalanceDetDto;
import com.company.kotlinapp_apis.model.finance.CourierCurrentBalanceDet;
import com.company.kotlinapp_apis.model.finance.CourierToAdminDeptBalanceDet;
import org.modelmapper.ModelMapper;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourierToAdminDeptBalanceDetImpl {
    private final CourierToAdminDeptBalanceDetRepository repository;
    private final ModelMapper modelMapper;

    public CourierToAdminDeptBalanceDetImpl(CourierToAdminDeptBalanceDetRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    //getAllCourierToAdminDeptBalance
    //getCourierCurrentBalanceDetById
    //saveCourierCurrentBalanceDet
    //deleteCourierCurrentBalanceDet


    //ALL
    public List<CourierToAdminDeptBalanceDetDto> getAllCourierToAdminDeptBalanceDet() {
        return repository.findAll().stream().map(x -> modelMapper.map(x, CourierToAdminDeptBalanceDetDto.class))
                .collect(Collectors.toList());

    }

    //ID
    public CourierToAdminDeptBalanceDetDto getCourierToAdminDeptBalanceDetById(Long id) {
        Optional<CourierToAdminDeptBalanceDet> fromDb = repository.findById(id);
        return fromDb.map(x -> modelMapper.map(x, CourierToAdminDeptBalanceDetDto.class))
                .orElse(null);
    }

    //CREATE
    public CourierToAdminDeptBalanceDetDto saveCourierToAdminDeptBalanceDet(CourierToAdminDeptBalanceDetDto dto) {
        CourierToAdminDeptBalanceDet balanceDet = modelMapper.map(dto, CourierToAdminDeptBalanceDet.class);
        repository.save(balanceDet);
        return modelMapper.map(balanceDet, CourierToAdminDeptBalanceDetDto.class);
    }

    //DELETE
    public Boolean deleteCourierToAdminDeptBalanceDetById(Long id) {
        Optional<CourierToAdminDeptBalanceDet> fromDb = repository.findById(id);
        if (fromDb.isPresent()) {
            CourierToAdminDeptBalanceDet det = fromDb.get();
            repository.delete(det);
            return true;
        }
        return false;
    }

}
