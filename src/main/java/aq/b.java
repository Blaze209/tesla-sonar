package aq;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f14857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f14858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14860e;

    public b(int i11, Bitmap bitmap, RectF rectF, boolean z11, int i12) {
        this.f14856a = i11;
        this.f14857b = bitmap;
        this.f14858c = rectF;
        this.f14859d = z11;
        this.f14860e = i12;
    }

    public int a() {
        return this.f14860e;
    }

    public int b() {
        return this.f14856a;
    }

    public RectF c() {
        return this.f14858c;
    }

    public Bitmap d() {
        return this.f14857b;
    }

    public boolean e() {
        return this.f14859d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.b() == this.f14856a && bVar.c().left == this.f14858c.left && bVar.c().right == this.f14858c.right && bVar.c().top == this.f14858c.top && bVar.c().bottom == this.f14858c.bottom;
    }

    public void f(int i11) {
        this.f14860e = i11;
    }
}
