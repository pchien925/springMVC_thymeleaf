package com.PhamChien.SpringMVC_thymeleaf.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {
    private String categoryname;
    private String images;
    private int status;

    private Boolean isEdit=false;
}
