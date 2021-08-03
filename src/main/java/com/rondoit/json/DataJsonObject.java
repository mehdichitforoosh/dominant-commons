package com.rondoit.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"kind", "fields", "id", "updated", "deleted", "version", "totalItems", "items"})
public class DataJsonObject {

    @JsonProperty(value = "kind", required = true)
    protected String kind;
    @JsonProperty(value = "fields", required = true)
    protected String fields;
    @JsonProperty(value = "id", required = true)
    protected String id;
    @JsonProperty(value = "updated", required = true)
    protected String updated;
    @JsonProperty(value = "deleted", required = true)
    protected Boolean deleted;
    @JsonProperty(value = "version", required = true)
    private Long version;
    @JsonProperty(value = "totalItems", required = true)
    private Long totalItems;
    @JsonProperty(value = "items", required = true)
    private List<ItemJsonObject> items;

    @JsonCreator
    public DataJsonObject() {
    }

    @JsonCreator
    public DataJsonObject(@JsonProperty(value = "kind") String kind, @JsonProperty(value = "id") String id) {
        this.kind = kind;
        this.id = id;
    }

    @JsonCreator
    public DataJsonObject(@JsonProperty(value = "kind") String kind, @JsonProperty(value = "id") String id, @JsonProperty(value = "version") Long version) {
        this.kind = kind;
        this.id = id;
        this.version = version;
    }

    @JsonCreator
    public DataJsonObject(@JsonProperty(value = "kind") String kind, @JsonProperty(value = "id") String id
            , @JsonProperty(value = "updated") String updated
            , @JsonProperty(value = "version") Long version) {
        this.kind = kind;
        this.id = id;
        this.updated = updated;
        this.version = version;
    }

    @JsonCreator
    public DataJsonObject(@JsonProperty(value = "kind") String kind, @JsonProperty(value = "id") String id
            , @JsonProperty(value = "updated") String updated) {
        this.kind = kind;
        this.id = id;
        this.updated = updated;
    }

    @JsonCreator
    public DataJsonObject(@JsonProperty(value = "totalItems") Long totalItems, @JsonProperty(value = "items") List<ItemJsonObject> items) {
        this.totalItems = totalItems;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public List<ItemJsonObject> getItems() {
        return items;
    }

    public void setItems(List<ItemJsonObject> items) {
        this.items = items;
    }
}
