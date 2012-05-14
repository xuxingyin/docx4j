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

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_HorizontalAlignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_HorizontalAlignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="fill"/>
 *     &lt;enumeration value="justify"/>
 *     &lt;enumeration value="centerContinuous"/>
 *     &lt;enumeration value="distributed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_HorizontalAlignment")
@XmlEnum
public enum STHorizontalAlignment {


    /**
     * General Horizontal Alignment
     * 
     */
    @XmlEnumValue("general")
    GENERAL("general"),

    /**
     * Left Horizontal Alignment
     * 
     */
    @XmlEnumValue("left")
    LEFT("left"),

    /**
     * Centered Horizontal Alignment
     * 
     */
    @XmlEnumValue("center")
    CENTER("center"),

    /**
     * Right Horizontal Alignment
     * 
     */
    @XmlEnumValue("right")
    RIGHT("right"),

    /**
     * Fill
     * 
     */
    @XmlEnumValue("fill")
    FILL("fill"),

    /**
     * Justify
     * 
     */
    @XmlEnumValue("justify")
    JUSTIFY("justify"),

    /**
     * Center Continuous Horizontal Alignment
     * 
     */
    @XmlEnumValue("centerContinuous")
    CENTER_CONTINUOUS("centerContinuous"),

    /**
     * Distributed Horizontal Alignment
     * 
     */
    @XmlEnumValue("distributed")
    DISTRIBUTED("distributed");
    private final String value;

    STHorizontalAlignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STHorizontalAlignment fromValue(String v) {
        for (STHorizontalAlignment c: STHorizontalAlignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
