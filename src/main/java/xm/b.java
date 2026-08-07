package xm;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f123712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f123713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f123714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f123715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tk.h<Bitmap> f123716e;

    class a implements tk.h<Bitmap> {
        a() {
        }

        @Override // tk.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                b.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public b(int i11, int i12) {
        pk.k.b(Boolean.valueOf(i11 > 0));
        pk.k.b(Boolean.valueOf(i12 > 0));
        this.f123714c = i11;
        this.f123715d = i12;
        this.f123716e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iJ = fn.c.j(bitmap);
        pk.k.c(this.f123712a > 0, "No bitmaps registered.");
        long j11 = iJ;
        pk.k.d(j11 <= this.f123713b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iJ), Long.valueOf(this.f123713b));
        this.f123713b -= j11;
        this.f123712a--;
    }

    public synchronized int b() {
        return this.f123712a;
    }

    public synchronized int c() {
        return this.f123714c;
    }

    public synchronized int d() {
        return this.f123715d;
    }

    public tk.h<Bitmap> e() {
        return this.f123716e;
    }

    public synchronized long f() {
        return this.f123713b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iJ = fn.c.j(bitmap);
        int i11 = this.f123712a;
        if (i11 < this.f123714c) {
            long j11 = this.f123713b;
            long j12 = iJ;
            if (j11 + j12 <= this.f123715d) {
                this.f123712a = i11 + 1;
                this.f123713b = j11 + j12;
                return true;
            }
        }
        return false;
    }
}
