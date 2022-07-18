package com.github.atlassian.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the body of a content object in the Confluence Cloud server.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentBody {

  @JsonProperty
  private ContentBodyFormat anonymous_export_view;
  @JsonProperty
  private ContentBodyFormat editor2;
  @JsonProperty
  private ContentBodyFormat export_view;
  @JsonProperty
  private ContentBodyFormat storage;
  @JsonProperty
  private ContentBodyFormat styled_view;
  @JsonProperty
  private ContentBodyFormat view;

  public ContentBodyFormat getAnonymous_export_view() {
    return anonymous_export_view;
  }

  public void setAnonymous_export_view(ContentBodyFormat anonymous_export_view) {
    this.anonymous_export_view = anonymous_export_view;
  }

  public ContentBodyFormat getEditor2() {
    return editor2;
  }

  public void setEditor2(ContentBodyFormat editor2) {
    this.editor2 = editor2;
  }

  public ContentBodyFormat getExport_view() {
    return export_view;
  }

  public void setExport_view(ContentBodyFormat export_view) {
    this.export_view = export_view;
  }

  public ContentBodyFormat getStorage() {
    return storage;
  }

  public void setStorage(ContentBodyFormat storage) {
    this.storage = storage;
  }

  public ContentBodyFormat getStyled_view() {
    return styled_view;
  }

  public void setStyled_view(ContentBodyFormat styled_view) {
    this.styled_view = styled_view;
  }

  public ContentBodyFormat getView() {
    return view;
  }

  public void setView(ContentBodyFormat view) {
    this.view = view;
  }

  @SuppressWarnings("unused")
  private ContentBody() {
    // Required for Jackson deserialization
  }

  /**
   * This constructor creates the content body using the value defined for a given type.
   *
   * @param type The body type that is being defined.
   * @param value The value for the given body type.
   */
  public ContentBody(ContentBodyType type, String value) {
    ContentBodyFormat bodyFormat = new ContentBodyFormat(value, type.getIdentifier());
    switch (type) {
      case ANONYMOUS_EXPORT_VIEW:
        this.anonymous_export_view = bodyFormat;
        break;
      case EDITOR2:
        this.editor2 = bodyFormat;
        break;
      case EXPORT_VIEW:
        this.export_view = bodyFormat;
        break;
      case STORAGE:
        this.storage = bodyFormat;
        break;
      case STYLED_VIEW:
        this.styled_view = bodyFormat;
        break;
      case VIEW:
        this.view = bodyFormat;
        break;
    }
  }
}
