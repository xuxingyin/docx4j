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
 * <p>Java class for ST_VolValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VolValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="b"/>
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="e"/>
 *     &lt;enumeration value="s"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_VolValueType")
@XmlEnum
public enum STVolValueType {


    /**
     * Boolean
     * 
     */
    @XmlEnumValue("b")
    B("b"),

    /**
     * Real Number
     * 
     */
    @XmlEnumValue("n")
    N("n"),

    /**
     * Error
     * 
     */
    @XmlEnumValue("e")
    E("e"),

    /**
     * String
     * 
     */
    @XmlEnumValue("s")
    S("s");
    private final String value;

    STVolValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVolValueType fromValue(String v) {
        for (STVolValueType c: STVolValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
