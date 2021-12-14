package com.furkanergun.productservice.entity.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.furkanergun.productservice.entity.info.ProductInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PriceRangeCategory implements Serializable {
    @Id
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "priceRangeCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    public PriceRangeCategory(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
