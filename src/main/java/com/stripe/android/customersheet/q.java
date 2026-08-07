package com.stripe.android.customersheet;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w70.PaymentOption;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/customersheet/q;", "", "Lw70/g;", "paymentOption", "<init>", "(Lw70/g;)V", "a", "Lw70/g;", "getPaymentOption", "()Lw70/g;", "b", "Lcom/stripe/android/customersheet/q$a;", "Lcom/stripe/android/customersheet/q$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentOption paymentOption;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/q$a;", "Lcom/stripe/android/customersheet/q;", "Lw70/g;", "paymentOption", "<init>", "(Lw70/g;)V", "b", "Lw70/g;", "a", "()Lw70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentOption paymentOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentOption paymentOption) {
            super(paymentOption, null);
            p013kotlin.jvm.internal.s.k(paymentOption, "paymentOption");
            this.paymentOption = paymentOption;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public PaymentOption getPaymentOption() {
            return this.paymentOption;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/customersheet/q$b;", "Lcom/stripe/android/customersheet/q;", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lw70/g;", "paymentOption", "<init>", "(Lcom/stripe/android/model/v0;Lw70/g;)V", "b", "Lcom/stripe/android/model/v0;", "a", "()Lcom/stripe/android/model/v0;", "c", "Lw70/g;", "()Lw70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod paymentMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final PaymentOption paymentOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PaymentMethod paymentMethod, PaymentOption paymentOption) {
            super(paymentOption, null);
            p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
            p013kotlin.jvm.internal.s.k(paymentOption, "paymentOption");
            this.paymentMethod = paymentMethod;
            this.paymentOption = paymentOption;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public PaymentOption getPaymentOption() {
            return this.paymentOption;
        }
    }

    public /* synthetic */ q(PaymentOption gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar);
    }

    private q(PaymentOption gVar) {
        this.paymentOption = gVar;
    }
}
