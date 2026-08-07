package com.plaid.internal;

import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.c1[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.c1[]) from 0x0024: INVOKE (r0v1 com.plaid.internal.c1[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:37)
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
/* JADX INFO: renamed from: com.plaid.internal.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC4360c1 {
    ENABLED,
    DISABLED,
    BACKEND_DETERMINES;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46897b;

    /* JADX INFO: renamed from: com.plaid.internal.c1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46898a;

        static {
            int[] iArr = new int[EnumC4360c1.values().length];
            try {
                iArr[EnumC4360c1.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4360c1.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4360c1.BACKEND_DETERMINES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46898a = iArr;
        }
    }

    static {
        f46897b = on0.a.a(enumC4360c1Arr);
    }

    public EnumC4360c1() {
        super(str, i);
    }

    public static EnumEntries<EnumC4360c1> getEntries() {
        return f46897b;
    }

    public static EnumC4360c1 valueOf(String str) {
        return (EnumC4360c1) Enum.valueOf(EnumC4360c1.class, str);
    }

    public static EnumC4360c1[] values() {
        return (EnumC4360c1[]) f46896a.clone();
    }

    public final boolean isSet() {
        return this != BACKEND_DETERMINES;
    }

    public final boolean toBoolean() {
        int i11 = a.f46898a[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Cannot convert BACKEND_DETERMINES to boolean");
    }
}
