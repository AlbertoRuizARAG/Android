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
 * @param groupName 
 * @param tenantId 
 * @param polygons 
 * @param isGroupManagementReady 
 */

data class P2PGroupDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "groupName")
    val groupName: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "polygons")
    val polygons: kotlin.collections.List<P2PMapPolygon>? = null,

    @Json(name = "isGroupManagementReady")
    val isGroupManagementReady: kotlin.Boolean? = null

)

