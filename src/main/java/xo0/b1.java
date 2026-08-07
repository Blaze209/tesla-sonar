package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwo0/b;", "Lto0/f;", "desc", "Lxo0/a1;", "b", "(Lwo0/b;Lto0/f;)Lxo0/a1;", "Lyo0/c;", "module", "a", "(Lto0/f;Lyo0/c;)Lto0/f;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b1 {
    public static final to0.f a(to0.f fVar, yo0.c module) {
        to0.f fVarA;
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(module, "module");
        if (!p013kotlin.jvm.internal.s.f(fVar.getKind(), to0.n.a.f114904a)) {
            return fVar.getIsInline() ? a(fVar.d(0), module) : fVar;
        }
        to0.f fVarB = to0.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final a1 b(wo0.b bVar, to0.f desc) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(desc, "desc");
        to0.n kind = desc.getKind();
        if (kind instanceof to0.d) {
            return a1.POLY_OBJ;
        }
        if (p013kotlin.jvm.internal.s.f(kind, to0.o.b.f114907a)) {
            return a1.LIST;
        }
        if (!p013kotlin.jvm.internal.s.f(kind, to0.o.c.f114908a)) {
            return a1.OBJ;
        }
        to0.f fVarA = a(desc.d(0), bVar.getSerializersModule());
        to0.n kind2 = fVarA.getKind();
        if ((kind2 instanceof to0.e) || p013kotlin.jvm.internal.s.f(kind2, to0.n.b.f114905a)) {
            return a1.MAP;
        }
        if (bVar.getConfiguration().getAllowStructuredMapKeys()) {
            return a1.LIST;
        }
        throw z.d(fVarA);
    }
}
