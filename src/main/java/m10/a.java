package m10;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lm10/a;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "h", "()V", "onAttachedToWindow", "", "value", "setContentInsetBottom", "(D)V", "setContentInsetTop", "", "setApplyWorkaroundForContentInsetHitTestBug", "(Z)V", "a", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "b", "D", "insetBottom", "c", "insetTop", "", DateTokenConverter.CONVERTER_KEY, "I", "appliedTopInsetPx", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class a extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double insetBottom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private double insetTop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int appliedTopInsetPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final void h() {
        View childAt = getChildAt(0);
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        if (scrollView == null) {
            return;
        }
        scrollView.setClipToPadding(false);
        int iB = (int) c10.d.b((float) this.insetTop);
        View childAt2 = scrollView.getChildAt(0);
        ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
        if (viewGroup == null) {
            return;
        }
        View childAt3 = viewGroup.getChildAt(0);
        ViewGroup viewGroup2 = childAt3 instanceof ViewGroup ? (ViewGroup) childAt3 : null;
        if (viewGroup2 != null) {
            viewGroup2.setTranslationY(iB);
        }
        scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), (int) c10.d.b((float) (this.insetBottom + this.insetTop)));
        int i11 = iB - this.appliedTopInsetPx;
        if (i11 != 0) {
            scrollView.scrollBy(0, i11);
        }
        this.appliedTopInsetPx = iB;
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    public final void setContentInsetBottom(double value) {
        this.insetBottom = value;
        h();
    }

    public final void setContentInsetTop(double value) {
        this.insetTop = value;
        h();
    }

    public final void setApplyWorkaroundForContentInsetHitTestBug(boolean value) {
    }
}
