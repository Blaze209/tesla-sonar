package ak0;

import ezvcard.property.Birthday;
import ezvcard.util.PartialDate;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class e extends l<Birthday> {
    public e() {
        super(Birthday.class, "BDAY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Birthday j(PartialDate partialDate) {
        return new Birthday(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Birthday k(String str) {
        return new Birthday(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Birthday l(Date date, boolean z11) {
        return new Birthday(date, z11);
    }
}
