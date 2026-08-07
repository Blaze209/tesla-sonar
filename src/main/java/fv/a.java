package fv;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f66607a = new a();

    /* JADX INFO: renamed from: fv.a$a, reason: collision with other inner class name */
    private static final class C1355a implements rv.c<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1355a f66608a = new C1355a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f66609b = rv.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f66610c = rv.b.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f66611d = rv.b.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f66612e = rv.b.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f66613f = rv.b.d("templateVersion");

        private C1355a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(j jVar, rv.d dVar) {
            dVar.add(f66609b, jVar.e());
            dVar.add(f66610c, jVar.c());
            dVar.add(f66611d, jVar.d());
            dVar.add(f66612e, jVar.g());
            dVar.add(f66613f, jVar.f());
        }
    }

    private a() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        C1355a c1355a = C1355a.f66608a;
        bVar.registerEncoder(j.class, c1355a);
        bVar.registerEncoder(b.class, c1355a);
    }
}
