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
 * @param name 
 * @param circuito 
 * @param coraid 
 * @param db 
 * @param tenantid 
 * @param groupid 
 * @param plsnum 
 * @param syranum 
 */

data class Metric (

    @Json(name = "__name__")
    val name: kotlin.String? = null,

    @Json(name = "circuito")
    val circuito: kotlin.String? = null,

    @Json(name = "coraid")
    val coraid: kotlin.String? = null,

    @Json(name = "db")
    val db: kotlin.String? = null,

    @Json(name = "tenantid")
    val tenantid: kotlin.String? = null,

    @Json(name = "groupid")
    val groupid: kotlin.String? = null,

    @Json(name = "plsnum")
    val plsnum: kotlin.String? = null,

    @Json(name = "syranum")
    val syranum: kotlin.String? = null

)

