package to0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import vo0.t1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "serialName", "", "Lto0/f;", "typeParameters", "Lkotlin/Function1;", "Lto0/a;", "Ljn0/h0;", "builderAction", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;[Lto0/f;Lwn0/l;)Lto0/f;", "Lto0/e;", "kind", "c", "(Ljava/lang/String;Lto0/e;)Lto0/f;", "Lto0/n;", "builder", "g", "(Ljava/lang/String;Lto0/n;[Lto0/f;Lwn0/l;)Lto0/f;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {
    public static final f c(String serialName, e kind) {
        s.k(serialName, "serialName");
        s.k(kind, "kind");
        if (t.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return t1.a(serialName, kind);
    }

    public static final f d(String serialName, f[] typeParameters, wn0.l<? super a, h0> builderAction) {
        s.k(serialName, "serialName");
        s.k(typeParameters, "typeParameters");
        s.k(builderAction, "builderAction");
        if (t.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new i(serialName, o.a.f114906a, aVar.f().size(), p013kotlin.collections.n.w1(typeParameters), aVar);
    }

    public static /* synthetic */ f e(String str, f[] fVarArr, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new wn0.l() { // from class: to0.k
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return m.f((a) obj2);
                }
            };
        }
        return d(str, fVarArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(a aVar) {
        s.k(aVar, "<this>");
        return h0.f84049a;
    }

    public static final f g(String serialName, n kind, f[] typeParameters, wn0.l<? super a, h0> builder) {
        s.k(serialName, "serialName");
        s.k(kind, "kind");
        s.k(typeParameters, "typeParameters");
        s.k(builder, "builder");
        if (t.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (s.f(kind, o.a.f114906a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new i(serialName, kind, aVar.f().size(), p013kotlin.collections.n.w1(typeParameters), aVar);
    }

    public static /* synthetic */ f h(String str, n nVar, f[] fVarArr, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar = new wn0.l() { // from class: to0.l
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return m.i((a) obj2);
                }
            };
        }
        return g(str, nVar, fVarArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(a aVar) {
        s.k(aVar, "<this>");
        return h0.f84049a;
    }
}
