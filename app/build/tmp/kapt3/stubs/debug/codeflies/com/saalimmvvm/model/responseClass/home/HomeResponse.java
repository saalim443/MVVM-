package codeflies.com.saalimmvvm.model.responseClass.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003JS\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006 "}, d2 = {"Lcodeflies/com/saalimmvvm/model/responseClass/home/HomeResponse;", "Ljava/io/Serializable;", "sliderArray", "", "Lcodeflies/com/saalimmvvm/model/responseClass/home/SliderArray;", "topCategoryArray", "Lcodeflies/com/saalimmvvm/model/responseClass/home/HomeItem;", "topBrandArray", "groceryItemsArray", "homePageCallStatus", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getGroceryItemsArray", "()Ljava/util/List;", "getHomePageCallStatus", "()Z", "getSliderArray", "getTopBrandArray", "getTopCategoryArray", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
public final class HomeResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.SliderArray> sliderArray = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topCategoryArray = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topBrandArray = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> groceryItemsArray = null;
    private final boolean homePageCallStatus = false;
    
    public HomeResponse(@com.fasterxml.jackson.annotation.JsonProperty(value = "sliderArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.SliderArray> sliderArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "topCategoryArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topCategoryArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "topBrandArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topBrandArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "groceryItemsArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> groceryItemsArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "homePageCallStatus")
    boolean homePageCallStatus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.SliderArray> getSliderArray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> getTopCategoryArray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> getTopBrandArray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> getGroceryItemsArray() {
        return null;
    }
    
    public final boolean getHomePageCallStatus() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.SliderArray> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "sliderArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.SliderArray> sliderArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "topCategoryArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topCategoryArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "topBrandArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> topBrandArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "groceryItemsArray")
    @org.jetbrains.annotations.NotNull
    java.util.List<codeflies.com.saalimmvvm.model.responseClass.home.HomeItem> groceryItemsArray, @com.fasterxml.jackson.annotation.JsonProperty(value = "homePageCallStatus")
    boolean homePageCallStatus) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}