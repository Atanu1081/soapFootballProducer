//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.27 at 02:02:08 PM IST 
//


package pojoClasses;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_howtodoinjava_com.xml.school package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_howtodoinjava_com.xml.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FootballerDetailsRequest }
     *
     */
    public FootballerDetailsRequest createFootballerDetailsRequest() {
        return new FootballerDetailsRequest();
    }

    /**
     * Create an instance of {@link FootballerDetailsResponse }
     *
     */
    public FootballerDetailsResponse createFootballerDetailsResponse() {
        return new FootballerDetailsResponse();
    }

    /**
     * Create an instance of {@link Footballer }
     *
     */
    public Footballer createFootballer() {
        return new Footballer();
    }

}
