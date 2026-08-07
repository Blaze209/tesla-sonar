package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0})
public class Classification extends TextProperty {
    public Classification(String str) {
        super(str);
    }

    public Classification(Classification classification) {
        super(classification);
    }

    @Override // ezvcard.property.VCardProperty
    public Classification copy() {
        return new Classification(this);
    }
}
