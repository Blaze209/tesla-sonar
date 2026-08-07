package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getIssuerImageView$3ds2sdk_release", "()Landroid/widget/ImageView;", "issuerImageView", "b", "getPaymentSystemImageView$3ds2sdk_release", "paymentSystemImageView", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BrandZoneView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageView issuerImageView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageView paymentSystemImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: renamed from: getIssuerImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getIssuerImageView() {
        return this.issuerImageView;
    }

    /* JADX INFO: renamed from: getPaymentSystemImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getPaymentSystemImageView() {
        return this.paymentSystemImageView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        o80.a aVarB = o80.a.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(aVarB, "inflate(...)");
        ImageView issuerImage = aVarB.f96844b;
        p013kotlin.jvm.internal.s.j(issuerImage, "issuerImage");
        this.issuerImageView = issuerImage;
        ImageView paymentSystemImage = aVarB.f96845c;
        p013kotlin.jvm.internal.s.j(paymentSystemImage, "paymentSystemImage");
        this.paymentSystemImageView = paymentSystemImage;
    }
}
