package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/stripe/android/view/d;", "Lcom/stripe/android/view/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lcom/stripe/android/view/t;", "billingAddressFields", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/stripe/android/view/t;)V", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "activity", "Ljn0/h0;", "a", "(Lcom/stripe/android/view/AddPaymentMethodActivity;)V", "", "communicating", "setCommunicatingProgress", "(Z)V", "Lcom/stripe/android/view/f0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCardInputListener", "(Lcom/stripe/android/view/f0;)V", "Lcom/stripe/android/view/t;", "Lcom/stripe/android/view/CardMultilineWidget;", "b", "Lcom/stripe/android/view/CardMultilineWidget;", "cardMultilineWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "c", "Lcom/stripe/android/view/ShippingInfoWidget;", "billingAddressWidget", "Lcom/stripe/android/model/v0$e;", "getBillingDetails", "()Lcom/stripe/android/model/v0$e;", "billingDetails", "Lcom/stripe/android/model/w0;", "getCreateParams", "()Lcom/stripe/android/model/w0;", "createParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t billingAddressFields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CardMultilineWidget cardMultilineWidget;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ShippingInfoWidget billingAddressWidget;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/view/d$a;", "Landroid/widget/TextView$OnEditorActionListener;", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "activity", "Lcom/stripe/android/view/d;", "addPaymentMethodCardView", "Lcom/stripe/android/view/q1;", "keyboardController", "<init>", "(Lcom/stripe/android/view/AddPaymentMethodActivity;Lcom/stripe/android/view/d;Lcom/stripe/android/view/q1;)V", "Landroid/widget/TextView;", "v", "", "actionId", "Landroid/view/KeyEvent;", "event", "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "a", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "b", "Lcom/stripe/android/view/d;", "c", "Lcom/stripe/android/view/q1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AddPaymentMethodActivity activity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d addPaymentMethodCardView;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1 keyboardController;

        public a(AddPaymentMethodActivity activity, d addPaymentMethodCardView, q1 keyboardController) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            p013kotlin.jvm.internal.s.k(addPaymentMethodCardView, "addPaymentMethodCardView");
            p013kotlin.jvm.internal.s.k(keyboardController, "keyboardController");
            this.activity = activity;
            this.addPaymentMethodCardView = addPaymentMethodCardView;
            this.keyboardController = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v11, int actionId, KeyEvent event) {
            if (actionId != 6) {
                return false;
            }
            if (this.addPaymentMethodCardView.getCreateParams() != null) {
                this.keyboardController.a();
            }
            this.activity.t();
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54837a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.PostalCode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54837a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, null, 0, null, 14, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void a(AddPaymentMethodActivity activity) {
        a aVar = new a(activity, this, new q1(activity));
        this.cardMultilineWidget.getCardNumberEditText().setOnEditorActionListener(aVar);
        this.cardMultilineWidget.getExpiryDateEditText().setOnEditorActionListener(aVar);
        this.cardMultilineWidget.getCvcEditText().setOnEditorActionListener(aVar);
        this.cardMultilineWidget.getPostalCodeEditText().setOnEditorActionListener(aVar);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        ShippingInformation shippingInformation;
        if (this.billingAddressFields != t.Full || (shippingInformation = this.billingAddressWidget.getShippingInformation()) == null) {
            return null;
        }
        return PaymentMethod.BillingDetails.INSTANCE.a(shippingInformation);
    }

    @Override // com.stripe.android.view.i
    public PaymentMethodCreateParams getCreateParams() {
        int i11 = b.f54837a[this.billingAddressFields.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return this.cardMultilineWidget.getPaymentMethodCreateParams();
            }
            if (i11 == 3) {
                return this.cardMultilineWidget.getPaymentMethodCreateParams();
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethodCreateParams.Card paymentMethodCard = this.cardMultilineWidget.getPaymentMethodCard();
        PaymentMethod.BillingDetails billingDetails = getBillingDetails();
        if (paymentMethodCard == null || billingDetails == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.j(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, billingDetails, null, null, 12, null);
    }

    public final void setCardInputListener(f0 listener) {
        this.cardMultilineWidget.setCardInputListener(listener);
    }

    @Override // com.stripe.android.view.i
    public void setCommunicatingProgress(boolean communicating) {
        this.cardMultilineWidget.setEnabled(!communicating);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i11, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? t.PostalCode : tVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i11, t billingAddressFields) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(billingAddressFields, "billingAddressFields");
        this.billingAddressFields = billingAddressFields;
        h40.d dVarC = h40.d.c(LayoutInflater.from(context), this, true);
        p013kotlin.jvm.internal.s.j(dVarC, "inflate(...)");
        CardMultilineWidget cardMultilineWidget = dVarC.f70668d;
        p013kotlin.jvm.internal.s.j(cardMultilineWidget, "cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == t.PostalCode);
        ShippingInfoWidget billingAddressWidget = dVarC.f70667c;
        p013kotlin.jvm.internal.s.j(billingAddressWidget, "billingAddressWidget");
        this.billingAddressWidget = billingAddressWidget;
        if (billingAddressFields == t.Full) {
            billingAddressWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity != null) {
            a(addPaymentMethodActivity);
        }
    }
}
