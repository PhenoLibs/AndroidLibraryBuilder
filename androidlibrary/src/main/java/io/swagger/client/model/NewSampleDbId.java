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

import io.swagger.client.model.Metadata;
import io.swagger.client.model.NewSampleDbIdResult;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class NewSampleDbId implements Serializable {
  
  @SerializedName("metadata")
  private Metadata metadata = null;
  @SerializedName("result")
  private NewSampleDbIdResult result = null;

  /**
   * Metadata of this response
   **/
  @ApiModelProperty(value = "Metadata of this response")
  public Metadata getMetadata() {
    return metadata;
  }
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NewSampleDbIdResult getResult() {
    return result;
  }
  public void setResult(NewSampleDbIdResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewSampleDbId newSampleDbId = (NewSampleDbId) o;
    return (this.metadata == null ? newSampleDbId.metadata == null : this.metadata.equals(newSampleDbId.metadata)) &&
        (this.result == null ? newSampleDbId.result == null : this.result.equals(newSampleDbId.result));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewSampleDbId {\n");
    
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
