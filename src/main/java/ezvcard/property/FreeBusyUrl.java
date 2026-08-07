package ezvcard.property;

import ezvcard.VCardVersion;
import java.util.List;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class FreeBusyUrl extends UriProperty implements HasAltId {
    public FreeBusyUrl(String str) {
        super(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    public String getMediaType() {
        return this.parameters.u();
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

    public void setMediaType(String str) {
        this.parameters.L(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.P(str);
    }

    public FreeBusyUrl(FreeBusyUrl freeBusyUrl) {
        super(freeBusyUrl);
    }

    @Override // ezvcard.property.VCardProperty
    public FreeBusyUrl copy() {
        return new FreeBusyUrl(this);
    }
}
