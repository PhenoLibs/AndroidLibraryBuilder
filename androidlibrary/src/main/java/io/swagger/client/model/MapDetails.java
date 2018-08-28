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

import io.swagger.client.model.LinkageGroup;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class MapDetails implements Serializable {
  
  @SerializedName("data")
  private List<LinkageGroup> data = null;
  @SerializedName("linkageGroups")
  private List<LinkageGroup> linkageGroups = null;
  @SerializedName("mapDbId")
  private String mapDbId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("unit")
  private String unit = null;

  /**
   * List of linkage group details associated with a given map
   **/
  @ApiModelProperty(value = "List of linkage group details associated with a given map")
  public List<LinkageGroup> getData() {
    return data;
  }
  public void setData(List<LinkageGroup> data) {
    this.data = data;
  }

  /**
   * **Deprecated** Use \"data\"
   **/
  @ApiModelProperty(value = "**Deprecated** Use \"data\"")
  public List<LinkageGroup> getLinkageGroups() {
    return linkageGroups;
  }
  public void setLinkageGroups(List<LinkageGroup> linkageGroups) {
    this.linkageGroups = linkageGroups;
  }

  /**
   * The ID which uniquely identifies this genome map
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies this genome map")
  public String getMapDbId() {
    return mapDbId;
  }
  public void setMapDbId(String mapDbId) {
    this.mapDbId = mapDbId;
  }

  /**
   * A human readable name for this map
   **/
  @ApiModelProperty(value = "A human readable name for this map")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of map this represents, ussually \"Genetic\"
   **/
  @ApiModelProperty(value = "The type of map this represents, ussually \"Genetic\"")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The units used to describe the data in this map
   **/
  @ApiModelProperty(value = "The units used to describe the data in this map")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapDetails mapDetails = (MapDetails) o;
    return (this.data == null ? mapDetails.data == null : this.data.equals(mapDetails.data)) &&
        (this.linkageGroups == null ? mapDetails.linkageGroups == null : this.linkageGroups.equals(mapDetails.linkageGroups)) &&
        (this.mapDbId == null ? mapDetails.mapDbId == null : this.mapDbId.equals(mapDetails.mapDbId)) &&
        (this.name == null ? mapDetails.name == null : this.name.equals(mapDetails.name)) &&
        (this.type == null ? mapDetails.type == null : this.type.equals(mapDetails.type)) &&
        (this.unit == null ? mapDetails.unit == null : this.unit.equals(mapDetails.unit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.linkageGroups == null ? 0: this.linkageGroups.hashCode());
    result = 31 * result + (this.mapDbId == null ? 0: this.mapDbId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.unit == null ? 0: this.unit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapDetails {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  linkageGroups: ").append(linkageGroups).append("\n");
    sb.append("  mapDbId: ").append(mapDbId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
