package mx.edu.utez.Ex_U2.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomResponse <T>{
    T data;
    Boolean error;
    int StatusCode;
    String message;


}