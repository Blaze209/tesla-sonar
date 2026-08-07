package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.button.MaterialButton;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lq80/b;", "buttonCustomization", "Ljn0/h0;", "setButtonCustomization", "(Lq80/b;)V", "", "hexColor", "j", "(Ljava/lang/String;)I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ThreeDS2Button extends MaterialButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public final int j(String hexColor) {
        p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
        return Color.parseColor(hexColor);
    }

    public final void setButtonCustomization(q80.b buttonCustomization) {
        if (buttonCustomization == null) {
            return;
        }
        String strF = buttonCustomization.f();
        if (strF != null) {
            setTextColor(j(strF));
        }
        String strE = buttonCustomization.e();
        if (strE != null) {
            setBackgroundTintList(ColorStateList.valueOf(j(strE)));
        }
        Integer numValueOf = Integer.valueOf(buttonCustomization.b());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            setCornerRadius(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(buttonCustomization.v());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        if (num != null) {
            setTextSize(2, num.intValue());
        }
        String strR = buttonCustomization.r();
        if (strR != null) {
            setTypeface(Typeface.create(strR, 0));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ ThreeDS2Button(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
    }
}
