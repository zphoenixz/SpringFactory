package com.factory.model.request;

import lombok.*;

import javax.validation.constraints.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "El campo type no puede estar vacio")
    @Pattern(regexp = "^(ADMIN|EDITOR|CLIENT)$", message = "Solo acepta: ADMIN, EDITOR, CLIENT")
    private String type;
    @NotBlank(message = "El campo nombre no puede estar vacio")
    private String name;
    @Email
    private String email;
}
