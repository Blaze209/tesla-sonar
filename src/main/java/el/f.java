package el;

import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import nm.k;
import pm.t;
import um.m;

/* JADX INFO: loaded from: classes3.dex */
public class f extends il.b<f, com.facebook.imagepipeline.request.a, tk.a<um.e>, m> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final t f63041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f63042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private pk.f<tm.a> f63043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private bm.g f63044w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63045a;

        static {
            int[] iArr = new int[il.b.c.values().length];
            f63045a = iArr;
            try {
                iArr[il.b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63045a[il.b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63045a[il.b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, t tVar, Set<il.d> set, Set<bm.b> set2) {
        super(context, set, set2);
        this.f63041t = tVar;
        this.f63042u = hVar;
    }

    public static com.facebook.imagepipeline.request.a.c H(il.b.c cVar) {
        int i11 = a.f63045a[cVar.ordinal()];
        if (i11 == 1) {
            return com.facebook.imagepipeline.request.a.c.FULL_FETCH;
        }
        if (i11 == 2) {
            return com.facebook.imagepipeline.request.a.c.DISK_CACHE;
        }
        if (i11 == 3) {
            return com.facebook.imagepipeline.request.a.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private jk.d I() {
        com.facebook.imagepipeline.request.a aVarN = n();
        k kVarR = this.f63041t.getCacheKeyFactory();
        if (kVarR == null || aVarN == null) {
            return null;
        }
        return aVarN.l() != null ? kVarR.a(aVarN, f()) : kVarR.c(aVarN, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public com.facebook.datasource.c<tk.a<um.e>> i(ol.a aVar, String str, com.facebook.imagepipeline.request.a aVar2, Object obj, il.b.c cVar) {
        return this.f63041t.m(aVar2, obj, H(cVar), K(aVar), str);
    }

    protected wm.e K(ol.a aVar) {
        if (aVar instanceof e) {
            return ((e) aVar).q0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // il.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public e x() {
        if (bn.b.d()) {
            bn.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            ol.a aVarP = p();
            String strE = il.b.e();
            e eVarC = aVarP instanceof e ? (e) aVarP : this.f63042u.c();
            eVarC.s0(y(eVarC, strE), strE, I(), f(), this.f63043v);
            eVarC.t0(this.f63044w, this);
            return eVarC;
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    public f M(bm.g gVar) {
        this.f63044w = gVar;
        return r();
    }

    @Override // ol.d
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public f b(Uri uri) {
        return uri == null ? (f) super.D(null) : (f) super.D(ImageRequestBuilder.x(uri).P(om.g.e()).a());
    }
}
