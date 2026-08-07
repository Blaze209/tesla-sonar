package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Birthplace extends PlaceProperty {
    public Birthplace() {
    }

    public Birthplace(double d11, double d12) {
        super(d11, d12);
    }

    @Override // ezvcard.property.VCardProperty
    public Birthplace copy() {
        return new Birthplace(this);
    }

    public Birthplace(String str) {
        super(str);
    }

    public Birthplace(Birthplace birthplace) {
        super(birthplace);
    }
}
