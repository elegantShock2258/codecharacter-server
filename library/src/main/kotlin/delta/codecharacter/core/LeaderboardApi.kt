/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package delta.codecharacter.core

import delta.codecharacter.dtos.LeaderboardEntryDto
import delta.codecharacter.dtos.TierTypeDto
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface LeaderboardApi {

    @Operation(
        summary = "Get leaderboard",
        operationId = "getLeaderboard",
        description = """Get leaderboard""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(array = ArraySchema(schema = Schema(implementation = LeaderboardEntryDto::class)))]),
            ApiResponse(responseCode = "401", description = "Unauthorized")
        ],
        security = [ SecurityRequirement(name = "http-bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/leaderboard"],
            produces = ["application/json"]
    )
    fun getLeaderboard(@Parameter(description = "Index of the page") @Valid @RequestParam(value = "page", required = false) page: kotlin.Int?,@Parameter(description = "Size of the page") @Valid @RequestParam(value = "size", required = false) size: kotlin.Int?,@Parameter(description = "Leaderboard Tier", schema = Schema(allowableValues = ["TIER_PRACTICE", "TIER1", "TIER2", "TIER3", "TIER4"])) @Valid @RequestParam(value = "tier", required = false) tier: TierTypeDto?): ResponseEntity<List<LeaderboardEntryDto>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
