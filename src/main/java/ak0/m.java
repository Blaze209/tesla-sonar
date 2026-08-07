package ak0;

import ezvcard.property.Deathdate;
import ezvcard.util.PartialDate;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class m extends l<Deathdate> {
    public m() {
        super(Deathdate.class, "DEATHDATE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Deathdate j(PartialDate partialDate) {
        return new Deathdate(partialDate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Deathdate k(String str) {
        return new Deathdate(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.l
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Deathdate l(Date date, boolean z11) {
        return new Deathdate(date, z11);
    }
}
