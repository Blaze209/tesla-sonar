package om;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import pk.i;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f98022m = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f98026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f98027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f98028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f98029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f98030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f98031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sm.b f98032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorSpace f98033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f98034l;

    public c(d dVar) {
        this.f98023a = dVar.l();
        this.f98024b = dVar.k();
        this.f98025c = dVar.h();
        this.f98026d = dVar.n();
        this.f98027e = dVar.m();
        this.f98028f = dVar.g();
        this.f98029g = dVar.j();
        this.f98030h = dVar.c();
        this.f98031i = dVar.b();
        this.f98032j = dVar.f();
        dVar.d();
        this.f98033k = dVar.e();
        this.f98034l = dVar.i();
    }

    public static c a() {
        return f98022m;
    }

    public static d b() {
        return new d();
    }

    protected i.a c() {
        return i.b(this).a("minDecodeIntervalMs", this.f98023a).a("maxDimensionPx", this.f98024b).c("decodePreviewFrame", this.f98025c).c("useLastFrameForPreview", this.f98026d).c("useEncodedImageForPreview", this.f98027e).c("decodeAllFrames", this.f98028f).c("forceStaticImage", this.f98029g).b("bitmapConfigName", this.f98030h.name()).b("animatedBitmapConfigName", this.f98031i.name()).b("customImageDecoder", this.f98032j).b("bitmapTransformation", null).b("colorSpace", this.f98033k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f98023a != cVar.f98023a || this.f98024b != cVar.f98024b || this.f98025c != cVar.f98025c || this.f98026d != cVar.f98026d || this.f98027e != cVar.f98027e || this.f98028f != cVar.f98028f || this.f98029g != cVar.f98029g) {
            return false;
        }
        boolean z11 = this.f98034l;
        if (z11 || this.f98030h == cVar.f98030h) {
            return (z11 || this.f98031i == cVar.f98031i) && this.f98032j == cVar.f98032j && this.f98033k == cVar.f98033k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f98023a * 31) + this.f98024b) * 31) + (this.f98025c ? 1 : 0)) * 31) + (this.f98026d ? 1 : 0)) * 31) + (this.f98027e ? 1 : 0)) * 31) + (this.f98028f ? 1 : 0)) * 31) + (this.f98029g ? 1 : 0);
        if (!this.f98034l) {
            iOrdinal = (iOrdinal * 31) + this.f98030h.ordinal();
        }
        if (!this.f98034l) {
            int i11 = iOrdinal * 31;
            Bitmap.Config config = this.f98031i;
            iOrdinal = i11 + (config != null ? config.ordinal() : 0);
        }
        int i12 = iOrdinal * 31;
        sm.b bVar = this.f98032j;
        int iHashCode = (i12 + (bVar != null ? bVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f98033k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
