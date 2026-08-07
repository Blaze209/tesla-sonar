package p008h80;

import androidx.compose.ui.platform.s2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.h;
import com.stripe.android.model.x0;
import com.stripe.android.model.y0;
import java.util.List;
import jn0.h0;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import r90.f;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;
import w70.j;
import w80.g;
import wn0.l;
import wn0.p;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000e\u001a\u00020\r*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0019\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lh80/b;", "interactor", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Lh80/b;Landroidx/compose/ui/d;Lr2/l;II)V", "Lu70/c;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "Lu60/e;", "paymentMethodMetadata", "Lcom/stripe/android/model/w0;", "e", "(Lu70/c;Ljava/lang/String;Lu60/e;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/y0;", "f", "(Lu70/c;Ljava/lang/String;)Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/x0;", DateTokenConverter.CONVERTER_KEY, "(Lu70/c;Ljava/lang/String;)Lcom/stripe/android/model/x0;", "Lt60/g;", "paymentMethod", "Lw70/j;", "g", "(Lu70/c;Lt60/g;Lu60/e;)Lw70/j;", "Lh80/b$a;", "state", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt60/g;", "selectedLpm", "Ljn0/h0;", "a", "(Lt60/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<SupportedPaymentMethod, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p008h80.b f71004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p008h80.b bVar) {
            super(1);
            this.f71004c = bVar;
        }

        public final void a(SupportedPaymentMethod selectedLpm) {
            s.k(selectedLpm, "selectedLpm");
            this.f71004c.a(new p008h80.b.AbstractC1489b.OnPaymentMethodSelected(selectedLpm.getCode()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(SupportedPaymentMethod supportedPaymentMethod) {
            a(supportedPaymentMethod);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu70/c;", "formValues", "Ljn0/h0;", "a", "(Lu70/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<FormFieldValues, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p008h80.b f71005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<p008h80.b.State> f71006d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p008h80.b bVar, y3<p008h80.b.State> y3Var) {
            super(1);
            this.f71005c = bVar;
            this.f71006d = y3Var;
        }

        public final void a(FormFieldValues formFieldValues) {
            this.f71005c.a(new p008h80.b.AbstractC1489b.OnFormFieldValuesChanged(formFieldValues, c.b(this.f71006d).getSelectedPaymentMethodCode()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(FormFieldValues formFieldValues) {
            a(formFieldValues);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: h80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class C1491c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p008h80.b f71007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<p008h80.b.State> f71008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1491c(p008h80.b bVar, y3<p008h80.b.State> y3Var) {
            super(0);
            this.f71007c = bVar;
            this.f71008d = y3Var;
        }

        public final void b() {
            this.f71007c.a(new p008h80.b.AbstractC1489b.ReportFieldInteraction(c.b(this.f71008d).getSelectedPaymentMethodCode()));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p008h80.b f71009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71012f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p008h80.b bVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f71009c = bVar;
            this.f71010d = dVar;
            this.f71011e = i11;
            this.f71012f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f71009c, this.f71010d, lVar, k2.a(this.f71011e | 1), this.f71012f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void a(p008h80.b interactor, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        s.k(interactor, "interactor");
        p020r2.l lVarV = lVar.v(-1093227002);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(interactor) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i13 & 91) == 18 || !lVarV.b()) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(-1093227002, i13, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:26)");
                }
                y3 y3VarA = f.a(interactor.getState(), lVarV, 8);
                boolean z11 = !b(y3VarA).getProcessing();
                List<SupportedPaymentMethod> listG = b(y3VarA).g();
                String selectedPaymentMethodCode = b(y3VarA).getSelectedPaymentMethodCode();
                List<d0> listD = b(y3VarA).d();
                a aVar = new a(interactor);
                FormArguments arguments = b(y3VarA).getArguments();
                p027z70.d usBankAccountFormArguments = b(y3VarA).getUsBankAccountFormArguments();
                b bVar = new b(interactor, y3VarA);
                androidx.compose.ui.d dVarA = s2.a(dVar3, "PaymentSheetAddPaymentMethodForm");
                C1491c c1491c = new C1491c(interactor, y3VarA);
                dVar4 = dVar3;
                w.b(z11, listG, selectedPaymentMethodCode, listD, aVar, arguments, usBankAccountFormArguments, bVar, dVarA, c1491c, lVarV, 2363456, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar4 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(interactor, dVar4, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(-1093227002, i13, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:26)");
            }
            y3 y3VarA2 = f.a(interactor.getState(), lVarV, 8);
            boolean z12 = !b(y3VarA2).getProcessing();
            List<SupportedPaymentMethod> listG2 = b(y3VarA2).g();
            String selectedPaymentMethodCode2 = b(y3VarA2).getSelectedPaymentMethodCode();
            List<d0> listD2 = b(y3VarA2).d();
            a aVar2 = new a(interactor);
            FormArguments arguments2 = b(y3VarA2).getArguments();
            p027z70.d usBankAccountFormArguments2 = b(y3VarA2).getUsBankAccountFormArguments();
            b bVar2 = new b(interactor, y3VarA2);
            androidx.compose.ui.d dVarA2 = s2.a(dVar3, "PaymentSheetAddPaymentMethodForm");
            C1491c c1491c2 = new C1491c(interactor, y3VarA2);
            dVar4 = dVar3;
            w.b(z12, listG2, selectedPaymentMethodCode2, listD2, aVar2, arguments2, usBankAccountFormArguments2, bVar2, dVarA2, c1491c2, lVarV, 2363456, 0);
            if (o.J()) {
                o.R();
            }
        } else {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(-1093227002, i13, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:26)");
            }
            y3 y3VarA3 = f.a(interactor.getState(), lVarV, 8);
            boolean z13 = !b(y3VarA3).getProcessing();
            List<SupportedPaymentMethod> listG3 = b(y3VarA3).g();
            String selectedPaymentMethodCode3 = b(y3VarA3).getSelectedPaymentMethodCode();
            List<d0> listD3 = b(y3VarA3).d();
            a aVar3 = new a(interactor);
            FormArguments arguments3 = b(y3VarA3).getArguments();
            p027z70.d usBankAccountFormArguments3 = b(y3VarA3).getUsBankAccountFormArguments();
            b bVar3 = new b(interactor, y3VarA3);
            androidx.compose.ui.d dVarA3 = s2.a(dVar3, "PaymentSheetAddPaymentMethodForm");
            C1491c c1491c3 = new C1491c(interactor, y3VarA3);
            dVar4 = dVar3;
            w.b(z13, listG3, selectedPaymentMethodCode3, listD3, aVar3, arguments3, usBankAccountFormArguments3, bVar3, dVarA3, c1491c3, lVarV, 2363456, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(interactor, dVar4, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p008h80.b.State b(y3<p008h80.b.State> y3Var) {
        return y3Var.getValue();
    }

    public static final x0 d(FormFieldValues formFieldValues, String paymentMethodCode) {
        s.k(formFieldValues, "<this>");
        s.k(paymentMethodCode, "paymentMethodCode");
        return g.INSTANCE.h(formFieldValues.a(), paymentMethodCode);
    }

    public static final PaymentMethodCreateParams e(FormFieldValues formFieldValues, String paymentMethodCode, PaymentMethodMetadata paymentMethodMetadata) {
        s.k(formFieldValues, "<this>");
        s.k(paymentMethodCode, "paymentMethodCode");
        s.k(paymentMethodMetadata, "paymentMethodMetadata");
        return g.INSTANCE.g(formFieldValues.a(), paymentMethodCode, paymentMethodMetadata.D(paymentMethodCode), paymentMethodMetadata.a(formFieldValues.getUserRequestedReuse()));
    }

    public static final y0 f(FormFieldValues formFieldValues, String paymentMethodCode) {
        s.k(formFieldValues, "<this>");
        s.k(paymentMethodCode, "paymentMethodCode");
        return g.INSTANCE.i(formFieldValues.a(), paymentMethodCode);
    }

    public static final j g(FormFieldValues formFieldValues, SupportedPaymentMethod paymentMethod, PaymentMethodMetadata paymentMethodMetadata) {
        s.k(formFieldValues, "<this>");
        s.k(paymentMethod, "paymentMethod");
        s.k(paymentMethodMetadata, "paymentMethodMetadata");
        PaymentMethodCreateParams paymentMethodCreateParamsE = e(formFieldValues, paymentMethod.getCode(), paymentMethodMetadata);
        y0 y0VarF = f(formFieldValues, paymentMethod.getCode());
        x0 x0VarD = d(formFieldValues, paymentMethod.getCode());
        if (!s.f(paymentMethod.getCode(), PaymentMethod.p.Card.code)) {
            return paymentMethodMetadata.x(paymentMethod.getCode()) ? new j.ExternalPaymentMethod(paymentMethod.getCode(), paymentMethodCreateParamsE.getBillingDetails(), paymentMethod.getDisplayName(), paymentMethod.getIconResource(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl()) : new j.e.GenericPaymentMethod(paymentMethod.getDisplayName(), paymentMethod.getIconResource(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl(), paymentMethodCreateParamsE, formFieldValues.getUserRequestedReuse(), y0VarF, x0VarD);
        }
        y0.Card card = new y0.Card(null, null, formFieldValues.getUserRequestedReuse().getSetupFutureUsage(), 3, null);
        h.Companion companion = h.INSTANCE;
        FormFieldEntry formFieldEntry = formFieldValues.a().get(IdentifierSpec.INSTANCE.f());
        return new j.e.Card(paymentMethodCreateParamsE, companion.b(formFieldEntry != null ? formFieldEntry.getValue() : null), formFieldValues.getUserRequestedReuse(), card, null, 16, null);
    }
}
