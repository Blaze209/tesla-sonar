package com.stripe.android.customersheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import java.util.List;
import jn0.h0;
import n70.x;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p008h80.PaymentSheetTopBarState;
import p008h80.t;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u70.FormFieldValues;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0012\u0015\u0010\fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/customersheet/n;", "", "", "isLiveMode", "isProcessing", "canNavigateBack", "<init>", "(ZZZ)V", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "Lh80/g0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lh80/g0;", "Ll70/d;", "isFinancialConnectionsAvailable", "c", "(Ll70/d;)Z", "a", "Z", "()Z", "b", "Lcom/stripe/android/customersheet/n$a;", "Lcom/stripe/android/customersheet/n$b;", "Lcom/stripe/android/customersheet/n$c;", "Lcom/stripe/android/customersheet/n$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isProcessing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canNavigateBack;

    /* JADX INFO: renamed from: com.stripe.android.customersheet.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b*\u0010+Jô\u0001\u0010,\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b8\u0010/R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010OR\u001a\u0010\u0014\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010OR\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010N\u001a\u0004\bR\u0010OR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bA\u0010S\u001a\u0004\bP\u0010TR\u0017\u0010\u0018\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010N\u001a\u0004\b\u0018\u0010OR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010TR\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u0010N\u001a\u0004\bW\u0010OR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bB\u0010YR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bU\u0010TR\u0017\u0010\u001e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bZ\u0010N\u001a\u0004\bZ\u0010OR\u0017\u0010\u001f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010N\u001a\u0004\bF\u0010OR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b@\u0010\\R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bQ\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lcom/stripe/android/customersheet/n$a;", "Lcom/stripe/android/customersheet/n;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "", "Lt60/g;", "supportedPaymentMethods", "Lu70/c;", "formFieldValues", "Li90/d0;", "formElements", "Ly70/a;", "formArguments", "Lz70/d;", "usBankAccountFormArguments", "Lw70/j;", "draftPaymentSelection", "", "enabled", "isLiveMode", "isProcessing", "Lx30/c;", "errorMessage", "isFirstPaymentMethod", "primaryButtonLabel", "primaryButtonEnabled", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "customPrimaryButtonUiState", "mandateText", "showMandateAbovePrimaryButton", "displayDismissConfirmationModal", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "bankAccountResult", "Lh70/h;", "errorReporter", "<init>", "(Ljava/lang/String;Ljava/util/List;Lu70/c;Ljava/util/List;Ly70/a;Lz70/d;Lw70/j;ZZZLx30/c;ZLx30/c;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$b;Lx30/c;ZZLcom/stripe/android/payments/bankaccount/navigation/e;Lh70/h;)V", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "Lh80/g0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lh80/g0;", "e", "(Ljava/lang/String;Ljava/util/List;Lu70/c;Ljava/util/List;Ly70/a;Lz70/d;Lw70/j;ZZZLx30/c;ZLx30/c;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$b;Lx30/c;ZZLcom/stripe/android/payments/bankaccount/navigation/e;Lh70/h;)Lcom/stripe/android/customersheet/n$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "q", "Ljava/util/List;", "u", "()Ljava/util/List;", "f", "Lu70/c;", "o", "()Lu70/c;", "g", "n", "h", "Ly70/a;", "m", "()Ly70/a;", IntegerTokenConverter.CONVERTER_KEY, "Lz70/d;", "v", "()Lz70/d;", "j", "Lw70/j;", "()Lw70/j;", "k", "Z", "()Z", "l", "w", "b", "Lx30/c;", "()Lx30/c;", "p", "s", "r", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "t", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "()Lcom/stripe/android/payments/bankaccount/navigation/e;", "Lh70/h;", "getErrorReporter", "()Lh70/h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethod extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentMethodCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SupportedPaymentMethod> supportedPaymentMethods;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormFieldValues formFieldValues;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> formElements;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormArguments formArguments;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final p027z70.d usBankAccountFormArguments;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j draftPaymentSelection;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLiveMode;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c errorMessage;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFirstPaymentMethod;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c primaryButtonLabel;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean primaryButtonEnabled;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrimaryButton.UIState customPrimaryButtonUiState;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showMandateAbovePrimaryButton;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displayDismissConfirmationModal;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.payments.bankaccount.navigation.e bankAccountResult;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final h70.h errorReporter;

        public /* synthetic */ AddPaymentMethod(String str, List list, FormFieldValues formFieldValues, List list2, FormArguments formArguments, p027z70.d dVar, w70.j jVar, boolean z11, boolean z12, boolean z13, x30.c cVar, boolean z14, x30.c cVar2, boolean z15, PrimaryButton.UIState uIState, x30.c cVar3, boolean z16, boolean z17, com.stripe.android.payments.bankaccount.navigation.e eVar, h70.h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, formFieldValues, list2, formArguments, dVar, jVar, z11, z12, z13, (i11 & 1024) != 0 ? null : cVar, z14, cVar2, z15, uIState, (32768 & i11) != 0 ? null : cVar3, (65536 & i11) != 0 ? false : z16, (i11 & 131072) != 0 ? false : z17, eVar, hVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddPaymentMethod f(AddPaymentMethod addPaymentMethod, String str, List list, FormFieldValues formFieldValues, List list2, FormArguments formArguments, p027z70.d dVar, w70.j jVar, boolean z11, boolean z12, boolean z13, x30.c cVar, boolean z14, x30.c cVar2, boolean z15, PrimaryButton.UIState uIState, x30.c cVar3, boolean z16, boolean z17, com.stripe.android.payments.bankaccount.navigation.e eVar, h70.h hVar, int i11, Object obj) {
            h70.h hVar2;
            com.stripe.android.payments.bankaccount.navigation.e eVar2;
            String str2 = (i11 & 1) != 0 ? addPaymentMethod.paymentMethodCode : str;
            List list3 = (i11 & 2) != 0 ? addPaymentMethod.supportedPaymentMethods : list;
            FormFieldValues formFieldValues2 = (i11 & 4) != 0 ? addPaymentMethod.formFieldValues : formFieldValues;
            List list4 = (i11 & 8) != 0 ? addPaymentMethod.formElements : list2;
            FormArguments formArguments2 = (i11 & 16) != 0 ? addPaymentMethod.formArguments : formArguments;
            p027z70.d dVar2 = (i11 & 32) != 0 ? addPaymentMethod.usBankAccountFormArguments : dVar;
            w70.j jVar2 = (i11 & 64) != 0 ? addPaymentMethod.draftPaymentSelection : jVar;
            boolean z18 = (i11 & 128) != 0 ? addPaymentMethod.enabled : z11;
            boolean z19 = (i11 & 256) != 0 ? addPaymentMethod.isLiveMode : z12;
            boolean z21 = (i11 & 512) != 0 ? addPaymentMethod.isProcessing : z13;
            x30.c cVar4 = (i11 & 1024) != 0 ? addPaymentMethod.errorMessage : cVar;
            boolean z22 = (i11 & 2048) != 0 ? addPaymentMethod.isFirstPaymentMethod : z14;
            x30.c cVar5 = (i11 & 4096) != 0 ? addPaymentMethod.primaryButtonLabel : cVar2;
            boolean z23 = (i11 & PKIFailureInfo.certRevoked) != 0 ? addPaymentMethod.primaryButtonEnabled : z15;
            String str3 = str2;
            PrimaryButton.UIState uIState2 = (i11 & 16384) != 0 ? addPaymentMethod.customPrimaryButtonUiState : uIState;
            x30.c cVar6 = (i11 & 32768) != 0 ? addPaymentMethod.mandateText : cVar3;
            boolean z24 = (i11 & 65536) != 0 ? addPaymentMethod.showMandateAbovePrimaryButton : z16;
            boolean z25 = (i11 & 131072) != 0 ? addPaymentMethod.displayDismissConfirmationModal : z17;
            com.stripe.android.payments.bankaccount.navigation.e eVar3 = (i11 & 262144) != 0 ? addPaymentMethod.bankAccountResult : eVar;
            if ((i11 & PKIFailureInfo.signerNotTrusted) != 0) {
                eVar2 = eVar3;
                hVar2 = addPaymentMethod.errorReporter;
            } else {
                hVar2 = hVar;
                eVar2 = eVar3;
            }
            return addPaymentMethod.e(str3, list3, formFieldValues2, list4, formArguments2, dVar2, jVar2, z18, z19, z21, cVar4, z22, cVar5, z23, uIState2, cVar6, z24, z25, eVar2, hVar2);
        }

        @Override // com.stripe.android.customersheet.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsProcessing() {
            return this.isProcessing;
        }

        @Override // com.stripe.android.customersheet.n
        public PaymentSheetTopBarState d(wn0.a<h0> onEditIconPressed) {
            p013kotlin.jvm.internal.s.k(onEditIconPressed, "onEditIconPressed");
            return p008h80.h0.f71089a.a(getCanNavigateBack(), getIsLiveMode(), PaymentSheetTopBarState.a.b.f71083a);
        }

        public final AddPaymentMethod e(String paymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormFieldValues formFieldValues, List<? extends d0> formElements, FormArguments formArguments, p027z70.d usBankAccountFormArguments, w70.j draftPaymentSelection, boolean enabled, boolean isLiveMode, boolean isProcessing, x30.c errorMessage, boolean isFirstPaymentMethod, x30.c primaryButtonLabel, boolean primaryButtonEnabled, PrimaryButton.UIState customPrimaryButtonUiState, x30.c mandateText, boolean showMandateAbovePrimaryButton, boolean displayDismissConfirmationModal, com.stripe.android.payments.bankaccount.navigation.e bankAccountResult, h70.h errorReporter) {
            p013kotlin.jvm.internal.s.k(paymentMethodCode, "paymentMethodCode");
            p013kotlin.jvm.internal.s.k(supportedPaymentMethods, "supportedPaymentMethods");
            p013kotlin.jvm.internal.s.k(formElements, "formElements");
            p013kotlin.jvm.internal.s.k(formArguments, "formArguments");
            p013kotlin.jvm.internal.s.k(usBankAccountFormArguments, "usBankAccountFormArguments");
            p013kotlin.jvm.internal.s.k(primaryButtonLabel, "primaryButtonLabel");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            return new AddPaymentMethod(paymentMethodCode, supportedPaymentMethods, formFieldValues, formElements, formArguments, usBankAccountFormArguments, draftPaymentSelection, enabled, isLiveMode, isProcessing, errorMessage, isFirstPaymentMethod, primaryButtonLabel, primaryButtonEnabled, customPrimaryButtonUiState, mandateText, showMandateAbovePrimaryButton, displayDismissConfirmationModal, bankAccountResult, errorReporter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddPaymentMethod)) {
                return false;
            }
            AddPaymentMethod addPaymentMethod = (AddPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.paymentMethodCode, addPaymentMethod.paymentMethodCode) && p013kotlin.jvm.internal.s.f(this.supportedPaymentMethods, addPaymentMethod.supportedPaymentMethods) && p013kotlin.jvm.internal.s.f(this.formFieldValues, addPaymentMethod.formFieldValues) && p013kotlin.jvm.internal.s.f(this.formElements, addPaymentMethod.formElements) && p013kotlin.jvm.internal.s.f(this.formArguments, addPaymentMethod.formArguments) && p013kotlin.jvm.internal.s.f(this.usBankAccountFormArguments, addPaymentMethod.usBankAccountFormArguments) && p013kotlin.jvm.internal.s.f(this.draftPaymentSelection, addPaymentMethod.draftPaymentSelection) && this.enabled == addPaymentMethod.enabled && this.isLiveMode == addPaymentMethod.isLiveMode && this.isProcessing == addPaymentMethod.isProcessing && p013kotlin.jvm.internal.s.f(this.errorMessage, addPaymentMethod.errorMessage) && this.isFirstPaymentMethod == addPaymentMethod.isFirstPaymentMethod && p013kotlin.jvm.internal.s.f(this.primaryButtonLabel, addPaymentMethod.primaryButtonLabel) && this.primaryButtonEnabled == addPaymentMethod.primaryButtonEnabled && p013kotlin.jvm.internal.s.f(this.customPrimaryButtonUiState, addPaymentMethod.customPrimaryButtonUiState) && p013kotlin.jvm.internal.s.f(this.mandateText, addPaymentMethod.mandateText) && this.showMandateAbovePrimaryButton == addPaymentMethod.showMandateAbovePrimaryButton && this.displayDismissConfirmationModal == addPaymentMethod.displayDismissConfirmationModal && p013kotlin.jvm.internal.s.f(this.bankAccountResult, addPaymentMethod.bankAccountResult) && p013kotlin.jvm.internal.s.f(this.errorReporter, addPaymentMethod.errorReporter);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final com.stripe.android.payments.bankaccount.navigation.e getBankAccountResult() {
            return this.bankAccountResult;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final PrimaryButton.UIState getCustomPrimaryButtonUiState() {
            return this.customPrimaryButtonUiState;
        }

        public int hashCode() {
            int iHashCode = ((this.paymentMethodCode.hashCode() * 31) + this.supportedPaymentMethods.hashCode()) * 31;
            FormFieldValues formFieldValues = this.formFieldValues;
            int iHashCode2 = (((((((iHashCode + (formFieldValues == null ? 0 : formFieldValues.hashCode())) * 31) + this.formElements.hashCode()) * 31) + this.formArguments.hashCode()) * 31) + this.usBankAccountFormArguments.hashCode()) * 31;
            w70.j jVar = this.draftPaymentSelection;
            int iHashCode3 = (((((((iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isLiveMode)) * 31) + Boolean.hashCode(this.isProcessing)) * 31;
            x30.c cVar = this.errorMessage;
            int iHashCode4 = (((((((iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isFirstPaymentMethod)) * 31) + this.primaryButtonLabel.hashCode()) * 31) + Boolean.hashCode(this.primaryButtonEnabled)) * 31;
            PrimaryButton.UIState uIState = this.customPrimaryButtonUiState;
            int iHashCode5 = (iHashCode4 + (uIState == null ? 0 : uIState.hashCode())) * 31;
            x30.c cVar2 = this.mandateText;
            int iHashCode6 = (((((iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31) + Boolean.hashCode(this.showMandateAbovePrimaryButton)) * 31) + Boolean.hashCode(this.displayDismissConfirmationModal)) * 31;
            com.stripe.android.payments.bankaccount.navigation.e eVar = this.bankAccountResult;
            return ((iHashCode6 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.errorReporter.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getDisplayDismissConfirmationModal() {
            return this.displayDismissConfirmationModal;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final w70.j getDraftPaymentSelection() {
            return this.draftPaymentSelection;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final x30.c getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final FormArguments getFormArguments() {
            return this.formArguments;
        }

        public final List<d0> n() {
            return this.formElements;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final FormFieldValues getFormFieldValues() {
            return this.formFieldValues;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final x30.c getMandateText() {
            return this.mandateText;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final x30.c getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getShowMandateAbovePrimaryButton() {
            return this.showMandateAbovePrimaryButton;
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.paymentMethodCode + ", supportedPaymentMethods=" + this.supportedPaymentMethods + ", formFieldValues=" + this.formFieldValues + ", formElements=" + this.formElements + ", formArguments=" + this.formArguments + ", usBankAccountFormArguments=" + this.usBankAccountFormArguments + ", draftPaymentSelection=" + this.draftPaymentSelection + ", enabled=" + this.enabled + ", isLiveMode=" + this.isLiveMode + ", isProcessing=" + this.isProcessing + ", errorMessage=" + this.errorMessage + ", isFirstPaymentMethod=" + this.isFirstPaymentMethod + ", primaryButtonLabel=" + this.primaryButtonLabel + ", primaryButtonEnabled=" + this.primaryButtonEnabled + ", customPrimaryButtonUiState=" + this.customPrimaryButtonUiState + ", mandateText=" + this.mandateText + ", showMandateAbovePrimaryButton=" + this.showMandateAbovePrimaryButton + ", displayDismissConfirmationModal=" + this.displayDismissConfirmationModal + ", bankAccountResult=" + this.bankAccountResult + ", errorReporter=" + this.errorReporter + ")";
        }

        public final List<SupportedPaymentMethod> u() {
            return this.supportedPaymentMethods;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final p027z70.d getUsBankAccountFormArguments() {
            return this.usBankAccountFormArguments;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddPaymentMethod(String paymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormFieldValues formFieldValues, List<? extends d0> formElements, FormArguments formArguments, p027z70.d usBankAccountFormArguments, w70.j jVar, boolean z11, boolean z12, boolean z13, x30.c cVar, boolean z14, x30.c primaryButtonLabel, boolean z15, PrimaryButton.UIState uIState, x30.c cVar2, boolean z16, boolean z17, com.stripe.android.payments.bankaccount.navigation.e eVar, h70.h errorReporter) {
            super(z12, z13, !z14, null);
            p013kotlin.jvm.internal.s.k(paymentMethodCode, "paymentMethodCode");
            p013kotlin.jvm.internal.s.k(supportedPaymentMethods, "supportedPaymentMethods");
            p013kotlin.jvm.internal.s.k(formElements, "formElements");
            p013kotlin.jvm.internal.s.k(formArguments, "formArguments");
            p013kotlin.jvm.internal.s.k(usBankAccountFormArguments, "usBankAccountFormArguments");
            p013kotlin.jvm.internal.s.k(primaryButtonLabel, "primaryButtonLabel");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            this.paymentMethodCode = paymentMethodCode;
            this.supportedPaymentMethods = supportedPaymentMethods;
            this.formFieldValues = formFieldValues;
            this.formElements = formElements;
            this.formArguments = formArguments;
            this.usBankAccountFormArguments = usBankAccountFormArguments;
            this.draftPaymentSelection = jVar;
            this.enabled = z11;
            this.isLiveMode = z12;
            this.isProcessing = z13;
            this.errorMessage = cVar;
            this.isFirstPaymentMethod = z14;
            this.primaryButtonLabel = primaryButtonLabel;
            this.primaryButtonEnabled = z15;
            this.customPrimaryButtonUiState = uIState;
            this.mandateText = cVar2;
            this.showMandateAbovePrimaryButton = z16;
            this.displayDismissConfirmationModal = z17;
            this.bankAccountResult = eVar;
            this.errorReporter = errorReporter;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/customersheet/n$b;", "Lcom/stripe/android/customersheet/n;", "Lh80/t;", "editPaymentMethodInteractor", "", "isLiveMode", "<init>", "(Lh80/t;Z)V", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "Lh80/g0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lh80/g0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lh80/t;", "e", "()Lh80/t;", "Z", "f", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditPaymentMethod extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final t editPaymentMethodInteractor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLiveMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditPaymentMethod(t editPaymentMethodInteractor, boolean z11) {
            super(z11, false, true, null);
            p013kotlin.jvm.internal.s.k(editPaymentMethodInteractor, "editPaymentMethodInteractor");
            this.editPaymentMethodInteractor = editPaymentMethodInteractor;
            this.isLiveMode = z11;
        }

        @Override // com.stripe.android.customersheet.n
        public PaymentSheetTopBarState d(wn0.a<h0> onEditIconPressed) {
            p013kotlin.jvm.internal.s.k(onEditIconPressed, "onEditIconPressed");
            return p008h80.h0.f71089a.a(getCanNavigateBack(), getIsLiveMode(), PaymentSheetTopBarState.a.b.f71083a);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final t getEditPaymentMethodInteractor() {
            return this.editPaymentMethodInteractor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditPaymentMethod)) {
                return false;
            }
            EditPaymentMethod editPaymentMethod = (EditPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.editPaymentMethodInteractor, editPaymentMethod.editPaymentMethodInteractor) && this.isLiveMode == editPaymentMethod.isLiveMode;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public int hashCode() {
            return (this.editPaymentMethodInteractor.hashCode() * 31) + Boolean.hashCode(this.isLiveMode);
        }

        public String toString() {
            return "EditPaymentMethod(editPaymentMethodInteractor=" + this.editPaymentMethodInteractor + ", isLiveMode=" + this.isLiveMode + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.n$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/customersheet/n$c;", "Lcom/stripe/android/customersheet/n;", "", "isLiveMode", "<init>", "(Z)V", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "Lh80/g0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lh80/g0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLiveMode;

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading(boolean z11) {
            boolean z12 = false;
            super(z11, z12, z12, null);
            this.isLiveMode = z11;
        }

        @Override // com.stripe.android.customersheet.n
        public PaymentSheetTopBarState d(wn0.a<h0> onEditIconPressed) {
            p013kotlin.jvm.internal.s.k(onEditIconPressed, "onEditIconPressed");
            return p008h80.h0.f71089a.a(getCanNavigateBack(), getIsLiveMode(), PaymentSheetTopBarState.a.b.f71083a);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.isLiveMode == ((Loading) other).isLiveMode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLiveMode);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.isLiveMode + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.n$d, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b4\u00103R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b9\u00103R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b(\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b,\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b0\u0010=R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b;\u00103R\u0017\u0010>\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b7\u0010=R\u0011\u0010?\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u00103¨\u0006@"}, d2 = {"Lcom/stripe/android/customersheet/n$d;", "Lcom/stripe/android/customersheet/n;", "", "title", "", "Lcom/stripe/android/model/v0;", "savedPaymentMethods", "Lw70/j;", "paymentSelection", "", "isLiveMode", "isProcessing", "isEditing", "isGooglePayEnabled", "primaryButtonVisible", "canEdit", "canRemovePaymentMethods", "errorMessage", "Lx30/c;", "mandateText", "isCbcEligible", "<init>", "(Ljava/lang/String;Ljava/util/List;Lw70/j;ZZZZZZZLjava/lang/String;Lx30/c;Z)V", "Lkotlin/Function0;", "Ljn0/h0;", "onEditIconPressed", "Lh80/g0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)Lh80/g0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "m", "e", "Ljava/util/List;", "l", "()Ljava/util/List;", "f", "Lw70/j;", "h", "()Lw70/j;", "g", "Z", "q", "()Z", "b", IntegerTokenConverter.CONVERTER_KEY, "o", "j", "p", "k", "getCanEdit", "n", "Lx30/c;", "()Lx30/c;", "primaryButtonLabel", "primaryButtonEnabled", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectPaymentMethod extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> savedPaymentMethods;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j paymentSelection;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLiveMode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditing;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isGooglePayEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean primaryButtonVisible;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canEdit;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemovePaymentMethods;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorMessage;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c mandateText;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCbcEligible;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final x30.c primaryButtonLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentMethod(String str, List<PaymentMethod> savedPaymentMethods, w70.j jVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str2, x30.c cVar, boolean z18) {
            super(z11, z12, false, null);
            p013kotlin.jvm.internal.s.k(savedPaymentMethods, "savedPaymentMethods");
            this.title = str;
            this.savedPaymentMethods = savedPaymentMethods;
            this.paymentSelection = jVar;
            this.isLiveMode = z11;
            this.isProcessing = z12;
            this.isEditing = z13;
            this.isGooglePayEnabled = z14;
            this.primaryButtonVisible = z15;
            this.canEdit = z16;
            this.canRemovePaymentMethods = z17;
            this.errorMessage = str2;
            this.mandateText = cVar;
            this.isCbcEligible = z18;
            this.primaryButtonLabel = x30.d.a(x.G);
        }

        @Override // com.stripe.android.customersheet.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsProcessing() {
            return this.isProcessing;
        }

        @Override // com.stripe.android.customersheet.n
        public PaymentSheetTopBarState d(wn0.a<h0> onEditIconPressed) {
            p013kotlin.jvm.internal.s.k(onEditIconPressed, "onEditIconPressed");
            return p008h80.h0.f71089a.a(getCanNavigateBack(), getIsLiveMode(), new PaymentSheetTopBarState.a.Maybe(this.isEditing, this.canEdit, onEditIconPressed));
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectPaymentMethod)) {
                return false;
            }
            SelectPaymentMethod selectPaymentMethod = (SelectPaymentMethod) other;
            return p013kotlin.jvm.internal.s.f(this.title, selectPaymentMethod.title) && p013kotlin.jvm.internal.s.f(this.savedPaymentMethods, selectPaymentMethod.savedPaymentMethods) && p013kotlin.jvm.internal.s.f(this.paymentSelection, selectPaymentMethod.paymentSelection) && this.isLiveMode == selectPaymentMethod.isLiveMode && this.isProcessing == selectPaymentMethod.isProcessing && this.isEditing == selectPaymentMethod.isEditing && this.isGooglePayEnabled == selectPaymentMethod.isGooglePayEnabled && this.primaryButtonVisible == selectPaymentMethod.primaryButtonVisible && this.canEdit == selectPaymentMethod.canEdit && this.canRemovePaymentMethods == selectPaymentMethod.canRemovePaymentMethods && p013kotlin.jvm.internal.s.f(this.errorMessage, selectPaymentMethod.errorMessage) && p013kotlin.jvm.internal.s.f(this.mandateText, selectPaymentMethod.mandateText) && this.isCbcEligible == selectPaymentMethod.isCbcEligible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final x30.c getMandateText() {
            return this.mandateText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final w70.j getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.savedPaymentMethods.hashCode()) * 31;
            w70.j jVar = this.paymentSelection;
            int iHashCode2 = (((((((((((((((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31) + Boolean.hashCode(this.isProcessing)) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.isGooglePayEnabled)) * 31) + Boolean.hashCode(this.primaryButtonVisible)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.canRemovePaymentMethods)) * 31;
            String str2 = this.errorMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            x30.c cVar = this.mandateText;
            return ((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCbcEligible);
        }

        public final boolean i() {
            return !getIsProcessing();
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final x30.c getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getPrimaryButtonVisible() {
            return this.primaryButtonVisible;
        }

        public final List<PaymentMethod> l() {
            return this.savedPaymentMethods;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsGooglePayEnabled() {
            return this.isGooglePayEnabled;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.title + ", savedPaymentMethods=" + this.savedPaymentMethods + ", paymentSelection=" + this.paymentSelection + ", isLiveMode=" + this.isLiveMode + ", isProcessing=" + this.isProcessing + ", isEditing=" + this.isEditing + ", isGooglePayEnabled=" + this.isGooglePayEnabled + ", primaryButtonVisible=" + this.primaryButtonVisible + ", canEdit=" + this.canEdit + ", canRemovePaymentMethods=" + this.canRemovePaymentMethods + ", errorMessage=" + this.errorMessage + ", mandateText=" + this.mandateText + ", isCbcEligible=" + this.isCbcEligible + ")";
        }
    }

    public /* synthetic */ n(boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, z13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getCanNavigateBack() {
        return this.canNavigateBack;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsProcessing() {
        return this.isProcessing;
    }

    public final boolean c(l70.d isFinancialConnectionsAvailable) {
        FinancialConnectionsSession financialConnectionsSession;
        p013kotlin.jvm.internal.s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        if (!(this instanceof AddPaymentMethod)) {
            return false;
        }
        AddPaymentMethod addPaymentMethod = (AddPaymentMethod) this;
        if (!p013kotlin.jvm.internal.s.f(addPaymentMethod.getPaymentMethodCode(), PaymentMethod.p.USBankAccount.code) || !isFinancialConnectionsAvailable.invoke() || !(addPaymentMethod.getBankAccountResult() instanceof com.stripe.android.payments.bankaccount.navigation.e.Completed)) {
            return false;
        }
        CollectBankAccountResponseInternal.USBankAccountData usBankAccountData = ((com.stripe.android.payments.bankaccount.navigation.e.Completed) addPaymentMethod.getBankAccountResult()).getResponse().getUsBankAccountData();
        return ((usBankAccountData == null || (financialConnectionsSession = usBankAccountData.getFinancialConnectionsSession()) == null) ? null : financialConnectionsSession.getPaymentAccount()) instanceof FinancialConnectionsAccount;
    }

    public abstract PaymentSheetTopBarState d(wn0.a<h0> onEditIconPressed);

    private n(boolean z11, boolean z12, boolean z13) {
        this.isLiveMode = z11;
        this.isProcessing = z12;
        this.canNavigateBack = z13;
    }
}
