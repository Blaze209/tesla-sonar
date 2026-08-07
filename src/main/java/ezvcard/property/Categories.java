package ezvcard.property;

import ezvcard.VCardVersion;
import java.util.List;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0, VCardVersion.V4_0})
public class Categories extends TextListProperty implements HasAltId {
    public Categories() {
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    @Override // ezvcard.property.VCardProperty
    public List<ezvcard.parameter.c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getType() {
        return this.parameters.z();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.E(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    public Categories(Categories categories) {
        super(categories);
    }

    @Override // ezvcard.property.VCardProperty
    public Categories copy() {
        return new Categories(this);
    }
}
