package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Related;

/* JADX INFO: loaded from: classes8.dex */
public class p0 extends g1<Related> {
    public p0() {
        super(Related.class, "RELATED");
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63495f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Related b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        String strF = gq.e.f(str);
        Related related = new Related();
        if (vCardDataType == VCardDataType.f63496g) {
            related.setText(strF);
            return related;
        }
        related.setUri(strF);
        return related;
    }
}
