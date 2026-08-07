package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t0<T extends VCardProperty> extends g1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final VCardDataType f1748d;

    public t0(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str);
        this.f1748d = vCardDataType;
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return this.f1748d;
    }

    @Override // ak0.g1
    protected T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return (T) i(gq.e.f(str));
    }

    protected abstract T i(String str);
}
