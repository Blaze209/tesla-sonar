package com.plaid.internal;

import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.V3[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.V3[]) from 0x0042: INVOKE (r0v1 com.plaid.internal.V3[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:67)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class V3 {
    ASSERT,
    DEBUG,
    ERROR,
    INFO,
    VERBOSE,
    WARN;

    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46773b;

    public static final class a {

        /* JADX INFO: renamed from: com.plaid.internal.V3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0719a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46774a;

            static {
                int[] iArr = new int[V3.values().length];
                try {
                    iArr[V3.ASSERT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[V3.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[V3.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[V3.INFO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[V3.VERBOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[V3.WARN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f46774a = iArr;
            }
        }

        public static int a(V3 logLevel) {
            p013kotlin.jvm.internal.s.k(logLevel, "logLevel");
            switch (C0719a.f46774a[logLevel.ordinal()]) {
                case 1:
                    return 7;
                case 2:
                    return 3;
                case 3:
                    return 6;
                case 4:
                    return 4;
                case 5:
                    return 2;
                case 6:
                    return 5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        f46773b = on0.a.a(new V3[]{r0, r1, r2, r3, r4, r5});
    }

    public V3() {
        super(str, i);
    }

    public static EnumEntries<V3> getEntries() {
        return f46773b;
    }

    public static V3 valueOf(String str) {
        return (V3) Enum.valueOf(V3.class, str);
    }

    public static V3[] values() {
        return (V3[]) f46772a.clone();
    }
}
