package sm;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;
import pk.n;
import um.k;
import um.o;
import um.p;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f111427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f111428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f111429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ym.d f111430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n<Boolean> f111431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f111432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<gm.c, b> f111433g;

    /* JADX INFO: renamed from: sm.a$a, reason: collision with other inner class name */
    class C2378a implements b {
        C2378a() {
        }

        @Override // sm.b
        public um.e a(k kVar, int i11, p pVar, om.c cVar) {
            ColorSpace colorSpaceC;
            gm.c cVarI = kVar.I();
            if (((Boolean) a.this.f111431e.get()).booleanValue()) {
                colorSpaceC = cVar.f98033k;
                if (colorSpaceC == null) {
                    colorSpaceC = kVar.C();
                }
            } else {
                colorSpaceC = cVar.f98033k;
            }
            ColorSpace colorSpace = colorSpaceC;
            if (cVarI == gm.b.JPEG) {
                return a.this.f(kVar, i11, pVar, cVar, colorSpace);
            }
            if (cVarI == gm.b.GIF) {
                return a.this.e(kVar, i11, pVar, cVar);
            }
            if (cVarI == gm.b.WEBP_ANIMATED) {
                return a.this.d(kVar, i11, pVar, cVar);
            }
            if (cVarI == gm.b.BINARY_XML) {
                return a.this.h(kVar, i11, pVar, cVar);
            }
            if (cVarI != gm.c.f69215d) {
                return a.this.g(kVar, cVar);
            }
            throw new DecodeException("unknown image format", kVar);
        }
    }

    public a(b bVar, b bVar2, b bVar3, ym.d dVar) {
        this(bVar, bVar2, bVar3, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public um.e h(k kVar, int i11, p pVar, om.c cVar) {
        b bVar = this.f111429c;
        if (bVar != null) {
            return bVar.a(kVar, i11, pVar, cVar);
        }
        return null;
    }

    @Override // sm.b
    public um.e a(k kVar, int i11, p pVar, om.c cVar) {
        InputStream inputStreamJ;
        b bVar;
        b bVar2 = cVar.f98032j;
        if (bVar2 != null) {
            return bVar2.a(kVar, i11, pVar, cVar);
        }
        gm.c cVarI = kVar.I();
        if ((cVarI == null || cVarI == gm.c.f69215d) && (inputStreamJ = kVar.J()) != null) {
            cVarI = gm.e.d(inputStreamJ);
            kVar.K0(cVarI);
        }
        Map<gm.c, b> map = this.f111433g;
        return (map == null || (bVar = map.get(cVarI)) == null) ? this.f111432f.a(kVar, i11, pVar, cVar) : bVar.a(kVar, i11, pVar, cVar);
    }

    public um.e d(k kVar, int i11, p pVar, om.c cVar) {
        b bVar;
        return (cVar.f98029g || (bVar = this.f111428b) == null) ? g(kVar, cVar) : bVar.a(kVar, i11, pVar, cVar);
    }

    public um.e e(k kVar, int i11, p pVar, om.c cVar) {
        b bVar;
        if (kVar.getWidth() == -1 || kVar.getHeight() == -1) {
            throw new DecodeException("image width or height is incorrect", kVar);
        }
        return (cVar.f98029g || (bVar = this.f111427a) == null) ? g(kVar, cVar) : bVar.a(kVar, i11, pVar, cVar);
    }

    public um.f f(k kVar, int i11, p pVar, om.c cVar, ColorSpace colorSpace) {
        tk.a<Bitmap> aVarB = this.f111430d.b(kVar, cVar.f98030h, null, i11, colorSpace);
        try {
            dn.b.a(null, aVarB);
            pk.k.g(aVarB);
            um.f fVarP3 = um.f.p3(aVarB, pVar, kVar.U2(), kVar.L0());
            fVarP3.o("is_rounded", false);
            return fVarP3;
        } finally {
            tk.a.C(aVarB);
        }
    }

    public um.f g(k kVar, om.c cVar) {
        tk.a<Bitmap> aVarA = this.f111430d.a(kVar, cVar.f98030h, null, cVar.f98033k);
        try {
            dn.b.a(null, aVarA);
            pk.k.g(aVarA);
            um.f fVarP3 = um.f.p3(aVarA, o.f116468d, kVar.U2(), kVar.L0());
            fVarP3.o("is_rounded", false);
            return fVarP3;
        } finally {
            tk.a.C(aVarA);
        }
    }

    public a(b bVar, b bVar2, b bVar3, ym.d dVar, Map<gm.c, b> map) {
        this(bVar, bVar2, bVar3, dVar, map, pk.o.f103136b);
    }

    public a(b bVar, b bVar2, b bVar3, ym.d dVar, Map<gm.c, b> map, n<Boolean> nVar) {
        this.f111432f = new C2378a();
        this.f111427a = bVar;
        this.f111428b = bVar2;
        this.f111429c = bVar3;
        this.f111430d = dVar;
        this.f111433g = map;
        this.f111431e = nVar;
    }
}
