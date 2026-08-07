package gk;

import p013kotlin.Lazy;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gk.q1[], still in use, count: 1, list:
  (r0v1 gk.q1[]) from 0x0016: INVOKE (r0v1 gk.q1[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:23)
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
/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class q1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF5,
    /* JADX INFO: Fake field, exist only in values array */
    EF13;

    public static final n1 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f69117a;

    static {
        on0.a.a(q1VarArr);
        Companion = new n1();
        f69117a = jn0.m.a(jn0.p.PUBLICATION, j1.f69075c);
    }

    public q1() {
        super(str, i);
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) f69118b.clone();
    }
}
