package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.x0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u000b\u000eJ\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/m;", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "getType", "Lcom/stripe/android/model/w0;", "c", "()Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/x0;", "a", "()Lcom/stripe/android/model/x0;", "Lw70/j;", "b", "()Lw70/j;", "paymentSelection", "Lcom/stripe/android/paymentsheet/m$a;", "Lcom/stripe/android/paymentsheet/m$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/m$a;", "Lcom/stripe/android/paymentsheet/m;", "Lw70/j$b;", "paymentSelection", "<init>", "(Lw70/j$b;)V", "", "Lcom/stripe/android/model/PaymentMethodCode;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "getType", "Lcom/stripe/android/model/w0;", "c", "()Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/x0;", "a", "()Lcom/stripe/android/model/x0;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw70/j$b;", "e", "()Lw70/j$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class External implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j.ExternalPaymentMethod paymentSelection;

        public External(w70.j.ExternalPaymentMethod paymentSelection) {
            p013kotlin.jvm.internal.s.k(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.m
        public x0 a() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.m
        public PaymentMethodCreateParams c() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.m
        public String d() {
            return b().getType();
        }

        @Override // com.stripe.android.paymentsheet.m
        /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
        public w70.j.ExternalPaymentMethod b() {
            return this.paymentSelection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof External) && p013kotlin.jvm.internal.s.f(this.paymentSelection, ((External) other).paymentSelection);
        }

        @Override // com.stripe.android.paymentsheet.m
        public String getType() {
            return b().getType();
        }

        public int hashCode() {
            return this.paymentSelection.hashCode();
        }

        public String toString() {
            return "External(paymentSelection=" + this.paymentSelection + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.m$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/m$b;", "Lcom/stripe/android/paymentsheet/m;", "Lw70/j$e;", "paymentSelection", "<init>", "(Lw70/j$e;)V", "", "Lcom/stripe/android/model/PaymentMethodCode;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "getType", "Lcom/stripe/android/model/w0;", "c", "()Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/x0;", "a", "()Lcom/stripe/android/model/x0;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw70/j$e;", "e", "()Lw70/j$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class New implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j.e paymentSelection;

        public New(w70.j.e paymentSelection) {
            p013kotlin.jvm.internal.s.k(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.m
        public x0 a() {
            return b().getPaymentMethodExtraParams();
        }

        @Override // com.stripe.android.paymentsheet.m
        public PaymentMethodCreateParams c() {
            return b().getPaymentMethodCreateParams();
        }

        @Override // com.stripe.android.paymentsheet.m
        public String d() {
            w70.j.e eVarB = b();
            if (eVarB instanceof w70.j.e.LinkInline) {
                return PaymentMethod.p.Card.code;
            }
            if (eVarB instanceof w70.j.e.Card ? true : eVarB instanceof w70.j.e.USBankAccount ? true : eVarB instanceof w70.j.e.GenericPaymentMethod) {
                return b().getPaymentMethodCreateParams().i();
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.stripe.android.paymentsheet.m
        /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
        public w70.j.e b() {
            return this.paymentSelection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof New) && p013kotlin.jvm.internal.s.f(this.paymentSelection, ((New) other).paymentSelection);
        }

        @Override // com.stripe.android.paymentsheet.m
        public String getType() {
            return b().getPaymentMethodCreateParams().i();
        }

        public int hashCode() {
            return this.paymentSelection.hashCode();
        }

        public String toString() {
            return "New(paymentSelection=" + this.paymentSelection + ")";
        }
    }

    x0 a();

    w70.j b();

    PaymentMethodCreateParams c();

    String d();

    String getType();
}
