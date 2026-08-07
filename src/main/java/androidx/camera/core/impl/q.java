package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<p> f3279a = new ArrayList();

        a(@NonNull List<p> list) {
            for (p pVar : list) {
                if (!(pVar instanceof b)) {
                    this.f3279a.add(pVar);
                }
            }
        }

        @Override // androidx.camera.core.impl.p
        public void a(int i11) {
            Iterator<p> it = this.f3279a.iterator();
            while (it.hasNext()) {
                it.next().a(i11);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull z zVar) {
            Iterator<p> it = this.f3279a.iterator();
            while (it.hasNext()) {
                it.next().b(i11, zVar);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void c(int i11, @NonNull r rVar) {
            Iterator<p> it = this.f3279a.iterator();
            while (it.hasNext()) {
                it.next().c(i11, rVar);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void d(int i11, int i12) {
            Iterator<p> it = this.f3279a.iterator();
            while (it.hasNext()) {
                it.next().d(i11, i12);
            }
        }

        @Override // androidx.camera.core.impl.p
        public void e(int i11) {
            Iterator<p> it = this.f3279a.iterator();
            while (it.hasNext()) {
                it.next().e(i11);
            }
        }

        @NonNull
        public List<p> f() {
            return this.f3279a;
        }
    }

    static final class b extends p {
        b() {
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull z zVar) {
        }

        @Override // androidx.camera.core.impl.p
        public void c(int i11, @NonNull r rVar) {
        }

        @Override // androidx.camera.core.impl.p
        public void e(int i11) {
        }
    }

    @NonNull
    static p a(@NonNull List<p> list) {
        if (list.isEmpty()) {
            return c();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    @NonNull
    public static p b(@NonNull p... pVarArr) {
        return a(Arrays.asList(pVarArr));
    }

    @NonNull
    public static p c() {
        return new b();
    }
}
