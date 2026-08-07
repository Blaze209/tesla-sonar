package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0})
public class SortString extends TextProperty {
    public SortString(String str) {
        super(str);
    }

    public SortString(SortString sortString) {
        super(sortString);
    }

    @Override // ezvcard.property.VCardProperty
    public SortString copy() {
        return new SortString(this);
    }
}
