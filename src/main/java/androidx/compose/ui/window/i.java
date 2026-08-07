package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u000e\u0010(R\"\u0010.\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00158\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010+R\u0014\u00104\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00067"}, d2 = {"Landroidx/compose/ui/window/i;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/window/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Lr2/q;", "parent", "Lkotlin/Function0;", "Ljn0/h0;", "content", "setContent", "(Lr2/q;Lwn0/p;)V", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "a", "(Lr2/l;I)V", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "j", "Lr2/p1;", "getContent", "()Lwn0/p;", "(Lwn0/p;)V", "k", "Z", "()Z", "setUsePlatformDefaultWidth", "(Z)V", "usePlatformDefaultWidth", "l", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends androidx.compose.ui.platform.a implements k {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 content;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6372d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f6372d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.this.a(lVar, k2.a(this.f6372d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public i(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = s3.d(g.f6361a.a(), null, 2, null);
    }

    private final wn0.p<p020r2.l, Integer, h0> getContent() {
        return (wn0.p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
        this.content.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.a
    public void a(p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(1735448596);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1735448596, i12, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(i11));
        }
    }

    @Override // androidx.compose.ui.platform.a
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.g(changed, left, top, right, bottom);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.window.k
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.a
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.usePlatformDefaultWidth) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final void setUsePlatformDefaultWidth(boolean z11) {
        this.usePlatformDefaultWidth = z11;
    }

    public final void setContent(p020r2.q parent, wn0.p<? super p020r2.l, ? super Integer, h0> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        d();
    }
}
