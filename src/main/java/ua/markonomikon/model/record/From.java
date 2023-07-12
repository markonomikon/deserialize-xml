package ua.markonomikon.model.record;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RECORD: that allows for serialization/deserialization to JSON format.
 * @param number
 * @param name
 * @param surname
 */

public record From(
        @JsonProperty("number") String number,
        @JsonProperty("name") String name,
        @JsonProperty("surname") String surname
) {}








/*
 * Created by markonomikon.
 */
