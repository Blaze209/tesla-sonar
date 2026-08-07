package ss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f111755a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f111756b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f111756b == null) {
                this.f111756b = Collections.unmodifiableMap(new HashMap(this.f111755a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f111756b;
    }
}
