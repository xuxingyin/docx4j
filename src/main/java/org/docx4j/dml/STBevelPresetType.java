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

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BevelPresetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BevelPresetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="relaxedInset"/>
 *     &lt;enumeration value="circle"/>
 *     &lt;enumeration value="slope"/>
 *     &lt;enumeration value="cross"/>
 *     &lt;enumeration value="angle"/>
 *     &lt;enumeration value="softRound"/>
 *     &lt;enumeration value="convex"/>
 *     &lt;enumeration value="coolSlant"/>
 *     &lt;enumeration value="divot"/>
 *     &lt;enumeration value="riblet"/>
 *     &lt;enumeration value="hardEdge"/>
 *     &lt;enumeration value="artDeco"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_BevelPresetType")
@XmlEnum
public enum STBevelPresetType {


    /**
     * Relaxed Inset
     * 
     */
    @XmlEnumValue("relaxedInset")
    RELAXED_INSET("relaxedInset"),

    /**
     * Circle
     * 
     */
    @XmlEnumValue("circle")
    CIRCLE("circle"),

    /**
     * Slope
     * 
     */
    @XmlEnumValue("slope")
    SLOPE("slope"),

    /**
     * Cross
     * 
     */
    @XmlEnumValue("cross")
    CROSS("cross"),

    /**
     * Angle
     * 
     */
    @XmlEnumValue("angle")
    ANGLE("angle"),

    /**
     * Soft Round
     * 
     */
    @XmlEnumValue("softRound")
    SOFT_ROUND("softRound"),

    /**
     * Convex
     * 
     */
    @XmlEnumValue("convex")
    CONVEX("convex"),

    /**
     * Cool Slant
     * 
     */
    @XmlEnumValue("coolSlant")
    COOL_SLANT("coolSlant"),

    /**
     * Divot
     * 
     */
    @XmlEnumValue("divot")
    DIVOT("divot"),

    /**
     * Riblet
     * 
     */
    @XmlEnumValue("riblet")
    RIBLET("riblet"),

    /**
     * Hard Edge
     * 
     */
    @XmlEnumValue("hardEdge")
    HARD_EDGE("hardEdge"),

    /**
     * Art Deco
     * 
     */
    @XmlEnumValue("artDeco")
    ART_DECO("artDeco");
    private final String value;

    STBevelPresetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBevelPresetType fromValue(String v) {
        for (STBevelPresetType c: STBevelPresetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
