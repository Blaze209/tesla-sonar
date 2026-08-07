package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.ExpertiseLevel;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Expertise extends TextProperty implements HasAltId {
    public Expertise(String str) {
        super(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getIndex() {
        return super.getIndex();
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    public ExpertiseLevel getLevel() {
        String strT = this.parameters.t();
        if (strT == null) {
            return null;
        }
        return ExpertiseLevel.d(strT);
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
    public void setIndex(Integer num) {
        super.setIndex(num);
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public void setLevel(ExpertiseLevel expertiseLevel) {
        this.parameters.K(expertiseLevel == null ? null : expertiseLevel.b());
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    public Expertise(Expertise expertise) {
        super(expertise);
    }

    @Override // ezvcard.property.VCardProperty
    public Expertise copy() {
        return new Expertise(this);
    }
}
