package pj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bj.a f103097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f103098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b> f103099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l f103100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gj.d f103101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f103102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k<Bitmap> f103105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f103106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f103107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f103108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f103109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private dj.l<Bitmap> f103110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f103111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f103112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f103113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f103114r;

    static class a extends uj.c<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f103115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f103116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f103117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f103118d;

        a(Handler handler, int i11, long j11) {
            this.f103115a = handler;
            this.f103116b = i11;
            this.f103117c = j11;
        }

        Bitmap a() {
            return this.f103118d;
        }

        @Override // uj.j
        public void onLoadCleared(Drawable drawable) {
            this.f103118d = null;
        }

        @Override // uj.j
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, vj.b bVar) {
            onResourceReady((Bitmap) obj, (vj.b<? super Bitmap>) bVar);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, vj.b<? super Bitmap> bVar) {
            this.f103118d = bitmap;
            this.f103115a.sendMessageAtTime(this.f103115a.obtainMessage(1, this), this.f103117c);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            g.this.f103100d.clear((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.c cVar, bj.a aVar, int i11, int i12, dj.l<Bitmap> lVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.C(cVar.j()), aVar, null, i(com.bumptech.glide.c.C(cVar.j()), i11, i12), lVar, bitmap);
    }

    private static dj.e g() {
        return new wj.d(Double.valueOf(Math.random()));
    }

    private static k<Bitmap> i(l lVar, int i11, int i12) {
        return lVar.asBitmap().apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.diskCacheStrategyOf(fj.a.f66013b).useAnimationPool(true).skipMemoryCache(true).override(i11, i12));
    }

    private void l() {
        if (!this.f103102f || this.f103103g) {
            return;
        }
        if (this.f103104h) {
            xj.k.a(this.f103111o == null, "Pending target must be null when starting from the first frame");
            this.f103097a.d();
            this.f103104h = false;
        }
        a aVar = this.f103111o;
        if (aVar != null) {
            this.f103111o = null;
            m(aVar);
            return;
        }
        this.f103103g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f103097a.g());
        this.f103097a.f();
        this.f103108l = new a(this.f103098b, this.f103097a.e(), jUptimeMillis);
        this.f103105i.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.signatureOf(g())).mo69load((Object) this.f103097a).into(this.f103108l);
    }

    private void n() {
        Bitmap bitmap = this.f103109m;
        if (bitmap != null) {
            this.f103101e.c(bitmap);
            this.f103109m = null;
        }
    }

    private void p() {
        if (this.f103102f) {
            return;
        }
        this.f103102f = true;
        this.f103107k = false;
        l();
    }

    private void q() {
        this.f103102f = false;
    }

    void a() {
        this.f103099c.clear();
        n();
        q();
        a aVar = this.f103106j;
        if (aVar != null) {
            this.f103100d.clear(aVar);
            this.f103106j = null;
        }
        a aVar2 = this.f103108l;
        if (aVar2 != null) {
            this.f103100d.clear(aVar2);
            this.f103108l = null;
        }
        a aVar3 = this.f103111o;
        if (aVar3 != null) {
            this.f103100d.clear(aVar3);
            this.f103111o = null;
        }
        this.f103097a.clear();
        this.f103107k = true;
    }

    ByteBuffer b() {
        return this.f103097a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f103106j;
        return aVar != null ? aVar.a() : this.f103109m;
    }

    int d() {
        a aVar = this.f103106j;
        if (aVar != null) {
            return aVar.f103116b;
        }
        return -1;
    }

    Bitmap e() {
        return this.f103109m;
    }

    int f() {
        return this.f103097a.a();
    }

    int h() {
        return this.f103114r;
    }

    int j() {
        return this.f103097a.b() + this.f103112p;
    }

    int k() {
        return this.f103113q;
    }

    void m(a aVar) {
        this.f103103g = false;
        if (this.f103107k) {
            this.f103098b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f103102f) {
            if (this.f103104h) {
                this.f103098b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f103111o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            n();
            a aVar2 = this.f103106j;
            this.f103106j = aVar;
            for (int size = this.f103099c.size() - 1; size >= 0; size--) {
                this.f103099c.get(size).a();
            }
            if (aVar2 != null) {
                this.f103098b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(dj.l<Bitmap> lVar, Bitmap bitmap) {
        this.f103110n = (dj.l) xj.k.d(lVar);
        this.f103109m = (Bitmap) xj.k.d(bitmap);
        this.f103105i = this.f103105i.apply((com.bumptech.glide.request.a<?>) new com.bumptech.glide.request.i().transform(lVar));
        this.f103112p = xj.l.i(bitmap);
        this.f103113q = bitmap.getWidth();
        this.f103114r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f103107k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f103099c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f103099c.isEmpty();
        this.f103099c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f103099c.remove(bVar);
        if (this.f103099c.isEmpty()) {
            q();
        }
    }

    g(gj.d dVar, l lVar, bj.a aVar, Handler handler, k<Bitmap> kVar, dj.l<Bitmap> lVar2, Bitmap bitmap) {
        this.f103099c = new ArrayList();
        this.f103100d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f103101e = dVar;
        this.f103098b = handler;
        this.f103105i = kVar;
        this.f103097a = aVar;
        o(lVar2, bitmap);
    }
}
