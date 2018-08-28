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

import io.swagger.client.model.Method;
import io.swagger.client.model.Scale;
import io.swagger.client.model.Trait;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class ObservationVariable implements Serializable {
  
  @SerializedName("contextOfUse")
  private List<String> contextOfUse = null;
  @SerializedName("crop")
  private String crop = null;
  @SerializedName("date")
  private String date = null;
  @SerializedName("defaultValue")
  private String defaultValue = null;
  @SerializedName("growthStage")
  private String growthStage = null;
  @SerializedName("institution")
  private String institution = null;
  @SerializedName("language")
  private String language = null;
  @SerializedName("method")
  private Method method = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("observationVariableDbId")
  private String observationVariableDbId = null;
  @SerializedName("ontologyDbId")
  private String ontologyDbId = null;
  @SerializedName("ontologyName")
  private String ontologyName = null;
  @SerializedName("scale")
  private Scale scale = null;
  @SerializedName("scientist")
  private String scientist = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("submissionTimestamp")
  private Date submissionTimestamp = null;
  @SerializedName("synonyms")
  private List<String> synonyms = null;
  @SerializedName("trait")
  private Trait trait = null;
  @SerializedName("xref")
  private String xref = null;

  /**
   * Indication of how trait is routinely used. (examples: [\"Trial evaluation\", \"Nursery evaluation\"])
   **/
  @ApiModelProperty(value = "Indication of how trait is routinely used. (examples: [\"Trial evaluation\", \"Nursery evaluation\"])")
  public List<String> getContextOfUse() {
    return contextOfUse;
  }
  public void setContextOfUse(List<String> contextOfUse) {
    this.contextOfUse = contextOfUse;
  }

  /**
   * Crop name (examples: \"Maize\", \"Wheat\")
   **/
  @ApiModelProperty(value = "Crop name (examples: \"Maize\", \"Wheat\")")
  public String getCrop() {
    return crop;
  }
  public void setCrop(String crop) {
    this.crop = crop;
  }

  /**
   * Date of submission of the variable (ISO 8601).
   **/
  @ApiModelProperty(value = "Date of submission of the variable (ISO 8601).")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Variable default value. (examples: \"red\", \"2.3\", etc.)
   **/
  @ApiModelProperty(required = true, value = "Variable default value. (examples: \"red\", \"2.3\", etc.)")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Growth stage at which measurement is made (examples: \"flowering\")
   **/
  @ApiModelProperty(value = "Growth stage at which measurement is made (examples: \"flowering\")")
  public String getGrowthStage() {
    return growthStage;
  }
  public void setGrowthStage(String growthStage) {
    this.growthStage = growthStage;
  }

  /**
   * Name of institution submitting the variable
   **/
  @ApiModelProperty(value = "Name of institution submitting the variable")
  public String getInstitution() {
    return institution;
  }
  public void setInstitution(String institution) {
    this.institution = institution;
  }

  /**
   * 2 letter ISO code for the language of submission of the variable.
   **/
  @ApiModelProperty(value = "2 letter ISO code for the language of submission of the variable.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The description of the method used to collect data for this variable
   **/
  @ApiModelProperty(required = true, value = "The description of the method used to collect data for this variable")
  public Method getMethod() {
    return method;
  }
  public void setMethod(Method method) {
    this.method = method;
  }

  /**
   * Variable name (usually a short name)
   **/
  @ApiModelProperty(required = true, value = "Variable name (usually a short name)")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Variable unique identifier
   **/
  @ApiModelProperty(required = true, value = "Variable unique identifier")
  public String getObservationVariableDbId() {
    return observationVariableDbId;
  }
  public void setObservationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
  }

  /**
   * Variable ontology unique identifier
   **/
  @ApiModelProperty(required = true, value = "Variable ontology unique identifier")
  public String getOntologyDbId() {
    return ontologyDbId;
  }
  public void setOntologyDbId(String ontologyDbId) {
    this.ontologyDbId = ontologyDbId;
  }

  /**
   * Variable ontology name (usually a short name)
   **/
  @ApiModelProperty(required = true, value = "Variable ontology name (usually a short name)")
  public String getOntologyName() {
    return ontologyName;
  }
  public void setOntologyName(String ontologyName) {
    this.ontologyName = ontologyName;
  }

  /**
   * The description of the reference scale and units used on the collected data for this variable
   **/
  @ApiModelProperty(required = true, value = "The description of the reference scale and units used on the collected data for this variable")
  public Scale getScale() {
    return scale;
  }
  public void setScale(Scale scale) {
    this.scale = scale;
  }

  /**
   * Name of scientist submitting the variable.
   **/
  @ApiModelProperty(value = "Name of scientist submitting the variable.")
  public String getScientist() {
    return scientist;
  }
  public void setScientist(String scientist) {
    this.scientist = scientist;
  }

  /**
   * Variable status. (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)
   **/
  @ApiModelProperty(value = "Variable status. (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Timestamp when the Variable was added
   **/
  @ApiModelProperty(value = "Timestamp when the Variable was added")
  public Date getSubmissionTimestamp() {
    return submissionTimestamp;
  }
  public void setSubmissionTimestamp(Date submissionTimestamp) {
    this.submissionTimestamp = submissionTimestamp;
  }

  /**
   * Other variable names
   **/
  @ApiModelProperty(value = "Other variable names")
  public List<String> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  /**
   * The description of the trait which is being examined for this variable
   **/
  @ApiModelProperty(required = true, value = "The description of the trait which is being examined for this variable")
  public Trait getTrait() {
    return trait;
  }
  public void setTrait(Trait trait) {
    this.trait = trait;
  }

  /**
   * Cross reference of the variable term to a term from an external ontology or to a database of a major system.
   **/
  @ApiModelProperty(value = "Cross reference of the variable term to a term from an external ontology or to a database of a major system.")
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
    ObservationVariable observationVariable = (ObservationVariable) o;
    return (this.contextOfUse == null ? observationVariable.contextOfUse == null : this.contextOfUse.equals(observationVariable.contextOfUse)) &&
        (this.crop == null ? observationVariable.crop == null : this.crop.equals(observationVariable.crop)) &&
        (this.date == null ? observationVariable.date == null : this.date.equals(observationVariable.date)) &&
        (this.defaultValue == null ? observationVariable.defaultValue == null : this.defaultValue.equals(observationVariable.defaultValue)) &&
        (this.growthStage == null ? observationVariable.growthStage == null : this.growthStage.equals(observationVariable.growthStage)) &&
        (this.institution == null ? observationVariable.institution == null : this.institution.equals(observationVariable.institution)) &&
        (this.language == null ? observationVariable.language == null : this.language.equals(observationVariable.language)) &&
        (this.method == null ? observationVariable.method == null : this.method.equals(observationVariable.method)) &&
        (this.name == null ? observationVariable.name == null : this.name.equals(observationVariable.name)) &&
        (this.observationVariableDbId == null ? observationVariable.observationVariableDbId == null : this.observationVariableDbId.equals(observationVariable.observationVariableDbId)) &&
        (this.ontologyDbId == null ? observationVariable.ontologyDbId == null : this.ontologyDbId.equals(observationVariable.ontologyDbId)) &&
        (this.ontologyName == null ? observationVariable.ontologyName == null : this.ontologyName.equals(observationVariable.ontologyName)) &&
        (this.scale == null ? observationVariable.scale == null : this.scale.equals(observationVariable.scale)) &&
        (this.scientist == null ? observationVariable.scientist == null : this.scientist.equals(observationVariable.scientist)) &&
        (this.status == null ? observationVariable.status == null : this.status.equals(observationVariable.status)) &&
        (this.submissionTimestamp == null ? observationVariable.submissionTimestamp == null : this.submissionTimestamp.equals(observationVariable.submissionTimestamp)) &&
        (this.synonyms == null ? observationVariable.synonyms == null : this.synonyms.equals(observationVariable.synonyms)) &&
        (this.trait == null ? observationVariable.trait == null : this.trait.equals(observationVariable.trait)) &&
        (this.xref == null ? observationVariable.xref == null : this.xref.equals(observationVariable.xref));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.contextOfUse == null ? 0: this.contextOfUse.hashCode());
    result = 31 * result + (this.crop == null ? 0: this.crop.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.defaultValue == null ? 0: this.defaultValue.hashCode());
    result = 31 * result + (this.growthStage == null ? 0: this.growthStage.hashCode());
    result = 31 * result + (this.institution == null ? 0: this.institution.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.method == null ? 0: this.method.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.observationVariableDbId == null ? 0: this.observationVariableDbId.hashCode());
    result = 31 * result + (this.ontologyDbId == null ? 0: this.ontologyDbId.hashCode());
    result = 31 * result + (this.ontologyName == null ? 0: this.ontologyName.hashCode());
    result = 31 * result + (this.scale == null ? 0: this.scale.hashCode());
    result = 31 * result + (this.scientist == null ? 0: this.scientist.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.submissionTimestamp == null ? 0: this.submissionTimestamp.hashCode());
    result = 31 * result + (this.synonyms == null ? 0: this.synonyms.hashCode());
    result = 31 * result + (this.trait == null ? 0: this.trait.hashCode());
    result = 31 * result + (this.xref == null ? 0: this.xref.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationVariable {\n");
    
    sb.append("  contextOfUse: ").append(contextOfUse).append("\n");
    sb.append("  crop: ").append(crop).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  growthStage: ").append(growthStage).append("\n");
    sb.append("  institution: ").append(institution).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  observationVariableDbId: ").append(observationVariableDbId).append("\n");
    sb.append("  ontologyDbId: ").append(ontologyDbId).append("\n");
    sb.append("  ontologyName: ").append(ontologyName).append("\n");
    sb.append("  scale: ").append(scale).append("\n");
    sb.append("  scientist: ").append(scientist).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  submissionTimestamp: ").append(submissionTimestamp).append("\n");
    sb.append("  synonyms: ").append(synonyms).append("\n");
    sb.append("  trait: ").append(trait).append("\n");
    sb.append("  xref: ").append(xref).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
