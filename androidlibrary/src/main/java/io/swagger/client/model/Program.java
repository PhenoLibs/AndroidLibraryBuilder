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
public class Program implements Serializable {
  
  @SerializedName("abbreviation")
  private String abbreviation = null;
  @SerializedName("leadPerson")
  private String leadPerson = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("objective")
  private String objective = null;
  @SerializedName("programDbId")
  private String programDbId = null;

  /**
   * An abbreviation which represnts this program
   **/
  @ApiModelProperty(value = "An abbreviation which represnts this program")
  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  /**
   * The name or identifier of the program leader
   **/
  @ApiModelProperty(value = "The name or identifier of the program leader")
  public String getLeadPerson() {
    return leadPerson;
  }
  public void setLeadPerson(String leadPerson) {
    this.leadPerson = leadPerson;
  }

  /**
   * Human readable name of the program
   **/
  @ApiModelProperty(value = "Human readable name of the program")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The primary objective of the program
   **/
  @ApiModelProperty(value = "The primary objective of the program")
  public String getObjective() {
    return objective;
  }
  public void setObjective(String objective) {
    this.objective = objective;
  }

  /**
   * The ID which uniquely identifies the program
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies the program")
  public String getProgramDbId() {
    return programDbId;
  }
  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return (this.abbreviation == null ? program.abbreviation == null : this.abbreviation.equals(program.abbreviation)) &&
        (this.leadPerson == null ? program.leadPerson == null : this.leadPerson.equals(program.leadPerson)) &&
        (this.name == null ? program.name == null : this.name.equals(program.name)) &&
        (this.objective == null ? program.objective == null : this.objective.equals(program.objective)) &&
        (this.programDbId == null ? program.programDbId == null : this.programDbId.equals(program.programDbId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.abbreviation == null ? 0: this.abbreviation.hashCode());
    result = 31 * result + (this.leadPerson == null ? 0: this.leadPerson.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.objective == null ? 0: this.objective.hashCode());
    result = 31 * result + (this.programDbId == null ? 0: this.programDbId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    
    sb.append("  abbreviation: ").append(abbreviation).append("\n");
    sb.append("  leadPerson: ").append(leadPerson).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  objective: ").append(objective).append("\n");
    sb.append("  programDbId: ").append(programDbId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
