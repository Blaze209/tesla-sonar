package fj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66012a = new C1347a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f66013b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66014c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66015d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66016e = new e();

    /* JADX INFO: renamed from: fj.a$a, reason: collision with other inner class name */
    class C1347a extends a {
        C1347a() {
        }

        @Override // fj.a
        public boolean a() {
            return true;
        }

        @Override // fj.a
        public boolean b() {
            return true;
        }

        @Override // fj.a
        public boolean c(dj.a aVar) {
            return aVar == dj.a.REMOTE;
        }

        @Override // fj.a
        public boolean d(boolean z11, dj.a aVar, dj.c cVar) {
            return (aVar == dj.a.RESOURCE_DISK_CACHE || aVar == dj.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends a {
        b() {
        }

        @Override // fj.a
        public boolean a() {
            return false;
        }

        @Override // fj.a
        public boolean b() {
            return false;
        }

        @Override // fj.a
        public boolean c(dj.a aVar) {
            return false;
        }

        @Override // fj.a
        public boolean d(boolean z11, dj.a aVar, dj.c cVar) {
            return false;
        }
    }

    class c extends a {
        c() {
        }

        @Override // fj.a
        public boolean a() {
            return true;
        }

        @Override // fj.a
        public boolean b() {
            return false;
        }

        @Override // fj.a
        public boolean c(dj.a aVar) {
            return (aVar == dj.a.DATA_DISK_CACHE || aVar == dj.a.MEMORY_CACHE) ? false : true;
        }

        @Override // fj.a
        public boolean d(boolean z11, dj.a aVar, dj.c cVar) {
            return false;
        }
    }

    class d extends a {
        d() {
        }

        @Override // fj.a
        public boolean a() {
            return false;
        }

        @Override // fj.a
        public boolean b() {
            return true;
        }

        @Override // fj.a
        public boolean c(dj.a aVar) {
            return false;
        }

        @Override // fj.a
        public boolean d(boolean z11, dj.a aVar, dj.c cVar) {
            return (aVar == dj.a.RESOURCE_DISK_CACHE || aVar == dj.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends a {
        e() {
        }

        @Override // fj.a
        public boolean a() {
            return true;
        }

        @Override // fj.a
        public boolean b() {
            return true;
        }

        @Override // fj.a
        public boolean c(dj.a aVar) {
            return aVar == dj.a.REMOTE;
        }

        @Override // fj.a
        public boolean d(boolean z11, dj.a aVar, dj.c cVar) {
            return ((z11 && aVar == dj.a.DATA_DISK_CACHE) || aVar == dj.a.LOCAL) && cVar == dj.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(dj.a aVar);

    public abstract boolean d(boolean z11, dj.a aVar, dj.c cVar);
}
