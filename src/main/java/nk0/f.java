package nk0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.t;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes8.dex */
final class f<R> implements retrofit2.e<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f95100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f95101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f95102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f95103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f95104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f95105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f95106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f95107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f95108i;

    f(Type type, t tVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f95100a = type;
        this.f95101b = tVar;
        this.f95102c = z11;
        this.f95103d = z12;
        this.f95104e = z13;
        this.f95105f = z14;
        this.f95106g = z15;
        this.f95107h = z16;
        this.f95108i = z17;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // retrofit2.e
    public Object adapt(retrofit2.d<R> dVar) {
        o aVar;
        t tVar;
        o bVar = this.f95102c ? new b(dVar) : new c(dVar);
        if (!this.f95103d) {
            if (this.f95104e) {
                aVar = new a(bVar);
            }
            tVar = this.f95101b;
            if (tVar != null) {
                bVar = bVar.R(tVar);
            }
            if (this.f95105f) {
                return bVar.W(io.reactivex.rxjava3.core.a.LATEST);
            }
            if (this.f95106g) {
                return bVar.K();
            }
            if (this.f95107h) {
                return bVar.J();
            }
            return this.f95108i ? bVar.z() : tm0.a.n(bVar);
        }
        aVar = new e(bVar);
        bVar = aVar;
        tVar = this.f95101b;
        if (tVar != null) {
            bVar = bVar.R(tVar);
        }
        if (this.f95105f) {
            return bVar.W(io.reactivex.rxjava3.core.a.LATEST);
        }
        if (this.f95106g) {
            return bVar.K();
        }
        if (this.f95107h) {
            return bVar.J();
        }
        if (this.f95108i) {
        }
    }

    @Override // retrofit2.e
    public Type responseType() {
        return this.f95100a;
    }
}
