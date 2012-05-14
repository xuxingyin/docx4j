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
 * <p>Java class for ST_VolDepType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VolDepType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="realTimeData"/>
 *     &lt;enumeration value="olapFunctions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_VolDepType")
@XmlEnum
public enum STVolDepType {


    /**
     * Real Time Data
     * 
     */
    @XmlEnumValue("realTimeData")
    REAL_TIME_DATA("realTimeData"),

    /**
     * OLAP Formulas
     * 
     */
    @XmlEnumValue("olapFunctions")
    OLAP_FUNCTIONS("olapFunctions");
    private final String value;

    STVolDepType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVolDepType fromValue(String v) {
        for (STVolDepType c: STVolDepType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
