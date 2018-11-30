package de.ostfalia.swt.progaufgabe_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//import javax.xml.bind.annotation.XmlEnum;
//@XmlEnum( value = DuckState.class)

@XmlRootElement(name = "de.ostfalia.swt.progaufgabe_4")
@XmlAccessorType(XmlAccessType.FIELD)
public enum DuckState {
	
	
	FLYING,

	STANDING,

}
