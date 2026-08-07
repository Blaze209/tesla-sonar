package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import c0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e implements g2.a<j0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f3711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.p003lifecycle.i0<PreviewView.f> f3712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PreviewView.f f3713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f3714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.google.common.util.concurrent.s<Void> f3715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3716f = false;

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.n f3718b;

        a(List list, c0.n nVar) {
            this.f3717a = list;
            this.f3718b = nVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            e.this.f3715e = null;
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            e.this.f3715e = null;
            if (this.f3717a.isEmpty()) {
                return;
            }
            Iterator it = this.f3717a.iterator();
            while (it.hasNext()) {
                ((i0) this.f3718b).h((androidx.camera.core.impl.p) it.next());
            }
            this.f3717a.clear();
        }
    }

    class b extends androidx.camera.core.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f3720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.n f3721b;

        b(androidx.concurrent.futures.c.a aVar, c0.n nVar) {
            this.f3720a = aVar;
            this.f3721b = nVar;
        }

        @Override // androidx.camera.core.impl.p
        public void b(int i11, @NonNull androidx.camera.core.impl.z zVar) {
            this.f3720a.c(null);
            ((i0) this.f3721b).h(this);
        }
    }

    e(i0 i0Var, androidx.p003lifecycle.i0<PreviewView.f> i0Var2, m mVar) {
        this.f3711a = i0Var;
        this.f3712b = i0Var2;
        this.f3714d = mVar;
        synchronized (this) {
            this.f3713c = i0Var2.getValue();
        }
    }

    public static /* synthetic */ Object b(e eVar, c0.n nVar, List list, androidx.concurrent.futures.c.a aVar) {
        eVar.getClass();
        b bVar = eVar.new b(aVar, nVar);
        list.add(bVar);
        ((i0) nVar).e(i0.c.b(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(e eVar, Void r11) {
        eVar.getClass();
        eVar.i(PreviewView.f.STREAMING);
        return null;
    }

    private void e() {
        com.google.common.util.concurrent.s<Void> sVar = this.f3715e;
        if (sVar != null) {
            sVar.cancel(false);
            this.f3715e = null;
        }
    }

    private void h(c0.n nVar) {
        i(PreviewView.f.IDLE);
        ArrayList arrayList = new ArrayList();
        j0.d dVarE = j0.d.a(j(nVar, arrayList)).f(new j0.a() { // from class: androidx.camera.view.b
            @Override // j0.a
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return this.f3693a.f3714d.j();
            }
        }, i0.c.b()).e(new r.a() { // from class: androidx.camera.view.c
            @Override // r.a
            public final Object apply(Object obj) {
                return e.d(this.f3695a, (Void) obj);
            }
        }, i0.c.b());
        this.f3715e = dVarE;
        j0.n.j(dVarE, new a(arrayList, nVar), i0.c.b());
    }

    private com.google.common.util.concurrent.s<Void> j(final c0.n nVar, final List<androidx.camera.core.impl.p> list) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e.b(this.f3708a, nVar, list, aVar);
            }
        });
    }

    void f() {
        e();
    }

    @Override // androidx.camera.core.impl.g2.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(j0.a aVar) {
        if (aVar == j0.a.CLOSING || aVar == j0.a.CLOSED || aVar == j0.a.RELEASING || aVar == j0.a.RELEASED) {
            i(PreviewView.f.IDLE);
            if (this.f3716f) {
                this.f3716f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == j0.a.OPENING || aVar == j0.a.OPEN || aVar == j0.a.PENDING_OPEN) && !this.f3716f) {
            h(this.f3711a);
            this.f3716f = true;
        }
    }

    void i(PreviewView.f fVar) {
        synchronized (this) {
            try {
                if (this.f3713c.equals(fVar)) {
                    return;
                }
                this.f3713c = fVar;
                y0.a("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.f3712b.postValue(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.g2.a
    public void onError(@NonNull Throwable th2) {
        f();
        i(PreviewView.f.IDLE);
    }
}
