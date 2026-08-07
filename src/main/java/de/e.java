package de;

import com.adyen.checkout.components.core.action.Action;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lde/e;", "", "<init>", "()V", "", "", "a", "()Ljava/util/List;", "b", "Lde/e$a;", "Lde/e$b;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lde/e$a;", "Lde/e;", "", "", "paymentMethodList", "Ljava/util/List;", "b", "()Ljava/util/List;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {
        public final List<String> b() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: de.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lde/e$b;", "Lde/e;", "", Action.PAYMENT_METHOD_TYPE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentComponent extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentMethodType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentComponent(String paymentMethodType) {
            super(null);
            s.k(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentComponent) && s.f(this.paymentMethodType, ((PaymentComponent) other).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "PaymentComponent(paymentMethodType=" + this.paymentMethodType + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final List<String> a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof PaymentComponent) {
            return v.e(((PaymentComponent) this).getPaymentMethodType());
        }
        throw new NoWhenBranchMatchedException();
    }

    private e() {
    }
}
