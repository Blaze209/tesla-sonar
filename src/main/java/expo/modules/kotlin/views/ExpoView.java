package expo.modules.kotlin.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.u0;
import expo.modules.kotlin.AppContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lexpo/modules/kotlin/views/ExpoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V", "Ljn0/h0;", "measureAndLayout", "()V", "requestLayout", "Landroid/graphics/Canvas;", "canvas", "clipToPaddingBox", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "Lexpo/modules/kotlin/AppContext;", "getAppContext", "()Lexpo/modules/kotlin/AppContext;", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "Lexpo/modules/kotlin/views/ShadowNodeProxy;", "shadowNodeProxy", "Lexpo/modules/kotlin/views/ShadowNodeProxy;", "getShadowNodeProxy", "()Lexpo/modules/kotlin/views/ShadowNodeProxy;", "", "shouldUseAndroidLayout", "Z", "getShouldUseAndroidLayout", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExpoView extends LinearLayout {
    private final AppContext appContext;
    private final ShadowNodeProxy shadowNodeProxy;
    private final boolean shouldUseAndroidLayout;
    private u0 stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoView(Context context, AppContext appContext) {
        super(context);
        s.k(context, "context");
        s.k(appContext, "appContext");
        this.appContext = appContext;
        this.shadowNodeProxy = new ShadowNodeProxy(this);
    }

    public void clipToPaddingBox(Canvas canvas) {
        s.k(canvas, "canvas");
        if (getClipToPadding()) {
            com.facebook.react.uimanager.a.a(this, canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        clipToPaddingBox(canvas);
        super.dispatchDraw(canvas);
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    public final ShadowNodeProxy getShadowNodeProxy() {
        return this.shadowNodeProxy;
    }

    public boolean getShouldUseAndroidLayout() {
        return this.shouldUseAndroidLayout;
    }

    public final u0 getStateWrapper() {
        return this.stateWrapper;
    }

    public final void measureAndLayout() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getShouldUseAndroidLayout()) {
            post(new Runnable() { // from class: expo.modules.kotlin.views.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63389a.measureAndLayout();
                }
            });
        }
    }

    public final void setStateWrapper(u0 u0Var) {
        this.stateWrapper = u0Var;
    }
}
