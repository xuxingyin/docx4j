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

import ae.javax.xml.bind.Unmarshaller;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlTransient;
import ae.javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_PPrChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PPrChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}CT_TrackChange">
 *       &lt;sequence>
 *         &lt;element name="pPr" type="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}CT_PPrBase"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PPrChange", propOrder = {
    "pPr"
})
public class CTPPrChange
    extends CTTrackChange
    implements Child
{

    @XmlElement(required = true)
    protected PPrBase pPr;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the pPr property.
     * 
     * @return
     *     possible object is
     *     {@link PPrBase }
     *     
     */
    public PPrBase getPPr() {
        return pPr;
    }

    /**
     * Sets the value of the pPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPrBase }
     *     
     */
    public void setPPr(PPrBase value) {
        this.pPr = value;
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
