package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\"J7\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0004¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0010¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J!\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00109J)\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010<J#\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010?J+\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b6\u0010@J+\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\bA\u0010BJ3\u0010A\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020$H\u0014¢\u0006\u0004\bA\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u00101R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010GR(\u0010N\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010I8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010K\"\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010PR(\u0010T\u001a\u0004\u0018\u00010\r2\b\u0010J\u001a\u0004\u0018\u00010\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010R\"\u0004\bS\u0010\u0015R$\u0010X\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010V\u0012\u0004\bW\u0010\fR0\u0010]\u001a\u00020$2\u0006\u0010J\u001a\u00020$8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010Y\u0012\u0004\b\\\u0010\f\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R\u0016\u0010^\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010YR\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010YR\u0018\u0010b\u001a\u00020$*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bc\u00101R\u0011\u0010f\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\be\u00101¨\u0006g"}, d2 = {"Landroidx/compose/ui/platform/a;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "c", "()V", "Lr2/q;", "b", "(Lr2/q;)Lr2/q;", "j", "()Lr2/q;", "f", "parent", "setParentCompositionContext", "(Lr2/q;)V", "Landroidx/compose/ui/platform/a3;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/a3;)V", "a", "(Lr2/l;I)V", DateTokenConverter.CONVERTER_KEY, "e", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "h", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "g", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", Snapshot.WIDTH, Snapshot.HEIGHT, "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Lr2/p;", "Lr2/p;", "composition", "Lr2/q;", "setParentContext", "parentContext", "Lkotlin/Function0;", "Lwn0/a;", "getDisposeViewCompositionStrategy$annotations", "disposeViewCompositionStrategy", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "creatingComposition", "isTransitionGroupSet", IntegerTokenConverter.CONVERTER_KEY, "(Lr2/q;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WeakReference<p020r2.q> cachedViewTreeCompositionContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p020r2.p composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p020r2.q parentContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean creatingComposition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitionGroupSet;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class C0121a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {
        C0121a() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-656146368, i11, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
            }
            a.this.a(lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public a(Context context) {
        this(context, null, 0, 6, null);
    }

    private final p020r2.q b(p020r2.q qVar) {
        p020r2.q qVar2 = i(qVar) ? qVar : null;
        if (qVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(qVar2);
        }
        return qVar;
    }

    private final void c() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = u3.c(this, j(), z2.c.c(-656146368, true, new C0121a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(p020r2.q qVar) {
        return !(qVar instanceof p020r2.m2) || ((p020r2.m2) qVar).f0().getValue().compareTo(r2.m2.d.ShuttingDown) > 0;
    }

    private final p020r2.q j() {
        p020r2.q qVar;
        p020r2.q qVarB = this.parentContext;
        if (qVarB == null) {
            p020r2.q qVarD = r3.d(this);
            p020r2.q qVar2 = null;
            qVarB = qVarD != null ? b(qVarD) : null;
            if (qVarB == null) {
                WeakReference<p020r2.q> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (qVar = weakReference.get()) != null && i(qVar)) {
                    qVar2 = qVar;
                }
                return qVar2 == null ? b(r3.h(this)) : qVar2;
            }
        }
        return qVarB;
    }

    private final void setParentContext(p020r2.q qVar) {
        if (this.parentContext != qVar) {
            this.parentContext = qVar;
            if (qVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            p020r2.p pVar = this.composition;
            if (pVar != null) {
                pVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void a(p020r2.l lVar, int i11);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        c();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        c();
        return super.addViewInLayout(child, index, params);
    }

    public final void d() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        p020r2.p pVar = this.composition;
        if (pVar != null) {
            pVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        g(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        f();
        h(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final void setParentCompositionContext(p020r2.q parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((b4.j1) childAt).setShowLayoutBounds(z11);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(a3 strategy) {
        wn0.a<jn0.h0> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        c();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        c();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = a3.INSTANCE.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        c();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        c();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        c();
        super.addView(child, index, params);
    }
}
