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
 * <p>Java class for ST_GroupBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_GroupBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="range"/>
 *     &lt;enumeration value="seconds"/>
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="days"/>
 *     &lt;enumeration value="months"/>
 *     &lt;enumeration value="quarters"/>
 *     &lt;enumeration value="years"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_GroupBy")
@XmlEnum
public enum STGroupBy {


    /**
     * Group By Numeric Ranges
     * 
     */
    @XmlEnumValue("range")
    RANGE("range"),

    /**
     * Seconds
     * 
     */
    @XmlEnumValue("seconds")
    SECONDS("seconds"),

    /**
     * Minutes
     * 
     */
    @XmlEnumValue("minutes")
    MINUTES("minutes"),

    /**
     * Hours
     * 
     */
    @XmlEnumValue("hours")
    HOURS("hours"),

    /**
     * Days
     * 
     */
    @XmlEnumValue("days")
    DAYS("days"),

    /**
     * Months
     * 
     */
    @XmlEnumValue("months")
    MONTHS("months"),

    /**
     * Quarters
     * 
     */
    @XmlEnumValue("quarters")
    QUARTERS("quarters"),

    /**
     * Years
     * 
     */
    @XmlEnumValue("years")
    YEARS("years");
    private final String value;

    STGroupBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGroupBy fromValue(String v) {
        for (STGroupBy c: STGroupBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
