package org.project.controllers.chat;

import jakarta.validation.constraints.NotBlank;

public record ChatMessageForm(
        @NotBlank
        String nickNm,
        @NotBlank
        String message,
        @NotBlank
        Long roomNo) {}
