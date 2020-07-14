package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class IDCard implements Serializable {
    private String identityNumber;
}
