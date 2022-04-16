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
 * @param isGroupJob 
 * @param targetNodeId 
 * @param targetGroupId 
 * @param launchTime 
 * @param dimmLevel 
 * @param offset 
 */

data class P2PCoraDimmCommandCreate (

    @Json(name = "isGroupJob")
    val isGroupJob: kotlin.Boolean? = null,

    @Json(name = "targetNodeId")
    val targetNodeId: kotlin.Int? = null,

    @Json(name = "targetGroupId")
    val targetGroupId: kotlin.Int? = null,

    @Json(name = "launchTime")
    val launchTime: java.time.OffsetDateTime? = null,

    @Json(name = "dimmLevel")
    val dimmLevel: kotlin.Int? = null,

    @Json(name = "offset")
    val offset: kotlin.Int? = null

)

