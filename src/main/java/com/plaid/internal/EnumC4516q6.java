package com.plaid.internal;

import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.q6[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.q6[]) from 0x0036: INVOKE (r0v1 com.plaid.internal.q6[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:55)
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
/* JADX INFO: renamed from: com.plaid.internal.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC4516q6 {
    ENQUEUE("QUEUE_BEHAVIOR_ENQUEUE"),
    ENQUEUE_AND_FLUSH("QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH"),
    NO_ENQUEUE("QUEUE_BEHAVIOR_NO_ENQUEUE"),
    UNKNOWN("QUEUE_BEHAVIOR_UNKNOWN");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f48071c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48072a;

    static {
        f48071c = on0.a.a(enumC4516q6Arr);
    }

    public EnumC4516q6(String str) {
        super(str, i);
        this.f48072a = str;
    }

    public static EnumEntries<EnumC4516q6> getEntries() {
        return f48071c;
    }

    public static EnumC4516q6 valueOf(String str) {
        return (EnumC4516q6) Enum.valueOf(EnumC4516q6.class, str);
    }

    public static EnumC4516q6[] values() {
        return (EnumC4516q6[]) f48070b.clone();
    }

    public final String getProtoString() {
        return this.f48072a;
    }
}
