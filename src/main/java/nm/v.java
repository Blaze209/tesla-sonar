package nm;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    class a implements z<jk.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f95188a;

        a(t tVar) {
            this.f95188a = tVar;
        }

        @Override // nm.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(jk.d dVar) {
            this.f95188a.a(dVar);
        }

        @Override // nm.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(jk.d dVar) {
            this.f95188a.h(dVar);
        }

        @Override // nm.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(jk.d dVar) {
            this.f95188a.d(dVar);
        }
    }

    public static u<jk.d, um.e> a(x<jk.d, um.e> xVar, t tVar) {
        tVar.m(xVar);
        return new u<>(xVar, new a(tVar));
    }
}
