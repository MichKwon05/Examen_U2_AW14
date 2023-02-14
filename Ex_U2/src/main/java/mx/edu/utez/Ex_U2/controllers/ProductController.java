package mx.edu.utez.Ex_U2.controllers;


import mx.edu.utez.Ex_U2.dto.ProductDto;
import mx.edu.utez.Ex_U2.models.product.Product;
import mx.edu.utez.Ex_U2.services.ProductServices;
import mx.edu.utez.Ex_U2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-ventas/product/")
@CrossOrigin(origins = {"*"})
public class ProductController {

    ///apis & bd

    @Autowired
    private ProductServices service;

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
    }

    //modificar status

    //status prod
    /*@PatchMapping("/")
    public ResponseEntity<CustomResponse<Integer>> enableOrDisable(
            @RequestBody ProductDto prouductDto){
        return new ResponseEntity<>(
                this.service.changeStatus(prouductDto.getProduct()),
                HttpStatus.OK
        );
    }*/


}
