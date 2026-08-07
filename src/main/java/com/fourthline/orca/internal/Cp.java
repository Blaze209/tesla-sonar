package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class Cp extends androidx.compose.ui.graphics.painter.b implements p020r2.r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ParcelFileDescriptor f25258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PdfRenderer f25259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f25261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j3.m f25262e;

    public Cp(File pdfFile, w4.d density) {
        p013kotlin.jvm.internal.s.k(pdfFile, "pdfFile");
        p013kotlin.jvm.internal.s.k(density, "density");
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(pdfFile, 268435456);
            this.f25258a = parcelFileDescriptorOpen;
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            this.f25259b = pdfRenderer;
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
            this.f25260c = j3.n.a(pageOpenPage.getWidth() * density.getDensity(), pageOpenPage.getHeight() * density.getDensity());
            pageOpenPage.close();
        } catch (FileNotFoundException unused) {
            throw new IllegalStateException(("FL Developer error. " + pdfFile.getAbsolutePath() + " doesn't exist").toString());
        }
    }

    private final Bitmap a(long j11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bo0.n.f((int) j3.m.k(j11), 1), bo0.n.f((int) j3.m.i(j11), 1), Bitmap.Config.ARGB_8888);
        PdfRenderer.Page pageOpenPage = this.f25259b.openPage(0);
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        pageOpenPage.close();
        return bitmapCreateBitmap;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1getIntrinsicSizeNHjbRc() {
        return this.f25260c;
    }

    @Override // p020r2.r2
    public void onAbandoned() throws IOException {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void onDraw(m3.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        if (this.f25261d == null || !j3.m.g(fVar.b(), this.f25262e)) {
            this.f25261d = a(fVar.b());
            this.f25262e = j3.m.c(fVar.b());
        }
        Bitmap bitmap = this.f25261d;
        if (bitmap != null) {
            m3.f.j0(fVar, k3.n0.c(bitmap), 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 62, null);
        }
    }

    @Override // p020r2.r2
    public void onForgotten() throws IOException {
        this.f25259b.close();
        this.f25258a.close();
        Bitmap bitmap = this.f25261d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f25261d = null;
    }

    @Override // p020r2.r2
    public void onRemembered() {
    }
}
