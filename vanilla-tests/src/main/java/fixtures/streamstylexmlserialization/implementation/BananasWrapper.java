// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstylexmlserialization.implementation;

import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import fixtures.streamstylexmlserialization.models.Banana;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;

/** A wrapper around List&lt;Banana&gt; which provides top-level metadata for serialization. */
public final class BananasWrapper implements XmlSerializable<BananasWrapper> {
    private final List<Banana> bananas;

    /**
     * Creates an instance of BananasWrapper.
     *
     * @param bananas the list.
     */
    public BananasWrapper(List<Banana> bananas) {
        this.bananas = bananas;
    }

    /**
     * Get the List&lt;Banana&gt; contained in this wrapper.
     *
     * @return the List&lt;Banana&gt;.
     */
    public List<Banana> items() {
        return bananas;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        xmlWriter.writeStartElement("bananas");
        if (bananas != null) {
            for (Banana element : bananas) {
                xmlWriter.writeXml(element);
            }
        }
        return xmlWriter.writeEndElement();
    }

    public static BananasWrapper fromXml(XmlReader xmlReader) throws XMLStreamException {
        return xmlReader.readObject(
                "bananas",
                reader -> {
                    List<Banana> items = null;

                    while (reader.nextElement() != XmlToken.END_ELEMENT) {
                        String elementName = reader.getElementName().getLocalPart();

                        if ("banana".equals(elementName)) {
                            if (items == null) {
                                items = new ArrayList<>();
                            }

                            items.add(Banana.fromXml(reader));
                        } else {
                            reader.nextElement();
                        }
                    }
                    return new BananasWrapper(items);
                });
    }
}