package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V4_0})
public class Deathplace extends PlaceProperty {
    public Deathplace() {
    }

    public Deathplace(double d11, double d12) {
        super(d11, d12);
    }

    @Override // ezvcard.property.VCardProperty
    public Deathplace copy() {
        return new Deathplace(this);
    }

    public Deathplace(String str) {
        super(str);
    }

    public Deathplace(Deathplace deathplace) {
        super(deathplace);
    }
}
