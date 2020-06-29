package jp.co.internous.angular.model.domain.dto;

import java.sql.Timestamp;

public class PurchaseHistoryDto {
	
	private long id; //tbl_purchase_history.id
	private long userId; //tbl_purchase_history.user_id
	private long productId; //tbl_purchase_history.product_id
	private long destinationId; //tbl_purchase_history.destination_id
	private Timestamp purchasedAt; //tbl_purchase_history.purchased_at
	private String productName; //mst_product.product_name
	private long price; //mst_prodcut.price
	private long productCount; ////tbl_purchase_history.product_count
	private String familyName; //mst_destination.family_name
	private String firstName; //mst_destination.first_name
	private String address; //mst_destination.address
	
	public PurchaseHistoryDto() {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(long destinationId) {
		this.destinationId = destinationId;
	}

	public Timestamp getPurchasedAt() {
		return purchasedAt;
	}

	public void setPurchasedAt(Timestamp purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getProductCount() {
		return productCount;
	}

	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
