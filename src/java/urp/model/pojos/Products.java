package urp.model.pojos;
// Generated 19/05/2016 11:45:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer productId;
     private Categories categories;
     private Suppliers suppliers;
     private String productName;
     private String quantityPerUnit;
     private Double unitPrice;
     private Short unitsInStock;
     private Short unitsOnOrder;
     private Short reorderLevel;
     private boolean discontinued;
     private Set orderdetailses = new HashSet(0);

    public Products() {
    }

	
    public Products(String productName, boolean discontinued) {
        this.productName = productName;
        this.discontinued = discontinued;
    }
    public Products(Categories categories, Suppliers suppliers, String productName, String quantityPerUnit, Double unitPrice, Short unitsInStock, Short unitsOnOrder, Short reorderLevel, boolean discontinued, Set orderdetailses) {
       this.categories = categories;
       this.suppliers = suppliers;
       this.productName = productName;
       this.quantityPerUnit = quantityPerUnit;
       this.unitPrice = unitPrice;
       this.unitsInStock = unitsInStock;
       this.unitsOnOrder = unitsOnOrder;
       this.reorderLevel = reorderLevel;
       this.discontinued = discontinued;
       this.orderdetailses = orderdetailses;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public Suppliers getSuppliers() {
        return this.suppliers;
    }
    
    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getQuantityPerUnit() {
        return this.quantityPerUnit;
    }
    
    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Short getUnitsInStock() {
        return this.unitsInStock;
    }
    
    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    public Short getUnitsOnOrder() {
        return this.unitsOnOrder;
    }
    
    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }
    public Short getReorderLevel() {
        return this.reorderLevel;
    }
    
    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }
    public boolean isDiscontinued() {
        return this.discontinued;
    }
    
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }
    public Set getOrderdetailses() {
        return this.orderdetailses;
    }
    
    public void setOrderdetailses(Set orderdetailses) {
        this.orderdetailses = orderdetailses;
    }




}


