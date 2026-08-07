package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.List;
import xj0.c;
import xj0.d;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0})
public class Profile extends TextProperty {
    public Profile() {
        super("VCARD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected void _validate(List<d> list, VCardVersion vCardVersion, VCard vCard) {
        if ("VCARD".equalsIgnoreCase((String) this.value)) {
            return;
        }
        list.add(new d(18, this.value));
    }

    public Profile(Profile profile) {
        super(profile);
    }

    @Override // ezvcard.property.VCardProperty
    public Profile copy() {
        return new Profile(this);
    }
}
