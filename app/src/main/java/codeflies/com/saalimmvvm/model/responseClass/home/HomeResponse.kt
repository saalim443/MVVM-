package codeflies.com.saalimmvvm.model.responseClass.home

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

data class HomeResponse(
    @JsonProperty("sliderArray") val sliderArray: List<SliderArray>,
    @JsonProperty("topCategoryArray") val topCategoryArray: List<HomeItem>,
    @JsonProperty("topBrandArray") val topBrandArray: List<HomeItem>,
    @JsonProperty("groceryItemsArray") val groceryItemsArray: List<HomeItem>,
    @JsonProperty("homePageCallStatus") val homePageCallStatus: Boolean
) : Serializable

data class SliderArray(
    @JsonProperty("image") val image: String
) : Serializable

data class HomeItem(
    @JsonProperty("_id") val id: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("image") val image: String
) : Serializable

//data class HomeResponse(
//    @JsonProperty("sliderArray") val sliderArray: List<SliderArray>,
//    @JsonProperty("groceryItemsArray") val groceryItemsArray: List<HomeItem>,
//    @JsonProperty("topBrandArray") val topBrandArray: List<HomeItem>,
//    @JsonProperty("topCategoryArray") val topCategoryArray: List<HomeItem>
//): Serializable
//
//data class HomeItem(
//    @JsonProperty("id") val id: String,
//    @JsonProperty("name") val name: String,
//    @JsonProperty("image") val image: String
//): Serializable
//
//data class SliderArray(
//    @JsonProperty("image") val image: String
//): Serializable
//
//data class TopBrandArray(
//    @JsonProperty("_id") val id: String,
//    @JsonProperty("image") val image: String,
//    @JsonProperty("name") val name: String
//): Serializable


//data class HomeResponse(
//    val sliderArray: List<SliderArray>,
//    val groceryItemsArray: List<HomeItem>,
//    val topBrandArray: List<HomeItem>,
//    val topCategoryArray: List<HomeItem>
//):Serializable
//
//data class HomeItem(
//    val id: String,  // This can be used to identify the type of item (e.g., topBrand, topCategory, etc.)
//    val name: String,
//    val image: String
//): Serializable
//
//data class GroceryItemsArray(
//    val _id: String,
//    val image: String,
//    val name: String
//):Serializable
//
//data class SliderArray(
//    val image: String
//):Serializable
//
//data class TopBrandArray(
//    val _id: String,
//    val image: String,
//    val name: String
//):Serializable

