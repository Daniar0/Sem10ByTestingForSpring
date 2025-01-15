package org.example.sem10bytest1.model;

import java.util.List;

public class Order {
    private Long id;
    private List<String> items;
    private String status;

    public Order(Long id, List<String> items, String status) {
        this.id = id;
        this.items = items;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
