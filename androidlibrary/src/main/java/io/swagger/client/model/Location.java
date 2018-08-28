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

import java.math.BigDecimal;
import java.util.*;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class Location implements Serializable {
  
  @SerializedName("abbreviation")
  private String abbreviation = null;
  @SerializedName("abreviation")
  private String abreviation = null;
  @SerializedName("additionalInfo")
  private Map<String, String> additionalInfo = null;
  @SerializedName("altitude")
  private BigDecimal altitude = null;
  @SerializedName("countryCode")
  private String countryCode = null;
  @SerializedName("countryName")
  private String countryName = null;
  @SerializedName("instituteAddress")
  private String instituteAddress = null;
  @SerializedName("instituteAdress")
  private String instituteAdress = null;
  @SerializedName("instituteName")
  private String instituteName = null;
  @SerializedName("latitude")
  private BigDecimal latitude = null;
  @SerializedName("locationDbId")
  private String locationDbId = null;
  @SerializedName("locationType")
  private String locationType = null;
  @SerializedName("longitude")
  private BigDecimal longitude = null;
  @SerializedName("name")
  private String name = null;

  /**
   * An abbreviation which represents this location
   **/
  @ApiModelProperty(value = "An abbreviation which represents this location")
  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  /**
   * Deprecated  <strong>Use abbreviation</strong> 
   **/
  @ApiModelProperty(value = "Deprecated  <strong>Use abbreviation</strong> ")
  public String getAbreviation() {
    return abreviation;
  }
  public void setAbreviation(String abreviation) {
    this.abreviation = abreviation;
  }

  /**
   * Additional arbitrary info
   **/
  @ApiModelProperty(value = "Additional arbitrary info")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * The altitude of this location
   **/
  @ApiModelProperty(value = "The altitude of this location")
  public BigDecimal getAltitude() {
    return altitude;
  }
  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }

  /**
   * [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec
   **/
  @ApiModelProperty(value = "[ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The full name of the country where this location is
   **/
  @ApiModelProperty(value = "The full name of the country where this location is")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  /**
   * The street address of the institute representing this location
   **/
  @ApiModelProperty(value = "The street address of the institute representing this location")
  public String getInstituteAddress() {
    return instituteAddress;
  }
  public void setInstituteAddress(String instituteAddress) {
    this.instituteAddress = instituteAddress;
  }

  /**
   * Deprecated  <strong>Use instituteAddress</strong> 
   **/
  @ApiModelProperty(value = "Deprecated  <strong>Use instituteAddress</strong> ")
  public String getInstituteAdress() {
    return instituteAdress;
  }
  public void setInstituteAdress(String instituteAdress) {
    this.instituteAdress = instituteAdress;
  }

  /**
   * each institute/laboratory can have several experimental field
   **/
  @ApiModelProperty(value = "each institute/laboratory can have several experimental field")
  public String getInstituteName() {
    return instituteName;
  }
  public void setInstituteName(String instituteName) {
    this.instituteName = instituteName;
  }

  /**
   * The latitude of this location
   **/
  @ApiModelProperty(value = "The latitude of this location")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * string identifier
   **/
  @ApiModelProperty(value = "string identifier")
  public String getLocationDbId() {
    return locationDbId;
  }
  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  /**
   * The type of location this represents (ex. Breeding Location, Storage Location, etc)
   **/
  @ApiModelProperty(value = "The type of location this represents (ex. Breeding Location, Storage Location, etc)")
  public String getLocationType() {
    return locationType;
  }
  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  /**
   * the longitude of this location
   **/
  @ApiModelProperty(value = "the longitude of this location")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * A human readable name for this location
   **/
  @ApiModelProperty(value = "A human readable name for this location")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return (this.abbreviation == null ? location.abbreviation == null : this.abbreviation.equals(location.abbreviation)) &&
        (this.abreviation == null ? location.abreviation == null : this.abreviation.equals(location.abreviation)) &&
        (this.additionalInfo == null ? location.additionalInfo == null : this.additionalInfo.equals(location.additionalInfo)) &&
        (this.altitude == null ? location.altitude == null : this.altitude.equals(location.altitude)) &&
        (this.countryCode == null ? location.countryCode == null : this.countryCode.equals(location.countryCode)) &&
        (this.countryName == null ? location.countryName == null : this.countryName.equals(location.countryName)) &&
        (this.instituteAddress == null ? location.instituteAddress == null : this.instituteAddress.equals(location.instituteAddress)) &&
        (this.instituteAdress == null ? location.instituteAdress == null : this.instituteAdress.equals(location.instituteAdress)) &&
        (this.instituteName == null ? location.instituteName == null : this.instituteName.equals(location.instituteName)) &&
        (this.latitude == null ? location.latitude == null : this.latitude.equals(location.latitude)) &&
        (this.locationDbId == null ? location.locationDbId == null : this.locationDbId.equals(location.locationDbId)) &&
        (this.locationType == null ? location.locationType == null : this.locationType.equals(location.locationType)) &&
        (this.longitude == null ? location.longitude == null : this.longitude.equals(location.longitude)) &&
        (this.name == null ? location.name == null : this.name.equals(location.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.abbreviation == null ? 0: this.abbreviation.hashCode());
    result = 31 * result + (this.abreviation == null ? 0: this.abreviation.hashCode());
    result = 31 * result + (this.additionalInfo == null ? 0: this.additionalInfo.hashCode());
    result = 31 * result + (this.altitude == null ? 0: this.altitude.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.countryName == null ? 0: this.countryName.hashCode());
    result = 31 * result + (this.instituteAddress == null ? 0: this.instituteAddress.hashCode());
    result = 31 * result + (this.instituteAdress == null ? 0: this.instituteAdress.hashCode());
    result = 31 * result + (this.instituteName == null ? 0: this.instituteName.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.locationDbId == null ? 0: this.locationDbId.hashCode());
    result = 31 * result + (this.locationType == null ? 0: this.locationType.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("  abbreviation: ").append(abbreviation).append("\n");
    sb.append("  abreviation: ").append(abreviation).append("\n");
    sb.append("  additionalInfo: ").append(additionalInfo).append("\n");
    sb.append("  altitude: ").append(altitude).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  countryName: ").append(countryName).append("\n");
    sb.append("  instituteAddress: ").append(instituteAddress).append("\n");
    sb.append("  instituteAdress: ").append(instituteAdress).append("\n");
    sb.append("  instituteName: ").append(instituteName).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  locationDbId: ").append(locationDbId).append("\n");
    sb.append("  locationType: ").append(locationType).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
