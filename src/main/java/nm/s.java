package nm;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    class a implements z<jk.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f95185a;

        a(t tVar) {
            this.f95185a = tVar;
        }

        @Override // nm.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(jk.d dVar) {
            this.f95185a.n(dVar);
        }

        @Override // nm.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(jk.d dVar) {
            this.f95185a.l(dVar);
        }

        @Override // nm.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(jk.d dVar) {
            this.f95185a.b(dVar);
        }
    }

    public static u<jk.d, PooledByteBuffer> a(x<jk.d, PooledByteBuffer> xVar, t tVar) {
        tVar.j(xVar);
        return new u<>(xVar, new a(tVar));
    }
}
