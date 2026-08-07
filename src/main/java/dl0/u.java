package dl0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Ldl0/t;", "Ldl0/s;", "a", "(Ldl0/t;)Ldl0/s;", "platform", "", "b", "(Ldl0/t;)Z", "isDevelopmentMode", "c", "isNewMemoryModel", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {
    public static final s a(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        return s.Jvm;
    }

    public static final boolean b(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }

    public static final boolean c(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        return true;
    }
}
