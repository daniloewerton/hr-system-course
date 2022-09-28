package br.com.daniloewerton.userapi.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
