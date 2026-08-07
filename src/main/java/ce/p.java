package ce;

import be.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u00020\u0004:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lce/p;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lce/p$a;", "Lce/p$b;", "Lce/p$c;", "Lce/p$d;", "Lce/p$e;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class p<ComponentStateT extends be.h<? extends PaymentMethodDetails>> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lce/p$a;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lce/p;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "data", "<init>", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "a", "Lcom/adyen/checkout/components/core/ActionComponentData;", "()Lcom/adyen/checkout/components/core/ActionComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<ComponentStateT extends be.h<? extends PaymentMethodDetails>> extends p<ComponentStateT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActionComponentData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActionComponentData data) {
            super(null);
            p013kotlin.jvm.internal.s.k(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionComponentData getData() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lce/p$b;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lce/p;", "Lbe/g;", AnalyticsAttribute.Error, "<init>", "(Lbe/g;)V", "a", "Lbe/g;", "()Lbe/g;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<ComponentStateT extends be.h<? extends PaymentMethodDetails>> extends p<ComponentStateT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final be.g error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(be.g error) {
            super(null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final be.g getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lce/p$c;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lce/p;", "", "requiredPermission", "Lme/d;", "permissionCallback", "<init>", "(Ljava/lang/String;Lme/d;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lme/d;", "()Lme/d;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<ComponentStateT extends be.h<? extends PaymentMethodDetails>> extends p<ComponentStateT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String requiredPermission;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final me.d permissionCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String requiredPermission, me.d permissionCallback) {
            super(null);
            p013kotlin.jvm.internal.s.k(requiredPermission, "requiredPermission");
            p013kotlin.jvm.internal.s.k(permissionCallback, "permissionCallback");
            this.requiredPermission = requiredPermission;
            this.permissionCallback = permissionCallback;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final me.d getPermissionCallback() {
            return this.permissionCallback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequiredPermission() {
            return this.requiredPermission;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lce/p$d;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lce/p;", "state", "<init>", "(Lbe/h;)V", "a", "Lbe/h;", "()Lbe/h;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d<ComponentStateT extends be.h<? extends PaymentMethodDetails>> extends p<ComponentStateT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ComponentStateT state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentStateT state) {
            super(null);
            p013kotlin.jvm.internal.s.k(state, "state");
            this.state = state;
        }

        public final ComponentStateT a() {
            return this.state;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lce/p$e;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lce/p;", "state", "<init>", "(Lbe/h;)V", "a", "Lbe/h;", "()Lbe/h;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e<ComponentStateT extends be.h<? extends PaymentMethodDetails>> extends p<ComponentStateT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ComponentStateT state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentStateT state) {
            super(null);
            p013kotlin.jvm.internal.s.k(state, "state");
            this.state = state;
        }

        public final ComponentStateT a() {
            return this.state;
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private p() {
    }
}
