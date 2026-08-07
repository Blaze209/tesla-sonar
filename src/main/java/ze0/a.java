package ze0;

import bf0.e;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Lze0/a;", "", "<init>", "()V", "", "tag", "Lbf0/e;", "a", "(Ljava/lang/String;)Lbf0/e;", "policy", "Ljn0/h0;", "b", "(Ljava/lang/String;Lbf0/e;)V", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "policyCenter", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, e> policyCenter = new ConcurrentHashMap<>();

    public final e a(String tag) {
        s.k(tag, "tag");
        return this.policyCenter.get(tag);
    }

    public final void b(String tag, e policy) {
        s.k(tag, "tag");
        s.k(policy, "policy");
        this.policyCenter.put(tag, policy);
    }

    public final void c() {
        for (e eVar : this.policyCenter.values()) {
            s.j(eVar, "next(...)");
            eVar.f();
        }
    }
}
