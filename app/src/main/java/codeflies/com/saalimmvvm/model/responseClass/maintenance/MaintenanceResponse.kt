package codeflies.com.saalimmvvm.model.responseClass.maintenance

import java.io.Serializable

import com.fasterxml.jackson.annotation.JsonProperty


class MaintenanceResponse : ArrayList<MaintenanceResponseItem>()

data class MaintenanceResponseItem(
    @JsonProperty("arraydata") val arraydata: List<Arraydata>,
    @JsonProperty("name") val name: String
): Serializable

data class Arraydata(
    @JsonProperty("_id") val _id: String,
    @JsonProperty("image") val image: String,
    @JsonProperty("name") val name: String
): Serializable


//class MaintenanceResponse : ArrayList<MaintenanceResponseItem>()
//
//data class Arraydata(
//    val _id: String,
//    val image: String,
//    val name: String
//): Serializable
//
//data class MaintenanceResponseItem(
//    val arraydata: List<Arraydata>,
//    val name: String
//):Serializable