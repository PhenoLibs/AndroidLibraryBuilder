/**
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class GermplasmMarkerprofilesList implements Serializable {
  
  @SerializedName("germplasmDbId")
  private String germplasmDbId = null;
  @SerializedName("markerprofileDbIds")
  private List<String> markerprofileDbIds = null;

  /**
   * The ID which uniquely identifies a germplasm within the given database server
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a germplasm within the given database server")
  public String getGermplasmDbId() {
    return germplasmDbId;
  }
  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  /**
   * The ID which uniquely identifies a marker profile within the given database server
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a marker profile within the given database server")
  public List<String> getMarkerprofileDbIds() {
    return markerprofileDbIds;
  }
  public void setMarkerprofileDbIds(List<String> markerprofileDbIds) {
    this.markerprofileDbIds = markerprofileDbIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmMarkerprofilesList germplasmMarkerprofilesList = (GermplasmMarkerprofilesList) o;
    return (this.germplasmDbId == null ? germplasmMarkerprofilesList.germplasmDbId == null : this.germplasmDbId.equals(germplasmMarkerprofilesList.germplasmDbId)) &&
        (this.markerprofileDbIds == null ? germplasmMarkerprofilesList.markerprofileDbIds == null : this.markerprofileDbIds.equals(germplasmMarkerprofilesList.markerprofileDbIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.germplasmDbId == null ? 0: this.germplasmDbId.hashCode());
    result = 31 * result + (this.markerprofileDbIds == null ? 0: this.markerprofileDbIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMarkerprofilesList {\n");
    
    sb.append("  germplasmDbId: ").append(germplasmDbId).append("\n");
    sb.append("  markerprofileDbIds: ").append(markerprofileDbIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
