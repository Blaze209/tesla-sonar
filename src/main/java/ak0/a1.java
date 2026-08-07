package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Telephone;
import ezvcard.util.TelUri;

/* JADX INFO: loaded from: classes8.dex */
public class a1 extends g1<Telephone> {
    public a1() {
        super(Telephone.class, "TEL");
    }

    private Telephone j(String str, VCardDataType vCardDataType, yj0.a aVar) {
        try {
            return new Telephone(TelUri.e(str));
        } catch (IllegalArgumentException unused) {
            if (vCardDataType == VCardDataType.f63495f) {
                aVar.a(18, new Object[0]);
            }
            return new Telephone(str);
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Telephone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return j(gq.e.f(str), vCardDataType, aVar);
    }
}
