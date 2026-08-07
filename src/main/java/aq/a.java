package aq;

import android.graphics.RectF;
import io.legere.pdfiumandroid.PdfDocument;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f14850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f14851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f14853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f14854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PdfDocument.Link f14855f;

    public a(float f11, float f12, float f13, float f14, RectF rectF, PdfDocument.Link link) {
        this.f14850a = f11;
        this.f14851b = f12;
        this.f14852c = f13;
        this.f14853d = f14;
        this.f14854e = rectF;
        this.f14855f = link;
    }

    public PdfDocument.Link a() {
        return this.f14855f;
    }
}
