package ie0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0002\b\u00030\u00020\u0005*\u00020\u00002 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0002\b\u00030\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0000\u0012\u0002\b\u00030\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "Lkotlin/Function1;", "Lco0/o;", "", "filter", "Lho0/i;", "h", "(Ljava/lang/Object;Lwn0/l;)Lho0/i;", "f", "(Ljava/lang/Object;)Lho0/i;", DateTokenConverter.CONVERTER_KEY, "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i0 {
    public static final ho0.i<co0.o<? extends Object, ?>> d(final Object obj) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        return h(obj, new wn0.l() { // from class: ie0.f0
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(i0.e(obj, (co0.o) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj, co0.o it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.call(obj) != 0;
    }

    public static final ho0.i<co0.o<? extends Object, ?>> f(final Object obj) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        return h(obj, new wn0.l() { // from class: ie0.g0
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(i0.g(obj, (co0.o) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Object obj, co0.o it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.call(obj) == 0;
    }

    public static final ho0.i<co0.o<? extends Object, ?>> h(Object obj, final wn0.l<? super co0.o<? extends Object, ?>, Boolean> filter) {
        p013kotlin.jvm.internal.s.k(obj, "<this>");
        p013kotlin.jvm.internal.s.k(filter, "filter");
        return ho0.l.H(p013kotlin.collections.v.e0(do0.c.d(p013kotlin.jvm.internal.o0.b(obj.getClass()))), new wn0.l() { // from class: ie0.h0
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(i0.i(filter, (co0.o) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(wn0.l lVar, co0.o property) {
        p013kotlin.jvm.internal.s.k(property, "property");
        eo0.a.b(property, true);
        return property.getReturnType().getIsMarkedNullable() && ((Boolean) lVar.invoke(property)).booleanValue();
    }
}
