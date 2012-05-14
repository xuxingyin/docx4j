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


package org.pptx4j.pml;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlRootElement;
import ae.javax.xml.bind.annotation.XmlType;
import org.docx4j.dml.CTColorMappingOverride;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cSld" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_CommonSlideData"/>
 *         &lt;group ref="{http://schemas.openxmlformats.org/presentationml/2006/main}EG_ChildSlide" minOccurs="0"/>
 *         &lt;element name="transition" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SlideTransition" minOccurs="0"/>
 *         &lt;element name="timing" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_SlideTiming" minOccurs="0"/>
 *         &lt;element name="hf" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_HeaderFooter" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionListModify" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.openxmlformats.org/presentationml/2006/main}AG_ChildSlide"/>
 *       &lt;attribute name="matchingName" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="type" type="{http://schemas.openxmlformats.org/presentationml/2006/main}ST_SlideLayoutType" default="cust" />
 *       &lt;attribute name="preserve" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="userDrawn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cSld",
    "clrMapOvr",
    "transition",
    "timing",
    "hf",
    "extLst"
})
@XmlRootElement(name = "sldLayout")
public class SldLayout {

    @XmlElement(required = true)
    protected CommonSlideData cSld;
    protected CTColorMappingOverride clrMapOvr;
    protected CTSlideTransition transition;
    protected CTSlideTiming timing;
    protected CTHeaderFooter hf;
    protected CTExtensionListModify extLst;
    @XmlAttribute
    protected String matchingName;
    @XmlAttribute
    protected STSlideLayoutType type;
    @XmlAttribute
    protected Boolean preserve;
    @XmlAttribute
    protected Boolean userDrawn;
    @XmlAttribute
    protected Boolean showMasterSp;
    @XmlAttribute
    protected Boolean showMasterPhAnim;

    /**
     * Gets the value of the cSld property.
     * 
     * @return
     *     possible object is
     *     {@link CommonSlideData }
     *     
     */
    public CommonSlideData getCSld() {
        return cSld;
    }

    /**
     * Sets the value of the cSld property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonSlideData }
     *     
     */
    public void setCSld(CommonSlideData value) {
        this.cSld = value;
    }

    /**
     * Gets the value of the clrMapOvr property.
     * 
     * @return
     *     possible object is
     *     {@link CTColorMappingOverride }
     *     
     */
    public CTColorMappingOverride getClrMapOvr() {
        return clrMapOvr;
    }

    /**
     * Sets the value of the clrMapOvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColorMappingOverride }
     *     
     */
    public void setClrMapOvr(CTColorMappingOverride value) {
        this.clrMapOvr = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link CTSlideTransition }
     *     
     */
    public CTSlideTransition getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSlideTransition }
     *     
     */
    public void setTransition(CTSlideTransition value) {
        this.transition = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link CTSlideTiming }
     *     
     */
    public CTSlideTiming getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSlideTiming }
     *     
     */
    public void setTiming(CTSlideTiming value) {
        this.timing = value;
    }

    /**
     * Gets the value of the hf property.
     * 
     * @return
     *     possible object is
     *     {@link CTHeaderFooter }
     *     
     */
    public CTHeaderFooter getHf() {
        return hf;
    }

    /**
     * Sets the value of the hf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHeaderFooter }
     *     
     */
    public void setHf(CTHeaderFooter value) {
        this.hf = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTExtensionListModify }
     *     
     */
    public CTExtensionListModify getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExtensionListModify }
     *     
     */
    public void setExtLst(CTExtensionListModify value) {
        this.extLst = value;
    }

    /**
     * Gets the value of the matchingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchingName() {
        if (matchingName == null) {
            return "";
        } else {
            return matchingName;
        }
    }

    /**
     * Sets the value of the matchingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchingName(String value) {
        this.matchingName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link STSlideLayoutType }
     *     
     */
    public STSlideLayoutType getType() {
        if (type == null) {
            return STSlideLayoutType.CUST;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSlideLayoutType }
     *     
     */
    public void setType(STSlideLayoutType value) {
        this.type = value;
    }

    /**
     * Gets the value of the preserve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreserve() {
        if (preserve == null) {
            return false;
        } else {
            return preserve;
        }
    }

    /**
     * Sets the value of the preserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserve(Boolean value) {
        this.preserve = value;
    }

    /**
     * Gets the value of the userDrawn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserDrawn() {
        if (userDrawn == null) {
            return false;
        } else {
            return userDrawn;
        }
    }

    /**
     * Sets the value of the userDrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDrawn(Boolean value) {
        this.userDrawn = value;
    }

    /**
     * Gets the value of the showMasterSp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowMasterSp() {
        if (showMasterSp == null) {
            return true;
        } else {
            return showMasterSp;
        }
    }

    /**
     * Sets the value of the showMasterSp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMasterSp(Boolean value) {
        this.showMasterSp = value;
    }

    /**
     * Gets the value of the showMasterPhAnim property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowMasterPhAnim() {
        if (showMasterPhAnim == null) {
            return true;
        } else {
            return showMasterPhAnim;
        }
    }

    /**
     * Sets the value of the showMasterPhAnim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMasterPhAnim(Boolean value) {
        this.showMasterPhAnim = value;
    }

}
