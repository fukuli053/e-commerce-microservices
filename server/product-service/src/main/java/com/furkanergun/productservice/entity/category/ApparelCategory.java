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
public class ApparelCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "apparelCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "apparelCategory")
    @JsonIgnore
    private List<ApparelImages> apparelImages;

    public ApparelCategory(String type) {
        this.type = type;
    }
}
