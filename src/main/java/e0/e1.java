package e0;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e1 implements a1, androidx.camera.core.e.a, k1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c0 f61300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d0 f61301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x0 f61302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<x0> f61303e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Deque<k1> f61299a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f61304f = false;

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f61305a;

        a(m mVar) {
            this.f61305a = mVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            e1.this.f61300b.b();
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (this.f61305a.b()) {
                return;
            }
            int iF = this.f61305a.a().get(0).f();
            if (th2 instanceof ImageCaptureException) {
                e1.this.f61301c.j(a1.a.c(iF, (ImageCaptureException) th2));
            } else {
                e1.this.f61301c.j(a1.a.c(iF, new ImageCaptureException(2, "Failed to submit capture request", th2)));
            }
            e1.this.f61300b.b();
        }
    }

    public e1(@NonNull c0 c0Var) {
        h0.r.b();
        this.f61300b = c0Var;
        this.f61303e = new ArrayList();
    }

    public static /* synthetic */ void c(e1 e1Var) {
        e1Var.f61302d = null;
        e1Var.g();
    }

    private com.google.common.util.concurrent.s<Void> h(@NonNull m mVar) {
        h0.r.b();
        this.f61300b.a();
        com.google.common.util.concurrent.s<Void> sVarC = this.f61300b.c(mVar.a());
        j0.n.j(sVarC, new a(mVar), i0.c.e());
        return sVarC;
    }

    private void m(@NonNull final x0 x0Var) {
        u5.h.i(!f());
        this.f61302d = x0Var;
        x0Var.n().b(new Runnable() { // from class: e0.b1
            @Override // java.lang.Runnable
            public final void run() {
                e1.c(this.f61281a);
            }
        }, i0.c.b());
        this.f61303e.add(x0Var);
        x0Var.o().b(new Runnable() { // from class: e0.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f61285a.f61303e.remove(x0Var);
            }
        }, i0.c.b());
    }

    @Override // e0.k1.a
    public void a(@NonNull k1 k1Var) {
        h0.r.b();
        c0.y0.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f61299a.addFirst(k1Var);
        g();
    }

    @Override // e0.a1
    public void d() {
        h0.r.b();
        this.f61304f = true;
        x0 x0Var = this.f61302d;
        if (x0Var != null) {
            x0Var.l();
        }
    }

    @Override // androidx.camera.core.e.a
    public void e(@NonNull androidx.camera.core.n nVar) {
        i0.c.e().execute(new Runnable() { // from class: e0.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f61296a.g();
            }
        });
    }

    public boolean f() {
        return this.f61302d != null;
    }

    void g() {
        h0.r.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f61304f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f61301c.h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        k1 k1VarPoll = this.f61299a.poll();
        if (k1VarPoll == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        x0 x0Var = new x0(k1VarPoll, this);
        m(x0Var);
        u5.d<m, u0> dVarE = this.f61301c.e(k1VarPoll, x0Var, x0Var.n());
        m mVar = dVarE.f115407a;
        Objects.requireNonNull(mVar);
        u0 u0Var = dVarE.f115408b;
        Objects.requireNonNull(u0Var);
        this.f61301c.m(u0Var);
        x0Var.r(h(mVar));
    }

    @Override // e0.a1
    public void i() {
        h0.r.b();
        this.f61304f = false;
        g();
    }

    @Override // e0.a1
    public void j() {
        h0.r.b();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<k1> it = this.f61299a.iterator();
        while (it.hasNext()) {
            it.next().x(imageCaptureException);
        }
        this.f61299a.clear();
        Iterator it2 = new ArrayList(this.f61303e).iterator();
        while (it2.hasNext()) {
            ((x0) it2.next()).k(imageCaptureException);
        }
    }

    @Override // e0.a1
    public void k(@NonNull d0 d0Var) {
        h0.r.b();
        this.f61301c = d0Var;
        d0Var.k(this);
    }

    @Override // e0.a1
    public void l(@NonNull k1 k1Var) {
        h0.r.b();
        this.f61299a.offer(k1Var);
        g();
    }
}
