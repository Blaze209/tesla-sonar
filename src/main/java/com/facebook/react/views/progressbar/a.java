package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0000\u0018\u0000 32\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/facebook/react/views/progressbar/a;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/widget/ProgressBar;", "progressBar", "Ljn0/h0;", "setColor", "(Landroid/widget/ProgressBar;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "a", "()V", "", "styleName", "setStyle$ReactAndroid_release", "(Ljava/lang/String;)V", "setStyle", "", "Ljava/lang/Integer;", "getColor$ReactAndroid_release", "()Ljava/lang/Integer;", "setColor$ReactAndroid_release", "(Ljava/lang/Integer;)V", "color", "", "b", "Z", "getIndeterminate$ReactAndroid_release", "()Z", "setIndeterminate$ReactAndroid_release", "(Z)V", ReactProgressBarViewManager.PROP_INDETERMINATE, "c", "getAnimating$ReactAndroid_release", "setAnimating$ReactAndroid_release", ReactProgressBarViewManager.PROP_ANIMATING, "", DateTokenConverter.CONVERTER_KEY, "D", "getProgress$ReactAndroid_release", "()D", "setProgress$ReactAndroid_release", "(D)V", ReactProgressBarViewManager.PROP_PROGRESS, "e", "Landroid/widget/ProgressBar;", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0458a f23517f = new C0458a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean indeterminate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean animating;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ProgressBar progressBar;

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/progressbar/a$a;", "", "<init>", "()V", "", "MAX_PROGRESS", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C0458a {
        public /* synthetic */ C0458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0458a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.k(context, "context");
        this.indeterminate = true;
        this.animating = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.color;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.indeterminate);
        setColor(progressBar);
        progressBar.setProgress((int) (this.progress * ((double) 1000)));
        progressBar.setVisibility(this.animating ? 0 : 4);
    }

    /* JADX INFO: renamed from: getAnimating$ReactAndroid_release, reason: from getter */
    public final boolean getAnimating() {
        return this.animating;
    }

    /* JADX INFO: renamed from: getColor$ReactAndroid_release, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getIndeterminate$ReactAndroid_release, reason: from getter */
    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    /* JADX INFO: renamed from: getProgress$ReactAndroid_release, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        s.k(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(m.f22670t);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z11) {
        this.animating = z11;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.color = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z11) {
        this.indeterminate = z11;
    }

    public final void setProgress$ReactAndroid_release(double d11) {
        this.progress = d11;
    }

    public final void setStyle$ReactAndroid_release(String styleName) {
        ReactProgressBarViewManager.Companion aVar = ReactProgressBarViewManager.INSTANCE;
        ProgressBar progressBarA = aVar.a(getContext(), aVar.b(styleName));
        progressBarA.setMax(1000);
        this.progressBar = progressBarA;
        removeAllViews();
        addView(this.progressBar, new ViewGroup.LayoutParams(-1, -1));
    }
}
