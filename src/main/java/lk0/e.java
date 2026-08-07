package lk0;

import hk0.e0;
import java.lang.ref.ReferenceQueue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class e extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap f90052j = new WeakHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ReferenceQueue f90053k = new ReferenceQueue();

    private static class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f90054a = new a();

        private a() {
        }

        @Override // hk0.e0.a
        public hk0.i a(hk0.j jVar) {
            return new d(jVar, true);
        }
    }

    public e(q qVar) {
        super(qVar);
    }

    public d l() {
        return (d) e0.a(this, f90052j, f90053k, a.f90054a);
    }
}
