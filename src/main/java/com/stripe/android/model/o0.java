package com.stripe.android.model;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/n0;", "", "a", "(Lcom/stripe/android/model/n0;)Ljava/lang/String;", "analyticsValue", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51414a;

        static {
            int[] iArr = new int[n0.values().length];
            try {
                iArr[n0.Passthrough.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.LinkPaymentMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.LinkCardBrand.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51414a = iArr;
        }
    }

    public static final String a(n0 n0Var) {
        p013kotlin.jvm.internal.s.k(n0Var, "<this>");
        int i11 = a.f51414a[n0Var.ordinal()];
        if (i11 == 1) {
            return "passthrough";
        }
        if (i11 == 2) {
            return "payment_method_mode";
        }
        if (i11 == 3) {
            return "link_card_brand";
        }
        throw new NoWhenBranchMatchedException();
    }
}
