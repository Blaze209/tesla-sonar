package com.stripe.android.stripe3ds2.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010'\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010+\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R \u00102\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100R \u00109\u001a\u0002038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010&\u001a\u0004\b6\u00107R \u0010<\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b;\u0010&\u001a\u0004\b:\u0010$R \u0010@\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u0010\"\u0012\u0004\b?\u0010&\u001a\u0004\b>\u0010$R \u0010D\u001a\u00020,8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bA\u0010.\u0012\u0004\bC\u0010&\u001a\u0004\bB\u00100R \u0010H\u001a\u0002038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bE\u00105\u0012\u0004\bG\u0010&\u001a\u0004\bF\u00107R\"\u0010O\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010JR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010J¨\u0006T"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "arrow", "Landroid/widget/TextView;", AnnotatedPrivateKey.LABEL, "detailsView", "Ljn0/h0;", "f", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "", "whyInfoLabel", "whyInfoText", "Lq80/d;", "labelCustomization", "setWhyInfo", "(Ljava/lang/String;Ljava/lang/String;Lq80/d;)V", "expandInfoLabel", "expandInfoText", "setExpandInfo", "Lo80/j;", "a", "Lo80/j;", "viewBinding", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "b", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "()V", "whyLabel", "c", "getWhyText$3ds2sdk_release", "getWhyText$3ds2sdk_release$annotations", "whyText", "Landroid/widget/LinearLayout;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "whyContainer", "Landroidx/appcompat/widget/AppCompatImageView;", "e", "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "whyArrow", "getExpandLabel$3ds2sdk_release", "getExpandLabel$3ds2sdk_release$annotations", "expandLabel", "g", "getExpandText$3ds2sdk_release", "getExpandText$3ds2sdk_release$annotations", "expandText", "h", "getExpandContainer$3ds2sdk_release", "getExpandContainer$3ds2sdk_release$annotations", "expandContainer", IntegerTokenConverter.CONVERTER_KEY, "getExpandArrow$3ds2sdk_release", "getExpandArrow$3ds2sdk_release$annotations", "expandArrow", "j", "I", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "toggleColor", "k", "defaultColor", "l", "animationDuration", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InformationZoneView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o80.j viewBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView whyLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView whyText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinearLayout whyContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AppCompatImageView whyArrow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView expandLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView expandText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final LinearLayout expandContainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AppCompatImageView expandArrow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int toggleColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int defaultColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int animationDuration;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InformationZoneView this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.f(this$0.whyArrow, this$0.whyLabel, this$0.whyText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InformationZoneView this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.f(this$0.expandArrow, this$0.expandLabel, this$0.expandText);
    }

    private final void f(View arrow, TextView label, final View detailsView) {
        boolean z11 = detailsView.getVisibility() == 8;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(arrow, "rotation", z11 ? 180 : 0);
        objectAnimatorOfFloat.setDuration(this.animationDuration);
        objectAnimatorOfFloat.start();
        label.setEnabled(z11);
        arrow.setEnabled(z11);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                this.defaultColor = label.getTextColors().getDefaultColor();
            }
            label.setTextColor(z11 ? this.toggleColor : this.defaultColor);
        }
        detailsView.setVisibility(z11 ? 0 : 8);
        if (z11) {
            detailsView.postDelayed(new Runnable() { // from class: com.stripe.android.stripe3ds2.views.v
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.g(detailsView);
                }
            }, this.animationDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View detailsView) {
        p013kotlin.jvm.internal.s.k(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void setExpandInfo$default(InformationZoneView informationZoneView, String str, String str2, q80.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        informationZoneView.setExpandInfo(str, str2, dVar);
    }

    public static /* synthetic */ void setWhyInfo$default(InformationZoneView informationZoneView, String str, String str2, q80.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        informationZoneView.setWhyInfo(str, str2, dVar);
    }

    /* JADX INFO: renamed from: getExpandArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getExpandArrow() {
        return this.expandArrow;
    }

    /* JADX INFO: renamed from: getExpandContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getExpandContainer() {
        return this.expandContainer;
    }

    /* JADX INFO: renamed from: getExpandLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandLabel() {
        return this.expandLabel;
    }

    /* JADX INFO: renamed from: getExpandText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandText() {
        return this.expandText;
    }

    /* JADX INFO: renamed from: getToggleColor$3ds2sdk_release, reason: from getter */
    public final int getToggleColor() {
        return this.toggleColor;
    }

    /* JADX INFO: renamed from: getWhyArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getWhyArrow() {
        return this.whyArrow;
    }

    /* JADX INFO: renamed from: getWhyContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getWhyContainer() {
        return this.whyContainer;
    }

    /* JADX INFO: renamed from: getWhyLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyLabel() {
        return this.whyLabel;
    }

    /* JADX INFO: renamed from: getWhyText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyText() {
        return this.whyText;
    }

    public final void setExpandInfo(String expandInfoLabel, String expandInfoText, q80.d labelCustomization) {
        if (expandInfoLabel == null || p013kotlin.text.t.y0(expandInfoLabel)) {
            return;
        }
        this.expandLabel.setText(expandInfoLabel, labelCustomization);
        this.expandContainer.setVisibility(0);
        this.expandText.setText(expandInfoText, labelCustomization);
    }

    public final void setToggleColor$3ds2sdk_release(int i11) {
        this.toggleColor = i11;
    }

    public final void setWhyInfo(String whyInfoLabel, String whyInfoText, q80.d labelCustomization) {
        if (whyInfoLabel == null || p013kotlin.text.t.y0(whyInfoLabel)) {
            return;
        }
        this.whyLabel.setText(whyInfoLabel, labelCustomization);
        this.whyContainer.setVisibility(0);
        this.whyText.setText(whyInfoText, labelCustomization);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        o80.j jVarC = o80.j.c(LayoutInflater.from(context), this, true);
        p013kotlin.jvm.internal.s.j(jVarC, "inflate(...)");
        this.viewBinding = jVarC;
        ThreeDS2TextView whyLabel = jVarC.f96882h;
        p013kotlin.jvm.internal.s.j(whyLabel, "whyLabel");
        this.whyLabel = whyLabel;
        ThreeDS2TextView whyText = jVarC.f96883i;
        p013kotlin.jvm.internal.s.j(whyText, "whyText");
        this.whyText = whyText;
        LinearLayout whyContainer = jVarC.f96881g;
        p013kotlin.jvm.internal.s.j(whyContainer, "whyContainer");
        this.whyContainer = whyContainer;
        AppCompatImageView whyArrow = jVarC.f96880f;
        p013kotlin.jvm.internal.s.j(whyArrow, "whyArrow");
        this.whyArrow = whyArrow;
        ThreeDS2TextView expandLabel = jVarC.f96878d;
        p013kotlin.jvm.internal.s.j(expandLabel, "expandLabel");
        this.expandLabel = expandLabel;
        ThreeDS2TextView expandText = jVarC.f96879e;
        p013kotlin.jvm.internal.s.j(expandText, "expandText");
        this.expandText = expandText;
        LinearLayout expandContainer = jVarC.f96877c;
        p013kotlin.jvm.internal.s.j(expandContainer, "expandContainer");
        this.expandContainer = expandContainer;
        AppCompatImageView expandArrow = jVarC.f96876b;
        p013kotlin.jvm.internal.s.j(expandArrow, "expandArrow");
        this.expandArrow = expandArrow;
        this.animationDuration = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.d(this.f54343a, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.e(this.f54344a, view);
            }
        });
    }
}
