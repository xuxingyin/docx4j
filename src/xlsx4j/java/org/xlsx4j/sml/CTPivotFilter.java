/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlSchemaType;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_PivotFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PivotFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoFilter" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_AutoFilter"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fld" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="mpFld" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="type" use="required" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_PivotFilterType" />
 *       &lt;attribute name="evalOrder" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="iMeasureHier" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="iMeasureFld" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="name" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_Xstring" />
 *       &lt;attribute name="description" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_Xstring" />
 *       &lt;attribute name="stringValue1" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_Xstring" />
 *       &lt;attribute name="stringValue2" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_Xstring" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PivotFilter", propOrder = {
    "autoFilter",
    "extLst"
})
public class CTPivotFilter {

    @XmlElement(required = true)
    protected CTAutoFilter autoFilter;
    protected CTExtensionList extLst;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long fld;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long mpFld;
    @XmlAttribute(required = true)
    protected STPivotFilterType type;
    @XmlAttribute
    protected Integer evalOrder;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long iMeasureHier;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long iMeasureFld;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String stringValue1;
    @XmlAttribute
    protected String stringValue2;

    /**
     * Gets the value of the autoFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CTAutoFilter }
     *     
     */
    public CTAutoFilter getAutoFilter() {
        return autoFilter;
    }

    /**
     * Sets the value of the autoFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAutoFilter }
     *     
     */
    public void setAutoFilter(CTAutoFilter value) {
        this.autoFilter = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTExtensionList }
     *     
     */
    public CTExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExtensionList }
     *     
     */
    public void setExtLst(CTExtensionList value) {
        this.extLst = value;
    }

    /**
     * Gets the value of the fld property.
     * 
     */
    public long getFld() {
        return fld;
    }

    /**
     * Sets the value of the fld property.
     * 
     */
    public void setFld(long value) {
        this.fld = value;
    }

    /**
     * Gets the value of the mpFld property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMpFld() {
        return mpFld;
    }

    /**
     * Sets the value of the mpFld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMpFld(Long value) {
        this.mpFld = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link STPivotFilterType }
     *     
     */
    public STPivotFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPivotFilterType }
     *     
     */
    public void setType(STPivotFilterType value) {
        this.type = value;
    }

    /**
     * Gets the value of the evalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getEvalOrder() {
        if (evalOrder == null) {
            return  0;
        } else {
            return evalOrder;
        }
    }

    /**
     * Sets the value of the evalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEvalOrder(Integer value) {
        this.evalOrder = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the iMeasureHier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIMeasureHier() {
        return iMeasureHier;
    }

    /**
     * Sets the value of the iMeasureHier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIMeasureHier(Long value) {
        this.iMeasureHier = value;
    }

    /**
     * Gets the value of the iMeasureFld property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIMeasureFld() {
        return iMeasureFld;
    }

    /**
     * Sets the value of the iMeasureFld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIMeasureFld(Long value) {
        this.iMeasureFld = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the stringValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue1() {
        return stringValue1;
    }

    /**
     * Sets the value of the stringValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue1(String value) {
        this.stringValue1 = value;
    }

    /**
     * Gets the value of the stringValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue2() {
        return stringValue2;
    }

    /**
     * Sets the value of the stringValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue2(String value) {
        this.stringValue2 = value;
    }

}
