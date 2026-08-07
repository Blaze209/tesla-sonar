package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GA extends androidx.compose.ui.graphics.painter.b implements p020r2.r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptor f25922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tw f25923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f25924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j3.m f25925d;

    public GA(File svgFile, w4.d density) {
        p013kotlin.jvm.internal.s.k(svgFile, "svgFile");
        p013kotlin.jvm.internal.s.k(density, "density");
        try {
            this.f25922a = ParcelFileDescriptor.open(svgFile, 268435456);
            try {
                Tw twA = Tw.a(new FileInputStream(svgFile));
                this.f25923b = twA;
                twA.a(density.getDensity() * 160.0f);
            } catch (Xw e11) {
                throw new IllegalStateException(("FL Developer error. Failed to parse SVG: " + e11.getMessage()).toString());
            }
        } catch (FileNotFoundException unused) {
            throw new IllegalStateException(("FL Developer error. " + svgFile.getAbsolutePath() + " doesn't exist").toString());
        }
    }

    private final Bitmap a(long j11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) j3.m.k(j11), (int) j3.m.i(j11), Bitmap.Config.ARGB_8888);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(j3.m.k(j11) / j3.m.k(mo1getIntrinsicSizeNHjbRc()), j3.m.i(j11) / j3.m.i(mo1getIntrinsicSizeNHjbRc()));
        this.f25923b.a(canvas);
        return bitmapCreateBitmap;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1getIntrinsicSizeNHjbRc() {
        return (this.f25923b.a() == -1.0f || this.f25923b.b() == -1.0f) ? j3.m.INSTANCE.a() : j3.n.a(this.f25923b.b(), this.f25923b.a());
    }

    @Override // p020r2.r2
    public void onAbandoned() throws IOException {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void onDraw(m3.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        if (this.f25924c == null || !j3.m.g(fVar.b(), this.f25925d)) {
            this.f25924c = a(fVar.b());
            this.f25925d = j3.m.c(fVar.b());
        }
        Bitmap bitmap = this.f25924c;
        if (bitmap != null) {
            m3.f.j0(fVar, k3.n0.c(bitmap), 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 62, null);
        }
    }

    @Override // p020r2.r2
    public void onForgotten() throws IOException {
        this.f25922a.close();
        Bitmap bitmap = this.f25924c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f25924c = null;
    }

    @Override // p020r2.r2
    public void onRemembered() {
    }
}
