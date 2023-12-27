/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package delta.codecharacter.core

import delta.codecharacter.dtos.CompleteProfileRequestDto
import delta.codecharacter.dtos.CurrentUserProfileDto
import delta.codecharacter.dtos.GenericErrorDto
import delta.codecharacter.dtos.UpdateCurrentUserProfileDto
import delta.codecharacter.dtos.UpdatePasswordRequestDto
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
interface CurrentUserApi {

    @Operation(
        summary = "Complete user profile",
        operationId = "completeUserProfile",
        description = """Complete the user profile for users who registered using OAuth""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK"),
            ApiResponse(responseCode = "401", description = "Unauthorized")
        ],
        security = [ SecurityRequirement(name = "http-bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/complete-profile"],
            consumes = ["application/json"]
    )
    fun completeUserProfile(@Parameter(description = "", required = true) @Valid @RequestBody completeProfileRequestDto: CompleteProfileRequestDto): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get current user profile",
        operationId = "getCurrentUser",
        description = """Get current user profile""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CurrentUserProfileDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized")
        ],
        security = [ SecurityRequirement(name = "http-bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user"],
            produces = ["application/json"]
    )
    fun getCurrentUser(): ResponseEntity<CurrentUserProfileDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update current user",
        operationId = "updateCurrentUser",
        description = """Update current user""",
        responses = [
            ApiResponse(responseCode = "204", description = "No Content"),
            ApiResponse(responseCode = "400", description = "Bad Request", content = [Content(schema = Schema(implementation = GenericErrorDto::class))])
        ],
        security = [ SecurityRequirement(name = "http-bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.PATCH],
            value = ["/user"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateCurrentUser(@Parameter(description = "", required = true) @Valid @RequestBody updateCurrentUserProfileDto: UpdateCurrentUserProfileDto): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update password",
        operationId = "updatePassword",
        description = """Update password""",
        responses = [
            ApiResponse(responseCode = "204", description = "No Content"),
            ApiResponse(responseCode = "400", description = "Bad Request", content = [Content(schema = Schema(implementation = GenericErrorDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden")
        ],
        security = [ SecurityRequirement(name = "http-bearer") ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/password"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updatePassword(@Parameter(description = "", required = true) @Valid @RequestBody updatePasswordRequestDto: UpdatePasswordRequestDto): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
