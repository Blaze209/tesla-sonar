package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.EmailType;
import ezvcard.parameter.VCardParameters;
import ezvcard.parameter.c;
import java.util.List;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
public class Email extends TextProperty implements HasAltId {
    public Email(String str) {
        super(str);
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        super._validate(list, vCardVersion, vCard);
        for (EmailType emailType : getTypes()) {
            if (emailType != EmailType.f63525e && !emailType.c(vCardVersion)) {
                list.add(new d(9, emailType.b()));
            }
        }
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.l();
    }

    @Override // ezvcard.property.VCardProperty
    public List<c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public List<EmailType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<EmailType>(vCardParameters) { // from class: ezvcard.property.Email.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public EmailType _asObject(String str) {
                return EmailType.d(str);
            }
        };
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.E(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public Email(Email email) {
        super(email);
    }

    @Override // ezvcard.property.VCardProperty
    public Email copy() {
        return new Email(this);
    }
}
