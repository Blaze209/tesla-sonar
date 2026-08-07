package v7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f118122a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f118123b;

    public synchronized void a(Map<String, String> map) {
        this.f118123b = null;
        this.f118122a.clear();
        this.f118122a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        try {
            if (this.f118123b == null) {
                this.f118123b = Collections.unmodifiableMap(new HashMap(this.f118122a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f118123b;
    }
}
