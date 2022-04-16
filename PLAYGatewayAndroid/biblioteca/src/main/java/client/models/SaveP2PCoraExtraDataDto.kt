/**
 * PriluxWebUI API
 *
 * PriluxWebUI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param uuid 
 * @param pinBluetooth 
 * @param versionSW 
 * @param versionHW 
 * @param totalAnalizerNumber 
 * @param totalAnalizerActive 
 * @param imei 
 * @param iccd 
 * @param mobileCoberage 
 * @param batteryLevelEstimated 
 * @param totalPLSNumber 
 * @param totalPLSActive 
 */

data class SaveP2PCoraExtraDataDto (

    @Json(name = "uuid")
    val uuid: kotlin.String? = null,

    @Json(name = "pinBluetooth")
    val pinBluetooth: kotlin.String? = null,

    @Json(name = "versionSW")
    val versionSW: kotlin.String? = null,

    @Json(name = "versionHW")
    val versionHW: kotlin.String? = null,

    @Json(name = "totalAnalizerNumber")
    val totalAnalizerNumber: kotlin.Int? = null,

    @Json(name = "totalAnalizerActive")
    val totalAnalizerActive: kotlin.Int? = null,

    @Json(name = "imei")
    val imei: kotlin.String? = null,

    @Json(name = "iccd")
    val iccd: kotlin.String? = null,

    @Json(name = "mobileCoberage")
    val mobileCoberage: kotlin.Int? = null,

    @Json(name = "batteryLevelEstimated")
    val batteryLevelEstimated: kotlin.Int? = null,

    @Json(name = "totalPLSNumber")
    val totalPLSNumber: kotlin.Int? = null,

    @Json(name = "totalPLSActive")
    val totalPLSActive: kotlin.Int? = null

)

