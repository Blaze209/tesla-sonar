package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;

/* JADX INFO: loaded from: classes8.dex */
public class s extends g1<Gender> {
    public s() {
        super(Gender.class, "GENDER");
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Gender b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        gq.e.a aVar2 = new gq.e.a(str, 2);
        String strB = aVar2.b();
        if (strB != null) {
            strB = strB.toUpperCase();
        }
        String strB2 = aVar2.b();
        Gender gender = new Gender(strB);
        gender.setText(strB2);
        return gender;
    }
}
