package mx.edu.utez.Ex_U2.controllers;

import mx.edu.utez.Ex_U2.dto.ProductDto;
import mx.edu.utez.Ex_U2.models.product.Product;
import mx.edu.utez.Ex_U2.services.ProductServices;
import mx.edu.utez.Ex_U2.services.UsrServices;
import mx.edu.utez.Ex_U2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UserController {

    /*

    @Autowired
    private UsrServices service;

    //todos productos
    @GetMapping("/")
    public ResponseEntity<CustomResponse<List<Product>>> getAll(){
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }

    //consulta registro
    @GetMapping("/{id}")
    public ResponseEntity<CustomResponse<Product>> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(
                this.service.getOne(id),
                HttpStatus.OK
        );
    }

    //registrar
    @GetMapping("/")
    public ResponseEntity<CustomResponse<Product>> insert(
            @Validated @RequestBody ProductDto prouductDto){
        return new ResponseEntity<>(
                this.service.insert(prouductDto.getProduct()),
                HttpStatus.CREATED
        );
    }

    ///mod pro
    @PutMapping("/")
    public ResponseEntity<CustomResponse<Product>> update(
            @RequestBody ProductDto productdto, @Validated BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(
                    null,
                    HttpStatus.BAD_REQUEST
            );
        }
        return new ResponseEntity<>(
                this.service.update(productdto.getProduct()),
                HttpStatus.CREATED
        );
    }*/
}
