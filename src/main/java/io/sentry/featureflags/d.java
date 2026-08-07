package io.sentry.featureflags;

import io.sentry.d1;
import io.sentry.protocol.f;
import io.sentry.protocol.g;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f80581a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f80582b = new io.sentry.util.a();

    private d() {
    }

    public static b a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    public g g() {
        d1 d1VarA = this.f80582b.a();
        try {
            Map<String, Boolean> map = this.f80581a;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f80581a.size());
                for (Map.Entry<String, Boolean> entry : this.f80581a.entrySet()) {
                    arrayList.add(new f(entry.getKey(), entry.getValue().booleanValue()));
                }
                g gVar = new g(arrayList);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return gVar;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            return null;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m478clone() {
        return a();
    }
}
