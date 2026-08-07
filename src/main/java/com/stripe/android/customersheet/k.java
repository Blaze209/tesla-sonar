package com.stripe.android.customersheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u70.FormFieldValues;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/stripe/android/customersheet/k;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "Lcom/stripe/android/customersheet/k$a;", "Lcom/stripe/android/customersheet/k$b;", "Lcom/stripe/android/customersheet/k$c;", "Lcom/stripe/android/customersheet/k$d;", "Lcom/stripe/android/customersheet/k$e;", "Lcom/stripe/android/customersheet/k$f;", "Lcom/stripe/android/customersheet/k$g;", "Lcom/stripe/android/customersheet/k$h;", "Lcom/stripe/android/customersheet/k$i;", "Lcom/stripe/android/customersheet/k$j;", "Lcom/stripe/android/customersheet/k$k;", "Lcom/stripe/android/customersheet/k$l;", "Lcom/stripe/android/customersheet/k$m;", "Lcom/stripe/android/customersheet/k$n;", "Lcom/stripe/android/customersheet/k$o;", "Lcom/stripe/android/customersheet/k$p;", "Lcom/stripe/android/customersheet/k$q;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$a;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49812a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$b;", "Lcom/stripe/android/customersheet/k;", "Lt60/g;", "paymentMethod", "<init>", "(Lt60/g;)V", "a", "Lt60/g;", "()Lt60/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SupportedPaymentMethod paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SupportedPaymentMethod paymentMethod) {
            super(null);
            p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SupportedPaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$c;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f49814a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$d;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f49815a = new d();

        private d() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$e;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f49816a = new e();

        private e() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$f;", "Lcom/stripe/android/customersheet/k;", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "bankAccountResult", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V", "a", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "()Lcom/stripe/android/payments/bankaccount/navigation/e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f49817b = com.stripe.android.payments.bankaccount.navigation.e.f52015a;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.payments.bankaccount.navigation.e bankAccountResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.stripe.android.payments.bankaccount.navigation.e bankAccountResult) {
            super(null);
            p013kotlin.jvm.internal.s.k(bankAccountResult, "bankAccountResult");
            this.bankAccountResult = bankAccountResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.stripe.android.payments.bankaccount.navigation.e getBankAccountResult() {
            return this.bankAccountResult;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$g;", "Lcom/stripe/android/customersheet/k;", "Lw70/j$e$d;", "usBankAccount", "<init>", "(Lw70/j$e$d;)V", "a", "Lw70/j$e$d;", "()Lw70/j$e$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final w70.j.e.USBankAccount usBankAccount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w70.j.e.USBankAccount usBankAccount) {
            super(null);
            p013kotlin.jvm.internal.s.k(usBankAccount, "usBankAccount");
            this.usBankAccount = usBankAccount;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w70.j.e.USBankAccount getUsBankAccount() {
            return this.usBankAccount;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$h;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f49820a = new h();

        private h() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$i;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f49821a = new i();

        private i() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$j;", "Lcom/stripe/android/customersheet/k;", "Lx30/c;", AnalyticsAttribute.Error, "<init>", "(Lx30/c;)V", "a", "Lx30/c;", "()Lx30/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final x30.c error;

        public j(x30.c cVar) {
            super(null);
            this.error = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x30.c getError() {
            return this.error;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$k;", "Lcom/stripe/android/customersheet/k;", "Lu70/c;", "formFieldValues", "<init>", "(Lu70/c;)V", "a", "Lu70/c;", "()Lu70/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0808k extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FormFieldValues formFieldValues;

        public C0808k(FormFieldValues formFieldValues) {
            super(null);
            this.formFieldValues = formFieldValues;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FormFieldValues getFormFieldValues() {
            return this.formFieldValues;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$l;", "Lcom/stripe/android/customersheet/k;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f49824b = PaymentMethod.f51534u;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(PaymentMethod paymentMethod) {
            super(null);
            p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$m;", "Lcom/stripe/android/customersheet/k;", "Lw70/j;", "selection", "<init>", "(Lw70/j;)V", "a", "Lw70/j;", "()Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final w70.j selection;

        public m(w70.j jVar) {
            super(null);
            this.selection = jVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w70.j getSelection() {
            return this.selection;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/k$n;", "Lcom/stripe/android/customersheet/k;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f49827b = PaymentMethod.f51534u;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(PaymentMethod paymentMethod) {
            super(null);
            p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/k$o;", "Lcom/stripe/android/customersheet/k;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f49829a = new o();

        private o() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R'\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/k$p;", "Lcom/stripe/android/customersheet/k;", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "callback", "<init>", "(Lwn0/l;)V", "a", "Lwn0/l;", "()Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<PrimaryButton.UIState, PrimaryButton.UIState> callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(wn0.l<? super PrimaryButton.UIState, PrimaryButton.UIState> callback) {
            super(null);
            p013kotlin.jvm.internal.s.k(callback, "callback");
            this.callback = callback;
        }

        public final wn0.l<PrimaryButton.UIState, PrimaryButton.UIState> a() {
            return this.callback;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/k$q;", "Lcom/stripe/android/customersheet/k;", "Lx30/c;", "mandateText", "", "showAbovePrimaryButton", "<init>", "(Lx30/c;Z)V", "a", "Lx30/c;", "()Lx30/c;", "b", "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean showAbovePrimaryButton;

        public q(x30.c cVar, boolean z11) {
            super(null);
            this.mandateText = cVar;
            this.showAbovePrimaryButton = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x30.c getMandateText() {
            return this.mandateText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShowAbovePrimaryButton() {
            return this.showAbovePrimaryButton;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
