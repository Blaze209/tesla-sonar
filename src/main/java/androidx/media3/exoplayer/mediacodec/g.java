package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import ou.x;
import p7.g0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x<HandlerThread> f10544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x<HandlerThread> f10545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10547f;

    @Deprecated
    public g() {
        this.f10546e = 0;
        this.f10547f = false;
        this.f10543b = null;
        this.f10544c = null;
        this.f10545d = null;
    }

    private boolean d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            return true;
        }
        Context context = this.f10543b;
        return context != null && i11 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.h.b
    public h a(h.a aVar) {
        x<HandlerThread> xVar;
        int i11 = this.f10546e;
        if (i11 != 1 && (i11 != 0 || !d())) {
            return new q.b().a(aVar);
        }
        int iK = g0.k(aVar.f10550c.f101544o);
        t.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + q0.C0(iK));
        x<HandlerThread> xVar2 = this.f10544c;
        b.C0201b c0201b = (xVar2 == null || (xVar = this.f10545d) == null) ? new b.C0201b(iK) : new b.C0201b(xVar2, xVar);
        c0201b.f(this.f10547f);
        return c0201b.a(aVar);
    }

    public g c() {
        this.f10546e = 1;
        return this;
    }

    public g(Context context) {
        this(context, null, null);
    }

    public g(Context context, x<HandlerThread> xVar, x<HandlerThread> xVar2) {
        this.f10543b = context;
        this.f10546e = 0;
        this.f10547f = false;
        this.f10544c = xVar;
        this.f10545d = xVar2;
    }
}
