/*
 *  Copyright 2007, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is free software: you can use it, redistribute it and/or modify
    it under the terms of version 3 of the GNU Affero General Public License 
    as published by the Free Software Foundation.

    If you need the right to use it under a different license, please
    contact Plutext.

    docx4j is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License   
    along with docx4j.  If not, see <http://www.fsf.org/licensing/licenses/>.
    
 */

package org.docx4j.dml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_DuotoneEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_DuotoneEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_ColorChoice" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_DuotoneEffect", propOrder = {
    "egColorChoice"
})
public class CTDuotoneEffect {

    @XmlElements({
        @XmlElement(name = "srgbClr", type = CTSRgbColor.class),
        @XmlElement(name = "scrgbClr", type = CTScRgbColor.class),
        @XmlElement(name = "hslClr", type = CTHslColor.class),
        @XmlElement(name = "prstClr", type = CTPresetColor.class),
        @XmlElement(name = "sysClr", type = CTSystemColor.class),
        @XmlElement(name = "schemeClr", type = CTSchemeColor.class)
    })
    protected List<Object> egColorChoice;

    /**
     * Gets the value of the egColorChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egColorChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGColorChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSRgbColor }
     * {@link CTScRgbColor }
     * {@link CTHslColor }
     * {@link CTPresetColor }
     * {@link CTSystemColor }
     * {@link CTSchemeColor }
     * 
     * 
     */
    public List<Object> getEGColorChoice() {
        if (egColorChoice == null) {
            egColorChoice = new ArrayList<Object>();
        }
        return this.egColorChoice;
    }

}
