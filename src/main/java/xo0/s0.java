package xo0;

import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\n"}, d2 = {"", "Lto0/f;", "a", "Ljava/util/Set;", "unsignedNumberDescriptors", "", "b", "(Lto0/f;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<to0.f> f123905a = d1.i(so0.a.s(jn0.a0.INSTANCE).getDescriptor(), so0.a.t(jn0.c0.INSTANCE).getDescriptor(), so0.a.r(jn0.y.INSTANCE).getDescriptor(), so0.a.u(jn0.f0.INSTANCE).getDescriptor());

    public static final boolean a(to0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        return fVar.getIsInline() && p013kotlin.jvm.internal.s.f(fVar, wo0.j.q());
    }

    public static final boolean b(to0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        return fVar.getIsInline() && f123905a.contains(fVar);
    }
}
