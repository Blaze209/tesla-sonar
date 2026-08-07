package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class SimpleProperty<T> extends VCardProperty {
    protected T value;

    public SimpleProperty(T t11) {
        this.value = t11;
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
        SimpleProperty simpleProperty = (SimpleProperty) obj;
        T t11 = this.value;
        if (t11 == null) {
            if (simpleProperty.value != null) {
                return false;
            }
        } else if (!t11.equals(simpleProperty.value)) {
            return false;
        }
        return true;
    }

    public T getValue() {
        return this.value;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        T t11 = this.value;
        return iHashCode + (t11 == null ? 0 : t11.hashCode());
    }

    public void setValue(T t11) {
        this.value = t11;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("value", this.value);
        return linkedHashMap;
    }

    public SimpleProperty(SimpleProperty<T> simpleProperty) {
        super(simpleProperty);
        this.value = simpleProperty.value;
    }
}
