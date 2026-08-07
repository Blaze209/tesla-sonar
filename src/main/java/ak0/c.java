package ak0;

import ezvcard.property.Anniversary;
import ezvcard.util.PartialDate;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class c extends l<Anniversary> {
    public c() {
        super(Anniversary.class, "ANNIVERSARY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Anniversary j(PartialDate partialDate) {
        return new Anniversary(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Anniversary k(String str) {
        return new Anniversary(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Anniversary l(Date date, boolean z11) {
        return new Anniversary(date, z11);
    }
}
