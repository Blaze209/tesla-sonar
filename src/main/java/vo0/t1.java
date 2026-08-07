package vo0;

import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"", "serialName", "Lto0/e;", "kind", "Lto0/f;", "a", "(Ljava/lang/String;Lto0/e;)Lto0/f;", "Ljn0/h0;", "c", "(Ljava/lang/String;)V", "", "T", "Lco0/d;", "Lro0/d;", "b", "(Lco0/d;)Lro0/d;", "", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<co0.d<?>, ro0.d<?>> f119696a = f1.i();

    public static final to0.f a(String serialName, to0.e kind) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(kind, "kind");
        c(serialName);
        return new PrimitiveDescriptor(serialName, kind);
    }

    public static final <T> ro0.d<T> b(co0.d<T> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return (ro0.d) f119696a.get(dVar);
    }

    private static final void c(String str) {
        for (ro0.d<?> dVar : f119696a.values()) {
            if (p013kotlin.jvm.internal.s.f(str, dVar.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(p013kotlin.text.t.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + p013kotlin.jvm.internal.o0.b(dVar.getClass()).l() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
