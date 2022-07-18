package com.github.atlassian.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.atlassian.content.Content;

import java.util.List;

/**
 * This class represents the response that is returned for a {@link GetContentRequest}.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetContentResponse {

  @JsonProperty
  private List<Content> results;
  @JsonProperty
  private Integer start;
  @JsonProperty
  private Integer limit;
  @JsonProperty
  private Integer size;

  public void setResults(List<Content> results) {
    this.results = results;
  }

  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @SuppressWarnings("unused")
  private GetContentResponse() {
    // Required for Jackson deserialization
  }

  /**
   * This constructor initialises the response with the given set of results.
   *
   * @param results The results contained in the response
   */
  public GetContentResponse(List<Content> results) {
    this.results = results;
  }

  /**
   * This method returns the matching content contained in the response to a {@link
   * GetContentRequest}.
   *
   * @return The contained in the response to a {@link GetContentRequest}.
   */
  public List<Content> getResults() {
    return this.results;
  }
}
