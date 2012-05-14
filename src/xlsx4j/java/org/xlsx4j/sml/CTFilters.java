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

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Filters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Filters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Filter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateGroupItem" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_DateGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="blank" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="calendarType" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}ST_CalendarType" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Filters", propOrder = {
    "filter",
    "dateGroupItem"
})
public class CTFilters {

    protected List<CTFilter> filter;
    protected List<CTDateGroupItem> dateGroupItem;
    @XmlAttribute
    protected Boolean blank;
    @XmlAttribute
    protected STCalendarType calendarType;

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFilter }
     * 
     * 
     */
    public List<CTFilter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<CTFilter>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the dateGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDateGroupItem }
     * 
     * 
     */
    public List<CTDateGroupItem> getDateGroupItem() {
        if (dateGroupItem == null) {
            dateGroupItem = new ArrayList<CTDateGroupItem>();
        }
        return this.dateGroupItem;
    }

    /**
     * Gets the value of the blank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBlank() {
        if (blank == null) {
            return false;
        } else {
            return blank;
        }
    }

    /**
     * Sets the value of the blank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlank(Boolean value) {
        this.blank = value;
    }

    /**
     * Gets the value of the calendarType property.
     * 
     * @return
     *     possible object is
     *     {@link STCalendarType }
     *     
     */
    public STCalendarType getCalendarType() {
        if (calendarType == null) {
            return STCalendarType.NONE;
        } else {
            return calendarType;
        }
    }

    /**
     * Sets the value of the calendarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link STCalendarType }
     *     
     */
    public void setCalendarType(STCalendarType value) {
        this.calendarType = value;
    }

}
