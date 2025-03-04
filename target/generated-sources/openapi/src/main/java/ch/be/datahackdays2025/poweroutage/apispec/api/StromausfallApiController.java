package ch.be.datahackdays2025.poweroutage.apispec.api;

import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldung;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T22:36:43.185684700+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.stromausfall.base-path:/v1}")
public class StromausfallApiController implements StromausfallApi {

    private final StromausfallApiDelegate delegate;

    public StromausfallApiController(@Autowired(required = false) StromausfallApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StromausfallApiDelegate() {});
    }

    @Override
    public StromausfallApiDelegate getDelegate() {
        return delegate;
    }

}
