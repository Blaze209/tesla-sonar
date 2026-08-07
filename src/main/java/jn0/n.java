package jn0;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "b", "(Lwn0/a;)Lkotlin/Lazy;", "Ljn0/p;", "mode", "a", "(Ljn0/p;Lwn0/a;)Lkotlin/Lazy;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/LazyKt")
public class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84060a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84060a = iArr;
        }
    }

    public static <T> Lazy<T> a(p mode, wn0.a<? extends T> initializer) {
        p013kotlin.jvm.internal.s.k(mode, "mode");
        p013kotlin.jvm.internal.s.k(initializer, "initializer");
        int i11 = a.f84060a[mode.ordinal()];
        int i12 = 2;
        if (i11 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new v(initializer, defaultConstructorMarker, i12, defaultConstructorMarker);
        }
        if (i11 == 2) {
            return new u(initializer);
        }
        if (i11 == 3) {
            return new i0(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static <T> Lazy<T> b(wn0.a<? extends T> initializer) {
        p013kotlin.jvm.internal.s.k(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new v(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
