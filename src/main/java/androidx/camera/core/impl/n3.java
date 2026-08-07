package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f3246b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final x2 f3247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final o3<?> f3248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c3 f3249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<p3.b> f3250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3251e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3252f = false;

        b(@NonNull x2 x2Var, @NonNull o3<?> o3Var, c3 c3Var, List<p3.b> list) {
            this.f3247a = x2Var;
            this.f3248b = o3Var;
            this.f3249c = c3Var;
            this.f3250d = list;
        }

        boolean a() {
            return this.f3252f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f3251e;
        }

        public List<p3.b> c() {
            return this.f3250d;
        }

        @NonNull
        public x2 d() {
            return this.f3247a;
        }

        public c3 e() {
            return this.f3249c;
        }

        @NonNull
        public o3<?> f() {
            return this.f3248b;
        }

        void g(boolean z11) {
            this.f3252f = z11;
        }

        void h(boolean z11) {
            this.f3251e = z11;
        }

        @NonNull
        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f3247a + ", mUseCaseConfig=" + this.f3248b + ", mStreamSpec=" + this.f3249c + ", mCaptureTypes=" + this.f3250d + ", mAttached=" + this.f3251e + ", mActive=" + this.f3252f + CoreConstants.CURLY_RIGHT;
        }
    }

    public n3(@NonNull String str) {
        this.f3245a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    private b k(@NonNull String str, @NonNull x2 x2Var, @NonNull o3<?> o3Var, c3 c3Var, List<p3.b> list) {
        b bVar = this.f3246b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(x2Var, o3Var, c3Var, list);
        this.f3246b.put(str, bVar2);
        return bVar2;
    }

    private Collection<x2> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f3246b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    private Collection<o3<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f3246b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    private Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f3246b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    @NonNull
    public x2.h e() {
        x2.h hVar = new x2.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f3246b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        c0.y0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f3245a);
        return hVar;
    }

    @NonNull
    public Collection<x2> f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.l3
            @Override // androidx.camera.core.impl.n3.a
            public final boolean a(n3.b bVar) {
                return n3.a(bVar);
            }
        }));
    }

    @NonNull
    public x2.h g() {
        x2.h hVar = new x2.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f3246b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        c0.y0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f3245a);
        return hVar;
    }

    @NonNull
    public Collection<x2> h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.j3
            @Override // androidx.camera.core.impl.n3.a
            public final boolean a(n3.b bVar) {
                return bVar.b();
            }
        }));
    }

    @NonNull
    public Collection<o3<?>> i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: androidx.camera.core.impl.k3
            @Override // androidx.camera.core.impl.n3.a
            public final boolean a(n3.b bVar) {
                return bVar.b();
            }
        }));
    }

    @NonNull
    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: androidx.camera.core.impl.m3
            @Override // androidx.camera.core.impl.n3.a
            public final boolean a(n3.b bVar) {
                return bVar.b();
            }
        }));
    }

    public boolean o(@NonNull String str) {
        if (this.f3246b.containsKey(str)) {
            return this.f3246b.get(str).b();
        }
        return false;
    }

    public void p(@NonNull String str) {
        this.f3246b.remove(str);
    }

    public void q(@NonNull String str, @NonNull x2 x2Var, @NonNull o3<?> o3Var, c3 c3Var, List<p3.b> list) {
        k(str, x2Var, o3Var, c3Var, list).g(true);
    }

    public void r(@NonNull String str, @NonNull x2 x2Var, @NonNull o3<?> o3Var, c3 c3Var, List<p3.b> list) {
        k(str, x2Var, o3Var, c3Var, list).h(true);
        u(str, x2Var, o3Var, c3Var, list);
    }

    public void s(@NonNull String str) {
        if (this.f3246b.containsKey(str)) {
            b bVar = this.f3246b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f3246b.remove(str);
        }
    }

    public void t(@NonNull String str) {
        if (this.f3246b.containsKey(str)) {
            b bVar = this.f3246b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f3246b.remove(str);
        }
    }

    public void u(@NonNull String str, @NonNull x2 x2Var, @NonNull o3<?> o3Var, c3 c3Var, List<p3.b> list) {
        if (this.f3246b.containsKey(str)) {
            b bVar = new b(x2Var, o3Var, c3Var, list);
            b bVar2 = this.f3246b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f3246b.put(str, bVar);
        }
    }
}
