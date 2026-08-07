package xm;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final v<Bitmap> f123740a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f123741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f123742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f123743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f123744e;

    public o(int i11, int i12, a0 a0Var, sk.d dVar) {
        this.f123741b = i11;
        this.f123742c = i12;
        this.f123743d = a0Var;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap h(int i11) {
        this.f123743d.a(i11);
        return Bitmap.createBitmap(1, i11, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i11) {
        Bitmap bitmapPop;
        while (this.f123744e > i11 && (bitmapPop = this.f123740a.pop()) != null) {
            int iA = this.f123740a.a(bitmapPop);
            this.f123744e -= iA;
            this.f123743d.e(iA);
        }
    }

    @Override // sk.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i11) {
        try {
            int i12 = this.f123744e;
            int i13 = this.f123741b;
            if (i12 > i13) {
                k(i13);
            }
            Bitmap bitmap = this.f123740a.get(i11);
            if (bitmap == null) {
                return h(i11);
            }
            int iA = this.f123740a.a(bitmap);
            this.f123744e -= iA;
            this.f123743d.b(iA);
            return bitmap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // sk.f, tk.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.f123740a.a(bitmap);
        if (iA <= this.f123742c) {
            this.f123743d.f(iA);
            this.f123740a.put(bitmap);
            synchronized (this) {
                this.f123744e += iA;
            }
        }
    }
}
