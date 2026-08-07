package com.stripe.android.customersheet;

import a40.CustomerPermissions;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import p013kotlin.Metadata;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;

/* JADX INFO: renamed from: com.stripe.android.customersheet.j, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100¨\u00061"}, d2 = {"Lcom/stripe/android/customersheet/j;", "", "Lcom/stripe/android/customersheet/d$c;", "config", "Lu60/e;", "paymentMethodMetadata", "", "Lcom/stripe/android/model/v0;", "customerPaymentMethods", "La40/b;", "customerPermissions", "Lt60/g;", "supportedPaymentMethods", "Lw70/j;", "paymentSelection", "", "validationError", "<init>", "(Lcom/stripe/android/customersheet/d$c;Lu60/e;Ljava/util/List;La40/b;Ljava/util/List;Lw70/j;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/customersheet/d$c;", "getConfig", "()Lcom/stripe/android/customersheet/d$c;", "b", "Lu60/e;", "c", "()Lu60/e;", "Ljava/util/List;", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "La40/b;", "()La40/b;", "e", "f", "Lw70/j;", "()Lw70/j;", "g", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Full {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d.Configuration config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethodMetadata paymentMethodMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentMethod> customerPaymentMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerPermissions customerPermissions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SupportedPaymentMethod> supportedPaymentMethods;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final w70.j paymentSelection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable validationError;

    public Full(d.Configuration config, PaymentMethodMetadata paymentMethodMetadata, List<PaymentMethod> customerPaymentMethods, CustomerPermissions customerPermissions, List<SupportedPaymentMethod> supportedPaymentMethods, w70.j jVar, Throwable th2) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(customerPaymentMethods, "customerPaymentMethods");
        p013kotlin.jvm.internal.s.k(customerPermissions, "customerPermissions");
        p013kotlin.jvm.internal.s.k(supportedPaymentMethods, "supportedPaymentMethods");
        this.config = config;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.customerPaymentMethods = customerPaymentMethods;
        this.customerPermissions = customerPermissions;
        this.supportedPaymentMethods = supportedPaymentMethods;
        this.paymentSelection = jVar;
        this.validationError = th2;
    }

    public final List<PaymentMethod> a() {
        return this.customerPaymentMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CustomerPermissions getCustomerPermissions() {
        return this.customerPermissions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PaymentMethodMetadata getPaymentMethodMetadata() {
        return this.paymentMethodMetadata;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w70.j getPaymentSelection() {
        return this.paymentSelection;
    }

    public final List<SupportedPaymentMethod> e() {
        return this.supportedPaymentMethods;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Full)) {
            return false;
        }
        Full full = (Full) other;
        return p013kotlin.jvm.internal.s.f(this.config, full.config) && p013kotlin.jvm.internal.s.f(this.paymentMethodMetadata, full.paymentMethodMetadata) && p013kotlin.jvm.internal.s.f(this.customerPaymentMethods, full.customerPaymentMethods) && p013kotlin.jvm.internal.s.f(this.customerPermissions, full.customerPermissions) && p013kotlin.jvm.internal.s.f(this.supportedPaymentMethods, full.supportedPaymentMethods) && p013kotlin.jvm.internal.s.f(this.paymentSelection, full.paymentSelection) && p013kotlin.jvm.internal.s.f(this.validationError, full.validationError);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Throwable getValidationError() {
        return this.validationError;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.config.hashCode() * 31) + this.paymentMethodMetadata.hashCode()) * 31) + this.customerPaymentMethods.hashCode()) * 31) + this.customerPermissions.hashCode()) * 31) + this.supportedPaymentMethods.hashCode()) * 31;
        w70.j jVar = this.paymentSelection;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Throwable th2 = this.validationError;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "Full(config=" + this.config + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ", customerPaymentMethods=" + this.customerPaymentMethods + ", customerPermissions=" + this.customerPermissions + ", supportedPaymentMethods=" + this.supportedPaymentMethods + ", paymentSelection=" + this.paymentSelection + ", validationError=" + this.validationError + ")";
    }
}
