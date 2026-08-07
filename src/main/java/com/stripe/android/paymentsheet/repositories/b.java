package com.stripe.android.paymentsheet.repositories;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0019J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J@\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/b;", "", "Lcom/stripe/android/paymentsheet/repositories/b$a;", "customerInfo", "Lcom/stripe/android/model/a0;", "e", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/stripe/android/model/v0$p;", "types", "", "silentlyFail", "Ljn0/s;", "Lcom/stripe/android/model/v0;", "c", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentMethodId", "canRemoveDuplicates", "b", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/a1;", "params", "a", "(Lcom/stripe/android/paymentsheet/repositories/b$a;Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.repositories.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/b$a;", "", "", "id", "ephemeralKeySecret", "customerSessionClientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CustomerInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ephemeralKeySecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerSessionClientSecret;

        public CustomerInfo(String id2, String ephemeralKeySecret, String str) {
            s.k(id2, "id");
            s.k(ephemeralKeySecret, "ephemeralKeySecret");
            this.id = id2;
            this.ephemeralKeySecret = ephemeralKeySecret;
            this.customerSessionClientSecret = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return s.f(this.id, customerInfo.id) && s.f(this.ephemeralKeySecret, customerInfo.ephemeralKeySecret) && s.f(this.customerSessionClientSecret, customerInfo.customerSessionClientSecret);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31;
            String str = this.customerSessionClientSecret;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CustomerInfo(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
        }
    }

    Object a(CustomerInfo customerInfo, String str, a1 a1Var, Continuation<? super jn0.s<PaymentMethod>> continuation);

    Object b(CustomerInfo customerInfo, String str, boolean z11, Continuation<? super jn0.s<PaymentMethod>> continuation);

    Object c(CustomerInfo customerInfo, List<? extends PaymentMethod.p> list, boolean z11, Continuation<? super jn0.s<? extends List<PaymentMethod>>> continuation);

    Object d(CustomerInfo customerInfo, String str, Continuation<? super jn0.s<PaymentMethod>> continuation);

    Object e(CustomerInfo customerInfo, Continuation<? super Customer> continuation);
}
