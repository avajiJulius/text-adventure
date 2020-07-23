package edu.java.domain.items;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Table(name = "items")
@Entity
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_level")
    private Integer itemLevel;
    @Column(name = "item_status")
    private ItemStatus itemStatus;
    private String description;

    public Item() {
    }

    public Item(Integer itemId, String itemName, Integer itemLevel, ItemStatus itemStatus, String description) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemLevel = itemLevel;
        this.itemStatus = itemStatus;
        this.description = description;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
