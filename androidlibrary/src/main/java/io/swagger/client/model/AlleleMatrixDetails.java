/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * AlleleMatrixDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-05T16:01:47.919Z[GMT]")public class AlleleMatrixDetails {

  @SerializedName("description")
  private String description = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("matrixDbId")
  private String matrixDbId = null;

  @SerializedName("matrixName")
  private String matrixName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("studyDbId")
  private String studyDbId = null;
  public AlleleMatrixDetails description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * How the matrix was generated
  * @return description
  **/
  @Schema(description = "How the matrix was generated")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public AlleleMatrixDetails lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  

  /**
  * A date format
  * @return lastUpdated
  **/
  @Schema(description = "A date format")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }
  public AlleleMatrixDetails matrixDbId(String matrixDbId) {
    this.matrixDbId = matrixDbId;
    return this;
  }

  

  /**
  * ID of the matrix
  * @return matrixDbId
  **/
  @Schema(description = "ID of the matrix")
  public String getMatrixDbId() {
    return matrixDbId;
  }
  public void setMatrixDbId(String matrixDbId) {
    this.matrixDbId = matrixDbId;
  }
  public AlleleMatrixDetails matrixName(String matrixName) {
    this.matrixName = matrixName;
    return this;
  }

  

  /**
  * Name of the matrix
  * @return matrixName
  **/
  @Schema(description = "Name of the matrix")
  public String getMatrixName() {
    return matrixName;
  }
  public void setMatrixName(String matrixName) {
    this.matrixName = matrixName;
  }
  public AlleleMatrixDetails name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - Use \&quot;matrixName\&quot;
  * @return name
  **/
  @Schema(description = "DEPRECATED in v1.3 - Use \"matrixName\"")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public AlleleMatrixDetails studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  

  /**
  * Link to the study where the matrix was produced
  * @return studyDbId
  **/
  @Schema(description = "Link to the study where the matrix was produced")
  public String getStudyDbId() {
    return studyDbId;
  }
  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleMatrixDetails alleleMatrixDetails = (AlleleMatrixDetails) o;
    return Objects.equals(this.description, alleleMatrixDetails.description) &&
        Objects.equals(this.lastUpdated, alleleMatrixDetails.lastUpdated) &&
        Objects.equals(this.matrixDbId, alleleMatrixDetails.matrixDbId) &&
        Objects.equals(this.matrixName, alleleMatrixDetails.matrixName) &&
        Objects.equals(this.name, alleleMatrixDetails.name) &&
        Objects.equals(this.studyDbId, alleleMatrixDetails.studyDbId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(description, lastUpdated, matrixDbId, matrixName, name, studyDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleMatrixDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    matrixDbId: ").append(toIndentedString(matrixDbId)).append("\n");
    sb.append("    matrixName: ").append(toIndentedString(matrixName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}