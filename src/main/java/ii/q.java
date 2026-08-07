package ii;

import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "D", "Lii/p;", "Lii/k;", "customScalarAdapters", "", "withDefaultBooleanValues", "Lii/p$a;", "b", "(Lii/p;Lii/k;Z)Lii/p$a;", "a", "(Lii/k;)Lii/k;", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class q {
    private static final k a(k kVar) {
        return kVar.f().a(kVar.getAdapterContext().a().c(Boolean.TRUE).a()).c();
    }

    public static final <D> p.a b(p<D> pVar, k customScalarAdapters, boolean z11) {
        p013kotlin.jvm.internal.s.k(pVar, "<this>");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        mi.i iVar = new mi.i();
        iVar.h();
        if (z11) {
            customScalarAdapters = a(customScalarAdapters);
        }
        pVar.a(iVar, customScalarAdapters);
        iVar.j();
        Object objO = iVar.o();
        p013kotlin.jvm.internal.s.i(objO, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new p.a((Map) objO);
    }
}
