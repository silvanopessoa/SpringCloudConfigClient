package br.com.silvanopessoa;

import org.springframework.http.HttpStatus;

import static org.slf4j.LoggerFactory.getLogger;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class TesteController {

    private static final Logger LOGGER = getLogger(TesteController.class);
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Void> getUsuario() {
		LOGGER.info("INFO");
		LOGGER.debug("DEBUG");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
