package com.company.kotlinapp_apis.service.impl.finance;

import com.company.kotlinapp_apis.dao.finance.AdminYourDeptBalanceDetRepository;
import com.company.kotlinapp_apis.dto.finance.AdminYourDeptBalanceDetDto;
import com.company.kotlinapp_apis.model.finance.CourierYourDeptBalanceDet;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminYourDeptBalanceDetImpl {

    private final AdminYourDeptBalanceDetRepository repository;
    private final ModelMapper modelMapper;

    public AdminYourDeptBalanceDetImpl(AdminYourDeptBalanceDetRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    //ALL
    public List<AdminYourDeptBalanceDetDto> getAllAdminYourDeptBalanceDets() {
        List<CourierYourDeptBalanceDet> list = repository.findAll();
        return list.stream()
                .map(det -> modelMapper.map(det, AdminYourDeptBalanceDetDto.class))
                .toList();
    }

    //ById
    public AdminYourDeptBalanceDetDto getAdminYourDeptBalanceDetById(Long id) {
        Optional<CourierYourDeptBalanceDet> optional = repository.findById(id);
        return optional.map(det -> modelMapper.map(det, AdminYourDeptBalanceDetDto.class)).orElse(null);
    }

    //Save
    public AdminYourDeptBalanceDetDto saveAdminYourDeptBalanceDet(AdminYourDeptBalanceDetDto dto) {
        CourierYourDeptBalanceDet det = modelMapper.map(dto, CourierYourDeptBalanceDet.class);
        det = repository.save(det);
        return modelMapper.map(det, AdminYourDeptBalanceDetDto.class);
    }

    //Delete
    public Boolean deleteAdminYourDeptBalanceDet(Long id) {
        Optional<CourierYourDeptBalanceDet> optional = repository.findById(id);
        if (optional.isPresent()) {
            CourierYourDeptBalanceDet det = optional.get();
            repository.delete(det);
            return true;
        }
        return false;
    }

}
