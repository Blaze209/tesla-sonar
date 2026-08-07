package wo0;

import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwo0/b;", "from", "Lkotlin/Function1;", "Lwo0/d;", "Ljn0/h0;", "builderAction", "a", "(Lwo0/b;Lwn0/l;)Lwo0/b;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u {
    public static final b a(b from, wn0.l<? super d, h0> builderAction) {
        p013kotlin.jvm.internal.s.k(from, "from");
        p013kotlin.jvm.internal.s.k(builderAction, "builderAction");
        d dVar = new d(from);
        builderAction.invoke(dVar);
        return new t(dVar.a(), dVar.getSerializersModule());
    }

    public static /* synthetic */ b b(b bVar, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = b.INSTANCE;
        }
        return a(bVar, lVar);
    }
}
