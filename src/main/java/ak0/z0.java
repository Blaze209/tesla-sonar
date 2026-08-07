package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;
import ezvcard.property.StructuredName;

/* JADX INFO: loaded from: classes8.dex */
public class z0 extends g1<StructuredName> {
    public z0() {
        super(StructuredName.class, Gender.NONE);
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public StructuredName b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        StructuredName structuredName = new StructuredName();
        if (aVar.d() != VCardVersion.V2_1) {
            gq.e.b bVar = new gq.e.b(str);
            structuredName.setFamily(bVar.c());
            structuredName.setGiven(bVar.c());
            structuredName.getAdditionalNames().addAll(bVar.b());
            structuredName.getPrefixes().addAll(bVar.b());
            structuredName.getSuffixes().addAll(bVar.b());
            return structuredName;
        }
        gq.e.a aVar2 = new gq.e.a(str);
        structuredName.setFamily(aVar2.b());
        structuredName.setGiven(aVar2.b());
        String strB = aVar2.b();
        if (strB != null) {
            structuredName.getAdditionalNames().add(strB);
        }
        String strB2 = aVar2.b();
        if (strB2 != null) {
            structuredName.getPrefixes().add(strB2);
        }
        String strB3 = aVar2.b();
        if (strB3 != null) {
            structuredName.getSuffixes().add(strB3);
        }
        return structuredName;
    }
}
