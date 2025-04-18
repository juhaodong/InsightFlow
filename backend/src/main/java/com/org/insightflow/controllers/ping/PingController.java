package com.org.insightflow.controllers.ping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PingController {
    @Operation(summary = "ping", description = "check reachability")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Successful operation")
	})
    @GetMapping("/ping")
    public ResponseEntity<PingResponse> getMethodName() {
        return ResponseEntity.ok().body(new PingResponse("ok"));
    }
}
