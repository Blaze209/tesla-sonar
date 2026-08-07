package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.PlaceProperty;
import ezvcard.util.GeoUri;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l0<T extends PlaceProperty> extends g1<T> {
    public l0(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        T t11 = (T) j();
        String strF = gq.e.f(str);
        if (vCardDataType == VCardDataType.f63496g) {
            t11.setText(strF);
            return t11;
        }
        if (vCardDataType != VCardDataType.f63495f) {
            t11.setText(strF);
            return t11;
        }
        try {
            t11.setGeoUri(GeoUri.n(strF));
            return t11;
        } catch (IllegalArgumentException unused) {
            t11.setUri(strF);
            return t11;
        }
    }

    protected abstract T j();
}
