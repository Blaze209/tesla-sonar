package tl;

import android.graphics.Bitmap;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vl.i;
import vl.j;
import vl.k;
import vl.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004*\u00019\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001e\u00105\u001a\u0004\u0018\u0001008B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:¨\u0006<"}, d2 = {"Ltl/f;", "Ltl/a;", "", "source", "Lql/d;", "animationInformation", "Lrl/c;", "bitmapFrameRenderer", "Lvl/k;", "frameLoaderFactory", "", "downscaleFrameToDrawableDimensions", "<init>", "(Ljava/lang/String;Lql/d;Lrl/c;Lvl/k;Z)V", "", "canvasWidth", "canvasHeight", "Ltl/g;", "j", "(II)Ltl/g;", "k", "(Lql/d;)I", "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationLoaded", "a", "(IILwn0/a;)V", "frameNumber", "Ltk/a;", "Landroid/graphics/Bitmap;", "b", "(III)Ltk/a;", "onStop", "()V", "c", "Lql/d;", "Lrl/c;", "Lvl/k;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Ljava/lang/String;", "cacheKey", "f", "I", "animationWidth", "g", "animationHeight", "Lvl/j;", "h", "Lvl/j;", "l", "()Lvl/j;", "frameLoader", IntegerTokenConverter.CONVERTER_KEY, "maxAnimationFps", "currentFps", "tl/f$a", "Ltl/f$a;", "dynamicFpsRender", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements tl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ql.d animationInformation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rl.c bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k frameLoaderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String cacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int animationWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int animationHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private j frameLoader;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int maxAnimationFps;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int currentFps;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a dynamicFpsRender;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"tl/f$a", "Lvl/i;", "", "renderingFps", "Ljn0/h0;", "a", "(I)V", "I", "c", "()I", "animationFps", "b", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int animationFps;

        a() {
            this.animationFps = f.this.maxAnimationFps;
        }

        @Override // vl.i
        public void a(int renderingFps) {
            if (renderingFps != f.this.currentFps) {
                f fVar = f.this;
                fVar.currentFps = n.n(renderingFps, 1, fVar.maxAnimationFps);
                j jVarL = f.this.l();
                if (jVarL != null) {
                    jVarL.b(f.this.currentFps);
                }
            }
        }

        @Override // vl.i
        public int b() {
            return f.this.currentFps;
        }

        @Override // vl.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getAnimationFps() {
            return this.animationFps;
        }
    }

    public f(String str, ql.d animationInformation, rl.c bitmapFrameRenderer, k frameLoaderFactory, boolean z11) {
        s.k(animationInformation, "animationInformation");
        s.k(bitmapFrameRenderer, "bitmapFrameRenderer");
        s.k(frameLoaderFactory, "frameLoaderFactory");
        this.animationInformation = animationInformation;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.frameLoaderFactory = frameLoaderFactory;
        this.downscaleFrameToDrawableDimensions = z11;
        this.cacheKey = str == null ? String.valueOf(hashCode()) : str;
        this.animationWidth = animationInformation.l();
        this.animationHeight = animationInformation.g();
        int iK = k(animationInformation);
        this.maxAnimationFps = iK;
        this.currentFps = iK;
        this.dynamicFpsRender = new a();
    }

    private final g j(int canvasWidth, int canvasHeight) {
        if (!this.downscaleFrameToDrawableDimensions) {
            return new g(this.animationWidth, this.animationHeight);
        }
        int iJ = this.animationWidth;
        int iJ2 = this.animationHeight;
        if (canvasWidth < iJ || canvasHeight < iJ2) {
            double d11 = ((double) iJ) / ((double) iJ2);
            if (canvasHeight > canvasWidth) {
                iJ2 = n.j(canvasHeight, iJ2);
                iJ = (int) (((double) iJ2) * d11);
            } else {
                iJ = n.j(canvasWidth, iJ);
                iJ2 = (int) (((double) iJ) / d11);
            }
        }
        return new g(iJ, iJ2);
    }

    private final int k(ql.d dVar) {
        return (int) n.g(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.i() / dVar.a())), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j l() {
        if (this.frameLoader == null) {
            this.frameLoader = this.frameLoaderFactory.b(this.cacheKey, this.bitmapFrameRenderer, this.animationInformation);
        }
        return this.frameLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m() {
        return h0.f84049a;
    }

    @Override // tl.a
    public void a(int canvasWidth, int canvasHeight, wn0.a<h0> onAnimationLoaded) {
        if (canvasWidth <= 0 || canvasHeight <= 0 || this.animationWidth <= 0 || this.animationHeight <= 0) {
            return;
        }
        g gVarJ = j(canvasWidth, canvasHeight);
        j jVarL = l();
        if (jVarL != null) {
            int i11 = gVarJ.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            int i12 = gVarJ.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            if (onAnimationLoaded == null) {
                onAnimationLoaded = new wn0.a() { // from class: tl.e
                    @Override // wn0.a
                    public final Object invoke() {
                        return f.m();
                    }
                };
            }
            jVarL.a(i11, i12, onAnimationLoaded);
        }
    }

    @Override // tl.a
    public tk.a<Bitmap> b(int frameNumber, int canvasWidth, int canvasHeight) {
        g gVarJ = j(canvasWidth, canvasHeight);
        j jVarL = l();
        l lVarC = jVarL != null ? jVarL.c(frameNumber, gVarJ.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), gVarJ.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) : null;
        if (lVarC != null) {
            vl.e.f119534a.h(this.dynamicFpsRender, lVarC);
        }
        if (lVarC != null) {
            return lVarC.a();
        }
        return null;
    }

    @Override // tl.a
    public void c() {
        j jVarL = l();
        if (jVarL != null) {
            k.INSTANCE.b(this.cacheKey, jVarL);
        }
        this.frameLoader = null;
    }

    @Override // tl.a
    public void d(b bVar, rl.b bVar2, ql.a aVar, int i11, wn0.a<h0> aVar2) {
        tl.a.C2455a.e(this, bVar, bVar2, aVar, i11, aVar2);
    }

    @Override // tl.a
    public void onStop() {
        j jVarL = l();
        if (jVarL != null) {
            jVarL.onStop();
        }
        c();
    }
}
