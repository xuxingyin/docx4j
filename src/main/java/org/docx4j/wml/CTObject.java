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


package org.docx4j.wml;

import java.math.BigInteger;
import ae.javax.xml.bind.Unmarshaller;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlTransient;
import ae.javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}CT_PictureBase">
 *       &lt;sequence>
 *         &lt;element name="control" type="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}CT_Control" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dxaOrig" type="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}ST_TwipsMeasure" />
 *       &lt;attribute name="dyaOrig" type="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}ST_TwipsMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Object", propOrder = {
    "control"
})
public class CTObject
    extends CTPictureBase
    implements Child
{

    protected CTControl control;
    @XmlAttribute(namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    protected BigInteger dxaOrig;
    @XmlAttribute(namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
    protected BigInteger dyaOrig;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link CTControl }
     *     
     */
    public CTControl getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTControl }
     *     
     */
    public void setControl(CTControl value) {
        this.control = value;
    }

    /**
     * Gets the value of the dxaOrig property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDxaOrig() {
        return dxaOrig;
    }

    /**
     * Sets the value of the dxaOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDxaOrig(BigInteger value) {
        this.dxaOrig = value;
    }

    /**
     * Gets the value of the dyaOrig property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDyaOrig() {
        return dyaOrig;
    }

    /**
     * Sets the value of the dyaOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDyaOrig(BigInteger value) {
        this.dyaOrig = value;
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
