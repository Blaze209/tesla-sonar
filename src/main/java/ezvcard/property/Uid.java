package ezvcard.property;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class Uid extends UriProperty {
    public Uid(String str) {
        super(str);
    }

    public static Uid random() {
        return new Uid("urn:uuid:" + UUID.randomUUID().toString());
    }

    public Uid(Uid uid) {
        super(uid);
    }

    @Override // ezvcard.property.VCardProperty
    public Uid copy() {
        return new Uid(this);
    }
}
