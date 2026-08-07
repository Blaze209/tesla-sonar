package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.TextListProperty;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c0<T extends TextListProperty> extends g1<T> {
    public c0(Class<T> cls, String str) {
        super(cls, str);
    }

    private T k(List<String> list) {
        T t11 = (T) i();
        t11.getValues().addAll(list);
        return t11;
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    protected abstract T i();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return (T) k(gq.e.a(str));
    }
}
