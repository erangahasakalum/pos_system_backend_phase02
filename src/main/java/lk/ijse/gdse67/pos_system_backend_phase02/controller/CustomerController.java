package lk.ijse.gdse67.pos_system_backend_phase02.controller;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveCustomer(@RequestBody CustomerDto customerDto){
            customerService.saveCustomer(customerDto);
    }

}
