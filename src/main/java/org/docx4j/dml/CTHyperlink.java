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

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Hyperlink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Hyperlink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snd" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_EmbeddedWAVAudioFile" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_OfficeArtExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://schemas.openxmlformats.org/officeDocument/2006/relationships}id"/>
 *       &lt;attribute name="invalidUrl" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="tgtFrame" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="history" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="highlightClick" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="endSnd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Hyperlink", propOrder = {
    "snd",
    "extLst"
})
public class CTHyperlink {

    protected CTEmbeddedWAVAudioFile snd;
    protected CTOfficeArtExtensionList extLst;
    @XmlAttribute(namespace = "http://schemas.openxmlformats.org/officeDocument/2006/relationships")
    protected String id;
    @XmlAttribute
    protected String invalidUrl;
    @XmlAttribute
    protected String action;
    @XmlAttribute
    protected String tgtFrame;
    @XmlAttribute
    protected String tooltip;
    @XmlAttribute
    protected Boolean history;
    @XmlAttribute
    protected Boolean highlightClick;
    @XmlAttribute
    protected Boolean endSnd;

    /**
     * Gets the value of the snd property.
     * 
     * @return
     *     possible object is
     *     {@link CTEmbeddedWAVAudioFile }
     *     
     */
    public CTEmbeddedWAVAudioFile getSnd() {
        return snd;
    }

    /**
     * Sets the value of the snd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEmbeddedWAVAudioFile }
     *     
     */
    public void setSnd(CTEmbeddedWAVAudioFile value) {
        this.snd = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public CTOfficeArtExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public void setExtLst(CTOfficeArtExtensionList value) {
        this.extLst = value;
    }

    /**
     * Drawing Object Hyperlink Target
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the invalidUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidUrl() {
        if (invalidUrl == null) {
            return "";
        } else {
            return invalidUrl;
        }
    }

    /**
     * Sets the value of the invalidUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidUrl(String value) {
        this.invalidUrl = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        if (action == null) {
            return "";
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the tgtFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgtFrame() {
        if (tgtFrame == null) {
            return "";
        } else {
            return tgtFrame;
        }
    }

    /**
     * Sets the value of the tgtFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgtFrame(String value) {
        this.tgtFrame = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        if (tooltip == null) {
            return "";
        } else {
            return tooltip;
        }
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHistory() {
        if (history == null) {
            return true;
        } else {
            return history;
        }
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistory(Boolean value) {
        this.history = value;
    }

    /**
     * Gets the value of the highlightClick property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHighlightClick() {
        if (highlightClick == null) {
            return false;
        } else {
            return highlightClick;
        }
    }

    /**
     * Sets the value of the highlightClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighlightClick(Boolean value) {
        this.highlightClick = value;
    }

    /**
     * Gets the value of the endSnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEndSnd() {
        if (endSnd == null) {
            return false;
        } else {
            return endSnd;
        }
    }

    /**
     * Sets the value of the endSnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndSnd(Boolean value) {
        this.endSnd = value;
    }

}
