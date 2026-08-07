package fn0;

import io.reactivex.BackpressureStrategy;
import io.realm.k0;
import io.realm.n0;
import io.realm.s0;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class a implements fn0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BackpressureStrategy f66068e = BackpressureStrategy.LATEST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f66069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadLocal<d<s0>> f66070b = new C1349a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ThreadLocal<d<k0>> f66071c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ThreadLocal<d<n0>> f66072d = new c();

    /* JADX INFO: renamed from: fn0.a$a, reason: collision with other inner class name */
    class C1349a extends ThreadLocal<d<s0>> {
        C1349a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<s0> initialValue() {
            return new d<>(null);
        }
    }

    class b extends ThreadLocal<d<k0>> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<k0> initialValue() {
            return new d<>(null);
        }
    }

    class c extends ThreadLocal<d<n0>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d<n0> initialValue() {
            return new d<>(null);
        }
    }

    public a(boolean z11) {
        this.f66069a = z11;
    }

    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return 37;
    }

    private static class d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<K, Integer> f66076a;

        private d() {
            this.f66076a = new IdentityHashMap();
        }

        /* synthetic */ d(C1349a c1349a) {
            this();
        }
    }
}
