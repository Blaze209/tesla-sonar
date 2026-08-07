package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.util.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xj0.c;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Xml extends VCardProperty implements HasAltId {
    private Document value;

    public Xml(String str) {
        this(str == null ? null : k.e(str));
    }

    private static Document detachElement(Element element) {
        Document documentC = k.c();
        documentC.appendChild(documentC.importNode(element, true));
        return documentC;
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.value == null) {
            list.add(new d(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Xml xml = (Xml) obj;
        Document document = this.value;
        if (document == null) {
            if (xml.value != null) {
                return false;
            }
        } else if (xml.value == null || !k.g(document).equals(k.g(xml.value))) {
            return false;
        }
        return true;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    public Document getValue() {
        return this.value;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Document document = this.value;
        return iHashCode + (document == null ? 0 : k.g(document).hashCode());
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.E(str);
    }

    public void setValue(Document document) {
        this.value = document;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Document document = this.value;
        linkedHashMap.put("value", document == null ? com.adyen.checkout.components.core.Address.ADDRESS_NULL_PLACEHOLDER : k.g(document));
        return linkedHashMap;
    }

    public Xml(Element element) {
        this(element == null ? null : detachElement(element));
    }

    @Override // ezvcard.property.VCardProperty
    public Xml copy() {
        return new Xml(this);
    }

    public Xml(Document document) {
        this.value = document;
    }

    public Xml(Xml xml) {
        super(xml);
        Document document = xml.value;
        if (document != null) {
            Element documentElement = document.getDocumentElement();
            this.value = documentElement == null ? k.c() : detachElement(documentElement);
        }
    }
}
