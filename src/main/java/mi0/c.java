package mi0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmi0/b;", "Lmi0/g;", "a", "(Lmi0/b;)Lmi0/g;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final UiComponentScreen a(b bVar) {
        s.k(bVar, "<this>");
        return new UiComponentScreen(bVar.getComponents(), bVar.t0(), bVar.getStyles());
    }
}
