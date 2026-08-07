package ak0;

import ezvcard.property.Uid;

/* JADX INFO: loaded from: classes8.dex */
public class d1 extends e1<Uid> {
    public d1() {
        super(Uid.class, "UID");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Uid i(String str) {
        return new Uid(str);
    }
}
