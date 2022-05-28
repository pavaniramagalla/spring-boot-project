package springboot.app.model;

import javax.persistence.Entity;

@Entity
public class Assets extends Organization {
    private String assetModel;

    public Assets() {
    }

    public Assets(String assetName, String assetModel) {
        super(assetName);
        this.assetModel = assetModel;
    }
}
