package ho0;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u000f\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0000\u0010\u000f\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001a\u0010\u0019\u001a7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001b\u0010\u0019\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u001c*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001f\u0010\u0019\u001a?\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\"\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000 j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`!¢\u0006\u0004\b#\u0010$\u001a7\u0010'\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0015*\n\u0012\u0006\b\u0000\u0012\u00028\u00000%*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u0001¢\u0006\u0004\b'\u0010(\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b*\u0010+\u001a#\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b-\u0010+\u001a#\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b/\u00100\u001aC\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\n¢\u0006\u0004\b3\u0010\u0019\u001a=\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b4\u0010\u0019\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u00101*\u00020\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n¢\u0006\u0004\b5\u0010\u0019\u001a\u001d\u00106\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b6\u00107\u001a\u001d\u00108\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b8\u00109\u001a.\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b:\u0010;\u001a4\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\u0002¢\u0006\u0004\b>\u0010?\u001a4\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b@\u0010A\u001a}\u0010K\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0004*\u00060Bj\u0002`C*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010D\u001a\u00028\u00012\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020E2\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010J\u001a\u00020E2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020E\u0018\u00010\n¢\u0006\u0004\bK\u0010L\u001ag\u0010N\u001a\u00020M\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020E2\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010J\u001a\u00020E2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020E\u0018\u00010\n¢\u0006\u0004\bN\u0010O\u001a#\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000<\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bP\u0010Q¨\u0006R"}, d2 = {"T", "Lho0/i;", "element", "", "A", "(Lho0/i;Ljava/lang/Object;)Z", "", "index", "E", "(Lho0/i;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "G", "(Lho0/i;ILwn0/l;)Ljava/lang/Object;", "L", "(Lho0/i;)Ljava/lang/Object;", Gender.MALE, Gender.OTHER, "(Lho0/i;Ljava/lang/Object;)I", "S", "n", "C", "(Lho0/i;I)Lho0/i;", "predicate", "D", "(Lho0/i;Lwn0/l;)Lho0/i;", "H", "I", "", "J", "(Lho0/i;)Lho0/i;", "a0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Z", "(Lho0/i;Ljava/util/Comparator;)Lho0/i;", "", "destination", "b0", "(Lho0/i;Ljava/util/Collection;)Ljava/util/Collection;", "", "c0", "(Lho0/i;)Ljava/util/List;", "", "d0", "", "e0", "(Lho0/i;)Ljava/util/Set;", "R", "transform", Gender.NONE, Gender.UNKNOWN, "V", "y", "(Lho0/i;)Z", "B", "(Lho0/i;)I", "Y", "(Lho0/i;Ljava/lang/Object;)Lho0/i;", "", "elements", "X", "(Lho0/i;Ljava/lang/Iterable;)Lho0/i;", "W", "(Lho0/i;Lho0/i;)Lho0/i;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "P", "(Lho0/i;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "", "Q", "(Lho0/i;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "z", "(Lho0/i;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class x extends u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ho0/x$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f73249a;

        public a(i iVar) {
            this.f73249a = iVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f73249a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b<R> extends p013kotlin.jvm.internal.p implements wn0.l<i<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73250a = new b();

        b() {
            super(1, i.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(i<? extends R> p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return p11.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ho0/x$c", "Lho0/i;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<T> f73251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super T> f73252b;

        /* JADX WARN: Multi-variable type inference failed */
        c(i<? extends T> iVar, Comparator<? super T> comparator) {
            this.f73251a = iVar;
            this.f73252b = comparator;
        }

        @Override // ho0.i
        public Iterator<T> iterator() {
            List listD0 = x.d0(this.f73251a);
            p013kotlin.collections.v.C(listD0, this.f73252b);
            return listD0.iterator();
        }
    }

    public static <T> boolean A(i<? extends T> iVar, T t11) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return O(iVar, t11) >= 0;
    }

    public static <T> int B(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                p013kotlin.collections.v.w();
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> i<T> C(i<? extends T> iVar, int i11) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                return iVar;
            }
            return iVar instanceof ho0.c ? ((ho0.c) iVar).b(i11) : new ho0.b(iVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static <T> i<T> D(i<? extends T> iVar, wn0.l<? super T, Boolean> predicate) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(predicate, "predicate");
        return new d(iVar, predicate);
    }

    public static <T> T E(i<? extends T> iVar, final int i11) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return (T) G(iVar, i11, new wn0.l() { // from class: ho0.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.F(i11, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object F(int i11, int i12) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i11 + CoreConstants.DOT);
    }

    public static final <T> T G(i<? extends T> iVar, int i11, wn0.l<? super Integer, ? extends T> defaultValue) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(defaultValue, "defaultValue");
        if (i11 < 0) {
            return defaultValue.invoke(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (T t11 : iVar) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return t11;
            }
            i12 = i13;
        }
        return defaultValue.invoke(Integer.valueOf(i11));
    }

    public static <T> i<T> H(i<? extends T> iVar, wn0.l<? super T, Boolean> predicate) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(predicate, "predicate");
        return new f(iVar, true, predicate);
    }

    public static <T> i<T> I(i<? extends T> iVar, wn0.l<? super T, Boolean> predicate) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(predicate, "predicate");
        return new f(iVar, false, predicate);
    }

    public static <T> i<T> J(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        i<T> iVarI = I(iVar, new wn0.l() { // from class: ho0.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.K(obj));
            }
        });
        p013kotlin.jvm.internal.s.i(iVarI, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(Object obj) {
        return obj == null;
    }

    public static <T> T L(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T> T M(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T, R> i<R> N(i<? extends T> iVar, wn0.l<? super T, ? extends i<? extends R>> transform) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new g(iVar, transform, b.f73250a);
    }

    public static <T> int O(i<? extends T> iVar, T t11) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        int i11 = 0;
        for (T t12 : iVar) {
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            if (p013kotlin.jvm.internal.s.f(t11, t12)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A P(i<? extends T> iVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, wn0.l<? super T, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : iVar) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            p013kotlin.text.t.a(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String Q(i<? extends T> iVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, wn0.l<? super T, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) P(iVar, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static /* synthetic */ String R(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, wn0.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        wn0.l lVar2 = lVar;
        return Q(iVar, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static <T> T S(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T T(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T, R> i<R> U(i<? extends T> iVar, wn0.l<? super T, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new z(iVar, transform);
    }

    public static <T, R> i<R> V(i<? extends T> iVar, wn0.l<? super T, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return J(new z(iVar, transform));
    }

    public static <T> i<T> W(i<? extends T> iVar, i<? extends T> elements) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(elements, "elements");
        return t.k(t.v(iVar, elements));
    }

    public static <T> i<T> X(i<? extends T> iVar, Iterable<? extends T> elements) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(elements, "elements");
        return t.k(t.v(iVar, p013kotlin.collections.v.e0(elements)));
    }

    public static <T> i<T> Y(i<? extends T> iVar, T t11) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return t.k(t.v(iVar, t.v(t11)));
    }

    public static <T> i<T> Z(i<? extends T> iVar, Comparator<? super T> comparator) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(comparator, "comparator");
        return new c(iVar, comparator);
    }

    public static <T> i<T> a0(i<? extends T> iVar, wn0.l<? super T, Boolean> predicate) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(predicate, "predicate");
        return new y(iVar, predicate);
    }

    public static <T, C extends Collection<? super T>> C b0(i<? extends T> iVar, C destination) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        Iterator<? extends T> it = iVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> List<T> c0(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return p013kotlin.collections.v.m();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return p013kotlin.collections.v.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> d0(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return (List) b0(iVar, new ArrayList());
    }

    public static <T> Set<T> e0(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return d1.d();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return d1.c(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> boolean y(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return iVar.iterator().hasNext();
    }

    public static <T> Iterable<T> z(i<? extends T> iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        return new a(iVar);
    }
}
