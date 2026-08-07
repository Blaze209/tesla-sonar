package n2;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u0016\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u001aJ(\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u001aR\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00109R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Ln2/k;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "bounded", "Ljn0/h0;", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lu1/n$b;", "interaction", "Lj3/m;", "size", "radius", "Lk3/p1;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Lu1/n$b;ZJIJFLwn0/a;)V", "e", "setRippleProperties-07v42R4", "(JJF)V", "setRippleProperties", DateTokenConverter.CONVERTER_KEY, "Ln2/p;", "a", "Ln2/p;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lwn0/a;", "f", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f92706g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f92707h = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f92708i = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p ripple;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Boolean bounded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long lastRippleStateChangeTimeMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Runnable resetRippleRunnable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onInvalidateRipple;

    public k(Context context) {
        super(context);
    }

    private final void c(boolean bounded) {
        p pVar = new p(bounded);
        setBackground(pVar);
        this.ripple = pVar;
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l11 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l11 != null ? l11.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f92707h : f92708i;
            p pVar = this.ripple;
            if (pVar != null) {
                pVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: n2.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.setRippleState$lambda$2(this.f92704a);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k kVar) {
        p pVar = kVar.ripple;
        if (pVar != null) {
            pVar.setState(f92708i);
        }
        kVar.resetRippleRunnable = null;
    }

    public final void b(u1.n.b interaction, boolean bounded, long size, int radius, long color, float alpha, wn0.a<h0> onInvalidateRipple) {
        if (this.ripple == null || !s.f(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        p pVar = this.ripple;
        s.h(pVar);
        this.onInvalidateRipple = onInvalidateRipple;
        pVar.c(radius);
        m599setRippleProperties07v42R4(size, color, alpha);
        if (bounded) {
            pVar.setHotspot(j3.g.m(interaction.getPressPosition()), j3.g.n(interaction.getPressPosition()));
        } else {
            pVar.setHotspot(pVar.getBounds().centerX(), pVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            s.h(runnable2);
            runnable2.run();
        } else {
            p pVar = this.ripple;
            if (pVar != null) {
                pVar.setState(f92708i);
            }
        }
        p pVar2 = this.ripple;
        if (pVar2 == null) {
            return;
        }
        pVar2.setVisible(false, false);
        unscheduleDrawable(pVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        wn0.a<h0> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: setRippleProperties-07v42R4, reason: not valid java name */
    public final void m599setRippleProperties07v42R4(long size, long color, float alpha) {
        p pVar = this.ripple;
        if (pVar == null) {
            return;
        }
        pVar.b(color, alpha);
        Rect rect = new Rect(0, 0, yn0.a.d(j3.m.k(size)), yn0.a.d(j3.m.i(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pVar.setBounds(rect);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
