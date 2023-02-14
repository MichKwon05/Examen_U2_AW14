package mx.edu.utez.Ex_U2.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.Ex_U2.models.product.Product;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ProductDto {

    private Long id;
    /*@NotEmpty(message = "Campo obligatorio")
    @Size(min = 3, max = 50)*/
    private String nameP;
    /*@NotEmpty(message = "Campo obligatorio")
    @Size(min = 3, max = 50)*/
    private String categoryP;

    /*@NotEmpty(message = "Campo obligatorio")
    @Size(min = 3, max = 50)*/
    private int priceP;

    private Boolean statusP = true;

    public Product getProduct() {
        return new Product(
                getId(),
                getNameP(),
                getCategoryP(),
                getPriceP(),
                getStatusP()
        );
    }
}

/*ID del producto (entero, clave primaria)
Nombre del producto (texto)
Categoría del producto (texto)
Precio del producto (decimal)
Disponibilidad (booleano)
*/
