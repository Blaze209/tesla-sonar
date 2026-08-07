package ezvcard.property;

import eq.a;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import hq.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class RawProperty extends TextProperty {
    private VCardDataType dataType;
    private String propertyName;

    public RawProperty(String str, String str2) {
        this(str, str2, null);
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        a syntaxStyle = vCardVersion.getSyntaxStyle();
        hq.a aVarB = b.b(syntaxStyle, true);
        if (aVarB.c(this.propertyName)) {
            return;
        }
        if (syntaxStyle != a.OLD) {
            list.add(new d(24, this.propertyName));
        } else {
            list.add(new d(33, this.propertyName, aVarB.d().e(true)));
        }
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        RawProperty rawProperty = (RawProperty) obj;
        VCardDataType vCardDataType = this.dataType;
        if (vCardDataType == null) {
            if (rawProperty.dataType != null) {
                return false;
            }
        } else if (!vCardDataType.equals(rawProperty.dataType)) {
            return false;
        }
        String str = this.propertyName;
        if (str == null) {
            if (rawProperty.propertyName != null) {
                return false;
            }
        } else if (!str.equalsIgnoreCase(rawProperty.propertyName)) {
            return false;
        }
        return true;
    }

    public VCardDataType getDataType() {
        return this.dataType;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        VCardDataType vCardDataType = this.dataType;
        int iHashCode2 = (iHashCode + (vCardDataType == null ? 0 : vCardDataType.hashCode())) * 31;
        String str = this.propertyName;
        return iHashCode2 + (str != null ? str.toLowerCase().hashCode() : 0);
    }

    public void setDataType(VCardDataType vCardDataType) {
        this.dataType = vCardDataType;
    }

    public void setPropertyName(String str) {
        this.propertyName = str;
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", this.propertyName);
        linkedHashMap.put("dataType", this.dataType);
        linkedHashMap.put("value", this.value);
        return linkedHashMap;
    }

    public RawProperty(String str, String str2, VCardDataType vCardDataType) {
        super(str2);
        this.propertyName = str;
        this.dataType = vCardDataType;
    }

    @Override // ezvcard.property.VCardProperty
    public RawProperty copy() {
        return new RawProperty(this);
    }

    public RawProperty(RawProperty rawProperty) {
        super(rawProperty);
        this.propertyName = rawProperty.propertyName;
        this.dataType = rawProperty.dataType;
    }
}
