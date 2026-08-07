package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.util.PartialDate;
import java.util.Date;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Anniversary extends DateOrTimeProperty {
    public Anniversary(Date date) {
        super(date);
    }

    public Anniversary(Date date, boolean z11) {
        super(date, z11);
    }

    @Override // ezvcard.property.VCardProperty
    public Anniversary copy() {
        return new Anniversary(this);
    }

    public Anniversary(PartialDate partialDate) {
        super(partialDate);
    }

    public Anniversary(String str) {
        super(str);
    }

    public Anniversary(Anniversary anniversary) {
        super(anniversary);
    }
}
