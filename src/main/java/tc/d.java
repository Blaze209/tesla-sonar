package tc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec.n;
import ec.r;
import gc.DecodeResult;
import gc.k;
import gc.u;
import ic.SourceFetchResult;
import jn0.g;
import kotlinx.coroutines.InterruptibleKt;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import rc.Options;
import sc.h;
import uc.f;
import yc.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Ltc/d;", "Lgc/k;", "Lgc/u;", "source", "Lrc/n;", "options", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "scaleToDensity", "<init>", "(Lgc/u;Lrc/n;ZZZ)V", "Lgc/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgc/u;", "b", "Lrc/n;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", DateTokenConverter.CONVERTER_KEY, "getRenderToBitmap", "e", "getScaleToDensity", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean useViewBoundsAsIntrinsicSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean renderToBitmap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean scaleToDensity;

    public d(u uVar, Options options, boolean z11, boolean z12, boolean z13) {
        this.source = uVar;
        this.options = options;
        this.useViewBoundsAsIntrinsicSize = z11;
        this.renderToBitmap = z12;
        this.scaleToDensity = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult c(d dVar) throws Throwable {
        Throwable th2;
        uc.b bVarA;
        float width;
        float height;
        j jVarSource = dVar.source.source();
        try {
            bVarA = uc.d.a(jVarSource);
            if (jVarSource != null) {
                try {
                    jVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th2 = null;
        } catch (Throwable th4) {
            if (jVarSource != null) {
                try {
                    jVarSource.close();
                } catch (Throwable th5) {
                    g.a(th4, th5);
                }
            }
            th2 = th4;
            bVarA = null;
        }
        if (th2 != null) {
            throw th2;
        }
        float[] fArrF = bVarA.f();
        if (!dVar.useViewBoundsAsIntrinsicSize || fArrF == null) {
            width = bVarA.getWidth();
            height = bVarA.getHeight();
        } else {
            width = fArrF[2] - fArrF[0];
            height = fArrF[3] - fArrF[1];
        }
        if (dVar.scaleToDensity && h.b(dVar.options.getSize())) {
            float fA = f.a(dVar.options.getContext());
            if (width > BitmapDescriptorFactory.HUE_RED) {
                width *= fA;
            }
            if (height > BitmapDescriptorFactory.HUE_RED) {
                height *= fA;
            }
        }
        long jB = gc.j.b(width > BitmapDescriptorFactory.HUE_RED ? yn0.a.d(width) : 512, height > BitmapDescriptorFactory.HUE_RED ? yn0.a.d(height) : 512, dVar.options.getSize(), dVar.options.getScale(), rc.h.f(dVar.options));
        int iC = q.c(jB);
        int iD = q.d(jB);
        if (width > BitmapDescriptorFactory.HUE_RED && height > BitmapDescriptorFactory.HUE_RED) {
            float fE = gc.j.e(width, height, iC, iD, dVar.options.getScale());
            int i11 = (int) (fE * width);
            iD = (int) (fE * height);
            if (fArrF == null) {
                bVarA.b(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height});
            }
            iC = i11;
        }
        bVarA.d("100%");
        bVarA.a("100%");
        bVarA.e(dVar.options);
        n nVarC = bVarA.c(iC, iD);
        if (dVar.renderToBitmap) {
            nVarC = ec.u.d(ec.u.g(nVarC, 0, 0, 3, null), false, 1, null);
        }
        return new DecodeResult(nVarC, dVar.renderToBitmap);
    }

    @Override // gc.k
    public Object a(Continuation<? super DecodeResult> continuation) {
        return InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, new wn0.a() { // from class: tc.c
            @Override // wn0.a
            public final Object invoke() {
                return d.c(this.f113118a);
            }
        }, continuation);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Ltc/d$a;", "Lgc/k$a;", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "scaleToDensity", "<init>", "(ZZZ)V", "Lic/o;", "result", "b", "(Lic/o;)Z", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lgc/k;", "a", "(Lic/o;Lrc/n;Lec/r;)Lgc/k;", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "getRenderToBitmap", "c", "getScaleToDensity", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean useViewBoundsAsIntrinsicSize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean renderToBitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean scaleToDensity;

        public a(boolean z11, boolean z12, boolean z13) {
            this.useViewBoundsAsIntrinsicSize = z11;
            this.renderToBitmap = z12;
            this.scaleToDensity = z13;
        }

        private final boolean b(SourceFetchResult result) {
            return s.f(result.getMimeType(), "image/svg+xml") || tc.a.a(gc.j.f67814a, result.getSource().source());
        }

        @Override // gc.k.a
        public k a(SourceFetchResult result, Options options, r imageLoader) {
            if (b(result)) {
                return new d(result.getSource(), options, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap, this.scaleToDensity);
            }
            return null;
        }

        public /* synthetic */ a(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? false : z13);
        }
    }

    public /* synthetic */ d(u uVar, Options options, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, options, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? false : z13);
    }
}
