package im;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.List;
import um.f;
import um.k;
import um.o;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static c f78287e = g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static c f78288f = g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jm.b f78289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mm.d f78290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f78291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f78292d;

    public e(jm.b bVar, mm.d dVar, boolean z11) {
        this(bVar, dVar, z11, true);
    }

    @SuppressLint({"NewApi"})
    private tk.a<Bitmap> c(int i11, int i12, Bitmap.Config config) {
        tk.a<Bitmap> aVarD = this.f78290b.d(i11, i12, config);
        aVarD.H().eraseColor(0);
        aVarD.H().setHasAlpha(true);
        return aVarD;
    }

    private tk.a<Bitmap> d(hm.c cVar, Bitmap.Config config, int i11) {
        tk.a<Bitmap> aVarC = c(cVar.getWidth(), cVar.getHeight(), config);
        new jm.d(this.f78289a.a(hm.e.b(cVar), null), this.f78291c, new a()).h(i11, aVarC.H());
        return aVarC;
    }

    private List<tk.a<Bitmap>> e(hm.c cVar, Bitmap.Config config) {
        hm.a aVarA = this.f78289a.a(hm.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(aVarA.a());
        jm.d dVar = new jm.d(aVarA, this.f78291c, new b(arrayList));
        for (int i11 = 0; i11 < aVarA.a(); i11++) {
            tk.a<Bitmap> aVarC = c(aVarA.getWidth(), aVarA.getHeight(), config);
            dVar.h(i11, aVarC.H());
            arrayList.add(aVarC);
        }
        return arrayList;
    }

    private um.e f(String str, om.c cVar, hm.c cVar2, Bitmap.Config config) throws Throwable {
        List<tk.a<Bitmap>> listE;
        tk.a<Bitmap> aVarD;
        tk.a<Bitmap> aVar = null;
        try {
            int iA = cVar.f98026d ? cVar2.a() - 1 : 0;
            if (cVar.f98029g) {
                f fVarW1 = f.W1(d(cVar2, config, iA), o.f116468d, 0);
                tk.a.C(null);
                tk.a.B(null);
                return fVarW1;
            }
            if (cVar.f98028f) {
                listE = e(cVar2, config);
                try {
                    aVarD = tk.a.t(listE.get(iA));
                } catch (Throwable th2) {
                    th = th2;
                    tk.a.C(aVar);
                    tk.a.B(listE);
                    throw th;
                }
            } else {
                listE = null;
                aVarD = null;
            }
            try {
                if (cVar.f98025c && aVarD == null) {
                    aVarD = d(cVar2, config, iA);
                }
                um.c cVar3 = new um.c(hm.e.f(cVar2).k(aVarD).j(iA).i(listE).h(null).l(str).a(), this.f78292d);
                tk.a.C(aVarD);
                tk.a.B(listE);
                return cVar3;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVarD;
                tk.a.C(aVar);
                tk.a.B(listE);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            listE = null;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // im.d
    public um.e a(k kVar, om.c cVar, Bitmap.Config config) {
        if (f78287e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        tk.a<PooledByteBuffer> aVarT = kVar.t();
        pk.k.g(aVarT);
        try {
            PooledByteBuffer pooledByteBufferH = aVarT.H();
            return f(kVar.e0(), cVar, pooledByteBufferH.g() != null ? f78287e.e(pooledByteBufferH.g(), cVar) : f78287e.d(pooledByteBufferH.getNativePtr(), pooledByteBufferH.size(), cVar), config);
        } finally {
            tk.a.C(aVarT);
        }
    }

    @Override // im.d
    public um.e b(k kVar, om.c cVar, Bitmap.Config config) {
        if (f78288f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        tk.a<PooledByteBuffer> aVarT = kVar.t();
        pk.k.g(aVarT);
        try {
            PooledByteBuffer pooledByteBufferH = aVarT.H();
            return f(kVar.e0(), cVar, pooledByteBufferH.g() != null ? f78288f.e(pooledByteBufferH.g(), cVar) : f78288f.d(pooledByteBufferH.getNativePtr(), pooledByteBufferH.size(), cVar), config);
        } finally {
            tk.a.C(aVarT);
        }
    }

    public e(jm.b bVar, mm.d dVar, boolean z11, boolean z12) {
        this.f78289a = bVar;
        this.f78290b = dVar;
        this.f78291c = z11;
        this.f78292d = z12;
    }

    class a implements jm.d.b {
        a() {
        }

        @Override // jm.d.b
        public tk.a<Bitmap> b(int i11) {
            return null;
        }

        @Override // jm.d.b
        public void a(int i11, Bitmap bitmap) {
        }
    }

    class b implements jm.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f78294a;

        b(List list) {
            this.f78294a = list;
        }

        @Override // jm.d.b
        public tk.a<Bitmap> b(int i11) {
            return tk.a.t((tk.a) this.f78294a.get(i11));
        }

        @Override // jm.d.b
        public void a(int i11, Bitmap bitmap) {
        }
    }
}
