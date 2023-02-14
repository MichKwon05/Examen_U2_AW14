package mx.edu.utez.Ex_U2.models.product;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;

    @Column(nullable = false, length = 50)
    private String nameProduct;

    @Column(nullable = false, length = 50)
    private String categoryProduct;

    @Column(nullable = false)
    private float priceProduct;
    @Column(nullable = false, columnDefinition = "TINYINT DEFAULT 1")
    private Boolean statusProduct;

    ///transaccion idproduct
    public Product(long idProduct, String nameProduct, String categoryProduct, float priceProduct, Boolean statusProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.priceProduct = priceProduct;
        this.statusProduct = statusProduct;
    }
}

/*ID del producto (entero, clave primaria)
Nombre del producto (texto)
Categoría del producto (texto)
Precio del producto (decimal)
Disponibilidad (booleano)
*/