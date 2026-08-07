package ho0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\f\u001aE\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\f\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00152\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"T", "", "Lho0/i;", "h", "(Ljava/util/Iterator;)Lho0/i;", "", "elements", "v", "([Ljava/lang/Object;)Lho0/i;", "j", "()Lho0/i;", "k", "(Lho0/i;)Lho0/i;", "", "p", "R", "Lkotlin/Function1;", "iterator", "l", "(Lho0/i;Lwn0/l;)Lho0/i;", IntegerTokenConverter.CONVERTER_KEY, "", "Lkotlin/Function0;", "nextFunction", "r", "(Lwn0/a;)Lho0/i;", "seed", "q", "(Ljava/lang/Object;Lwn0/l;)Lho0/i;", "seedFunction", "s", "(Lwn0/a;Lwn0/l;)Lho0/i;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class t extends n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ho0/t$a", "Lho0/i;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f73247a;

        public a(Iterator it) {
            this.f73247a = it;
        }

        @Override // ho0.i
        public Iterator<T> iterator() {
            return this.f73247a;
        }
    }

    public static <T> i<T> h(Iterator<? extends T> it) {
        p013kotlin.jvm.internal.s.k(it, "<this>");
        return i(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> i<T> i(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return iVar instanceof ho0.a ? iVar : new ho0.a(iVar);
    }

    public static <T> i<T> j() {
        return e.f73220a;
    }

    public static final <T> i<T> k(i<? extends i<? extends T>> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return l(iVar, new wn0.l() { // from class: ho0.q
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t.m((i) obj);
            }
        });
    }

    private static final <T, R> i<R> l(i<? extends T> iVar, wn0.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return iVar instanceof z ? ((z) iVar).d(lVar) : new g(iVar, new wn0.l() { // from class: ho0.s
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t.o(obj);
            }
        }, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator m(i it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator n(Iterable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.iterator();
    }

    public static <T> i<T> p(i<? extends Iterable<? extends T>> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return l(iVar, new wn0.l() { // from class: ho0.r
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t.n((Iterable) obj);
            }
        });
    }

    public static <T> i<T> q(final T t11, wn0.l<? super T, ? extends T> nextFunction) {
        p013kotlin.jvm.internal.s.k(nextFunction, "nextFunction");
        return t11 == null ? e.f73220a : new h(new wn0.a() { // from class: ho0.o
            @Override // wn0.a
            public final Object invoke() {
                return t.u(t11);
            }
        }, nextFunction);
    }

    public static <T> i<T> r(final wn0.a<? extends T> nextFunction) {
        p013kotlin.jvm.internal.s.k(nextFunction, "nextFunction");
        return i(new h(nextFunction, new wn0.l() { // from class: ho0.p
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return t.t(nextFunction, obj);
            }
        }));
    }

    public static <T> i<T> s(wn0.a<? extends T> seedFunction, wn0.l<? super T, ? extends T> nextFunction) {
        p013kotlin.jvm.internal.s.k(seedFunction, "seedFunction");
        p013kotlin.jvm.internal.s.k(nextFunction, "nextFunction");
        return new h(seedFunction, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(wn0.a aVar, Object it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return aVar.invoke();
    }

    public static <T> i<T> v(T... elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        return p013kotlin.collections.n.Z(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u(Object obj) {
        return obj;
    }
}
