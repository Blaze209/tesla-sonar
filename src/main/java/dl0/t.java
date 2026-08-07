package dl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Ldl0/t;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "IS_BROWSER", "c", "getIS_NODE", "IS_NODE", DateTokenConverter.CONVERTER_KEY, "getIS_JVM", "IS_JVM", "e", "getIS_NATIVE", "IS_NATIVE", "f", "IS_DEVELOPMENT_MODE", "g", "getIS_NEW_MM_ENABLED", "IS_NEW_MM_ENABLED", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f60776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_BROWSER;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_NODE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_JVM;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_NATIVE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_DEVELOPMENT_MODE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final boolean IS_NEW_MM_ENABLED;

    static {
        t tVar = new t();
        f60776a = tVar;
        IS_BROWSER = u.a(tVar) == s.Browser;
        IS_NODE = u.a(tVar) == s.Node;
        IS_JVM = u.a(tVar) == s.Jvm;
        IS_NATIVE = u.a(tVar) == s.Native;
        IS_DEVELOPMENT_MODE = u.b(tVar);
        IS_NEW_MM_ENABLED = u.c(tVar);
    }

    private t() {
    }

    public final boolean a() {
        return IS_BROWSER;
    }

    public final boolean b() {
        return IS_DEVELOPMENT_MODE;
    }
}
