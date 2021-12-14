package com.furkanergun.productservice.entity.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.furkanergun.productservice.entity.images.ApparelImages;
import com.furkanergun.productservice.entity.info.ProductInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class GenderCategory implements Serializable {
    @Id
    private int id;

    private String type;

    @OneToMany(mappedBy = "genderCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "genderCategory")
    @JsonIgnore
    private List<ApparelImages> apparelImages;

    public GenderCategory(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
