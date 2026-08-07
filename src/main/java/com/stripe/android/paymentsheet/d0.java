package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a!\u0010\b\u001a\u00020\u0001*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/c0;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/c0;)Z", "c", "a", "Lkotlin/Function0;", "extraRequirements", "b", "(Lcom/stripe/android/paymentsheet/c0;Lwn0/a;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var) {
            super(0);
            this.f52799c = c0Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f52799c.getConfig().getPaymentMethodLayout() == y.o.Horizontal);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0 c0Var) {
            super(0);
            this.f52800c = c0Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((this.f52800c.getConfig().getPaymentMethodLayout() == y.o.Horizontal || (this.f52800c.getNavigationHandler().f().getValue() instanceof x70.c.d)) ? false : true);
        }
    }

    public static final boolean a(c0 c0Var) {
        p013kotlin.jvm.internal.s.k(c0Var, "<this>");
        r70.a cvcRecollectionHandler = c0Var.getCvcRecollectionHandler();
        PaymentMethodMetadata value = c0Var.x().getValue();
        return cvcRecollectionHandler.b(value != null ? value.getStripeIntent() : null, c0Var.getArgs().getInitializationMode());
    }

    private static final boolean b(c0 c0Var, wn0.a<Boolean> aVar) {
        r70.a cvcRecollectionHandler = c0Var.getCvcRecollectionHandler();
        PaymentMethodMetadata value = c0Var.x().getValue();
        return cvcRecollectionHandler.c(value != null ? value.getStripeIntent() : null, c0Var.C().getValue(), c0Var.getArgs().getInitializationMode(), aVar);
    }

    public static final boolean c(c0 c0Var) {
        p013kotlin.jvm.internal.s.k(c0Var, "<this>");
        return b(c0Var, new a(c0Var));
    }

    public static final boolean d(c0 c0Var) {
        p013kotlin.jvm.internal.s.k(c0Var, "<this>");
        return b(c0Var, new b(c0Var));
    }
}
