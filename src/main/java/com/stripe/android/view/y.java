package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006#"}, d2 = {"Lcom/stripe/android/view/y;", "", "Landroid/content/res/Resources;", "resources", "Lcom/stripe/android/view/x2;", "themeConfig", "<init>", "(Landroid/content/res/Resources;Lcom/stripe/android/view/x2;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "Landroid/text/SpannableString;", "displayString", "Landroid/text/ParcelableSpan;", "span", "", "start", "end", "Ljn0/h0;", "c", "(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V", "Lcom/stripe/android/model/h;", "brand", "", "last4", "", "isSelected", "a", "(Lcom/stripe/android/model/h;Ljava/lang/String;Z)Landroid/text/SpannableString;", "Lcom/stripe/android/model/v0$g;", "card", "b", "(Lcom/stripe/android/model/v0$g;)Ljava/lang/String;", "Landroid/content/res/Resources;", "Lcom/stripe/android/view/x2;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x2 themeConfig;

    public y(Resources resources, x2 themeConfig) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        p013kotlin.jvm.internal.s.k(themeConfig, "themeConfig");
        this.resources = resources;
        this.themeConfig = themeConfig;
    }

    private final void c(SpannableString displayString, ParcelableSpan span, int start, int end) {
        displayString.setSpan(span, start, end, 33);
    }

    public final /* synthetic */ SpannableString a(com.stripe.android.model.h brand, String last4, boolean isSelected) {
        p013kotlin.jvm.internal.s.k(brand, "brand");
        String displayName = brand.getDisplayName();
        int length = displayName.length();
        if (last4 == null || p013kotlin.text.t.y0(last4)) {
            SpannableString spannableString = new SpannableString(displayName);
            c(spannableString, new TypefaceSpan("sans-serif-medium"), 0, length);
            return spannableString;
        }
        String string = this.resources.getString(f30.d0.f63935a0, displayName, last4);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        int length2 = string.length();
        int iV0 = p013kotlin.text.t.v0(string, last4, 0, false, 6, null);
        int length3 = last4.length() + iV0;
        int iV1 = p013kotlin.text.t.v0(string, displayName, 0, false, 6, null);
        int length4 = displayName.length() + iV1;
        int iC = this.themeConfig.c(isSelected);
        int iB = this.themeConfig.b(isSelected);
        SpannableString spannableString2 = new SpannableString(string);
        c(spannableString2, new ForegroundColorSpan(iB), 0, length2);
        c(spannableString2, new TypefaceSpan("sans-serif-medium"), iV1, length4);
        c(spannableString2, new ForegroundColorSpan(iC), iV1, length4);
        c(spannableString2, new TypefaceSpan("sans-serif-medium"), iV0, length3);
        c(spannableString2, new ForegroundColorSpan(iC), iV0, length3);
        return spannableString2;
    }

    public final /* synthetic */ String b(PaymentMethod.Card card) {
        p013kotlin.jvm.internal.s.k(card, "card");
        String string = this.resources.getString(f30.d0.f63935a0, card.brand.getDisplayName(), card.last4);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Resources resources = context.getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        this(resources, new x2(context));
    }
}
