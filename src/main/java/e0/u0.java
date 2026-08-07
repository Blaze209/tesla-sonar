package e0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    k1 f61385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.r0.g f61386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0.r0.g f61387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Rect f61388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final Matrix f61391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final z0 f61392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final String f61393j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final com.google.common.util.concurrent.s<Void> f61395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f61396m = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final List<Integer> f61394k = new ArrayList();

    u0(@NonNull androidx.camera.core.impl.u0 u0Var, @NonNull k1 k1Var, @NonNull z0 z0Var, @NonNull com.google.common.util.concurrent.s<Void> sVar, int i11) {
        this.f61384a = i11;
        this.f61385b = k1Var;
        this.f61386c = k1Var.m();
        this.f61387d = k1Var.o();
        this.f61390g = k1Var.k();
        this.f61389f = k1Var.n();
        this.f61388e = k1Var.i();
        this.f61391h = k1Var.p();
        this.f61392i = z0Var;
        this.f61393j = String.valueOf(u0Var.hashCode());
        List<androidx.camera.core.impl.w0> listA = u0Var.a();
        Objects.requireNonNull(listA);
        Iterator<androidx.camera.core.impl.w0> it = listA.iterator();
        while (it.hasNext()) {
            this.f61394k.add(Integer.valueOf(it.next().getId()));
        }
        this.f61395l = sVar;
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> a() {
        return this.f61395l;
    }

    @NonNull
    Rect b() {
        return this.f61388e;
    }

    int c() {
        return this.f61390g;
    }

    c0.r0.g d() {
        return this.f61386c;
    }

    public int e() {
        return this.f61384a;
    }

    int f() {
        return this.f61389f;
    }

    c0.r0.g g() {
        return this.f61387d;
    }

    @NonNull
    Matrix h() {
        return this.f61391h;
    }

    @NonNull
    List<Integer> i() {
        return this.f61394k;
    }

    @NonNull
    String j() {
        return this.f61393j;
    }

    @NonNull
    k1 k() {
        return this.f61385b;
    }

    boolean l() {
        return this.f61392i.isAborted();
    }

    boolean m() {
        return d() == null && g() == null;
    }

    void n(@NonNull ImageCaptureException imageCaptureException) {
        this.f61392i.g(imageCaptureException);
    }

    void o(int i11) {
        if (this.f61396m != i11) {
            this.f61396m = i11;
            this.f61392i.onCaptureProcessProgressed(i11);
        }
    }

    void p() {
        this.f61392i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@NonNull androidx.camera.core.n nVar) {
        this.f61392i.d(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@NonNull c0.r0.h hVar) {
        this.f61392i.f(hVar);
    }

    void s() {
        if (this.f61396m != -1) {
            o(100);
        }
        this.f61392i.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(@NonNull Bitmap bitmap) {
        this.f61392i.b(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@NonNull ImageCaptureException imageCaptureException) {
        this.f61392i.c(imageCaptureException);
    }
}
