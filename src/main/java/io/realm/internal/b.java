package io.realm.internal;

import io.realm.n0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends n0>, c> f79066a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, c> f79067b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f79068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OsSchemaInfo f79069d;

    public b(p pVar, OsSchemaInfo osSchemaInfo) {
        this.f79068c = pVar;
        this.f79069d = osSchemaInfo;
    }

    public c a(Class<? extends n0> cls) {
        c cVar = this.f79066a.get(cls);
        if (cVar != null) {
            return cVar;
        }
        c cVarD = this.f79068c.d(cls, this.f79069d);
        this.f79066a.put(cls, cVarD);
        return cVarD;
    }

    public void b() {
        for (Map.Entry<Class<? extends n0>, c> entry : this.f79066a.entrySet()) {
            entry.getValue().c(this.f79068c.d(entry.getKey(), this.f79069d));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnIndices[");
        boolean z11 = false;
        for (Map.Entry<Class<? extends n0>, c> entry : this.f79066a.entrySet()) {
            if (z11) {
                sb2.append(",");
            }
            sb2.append(entry.getKey().getSimpleName());
            sb2.append("->");
            sb2.append(entry.getValue());
            z11 = true;
        }
        sb2.append("]");
        return sb2.toString();
    }
}
