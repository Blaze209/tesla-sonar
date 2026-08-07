package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/l$h;", "callback", "Ljn0/h0;", "O1", "(Landroidx/recyclerview/widget/l$h;)V", "Lkotlin/Function1;", "Lcom/stripe/android/model/v0;", "Q0", "Lwn0/l;", "getPaymentMethodSelectedCallback$payments_core_release", "()Lwn0/l;", "setPaymentMethodSelectedCallback$payments_core_release", "(Lwn0/l;)V", "paymentMethodSelectedCallback", "R0", "Lcom/stripe/android/model/v0;", "getTappedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/v0;", "setTappedPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/v0;)V", "tappedPaymentMethod", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentMethodsRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private wn0.l<? super PaymentMethod, jn0.h0> paymentMethodSelectedCallback;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private PaymentMethod tappedPaymentMethod;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/view/PaymentMethodsRecyclerView$a", "Landroidx/recyclerview/widget/g;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "viewHolder", "Ljn0/h0;", "onAnimationFinished", "(Landroidx/recyclerview/widget/RecyclerView$g0;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.g {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onAnimationFinished(RecyclerView.g0 viewHolder) {
            p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
            super.onAnimationFinished(viewHolder);
            PaymentMethod tappedPaymentMethod = PaymentMethodsRecyclerView.this.getTappedPaymentMethod();
            if (tappedPaymentMethod != null) {
                PaymentMethodsRecyclerView.this.getPaymentMethodSelectedCallback$payments_core_release().invoke(tappedPaymentMethod);
            }
            PaymentMethodsRecyclerView.this.setTappedPaymentMethod$payments_core_release(null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<PaymentMethod, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54681c = new b();

        b() {
            super(1);
        }

        public final void a(PaymentMethod it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(PaymentMethod paymentMethod) {
            a(paymentMethod);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public final /* synthetic */ void O1(androidx.recyclerview.widget.l.h callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        new androidx.recyclerview.widget.l(callback).m(this);
    }

    public final wn0.l<PaymentMethod, jn0.h0> getPaymentMethodSelectedCallback$payments_core_release() {
        return this.paymentMethodSelectedCallback;
    }

    /* JADX INFO: renamed from: getTappedPaymentMethod$payments_core_release, reason: from getter */
    public final PaymentMethod getTappedPaymentMethod() {
        return this.tappedPaymentMethod;
    }

    public final void setPaymentMethodSelectedCallback$payments_core_release(wn0.l<? super PaymentMethod, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.paymentMethodSelectedCallback = lVar;
    }

    public final void setTappedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        this.tappedPaymentMethod = paymentMethod;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.paymentMethodSelectedCallback = b.f54681c;
        setHasFixedSize(false);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new a());
    }
}
