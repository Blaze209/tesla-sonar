package yu;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
class y<T> implements yv.b<T>, yv.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final yv.a.InterfaceC2735a<Object> f125883c = new yv.a.InterfaceC2735a() { // from class: yu.v
        @Override // yv.a.InterfaceC2735a
        public final void a(yv.b bVar) {
            y.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final yv.b<Object> f125884d = new yv.b() { // from class: yu.w
        @Override // yv.b
        public final Object get() {
            return y.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yv.a.InterfaceC2735a<T> f125885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile yv.b<T> f125886b;

    private y(yv.a.InterfaceC2735a<T> interfaceC2735a, yv.b<T> bVar) {
        this.f125885a = interfaceC2735a;
        this.f125886b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(yv.a.InterfaceC2735a interfaceC2735a, yv.a.InterfaceC2735a interfaceC2735a2, yv.b bVar) {
        interfaceC2735a.a(bVar);
        interfaceC2735a2.a(bVar);
    }

    public static /* synthetic */ void d(yv.b bVar) {
    }

    static <T> y<T> e() {
        return new y<>(f125883c, f125884d);
    }

    static <T> y<T> f(yv.b<T> bVar) {
        return new y<>(null, bVar);
    }

    @Override // yv.a
    public void a(@NonNull final yv.a.InterfaceC2735a<T> interfaceC2735a) {
        yv.b<T> bVar;
        yv.b<T> bVar2;
        yv.b<T> bVar3 = this.f125886b;
        yv.b<Object> bVar4 = f125884d;
        if (bVar3 != bVar4) {
            interfaceC2735a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f125886b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final yv.a.InterfaceC2735a<T> interfaceC2735a2 = this.f125885a;
                this.f125885a = new yv.a.InterfaceC2735a() { // from class: yu.x
                    @Override // yv.a.InterfaceC2735a
                    public final void a(yv.b bVar5) {
                        y.c(interfaceC2735a2, interfaceC2735a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC2735a.a(bVar);
        }
    }

    void g(yv.b<T> bVar) {
        yv.a.InterfaceC2735a<T> interfaceC2735a;
        if (this.f125886b != f125884d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC2735a = this.f125885a;
            this.f125885a = null;
            this.f125886b = bVar;
        }
        interfaceC2735a.a(bVar);
    }

    @Override // yv.b
    public T get() {
        return this.f125886b.get();
    }
}
