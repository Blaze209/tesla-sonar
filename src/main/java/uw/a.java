package uw;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f116744a = new a();

    /* JADX INFO: renamed from: uw.a$a, reason: collision with other inner class name */
    private static final class C2516a implements rv.c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C2516a f116745a = new C2516a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f116746b = rv.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f116747c = rv.b.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f116748d = rv.b.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f116749e = rv.b.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f116750f = rv.b.d("templateVersion");

        private C2516a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(d dVar, rv.d dVar2) {
            dVar2.add(f116746b, dVar.d());
            dVar2.add(f116747c, dVar.f());
            dVar2.add(f116748d, dVar.b());
            dVar2.add(f116749e, dVar.c());
            dVar2.add(f116750f, dVar.e());
        }
    }

    private a() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        C2516a c2516a = C2516a.f116745a;
        bVar.registerEncoder(d.class, c2516a);
        bVar.registerEncoder(b.class, c2516a);
    }
}
