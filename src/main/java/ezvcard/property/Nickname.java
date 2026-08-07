package ezvcard.property;

import ezvcard.VCardVersion;
import java.util.List;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0, VCardVersion.V4_0})
public class Nickname extends TextListProperty implements HasAltId {
    public Nickname() {
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
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
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    public Nickname(Nickname nickname) {
        super(nickname);
    }

    @Override // ezvcard.property.VCardProperty
    public Nickname copy() {
        return new Nickname(this);
    }
}
