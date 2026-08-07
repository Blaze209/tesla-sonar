package ezvcard.property;

import eq.a;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.parameter.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xj0.b;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract class VCardProperty implements Comparable<VCardProperty> {
    protected String group;
    protected VCardParameters parameters;

    public VCardProperty() {
        this.parameters = new VCardParameters();
    }

    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
    }

    public void addParameter(String str, String str2) {
        this.parameters.f(str, str2);
    }

    public VCardProperty copy() {
        Class<?> cls = getClass();
        try {
            return (VCardProperty) cls.getConstructor(cls).newInstance(this);
        } catch (Exception e11) {
            throw new UnsupportedOperationException(b.INSTANCE.getExceptionMessage(31, cls.getName()), e11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardProperty vCardProperty = (VCardProperty) obj;
        String str = this.group;
        if (str == null) {
            if (vCardProperty.group != null) {
                return false;
            }
        } else if (!str.equalsIgnoreCase(vCardProperty.group)) {
            return false;
        }
        return this.parameters.equals(vCardProperty.parameters);
    }

    public String getGroup() {
        return this.group;
    }

    Integer getIndex() {
        return this.parameters.q();
    }

    String getLanguage() {
        return this.parameters.s();
    }

    public String getParameter(String str) {
        return this.parameters.d(str);
    }

    public VCardParameters getParameters() {
        return this.parameters;
    }

    List<c> getPids() {
        return this.parameters.v();
    }

    Integer getPref() {
        return this.parameters.w();
    }

    public final VCardVersion[] getSupportedVersions() {
        xj0.c cVar = (xj0.c) getClass().getAnnotation(xj0.c.class);
        return cVar == null ? VCardVersion.values() : cVar.value();
    }

    public int hashCode() {
        String str = this.group;
        return (((str == null ? 0 : str.toLowerCase().hashCode()) + 31) * 31) + this.parameters.hashCode();
    }

    public final boolean isSupportedBy(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : getSupportedVersions()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public void removeParameter(String str) {
        this.parameters.h(str);
    }

    public void setGroup(String str) {
        this.group = str;
    }

    void setIndex(Integer num) {
        this.parameters.H(num);
    }

    void setLanguage(String str) {
        this.parameters.J(str);
    }

    public void setParameter(String str, String str2) {
        this.parameters.i(str, str2);
    }

    public void setParameters(VCardParameters vCardParameters) {
        if (vCardParameters == null) {
            throw new NullPointerException(b.INSTANCE.getExceptionMessage(42, new Object[0]));
        }
        this.parameters = vCardParameters;
    }

    void setPref(Integer num) {
        this.parameters.M(num);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(" [ group=");
        sb2.append(this.group);
        sb2.append(" | parameters=");
        sb2.append(this.parameters);
        for (Map.Entry<String, Object> entry : toStringValues().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(" | ");
            sb2.append(key);
            sb2.append('=');
            sb2.append(value);
        }
        sb2.append(" ]");
        return sb2.toString();
    }

    protected Map<String, Object> toStringValues() {
        return Collections.EMPTY_MAP;
    }

    public final List<d> validate(VCardVersion vCardVersion, VCard vCard) {
        ArrayList arrayList = new ArrayList(0);
        if (!isSupportedBy(vCardVersion)) {
            arrayList.add(new d(2, Arrays.toString(getSupportedVersions())));
        }
        arrayList.addAll(this.parameters.R(vCardVersion));
        if (this.group != null) {
            a syntaxStyle = vCardVersion.getSyntaxStyle();
            hq.a aVarA = hq.b.a(syntaxStyle, true);
            if (!aVarA.c(this.group)) {
                if (syntaxStyle == a.OLD) {
                    arrayList.add(new d(32, this.group, aVarA.d().e(true)));
                } else {
                    arrayList.add(new d(23, this.group));
                }
            }
        }
        _validate(arrayList, vCardVersion, vCard);
        return arrayList;
    }

    @Override // java.lang.Comparable
    public int compareTo(VCardProperty vCardProperty) {
        Integer numW = getParameters().w();
        Integer numW2 = vCardProperty.getParameters().w();
        if (numW == null && numW2 == null) {
            return 0;
        }
        if (numW == null) {
            return 1;
        }
        if (numW2 == null) {
            return -1;
        }
        return numW2.compareTo(numW);
    }

    public List<String> getParameters(String str) {
        return Collections.unmodifiableList(this.parameters.e(str));
    }

    protected VCardProperty(VCardProperty vCardProperty) {
        this.group = vCardProperty.group;
        this.parameters = new VCardParameters(vCardProperty.parameters);
    }
}
