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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="themeElements" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_BaseStyles"/>
 *         &lt;element name="objectDefaults" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_ObjectStyleDefaults" minOccurs="0"/>
 *         &lt;element name="extraClrSchemeLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_ColorSchemeList" minOccurs="0"/>
 *         &lt;element name="custClrLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_CustomColorList" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_OfficeArtExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "themeElements",
    "objectDefaults",
    "extraClrSchemeLst",
    "custClrLst",
    "extLst"
})
@XmlRootElement(name = "theme")
public class Theme {

    @XmlElement(required = true)
    protected BaseStyles themeElements;
    protected CTObjectStyleDefaults objectDefaults;
    protected CTColorSchemeList extraClrSchemeLst;
    protected CTCustomColorList custClrLst;
    protected CTOfficeArtExtensionList extLst;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the themeElements property.
     * 
     * @return
     *     possible object is
     *     {@link BaseStyles }
     *     
     */
    public BaseStyles getThemeElements() {
        return themeElements;
    }

    /**
     * Sets the value of the themeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseStyles }
     *     
     */
    public void setThemeElements(BaseStyles value) {
        this.themeElements = value;
    }

    /**
     * Gets the value of the objectDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link CTObjectStyleDefaults }
     *     
     */
    public CTObjectStyleDefaults getObjectDefaults() {
        return objectDefaults;
    }

    /**
     * Sets the value of the objectDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTObjectStyleDefaults }
     *     
     */
    public void setObjectDefaults(CTObjectStyleDefaults value) {
        this.objectDefaults = value;
    }

    /**
     * Gets the value of the extraClrSchemeLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTColorSchemeList }
     *     
     */
    public CTColorSchemeList getExtraClrSchemeLst() {
        return extraClrSchemeLst;
    }

    /**
     * Sets the value of the extraClrSchemeLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColorSchemeList }
     *     
     */
    public void setExtraClrSchemeLst(CTColorSchemeList value) {
        this.extraClrSchemeLst = value;
    }

    /**
     * Gets the value of the custClrLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTCustomColorList }
     *     
     */
    public CTCustomColorList getCustClrLst() {
        return custClrLst;
    }

    /**
     * Sets the value of the custClrLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCustomColorList }
     *     
     */
    public void setCustClrLst(CTCustomColorList value) {
        this.custClrLst = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
