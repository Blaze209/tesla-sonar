package ak0;

import ezvcard.parameter.ImageType;
import ezvcard.property.Logo;

/* JADX INFO: loaded from: classes8.dex */
public class d0 extends v<Logo> {
    public d0() {
        super(Logo.class, "LOGO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Logo l(String str, ImageType imageType) {
        return new Logo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Logo m(byte[] bArr, ImageType imageType) {
        return new Logo(bArr, imageType);
    }
}
