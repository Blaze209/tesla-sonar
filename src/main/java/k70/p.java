package k70;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements qj0.e<Map<String, String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f85309a;

    public p(l lVar) {
        this.f85309a = lVar;
    }

    public static p a(l lVar) {
        return new p(lVar);
    }

    public static Map<String, String> c(l lVar) {
        return (Map) qj0.h.d(lVar.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<String, String> get() {
        return c(this.f85309a);
    }
}
