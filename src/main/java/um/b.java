package um;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f116439i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tk.a<Bitmap> f116440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f116441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f116442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f116443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f116444h;

    protected b(Bitmap bitmap, tk.h<Bitmap> hVar, p pVar, int i11, int i12) {
        this.f116441e = (Bitmap) pk.k.g(bitmap);
        this.f116440d = tk.a.k0(this.f116441e, (tk.h) pk.k.g(hVar));
        this.f116442f = pVar;
        this.f116443g = i11;
        this.f116444h = i12;
    }

    private synchronized tk.a<Bitmap> n0() {
        tk.a<Bitmap> aVar;
        aVar = this.f116440d;
        this.f116440d = null;
        this.f116441e = null;
        return aVar;
    }

    private static int r0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int s0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean t0() {
        return f116439i;
    }

    @Override // um.f
    public int L0() {
        return this.f116444h;
    }

    @Override // um.f
    public int U2() {
        return this.f116443g;
    }

    @Override // um.f
    public synchronized tk.a<Bitmap> V() {
        return tk.a.t(this.f116440d);
    }

    @Override // um.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        tk.a<Bitmap> aVarN0 = n0();
        if (aVarN0 != null) {
            aVarN0.close();
        }
    }

    @Override // um.e, um.m
    public int getHeight() {
        int i11;
        return (this.f116443g % 180 != 0 || (i11 = this.f116444h) == 5 || i11 == 7) ? s0(this.f116441e) : r0(this.f116441e);
    }

    @Override // um.e, um.m
    public int getWidth() {
        int i11;
        return (this.f116443g % 180 != 0 || (i11 = this.f116444h) == 5 || i11 == 7) ? r0(this.f116441e) : s0(this.f116441e);
    }

    @Override // um.e
    /* JADX INFO: renamed from: isClosed */
    public synchronized boolean getClosed() {
        return this.f116440d == null;
    }

    @Override // um.a, um.e
    public p o3() {
        return this.f116442f;
    }

    @Override // um.d
    public Bitmap t3() {
        return this.f116441e;
    }

    @Override // um.e
    public int v() {
        return fn.c.j(this.f116441e);
    }

    protected b(tk.a<Bitmap> aVar, p pVar, int i11, int i12) {
        tk.a<Bitmap> aVar2 = (tk.a) pk.k.g(aVar.p());
        this.f116440d = aVar2;
        this.f116441e = aVar2.H();
        this.f116442f = pVar;
        this.f116443g = i11;
        this.f116444h = i12;
    }
}
