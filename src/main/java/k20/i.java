package k20;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk20/n;", "Lg20/e;", "a", "(Lk20/n;)Lg20/e;", "snowplow-android-tracker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final g20.e a(n nVar) {
        s.k(nVar, "<this>");
        j jVar = nVar instanceof j ? (j) nVar : null;
        k kVarB = jVar != null ? jVar.b() : null;
        g gVar = nVar instanceof g ? (g) nVar : null;
        if (gVar != null) {
            gVar.a();
        }
        l lVar = nVar instanceof l ? (l) nVar : null;
        if (lVar != null) {
            lVar.a();
        }
        return new g20.e(nVar.getIdentifier(), kVarB, null, null);
    }
}
