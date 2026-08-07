package ak0;

import ezvcard.VCardDataType;
import ezvcard.property.Language;

/* JADX INFO: loaded from: classes8.dex */
public class b0 extends y0<Language> {
    public b0() {
        super(Language.class, "LANG", VCardDataType.f63506q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Language i(String str) {
        return new Language(str);
    }
}
