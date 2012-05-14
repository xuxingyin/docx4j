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


package org.docx4j.dml;

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlElements;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_TextParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TextParagraph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_TextRun" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endParaRPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextCharacterProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TextParagraph", propOrder = {
    "pPr",
    "egTextRun",
    "endParaRPr"
})
public class CTTextParagraph {

    protected CTTextParagraphProperties pPr;
    @XmlElements({
        @XmlElement(name = "r", type = CTRegularTextRun.class),
        @XmlElement(name = "fld", type = CTTextField.class),
        @XmlElement(name = "br", type = CTTextLineBreak.class)
    })
    protected List<Object> egTextRun;
    protected CTTextCharacterProperties endParaRPr;

    /**
     * Gets the value of the pPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getPPr() {
        return pPr;
    }

    /**
     * Sets the value of the pPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setPPr(CTTextParagraphProperties value) {
        this.pPr = value;
    }

    /**
     * Gets the value of the egTextRun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egTextRun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGTextRun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTRegularTextRun }
     * {@link CTTextField }
     * {@link CTTextLineBreak }
     * 
     * 
     */
    public List<Object> getEGTextRun() {
        if (egTextRun == null) {
            egTextRun = new ArrayList<Object>();
        }
        return this.egTextRun;
    }

    /**
     * Gets the value of the endParaRPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextCharacterProperties }
     *     
     */
    public CTTextCharacterProperties getEndParaRPr() {
        return endParaRPr;
    }

    /**
     * Sets the value of the endParaRPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextCharacterProperties }
     *     
     */
    public void setEndParaRPr(CTTextCharacterProperties value) {
        this.endParaRPr = value;
    }

}
