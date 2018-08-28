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

import io.swagger.client.model.ValidValues;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Scale metadata
 **/
@ApiModel(description = "Scale metadata")
public class Scale implements Serializable {
  
  @SerializedName("dataType")
  private String dataType = null;
  @SerializedName("decimalPlaces")
  private Integer decimalPlaces = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("scaleDbId")
  private String scaleDbId = null;
  @SerializedName("validValues")
  private ValidValues validValues = null;
  @SerializedName("xref")
  private String xref = null;

  /**
   * Class of the scale, entries can be \"Numerical\", \"Nominal\", \"Ordinal\", \"Text\", \"Code\", \"Time\", \"Duration\"
   **/
  @ApiModelProperty(value = "Class of the scale, entries can be \"Numerical\", \"Nominal\", \"Ordinal\", \"Text\", \"Code\", \"Time\", \"Duration\"")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  /**
   * For numerical, number of decimal places to be reported
   **/
  @ApiModelProperty(value = "For numerical, number of decimal places to be reported")
  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }
  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }

  /**
   * Name of the scale
   **/
  @ApiModelProperty(value = "Name of the scale")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Unique identifier of the scale. If left blank, the upload system will automatically generate a scale ID.
   **/
  @ApiModelProperty(value = "Unique identifier of the scale. If left blank, the upload system will automatically generate a scale ID.")
  public String getScaleDbId() {
    return scaleDbId;
  }
  public void setScaleDbId(String scaleDbId) {
    this.scaleDbId = scaleDbId;
  }

  /**
   * List of valid values expected for non-numeric data
   **/
  @ApiModelProperty(value = "List of valid values expected for non-numeric data")
  public ValidValues getValidValues() {
    return validValues;
  }
  public void setValidValues(ValidValues validValues) {
    this.validValues = validValues;
  }

  /**
   * Cross reference to the scale, for example to a unit ontology such as UO or to a unit of an external major database
   **/
  @ApiModelProperty(value = "Cross reference to the scale, for example to a unit ontology such as UO or to a unit of an external major database")
  public String getXref() {
    return xref;
  }
  public void setXref(String xref) {
    this.xref = xref;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scale scale = (Scale) o;
    return (this.dataType == null ? scale.dataType == null : this.dataType.equals(scale.dataType)) &&
        (this.decimalPlaces == null ? scale.decimalPlaces == null : this.decimalPlaces.equals(scale.decimalPlaces)) &&
        (this.name == null ? scale.name == null : this.name.equals(scale.name)) &&
        (this.scaleDbId == null ? scale.scaleDbId == null : this.scaleDbId.equals(scale.scaleDbId)) &&
        (this.validValues == null ? scale.validValues == null : this.validValues.equals(scale.validValues)) &&
        (this.xref == null ? scale.xref == null : this.xref.equals(scale.xref));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dataType == null ? 0: this.dataType.hashCode());
    result = 31 * result + (this.decimalPlaces == null ? 0: this.decimalPlaces.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.scaleDbId == null ? 0: this.scaleDbId.hashCode());
    result = 31 * result + (this.validValues == null ? 0: this.validValues.hashCode());
    result = 31 * result + (this.xref == null ? 0: this.xref.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scale {\n");
    
    sb.append("  dataType: ").append(dataType).append("\n");
    sb.append("  decimalPlaces: ").append(decimalPlaces).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  scaleDbId: ").append(scaleDbId).append("\n");
    sb.append("  validValues: ").append(validValues).append("\n");
    sb.append("  xref: ").append(xref).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
