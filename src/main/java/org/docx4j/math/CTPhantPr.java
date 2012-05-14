/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
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


package org.docx4j.math;

import ae.javax.xml.bind.Unmarshaller;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlTransient;
import ae.javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_PhantPr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PhantPr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="show" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="zeroWid" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="zeroAsc" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="zeroDesc" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="transp" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_OnOff" minOccurs="0"/>
 *         &lt;element name="ctrlPr" type="{http://schemas.openxmlformats.org/officeDocument/2006/math}CT_CtrlPr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PhantPr", propOrder = {
    "show",
    "zeroWid",
    "zeroAsc",
    "zeroDesc",
    "transp",
    "ctrlPr"
})
public class CTPhantPr
    implements Child
{

    protected CTOnOff show;
    protected CTOnOff zeroWid;
    protected CTOnOff zeroAsc;
    protected CTOnOff zeroDesc;
    protected CTOnOff transp;
    protected CTCtrlPr ctrlPr;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setShow(CTOnOff value) {
        this.show = value;
    }

    /**
     * Gets the value of the zeroWid property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getZeroWid() {
        return zeroWid;
    }

    /**
     * Sets the value of the zeroWid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setZeroWid(CTOnOff value) {
        this.zeroWid = value;
    }

    /**
     * Gets the value of the zeroAsc property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getZeroAsc() {
        return zeroAsc;
    }

    /**
     * Sets the value of the zeroAsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setZeroAsc(CTOnOff value) {
        this.zeroAsc = value;
    }

    /**
     * Gets the value of the zeroDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getZeroDesc() {
        return zeroDesc;
    }

    /**
     * Sets the value of the zeroDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setZeroDesc(CTOnOff value) {
        this.zeroDesc = value;
    }

    /**
     * Gets the value of the transp property.
     * 
     * @return
     *     possible object is
     *     {@link CTOnOff }
     *     
     */
    public CTOnOff getTransp() {
        return transp;
    }

    /**
     * Sets the value of the transp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOnOff }
     *     
     */
    public void setTransp(CTOnOff value) {
        this.transp = value;
    }

    /**
     * Gets the value of the ctrlPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTCtrlPr }
     *     
     */
    public CTCtrlPr getCtrlPr() {
        return ctrlPr;
    }

    /**
     * Sets the value of the ctrlPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCtrlPr }
     *     
     */
    public void setCtrlPr(CTCtrlPr value) {
        this.ctrlPr = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
