package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.HobbyLevel;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Hobby extends TextProperty implements HasAltId {
    public Hobby(String str) {
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

    public HobbyLevel getLevel() {
        String strT = this.parameters.t();
        if (strT == null) {
            return null;
        }
        return HobbyLevel.d(strT);
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

    public void setLevel(HobbyLevel hobbyLevel) {
        this.parameters.K(hobbyLevel.b());
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    public Hobby(Hobby hobby) {
        super(hobby);
    }

    @Override // ezvcard.property.VCardProperty
    public Hobby copy() {
        return new Hobby(this);
    }
}
