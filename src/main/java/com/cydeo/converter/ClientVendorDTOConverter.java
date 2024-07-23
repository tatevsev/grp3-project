package com.cydeo.converter;

import com.cydeo.dto.ClientVendorDto;
import com.cydeo.service.ClientVendorService;
import org.springframework.core.convert.converter.Converter;

public class ClientVendorDTOConverter implements Converter<String, ClientVendorDto> {

    private final ClientVendorService clientVendorService;

    public ClientVendorDTOConverter(ClientVendorService clientVendorService) {
        this.clientVendorService = clientVendorService;
    }

    @Override
    public ClientVendorDto convert(String source) {
        if (source == null || source.equals("")) {
            return null;
        }
        return clientVendorService.findById(Long.parseLong(source));
    }
}
