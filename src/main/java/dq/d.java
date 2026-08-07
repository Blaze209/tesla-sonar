package dq;

import android.util.SizeF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.legere.pdfiumandroid.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f60821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f60822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f60823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f60824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SizeF f60825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SizeF f60826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f60827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f60828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f60829i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60830a;

        static {
            int[] iArr = new int[b.values().length];
            f60830a = iArr;
            try {
                iArr[b.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60830a[b.BOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(b bVar, Size size, Size size2, Size size3, boolean z11) {
        this.f60821a = bVar;
        this.f60822b = size;
        this.f60823c = size2;
        this.f60824d = size3;
        this.f60829i = z11;
        b();
    }

    private void b() {
        int i11 = a.f60830a[this.f60821a.ordinal()];
        if (i11 == 1) {
            SizeF sizeFD = d(this.f60823c, this.f60824d.getHeight());
            this.f60826f = sizeFD;
            this.f60828h = sizeFD.getHeight() / this.f60823c.getHeight();
            Size size = this.f60822b;
            this.f60825e = d(size, size.getHeight() * this.f60828h);
            return;
        }
        if (i11 != 2) {
            SizeF sizeFE = e(this.f60822b, this.f60824d.getWidth());
            this.f60825e = sizeFE;
            this.f60827g = sizeFE.getWidth() / this.f60822b.getWidth();
            Size size2 = this.f60823c;
            this.f60826f = e(size2, size2.getWidth() * this.f60827g);
            return;
        }
        float width = c(this.f60822b, this.f60824d.getWidth(), this.f60824d.getHeight()).getWidth() / this.f60822b.getWidth();
        Size size3 = this.f60823c;
        SizeF sizeFC = c(size3, size3.getWidth() * width, this.f60824d.getHeight());
        this.f60826f = sizeFC;
        this.f60828h = sizeFC.getHeight() / this.f60823c.getHeight();
        SizeF sizeFC2 = c(this.f60822b, this.f60824d.getWidth(), this.f60822b.getHeight() * this.f60828h);
        this.f60825e = sizeFC2;
        this.f60827g = sizeFC2.getWidth() / this.f60822b.getWidth();
    }

    private SizeF c(Size size, float f11, float f12) {
        float width = size.getWidth() / size.getHeight();
        float fFloor = (float) Math.floor(f11 / width);
        if (fFloor > f12) {
            f11 = (float) Math.floor(width * f12);
        } else {
            f12 = fFloor;
        }
        return new SizeF(f11, f12);
    }

    private SizeF d(Size size, float f11) {
        return new SizeF((float) Math.floor(f11 / (size.getHeight() / size.getWidth())), f11);
    }

    private SizeF e(Size size, float f11) {
        return new SizeF(f11, (float) Math.floor(f11 / (size.getWidth() / size.getHeight())));
    }

    public SizeF a(Size size, boolean z11, boolean z12) {
        float width;
        float f11;
        int width2;
        float f12;
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            return new SizeF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        if (!z11 || z12) {
            if (this.f60829i) {
                width2 = this.f60824d.getWidth();
                f12 = width2;
            } else {
                width = size.getWidth();
                f11 = this.f60827g;
                f12 = width * f11;
            }
        } else if (this.f60829i) {
            width2 = this.f60824d.getWidth();
            f12 = width2;
        } else {
            width = size.getWidth() / 2;
            f11 = this.f60827g;
            f12 = width * f11;
        }
        float height = this.f60829i ? this.f60824d.getHeight() : size.getHeight() * this.f60828h;
        int i11 = a.f60830a[this.f60821a.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? e(size, f12) : c(size, f12, height);
        }
        return d(size, height);
    }

    public SizeF f() {
        return this.f60826f;
    }

    public SizeF g() {
        return this.f60825e;
    }
}
