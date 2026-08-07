package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f39310v = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PdfDocument f39311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PdfiumCore f39312b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39324n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final dq.b f39328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f39329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f39330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f39331u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39313c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<Size> f39314d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<SizeF> f39315e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseBooleanArray f39316f = new SparseBooleanArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Size f39317g = new Size(0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Size f39318h = new Size(0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SizeF f39319i = new SizeF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SizeF f39320j = new SizeF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<Float> f39325o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<Float> f39326p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f39327q = BitmapDescriptorFactory.HUE_RED;

    g(PdfiumCore pdfiumCore, PdfDocument pdfDocument, dq.b bVar, Size size, int[] iArr, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15) {
        this.f39321k = z11;
        this.f39312b = pdfiumCore;
        this.f39311a = pdfDocument;
        this.f39328r = bVar;
        this.f39331u = iArr;
        this.f39322l = z12;
        this.f39323m = i11;
        this.f39324n = z13;
        this.f39329s = z14;
        this.f39330t = z15;
        A(size);
    }

    private void A(Size size) {
        int[] iArr = this.f39331u;
        if (iArr != null) {
            this.f39313c = iArr.length;
        } else {
            this.f39313c = this.f39311a.getPageCount();
        }
        for (int i11 = 0; i11 < this.f39313c; i11++) {
            Size pageSize = this.f39312b.getPageSize(this.f39311a, c(i11));
            if (pageSize.getWidth() > this.f39317g.getWidth()) {
                this.f39317g = pageSize;
            }
            if (pageSize.getHeight() > this.f39318h.getHeight()) {
                this.f39318h = pageSize;
            }
            this.f39314d.add(pageSize);
        }
        y(size);
    }

    private void v(Size size) {
        float width;
        float width2;
        this.f39326p.clear();
        for (int i11 = 0; i11 < p(); i11++) {
            SizeF sizeF = this.f39315e.get(i11);
            if (this.f39322l) {
                width = size.getHeight();
                width2 = sizeF.getHeight();
            } else {
                width = size.getWidth();
                width2 = sizeF.getWidth();
            }
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, width - width2);
            if (i11 < p() - 1) {
                fMax += this.f39323m;
            }
            this.f39326p.add(Float.valueOf(fMax));
        }
    }

    private void w() {
        float fFloatValue;
        float height = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < p(); i11++) {
            SizeF sizeF = this.f39315e.get(i11);
            height += this.f39322l ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f39324n) {
                fFloatValue = this.f39326p.get(i11).floatValue();
            } else {
                if (i11 < p() - 1) {
                    fFloatValue = this.f39323m;
                }
            }
            height += fFloatValue;
        }
        this.f39327q = height;
    }

    private void x() {
        float fFloatValue;
        this.f39325o.clear();
        float fFloatValue2 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < p(); i11++) {
            SizeF sizeF = this.f39315e.get(i11);
            float height = this.f39322l ? sizeF.getHeight() : sizeF.getWidth();
            if (this.f39324n) {
                fFloatValue2 += this.f39326p.get(i11).floatValue() / 2.0f;
                if (i11 == 0) {
                    fFloatValue2 -= this.f39323m / 2.0f;
                } else if (i11 == p() - 1) {
                    fFloatValue2 += this.f39323m / 2.0f;
                }
                this.f39325o.add(Float.valueOf(fFloatValue2));
                fFloatValue = this.f39326p.get(i11).floatValue() / 2.0f;
            } else {
                this.f39325o.add(Float.valueOf(fFloatValue2));
                fFloatValue = this.f39323m;
            }
            fFloatValue2 += height + fFloatValue;
        }
    }

    public int a(int i11) {
        int iP;
        if (i11 <= 0) {
            return 0;
        }
        int[] iArr = this.f39331u;
        if (iArr != null) {
            if (i11 >= iArr.length) {
                iP = iArr.length;
                return iP - 1;
            }
            return i11;
        }
        if (i11 >= p()) {
            iP = p();
            return iP - 1;
        }
        return i11;
    }

    public void b() {
        PdfDocument pdfDocument;
        PdfiumCore pdfiumCore = this.f39312b;
        if (pdfiumCore != null && (pdfDocument = this.f39311a) != null) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.f39311a = null;
        this.f39331u = null;
    }

    public int c(int i11) {
        int i12;
        int[] iArr = this.f39331u;
        if (iArr == null) {
            i12 = i11;
        } else {
            if (i11 < 0 || i11 >= iArr.length) {
                return -1;
            }
            i12 = iArr[i11];
        }
        if (i12 < 0 || i11 >= p()) {
            return -1;
        }
        return i12;
    }

    public List<PdfDocument.Bookmark> d() {
        PdfDocument pdfDocument = this.f39311a;
        return pdfDocument == null ? new ArrayList() : this.f39312b.getTableOfContents(pdfDocument);
    }

    public float e(float f11) {
        return this.f39327q * f11;
    }

    public float f() {
        return g().getHeight();
    }

    public SizeF g() {
        return this.f39322l ? this.f39320j : this.f39319i;
    }

    public float h() {
        return g().getWidth();
    }

    public PdfDocument.Meta i() {
        PdfDocument pdfDocument = this.f39311a;
        if (pdfDocument == null) {
            return null;
        }
        return this.f39312b.getDocumentMeta(pdfDocument);
    }

    public int j(float f11, float f12) {
        int i11 = 0;
        for (int i12 = 0; i12 < p() && (this.f39325o.get(i12).floatValue() * f12) - (o(i12, f12) / 2.0f) < f11; i12++) {
            i11++;
        }
        int i13 = i11 - 1;
        if (i13 >= 0) {
            return i13;
        }
        return 0;
    }

    public float k(int i11, float f11) {
        SizeF sizeFN = n(i11);
        return (this.f39322l ? sizeFN.getHeight() : sizeFN.getWidth()) * f11;
    }

    public List<PdfDocument.Link> l(int i11) {
        return this.f39312b.getPageLinks(this.f39311a, c(i11));
    }

    public float m(int i11, float f11) {
        return c(i11) < 0 ? BitmapDescriptorFactory.HUE_RED : this.f39325o.get(i11).floatValue() * f11;
    }

    public SizeF n(int i11) {
        return c(i11) < 0 ? new SizeF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : this.f39315e.get(i11);
    }

    public float o(int i11, float f11) {
        return (this.f39324n ? this.f39326p.get(i11).floatValue() : this.f39323m) * f11;
    }

    public int p() {
        return this.f39313c;
    }

    public SizeF q(int i11, float f11) {
        SizeF sizeFN = n(i11);
        return new SizeF(sizeFN.getWidth() * f11, sizeFN.getHeight() * f11);
    }

    public float r(int i11, float f11) {
        float f12;
        float height;
        SizeF sizeFN = n(i11);
        if (this.f39322l) {
            f12 = h();
            height = sizeFN.getWidth();
        } else {
            f12 = f();
            height = sizeFN.getHeight();
        }
        return (f11 * (f12 - height)) / 2.0f;
    }

    public RectF s(int i11, int i12, int i13, int i14, int i15, RectF rectF) {
        return new RectF(this.f39311a.openPage(c(i11)).mapRectToDevice(i12, i13, i14, i15, 0, rectF));
    }

    public boolean t(int i11) {
        int iC = c(i11);
        if (iC < 0) {
            return false;
        }
        synchronized (f39310v) {
            try {
                if (this.f39316f.indexOfKey(iC) >= 0) {
                    return false;
                }
                try {
                    this.f39312b.openPage(this.f39311a, iC);
                    this.f39316f.put(iC, true);
                    return true;
                } catch (Exception e11) {
                    this.f39316f.put(iC, false);
                    throw new PageRenderingException(i11, e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean u(int i11) {
        return !this.f39316f.get(c(i11), false);
    }

    public void y(Size size) {
        this.f39315e.clear();
        dq.d dVar = new dq.d(this.f39328r, this.f39317g, this.f39318h, size, this.f39329s);
        this.f39320j = dVar.g();
        this.f39319i = dVar.f();
        Iterator<Size> it = this.f39314d.iterator();
        while (it.hasNext()) {
            this.f39315e.add(dVar.a(it.next(), this.f39321k, this.f39330t));
        }
        if (this.f39324n) {
            v(size);
        }
        w();
        x();
    }

    public void z(Bitmap bitmap, int i11, Rect rect, boolean z11) {
        this.f39312b.renderPageBitmap(this.f39311a, bitmap, c(i11), rect.left, rect.top, rect.width(), rect.height(), z11);
    }
}
