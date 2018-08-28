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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class TrialStudies implements Serializable {
  
  @SerializedName("locationDbId")
  private String locationDbId = null;
  @SerializedName("locationName")
  private String locationName = null;
  @SerializedName("studyDbId")
  private String studyDbId = null;
  @SerializedName("studyName")
  private String studyName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocationDbId() {
    return locationDbId;
  }
  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStudyDbId() {
    return studyDbId;
  }
  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStudyName() {
    return studyName;
  }
  public void setStudyName(String studyName) {
    this.studyName = studyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialStudies trialStudies = (TrialStudies) o;
    return (this.locationDbId == null ? trialStudies.locationDbId == null : this.locationDbId.equals(trialStudies.locationDbId)) &&
        (this.locationName == null ? trialStudies.locationName == null : this.locationName.equals(trialStudies.locationName)) &&
        (this.studyDbId == null ? trialStudies.studyDbId == null : this.studyDbId.equals(trialStudies.studyDbId)) &&
        (this.studyName == null ? trialStudies.studyName == null : this.studyName.equals(trialStudies.studyName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.locationDbId == null ? 0: this.locationDbId.hashCode());
    result = 31 * result + (this.locationName == null ? 0: this.locationName.hashCode());
    result = 31 * result + (this.studyDbId == null ? 0: this.studyDbId.hashCode());
    result = 31 * result + (this.studyName == null ? 0: this.studyName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialStudies {\n");
    
    sb.append("  locationDbId: ").append(locationDbId).append("\n");
    sb.append("  locationName: ").append(locationName).append("\n");
    sb.append("  studyDbId: ").append(studyDbId).append("\n");
    sb.append("  studyName: ").append(studyName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
