package com.stripe.android.payments.bankaccount.ui;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.payments.bankaccount.navigation.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/a;", "", "<init>", "()V", "a", "b", "Lcom/stripe/android/payments/bankaccount/ui/a$a;", "Lcom/stripe/android/payments/bankaccount/ui/a$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.ui.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/a$a;", "Lcom/stripe/android/payments/bankaccount/ui/a;", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "result", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "()Lcom/stripe/android/payments/bankaccount/navigation/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishWithResult extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(e result) {
            super(null);
            s.k(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishWithResult) && s.f(this.result, ((FinishWithResult) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.ui.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/a$b;", "Lcom/stripe/android/payments/bankaccount/ui/a;", "", "publishableKey", "financialConnectionsSessionSecret", "stripeAccountId", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/a$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenConnectionsFlow extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f52033e = com.stripe.android.financialconnections.a.ElementsSessionContext.f50140e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publishableKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String financialConnectionsSessionSecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stripeAccountId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenConnectionsFlow(String publishableKey, String financialConnectionsSessionSecret, String str, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
            super(null);
            s.k(publishableKey, "publishableKey");
            s.k(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.publishableKey = publishableKey;
            this.financialConnectionsSessionSecret = financialConnectionsSessionSecret;
            this.stripeAccountId = str;
            this.elementsSessionContext = elementsSessionContext;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenConnectionsFlow)) {
                return false;
            }
            OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) other;
            return s.f(this.publishableKey, openConnectionsFlow.publishableKey) && s.f(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret) && s.f(this.stripeAccountId, openConnectionsFlow.stripeAccountId) && s.f(this.elementsSessionContext, openConnectionsFlow.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = ((this.publishableKey.hashCode() * 31) + this.financialConnectionsSessionSecret.hashCode()) * 31;
            String str = this.stripeAccountId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.publishableKey + ", financialConnectionsSessionSecret=" + this.financialConnectionsSessionSecret + ", stripeAccountId=" + this.stripeAccountId + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
