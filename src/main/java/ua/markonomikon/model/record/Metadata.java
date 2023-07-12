package ua.markonomikon.model.record;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RECORD: that allows for serialization/deserialization to JSON format.
 * @param from
 * @param to
 */

public record Metadata(
        @JsonProperty("from") From from,
        @JsonProperty("to") To to
) {}





/*
 * Created by markonomikon.
 */
