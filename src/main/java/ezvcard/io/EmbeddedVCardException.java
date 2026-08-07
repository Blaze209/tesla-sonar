package ezvcard.io;

import ezvcard.VCard;
import ezvcard.property.VCardProperty;

/* JADX INFO: loaded from: classes8.dex */
public class EmbeddedVCardException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VCard f63510a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f63511b;

    public interface a {
        VCardProperty a();

        void b(VCard vCard);
    }

    public EmbeddedVCardException(a aVar) {
        this.f63511b = aVar;
    }

    public VCardProperty a() {
        a aVar = this.f63511b;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    public void b(VCard vCard) {
        a aVar = this.f63511b;
        if (aVar == null) {
            return;
        }
        aVar.b(vCard);
    }
}
