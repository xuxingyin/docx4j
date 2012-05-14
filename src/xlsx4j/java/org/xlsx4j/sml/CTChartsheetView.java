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
import ae.javax.xml.bind.annotation.XmlSchemaType;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ChartsheetView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ChartsheetView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tabSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="zoomScale" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="100" />
 *       &lt;attribute name="workbookViewId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="zoomToFit" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ChartsheetView", propOrder = {
    "extLst"
})
public class CTChartsheetView {

    protected CTExtensionList extLst;
    @XmlAttribute
    protected Boolean tabSelected;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedInt")
    protected Long zoomScale;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long workbookViewId;
    @XmlAttribute
    protected Boolean zoomToFit;

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
     * Gets the value of the tabSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTabSelected() {
        if (tabSelected == null) {
            return false;
        } else {
            return tabSelected;
        }
    }

    /**
     * Sets the value of the tabSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTabSelected(Boolean value) {
        this.tabSelected = value;
    }

    /**
     * Gets the value of the zoomScale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getZoomScale() {
        if (zoomScale == null) {
            return  100L;
        } else {
            return zoomScale;
        }
    }

    /**
     * Sets the value of the zoomScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setZoomScale(Long value) {
        this.zoomScale = value;
    }

    /**
     * Gets the value of the workbookViewId property.
     * 
     */
    public long getWorkbookViewId() {
        return workbookViewId;
    }

    /**
     * Sets the value of the workbookViewId property.
     * 
     */
    public void setWorkbookViewId(long value) {
        this.workbookViewId = value;
    }

    /**
     * Gets the value of the zoomToFit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isZoomToFit() {
        if (zoomToFit == null) {
            return false;
        } else {
            return zoomToFit;
        }
    }

    /**
     * Sets the value of the zoomToFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZoomToFit(Boolean value) {
        this.zoomToFit = value;
    }

}
