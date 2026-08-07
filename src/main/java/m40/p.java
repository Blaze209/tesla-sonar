package m40;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lm40/p;", "", "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "financialConnectionsSheetNativeActivity", "Ljn0/h0;", "o", "(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V", "Ls50/f;", "a", "()Ls50/f;", "viewModel", "Lt40/d$d;", "m", "()Lt40/d$d;", "consentViewModelFactory", "Ly40/d$d;", "n", "()Ly40/d$d;", "institutionPickerViewModelFactory", "Lo40/d$b;", "f", "()Lo40/d$b;", "accountPickerViewModelFactory", "Lb50/f$d;", "k", "()Lb50/f$d;", "manualEntryViewModelFactory", "Lc50/c$d;", "h", "()Lc50/c$d;", "manualEntrySuccessViewModelFactory", "Li50/b$c;", "b", "()Li50/b$c;", "partnerAuthViewModelFactory", "Lr40/b$c;", "q", "()Lr40/b$c;", "bankAuthRepairViewModelFactory", "Lk50/d$d;", "l", "()Lk50/d$d;", "successViewModelFactory", "Lq40/c$d;", "c", "()Lq40/c$d;", "attachPaymentViewModelFactory", "Lj50/c$d;", IntegerTokenConverter.CONVERTER_KEY, "()Lj50/c$d;", "resetViewModelFactory", "Lv40/c$d;", "v", "()Lv40/c$d;", "errorViewModelFactory", "Lw40/d$d;", "e", "()Lw40/d$d;", "exitViewModelFactory", "Lh50/c$b;", "p", "()Lh50/c$b;", "noticeSheetViewModelFactory", "Le50/i$d;", "g", "()Le50/i$d;", "networkingLinkSignupViewModelFactory", "Ld50/d$d;", DateTokenConverter.CONVERTER_KEY, "()Ld50/d$d;", "networkingLinkLoginWarmupViewModelFactory", "Lf50/d$c;", "s", "()Lf50/d$c;", "networkingLinkVerificationViewModelFactory", "Lg50/d$d;", "u", "()Lg50/d$d;", "networkingSaveToLinkVerificationViewModelFactory", "Lz40/e$d;", "j", "()Lz40/e$d;", "linkAccountPickerViewModelFactory", "La50/c$d;", "t", "()La50/c$d;", "linkStepUpVerificationViewModelFactory", "Lp40/c$b;", "r", "()Lp40/c$b;", "accountUpdateRequiredViewModelFactory", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm40/p$a;", "", "Lcom/stripe/android/financialconnections/model/k0;", "initialSyncResponse", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/k0;)Lm40/p$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Lm40/p$a;", "Landroid/app/Application;", Kind.APPLICATION, "a", "(Landroid/app/Application;)Lm40/p$a;", "Ls50/c;", "initialState", "e", "(Ls50/c;)Lm40/p$a;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "c", "(Lcom/stripe/android/financialconnections/a$b;)Lm40/p$a;", "Lm40/p;", "build", "()Lm40/p;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(Application application);

        a b(s0 savedStateHandle);

        p build();

        a c(com.stripe.android.financialconnections.a.Configuration configuration);

        a d(SynchronizeSessionResponse initialSyncResponse);

        a e(FinancialConnectionsSheetNativeState initialState);
    }

    s50.f a();

    i50.b.c b();

    q40.c.d c();

    d50.d.InterfaceC1217d d();

    w40.d.InterfaceC2577d e();

    o40.d.b f();

    e50.i.d g();

    c50.c.d h();

    j50.c.d i();

    z40.e.d j();

    b50.f.d k();

    k50.d.InterfaceC1799d l();

    t40.d.InterfaceC2397d m();

    y40.d.InterfaceC2702d n();

    void o(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity);

    h50.c.b p();

    r40.b.c q();

    p40.c.b r();

    f50.d.c s();

    a50.c.d t();

    g50.d.InterfaceC1383d u();

    v40.c.d v();
}
