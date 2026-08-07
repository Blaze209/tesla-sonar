package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.util.TelUri;
import java.util.List;
import xj0.c;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Member extends UriProperty implements HasAltId {
    public Member(String str) {
        super(str);
    }

    public static Member email(String str) {
        return new Member("mailto:" + str);
    }

    public static Member im(String str, String str2) {
        return new Member(str + ":" + str2);
    }

    public static Member telephone(TelUri telUri) {
        return new Member(telUri.toString());
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        super._validate(list, vCardVersion, vCard);
        if (vCard.h() == null || !vCard.h().isGroup()) {
            list.add(new d(17, new Object[0]));
        }
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

    public String getUri() {
        return getValue();
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

    public void setUri(String str) {
        setValue(str);
    }

    public Member(Member member) {
        super(member);
    }

    @Override // ezvcard.property.VCardProperty
    public Member copy() {
        return new Member(this);
    }
}
