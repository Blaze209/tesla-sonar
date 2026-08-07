package ak0;

import ezvcard.VCardDataType;
import ezvcard.property.TextProperty;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y0<T extends TextProperty> extends t0<T> {
    public y0(Class<T> cls, String str) {
        this(cls, str, VCardDataType.f63496g);
    }

    public y0(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str, vCardDataType);
    }
}
