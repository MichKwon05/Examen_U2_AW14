package mx.edu.utez.Ex_U2.services;


import mx.edu.utez.Ex_U2.models.product.Product;
import mx.edu.utez.Ex_U2.models.product.ProductRepository;
import mx.edu.utez.Ex_U2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLDataException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    ///todos registros
    @Transactional(readOnly = true)
    public CustomResponse <List<Product>> getAll(){
        return new CustomResponse<>(
                this.repository.findAll(),
                false,
                200,
                "Ok"
        );
        //llama retorna repo
    }

    //servicio consulta un product
    @Transactional(readOnly = true)
    public CustomResponse<Product> getOne(Long id){
        return new CustomResponse<>(
                this.repository.findById(id).get(),
                false,
                200,
                "Ok"
        );
    }

    //insrta
    @Transactional(rollbackFor =  {SQLDataException.class})
    public CustomResponse<Product> insert(Product product){
        if(this.repository.existsById(product.getIdProduct()))
            return new CustomResponse<>(
                    null,
                    true,
                    400,
                    "Producto ya registrado"
            );
        return new CustomResponse<>(
                this.repository.saveAndFlush(product),
                false,
                200,
                "Producto registrado correctamente"
        );
    }

    //inserta
   /* @Transactional(rollbackFor = {SQLDataException.class})
    public CustomResponse<Product> insert(Product product){

        if(!this.repository.existsById(product.getIdProduct())){
            return new CustomResponse<>(
                    null,
                    true,
                    400,
                    "Producto ya registrado"
            );
        }
        return new CustomResponse<>(
                this.repository.saveAndFlush(product),
                false,
                200,
                "Persona registrada correctamente"
        );
    }*/

    //Modifica product
    @Transactional(rollbackFor = {SQLDataException.class})
    public CustomResponse<Product> update(Product product){
        if(!this.repository.existsById(product.getIdProduct())){
            return new CustomResponse<>(
                    null,
                    true,
                    400,
                    "El producto no existe"
            );
        }
        return new CustomResponse<>(
                this.repository.saveAndFlush(product),
                false,
                200,
                "Producto actualizado"
        );
    }


}
