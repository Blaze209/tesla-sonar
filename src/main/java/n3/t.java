package n3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import k3.e0;
import k3.j1;
import k3.k1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b&\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b'\u0010\u001d\"\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R*\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u00106R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Ln3/t;", "Landroid/view/View;", "ownerView", "Lk3/k1;", "canvasHolder", "Lm3/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Lk3/k1;Lm3/a;)V", "Landroid/graphics/Outline;", "outline", "", "c", "(Landroid/graphics/Outline;)Z", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln3/c;", "parentLayer", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "drawBlock", "setDrawParams", "(Lw4/d;Lw4/t;Ln3/c;Lwn0/l;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Lk3/k1;", "getCanvasHolder", "()Lk3/k1;", "Lm3/a;", DateTokenConverter.CONVERTER_KEY, "Z", "setInvalidated", "(Z)V", "isInvalidated", "e", "Landroid/graphics/Outline;", "layerOutline", "value", "f", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "g", "Lw4/d;", "h", "Lw4/t;", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/l;", "j", "Ln3/c;", "k", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ViewOutlineProvider f92861l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k1 canvasHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m3.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Outline layerOutline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private w4.t layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super m3.f, h0> drawBlock;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private c parentLayer;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"n3/t$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Ljn0/h0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof t) || (outline2 = ((t) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public t(View view, k1 k1Var, m3.a aVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = k1Var;
        this.canvasDrawScope = aVar;
        setOutlineProvider(f92861l);
        this.canUseCompositingLayer = true;
        this.density = m3.e.a();
        this.layoutDirection = w4.t.Ltr;
        this.drawBlock = d.INSTANCE.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final boolean c(Outline outline) {
        this.layerOutline = outline;
        return n.f92854a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        k1 k1Var = this.canvasHolder;
        Canvas canvasB = k1Var.getAndroidCanvas().getInternalCanvas();
        k1Var.getAndroidCanvas().z(canvas);
        e0 e0VarA = k1Var.getAndroidCanvas();
        m3.a aVar = this.canvasDrawScope;
        w4.d dVar = this.density;
        w4.t tVar = this.layoutDirection;
        long jA = j3.n.a(getWidth(), getHeight());
        c cVar = this.parentLayer;
        wn0.l<? super m3.f, h0> lVar = this.drawBlock;
        w4.d density = aVar.getDrawContext().getDensity();
        w4.t layoutDirection = aVar.getDrawContext().getLayoutDirection();
        j1 j1VarA = aVar.getDrawContext().a();
        long jB = aVar.getDrawContext().b();
        c cVarG = aVar.getDrawContext().getGraphicsLayer();
        m3.d dVarD0 = aVar.getDrawContext();
        dVarD0.d(dVar);
        dVarD0.c(tVar);
        dVarD0.h(e0VarA);
        dVarD0.f(jA);
        dVarD0.e(cVar);
        e0VarA.u();
        try {
            lVar.invoke(aVar);
            e0VarA.o();
            m3.d dVarD1 = aVar.getDrawContext();
            dVarD1.d(density);
            dVarD1.c(layoutDirection);
            dVarD1.h(j1VarA);
            dVarD1.f(jB);
            dVarD1.e(cVarG);
            k1Var.getAndroidCanvas().z(canvasB);
            this.isInvalidated = false;
        } catch (Throwable th2) {
            e0VarA.o();
            m3.d dVarD2 = aVar.getDrawContext();
            dVarD2.d(density);
            dVarD2.c(layoutDirection);
            dVarD2.h(j1VarA);
            dVarD2.f(jB);
            dVarD2.e(cVarG);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final k1 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z11) {
        if (this.canUseCompositingLayer != z11) {
            this.canUseCompositingLayer = z11;
            invalidate();
        }
    }

    public final void setDrawParams(w4.d density, w4.t layoutDirection, c parentLayer, wn0.l<? super m3.f, h0> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final void setInvalidated(boolean z11) {
        this.isInvalidated = z11;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
