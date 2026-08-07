package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010!\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010\u001eJ/\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001a\u0010\"\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u001a\u0010E\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010&\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u0014\u0010W\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "headerText", "Lq80/d;", "labelCustomization", "Ljn0/h0;", "setInfoHeaderText", "(Ljava/lang/String;Lq80/d;)V", "infoText", "setInfoText", "indicatorResId", "setInfoTextIndicator", "(I)V", "submitButtonLabel", "Lq80/b;", "buttonCustomization", "setSubmitButton", "(Ljava/lang/String;Lq80/b;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSubmitButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "resendButtonLabel", "setResendButtonLabel", "setResendButtonClickListener", "whitelistingLabel", "setWhitelistingLabel", "(Ljava/lang/String;Lq80/d;Lq80/b;)V", "Landroid/view/View;", "challengeEntryView", "setChallengeEntryView", "(Landroid/view/View;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "a", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "b", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoTextView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "c", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getSubmitButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", DateTokenConverter.CONVERTER_KEY, "getResendButton$3ds2sdk_release", "resendButton", "e", "getWhitelistingLabel$3ds2sdk_release", "Landroid/widget/RadioGroup;", "f", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "whitelistRadioGroup", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "Landroid/widget/RadioButton;", "h", "Landroid/widget/RadioButton;", "getWhitelistYesRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistYesRadioButton", IntegerTokenConverter.CONVERTER_KEY, "getWhitelistNoRadioButton$3ds2sdk_release", "whitelistNoRadioButton", "", "getWhitelistingSelection$3ds2sdk_release", "()Z", "whitelistingSelection", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeZoneView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2HeaderTextView infoHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView infoTextView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2Button submitButton;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2Button resendButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ThreeDS2TextView whitelistingLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final RadioGroup whitelistRadioGroup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FrameLayout challengeEntryView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final RadioButton whitelistYesRadioButton;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final RadioButton whitelistNoRadioButton;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, q80.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        challengeZoneView.setInfoHeaderText(str, dVar);
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, q80.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        challengeZoneView.setInfoText(str, dVar);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, q80.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        challengeZoneView.setResendButtonLabel(str, bVar);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, q80.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        challengeZoneView.setSubmitButton(str, bVar);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, q80.d dVar, q80.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            bVar = null;
        }
        challengeZoneView.setWhitelistingLabel(str, dVar, bVar);
    }

    /* JADX INFO: renamed from: getChallengeEntryView$3ds2sdk_release, reason: from getter */
    public final FrameLayout getChallengeEntryView() {
        return this.challengeEntryView;
    }

    /* JADX INFO: renamed from: getInfoHeader$3ds2sdk_release, reason: from getter */
    public final ThreeDS2HeaderTextView getInfoHeader() {
        return this.infoHeader;
    }

    /* JADX INFO: renamed from: getInfoTextView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoTextView() {
        return this.infoTextView;
    }

    /* JADX INFO: renamed from: getResendButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getResendButton() {
        return this.resendButton;
    }

    /* JADX INFO: renamed from: getSubmitButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getSubmitButton() {
        return this.submitButton;
    }

    /* JADX INFO: renamed from: getWhitelistNoRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistNoRadioButton() {
        return this.whitelistNoRadioButton;
    }

    /* JADX INFO: renamed from: getWhitelistRadioGroup$3ds2sdk_release, reason: from getter */
    public final RadioGroup getWhitelistRadioGroup() {
        return this.whitelistRadioGroup;
    }

    /* JADX INFO: renamed from: getWhitelistYesRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistYesRadioButton() {
        return this.whitelistYesRadioButton;
    }

    /* JADX INFO: renamed from: getWhitelistingLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhitelistingLabel() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == n80.d.f93643l;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        p013kotlin.jvm.internal.s.k(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }

    public final void setInfoHeaderText(String headerText, q80.d labelCustomization) {
        if (headerText == null || p013kotlin.text.t.y0(headerText)) {
            this.infoHeader.setVisibility(8);
        } else {
            this.infoHeader.setText(headerText, labelCustomization);
        }
    }

    public final void setInfoText(String infoText, q80.d labelCustomization) {
        if (infoText == null || p013kotlin.text.t.y0(infoText)) {
            this.infoTextView.setVisibility(8);
        } else {
            this.infoTextView.setText(infoText, labelCustomization);
        }
    }

    public final void setInfoTextIndicator(int indicatorResId) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(indicatorResId, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener listener) {
        this.resendButton.setOnClickListener(listener);
    }

    public final void setResendButtonLabel(String resendButtonLabel, q80.b buttonCustomization) {
        if (resendButtonLabel == null || p013kotlin.text.t.y0(resendButtonLabel)) {
            return;
        }
        this.resendButton.setVisibility(0);
        this.resendButton.setText(resendButtonLabel);
        this.resendButton.setButtonCustomization(buttonCustomization);
    }

    public final void setSubmitButton(String submitButtonLabel, q80.b buttonCustomization) {
        if (submitButtonLabel == null || p013kotlin.text.t.y0(submitButtonLabel)) {
            this.submitButton.setVisibility(8);
        } else {
            this.submitButton.setText(submitButtonLabel);
            this.submitButton.setButtonCustomization(buttonCustomization);
        }
    }

    public final void setSubmitButtonClickListener(View.OnClickListener listener) {
        this.submitButton.setOnClickListener(listener);
    }

    public final void setWhitelistingLabel(String whitelistingLabel, q80.d labelCustomization, q80.b buttonCustomization) {
        if (whitelistingLabel == null || p013kotlin.text.t.y0(whitelistingLabel)) {
            return;
        }
        this.whitelistingLabel.setText(whitelistingLabel, labelCustomization);
        if (buttonCustomization != null) {
            bo0.j jVarW = bo0.n.w(0, this.whitelistRadioGroup.getChildCount());
            ArrayList<RadioButton> arrayList = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                View childAt = this.whitelistRadioGroup.getChildAt(((s0) it).nextInt());
                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                if (radioButton != null) {
                    arrayList.add(radioButton);
                }
            }
            for (RadioButton radioButton2 : arrayList) {
                String strE = buttonCustomization.e();
                if (strE != null && !p013kotlin.text.t.y0(strE)) {
                    androidx.core.widget.c.d(radioButton2, ColorStateList.valueOf(Color.parseColor(buttonCustomization.e())));
                }
                String strF = buttonCustomization.f();
                if (strF != null && !p013kotlin.text.t.y0(strF)) {
                    radioButton2.setTextColor(Color.parseColor(buttonCustomization.f()));
                }
            }
        }
        this.whitelistingLabel.setVisibility(0);
        this.whitelistRadioGroup.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        o80.h hVarB = o80.h.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(hVarB, "inflate(...)");
        ThreeDS2HeaderTextView czvHeader = hVarB.f96865c;
        p013kotlin.jvm.internal.s.j(czvHeader, "czvHeader");
        this.infoHeader = czvHeader;
        ThreeDS2TextView czvInfo = hVarB.f96866d;
        p013kotlin.jvm.internal.s.j(czvInfo, "czvInfo");
        this.infoTextView = czvInfo;
        ThreeDS2Button czvSubmitButton = hVarB.f96868f;
        p013kotlin.jvm.internal.s.j(czvSubmitButton, "czvSubmitButton");
        this.submitButton = czvSubmitButton;
        ThreeDS2Button czvResendButton = hVarB.f96867e;
        p013kotlin.jvm.internal.s.j(czvResendButton, "czvResendButton");
        this.resendButton = czvResendButton;
        ThreeDS2TextView czvWhitelistingLabel = hVarB.f96872j;
        p013kotlin.jvm.internal.s.j(czvWhitelistingLabel, "czvWhitelistingLabel");
        this.whitelistingLabel = czvWhitelistingLabel;
        RadioGroup czvWhitelistRadioGroup = hVarB.f96870h;
        p013kotlin.jvm.internal.s.j(czvWhitelistRadioGroup, "czvWhitelistRadioGroup");
        this.whitelistRadioGroup = czvWhitelistRadioGroup;
        FrameLayout czvEntryView = hVarB.f96864b;
        p013kotlin.jvm.internal.s.j(czvEntryView, "czvEntryView");
        this.challengeEntryView = czvEntryView;
        RadioButton czvWhitelistYesButton = hVarB.f96871i;
        p013kotlin.jvm.internal.s.j(czvWhitelistYesButton, "czvWhitelistYesButton");
        this.whitelistYesRadioButton = czvWhitelistYesButton;
        RadioButton czvWhitelistNoButton = hVarB.f96869g;
        p013kotlin.jvm.internal.s.j(czvWhitelistNoButton, "czvWhitelistNoButton");
        this.whitelistNoRadioButton = czvWhitelistNoButton;
    }
}
