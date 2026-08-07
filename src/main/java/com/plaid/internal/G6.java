package com.plaid.internal;

import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.G6[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.G6[]) from 0x0024: INVOKE (r0v1 com.plaid.internal.G6[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:37)
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
public final class G6 {
    NONE,
    ERRORS_ONLY,
    ALL;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46329b;

    static {
        f46329b = on0.a.a(g6Arr);
    }

    public G6() {
        super(str, i);
    }

    public static EnumEntries<G6> getEntries() {
        return f46329b;
    }

    public static G6 valueOf(String str) {
        return (G6) Enum.valueOf(G6.class, str);
    }

    public static G6[] values() {
        return (G6[]) f46328a.clone();
    }
}
