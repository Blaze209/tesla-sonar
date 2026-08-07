package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.RawProperty;

/* JADX INFO: loaded from: classes8.dex */
public class o0 extends g1<RawProperty> {
    public o0(String str) {
        super(RawProperty.class, str);
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public RawProperty b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        RawProperty rawProperty = new RawProperty(this.f1738b, str);
        rawProperty.setDataType(vCardDataType);
        return rawProperty;
    }
}
