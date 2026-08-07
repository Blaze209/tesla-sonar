package com.stripe.android.view;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/stripe/android/view/x2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "defaultColor", "colorIfTransparent", "a", "(Landroid/content/Context;II)I", "", "isSelected", DateTokenConverter.CONVERTER_KEY, "(Z)I", "c", "b", "Lcom/stripe/android/view/s2;", "Lcom/stripe/android/view/s2;", "colorUtils", "I", "selectedColorInt", "unselectedColorInt", "unselectedTextColorInt", "e", "selectedTextAlphaColorInt", "f", "unselectedTextAlphaColorInt", "", "g", "[I", "getTextColorValues$payments_core_release", "()[I", "textColorValues", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s2 colorUtils;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int selectedColorInt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int unselectedColorInt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int unselectedTextColorInt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int selectedTextAlphaColorInt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int unselectedTextAlphaColorInt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int[] textColorValues;

    public x2(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        s2 s2Var = new s2(context);
        this.colorUtils = s2Var;
        int iA = a(context, s2Var.getColorAccent(), f30.w.f64197a);
        this.selectedColorInt = iA;
        this.unselectedColorInt = a(context, s2Var.getColorControlNormal(), f30.w.f64203g);
        int iA2 = a(context, s2Var.getTextColorSecondary(), f30.w.f64200d);
        this.unselectedTextColorInt = iA2;
        int iL = k5.d.l(iA, context.getResources().getInteger(f30.a0.f63901b));
        this.selectedTextAlphaColorInt = iL;
        int iL2 = k5.d.l(iA2, context.getResources().getInteger(f30.a0.f63901b));
        this.unselectedTextAlphaColorInt = iL2;
        this.textColorValues = new int[]{iA, iL, iA2, iL2};
    }

    private final int a(Context context, int defaultColor, int colorIfTransparent) {
        return s2.INSTANCE.b(defaultColor) ? androidx.core.content.b.getColor(context, colorIfTransparent) : defaultColor;
    }

    public final int b(boolean isSelected) {
        return isSelected ? this.selectedTextAlphaColorInt : this.unselectedTextAlphaColorInt;
    }

    public final int c(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedTextColorInt;
    }

    public final int d(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedColorInt;
    }
}
