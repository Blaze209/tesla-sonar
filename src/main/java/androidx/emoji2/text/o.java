package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<d7.a> f8339d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final m f8341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f8342c = 0;

    o(@NonNull m mVar, int i11) {
        this.f8341b = mVar;
        this.f8340a = i11;
    }

    private d7.a g() {
        ThreadLocal<d7.a> threadLocal = f8339d;
        d7.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new d7.a();
            threadLocal.set(aVar);
        }
        this.f8341b.d().j(aVar, this.f8340a);
        return aVar;
    }

    public void a(@NonNull Canvas canvas, float f11, float f12, @NonNull Paint paint) {
        Typeface typefaceG = this.f8341b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f8341b.c(), this.f8340a * 2, 2, f11, f12, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i11) {
        return g().h(i11);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f8342c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f8342c & 4) > 0;
    }

    public void l(boolean z11) {
        int iD = d();
        if (z11) {
            this.f8342c = iD | 4;
        } else {
            this.f8342c = iD;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z11) {
        int i11 = this.f8342c & 4;
        this.f8342c = z11 ? i11 | 2 : i11 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i11 = 0; i11 < iC; i11++) {
            sb2.append(Integer.toHexString(b(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
