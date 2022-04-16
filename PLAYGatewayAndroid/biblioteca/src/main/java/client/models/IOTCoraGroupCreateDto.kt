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

import org.openapitools.client.models.P2PMapPolygon

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param name 
 * @param description 
 * @param nodeIds 
 * @param polygons 
 */

data class IOTCoraGroupCreateDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "nodeIds")
    val nodeIds: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "polygons")
    val polygons: kotlin.collections.List<P2PMapPolygon>? = null

)

