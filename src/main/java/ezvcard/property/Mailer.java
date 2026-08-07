package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V2_1, VCardVersion.V3_0})
public class Mailer extends TextProperty {
    public Mailer(String str) {
        super(str);
    }

    public Mailer(Mailer mailer) {
        super(mailer);
    }

    @Override // ezvcard.property.VCardProperty
    public Mailer copy() {
        return new Mailer(this);
    }
}
