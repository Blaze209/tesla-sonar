package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ShippingMethod;
import java.util.Currency;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/stripe/android/view/q2;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "Ljn0/h0;", "setSelected", "(Z)V", "Lcom/stripe/android/model/g1;", "shippingMethod", "setShippingMethod", "(Lcom/stripe/android/model/g1;)V", "Lcom/stripe/android/view/s2;", "a", "Lcom/stripe/android/view/s2;", "colorUtils", "b", "I", "selectedColorInt", "c", "unselectedTextColorSecondaryInt", DateTokenConverter.CONVERTER_KEY, "unselectedTextColorPrimaryInt", "Lh40/x;", "e", "Lh40/x;", "viewBinding", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q2 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s2 colorUtils;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int selectedColorInt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int unselectedTextColorSecondaryInt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int unselectedTextColorPrimaryInt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h40.x viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q2(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        if (selected) {
            this.viewBinding.f70768c.setTextColor(this.selectedColorInt);
            this.viewBinding.f70767b.setTextColor(this.selectedColorInt);
            this.viewBinding.f70769d.setTextColor(this.selectedColorInt);
            this.viewBinding.f70770e.setVisibility(0);
            return;
        }
        this.viewBinding.f70768c.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.f70767b.setTextColor(this.unselectedTextColorSecondaryInt);
        this.viewBinding.f70769d.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.f70770e.setVisibility(4);
    }

    public final void setShippingMethod(ShippingMethod shippingMethod) {
        p013kotlin.jvm.internal.s.k(shippingMethod, "shippingMethod");
        this.viewBinding.f70768c.setText(shippingMethod.getLabel());
        this.viewBinding.f70767b.setText(shippingMethod.getDetail());
        TextView textView = this.viewBinding.f70769d;
        long amount = shippingMethod.getAmount();
        Currency currency = shippingMethod.getCurrency();
        String string = getContext().getString(f30.d0.F0);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        textView.setText(m2.b(amount, currency, string));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ q2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        s2 s2Var = new s2(context);
        this.colorUtils = s2Var;
        h40.x xVarB = h40.x.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(xVarB, "inflate(...)");
        this.viewBinding = xVarB;
        int colorAccent = s2Var.getColorAccent();
        int textColorPrimary = s2Var.getTextColorPrimary();
        int textColorSecondary = s2Var.getTextColorSecondary();
        s2.Companion companion = s2.INSTANCE;
        this.selectedColorInt = companion.b(colorAccent) ? androidx.core.content.b.getColor(context, f30.w.f64197a) : colorAccent;
        this.unselectedTextColorPrimaryInt = companion.b(textColorPrimary) ? androidx.core.content.b.getColor(context, f30.w.f64201e) : textColorPrimary;
        this.unselectedTextColorSecondaryInt = companion.b(textColorSecondary) ? androidx.core.content.b.getColor(context, f30.w.f64202f) : textColorSecondary;
    }
}
