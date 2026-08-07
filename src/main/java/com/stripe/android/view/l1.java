package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aBQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lcom/stripe/android/view/l1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/view/k2;", "adapter", "Lcom/stripe/android/view/y;", "cardDisplayTextFactory", "Ljn0/s;", "Lf30/f;", "customerSession", "", "", "productUsage", "Lkotlin/Function1;", "Lcom/stripe/android/model/v0;", "Ljn0/h0;", "onDeletedPaymentMethodCallback", "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/k2;Lcom/stripe/android/view/y;Ljava/lang/Object;Ljava/util/Set;Lwn0/l;)V", "paymentMethod", "Landroidx/appcompat/app/b;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/v0;)Landroidx/appcompat/app/b;", "h", "(Lcom/stripe/android/model/v0;)V", "a", "Landroid/content/Context;", "b", "Lcom/stripe/android/view/k2;", "c", "Lcom/stripe/android/view/y;", "Ljava/lang/Object;", "e", "Ljava/util/Set;", "f", "Lwn0/l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k2 adapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y cardDisplayTextFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object customerSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<PaymentMethod, jn0.h0> onDeletedPaymentMethodCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/view/l1$a;", "Lf30/f$c;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements f30.f.c {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l1(Context context, k2 adapter, y cardDisplayTextFactory, Object obj, Set<String> productUsage, wn0.l<? super PaymentMethod, jn0.h0> onDeletedPaymentMethodCallback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(adapter, "adapter");
        p013kotlin.jvm.internal.s.k(cardDisplayTextFactory, "cardDisplayTextFactory");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        p013kotlin.jvm.internal.s.k(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.context = context;
        this.adapter = adapter;
        this.cardDisplayTextFactory = cardDisplayTextFactory;
        this.customerSession = obj;
        this.productUsage = productUsage;
        this.onDeletedPaymentMethodCallback = onDeletedPaymentMethodCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(l1 this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(paymentMethod, "$paymentMethod");
        this$0.h(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(l1 this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(paymentMethod, "$paymentMethod");
        this$0.adapter.x(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(l1 this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(paymentMethod, "$paymentMethod");
        this$0.adapter.x(paymentMethod);
    }

    public final /* synthetic */ androidx.appcompat.app.b d(final PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        androidx.appcompat.app.b bVarCreate = new androidx.appcompat.app.b.a(this.context, f30.e0.f63987a).m(f30.d0.f63951i0).f(card != null ? this.cardDisplayTextFactory.b(card) : null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                l1.e(this.f54920a, paymentMethod, dialogInterface, i11);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.j1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                l1.f(this.f54947a, paymentMethod, dialogInterface, i11);
            }
        }).i(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.k1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                l1.g(this.f54952a, paymentMethod, dialogInterface);
            }
        }).create();
        p013kotlin.jvm.internal.s.j(bVarCreate, "create(...)");
        return bVarCreate;
    }

    public final /* synthetic */ void h(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        this.adapter.k(paymentMethod);
        String str = paymentMethod.id;
        if (str != null) {
            Object obj = this.customerSession;
            if (jn0.s.g(obj)) {
                obj = null;
            }
            f30.f fVar = (f30.f) obj;
            if (fVar != null) {
                fVar.c(str, this.productUsage, new a());
            }
        }
        this.onDeletedPaymentMethodCallback.invoke(paymentMethod);
    }
}
