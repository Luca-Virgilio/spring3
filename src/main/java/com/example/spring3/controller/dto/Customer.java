package com.example.spring3.controller.dto;

import org.springframework.data.annotation.Id;

public record Customer(@Id Integer id, String name) {
}
