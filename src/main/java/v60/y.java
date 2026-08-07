package v60;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.MandateTextElement;
import z80.SaveForFutureUseElement;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lv60/y;", "Lu60/k$d;", "<init>", "()V", "", "merchantName", "Lm60/k;", "signupMode", "", "canChangeSaveForFutureUse", "Lz80/s1;", "k", "(Ljava/lang/String;Lm60/k;Z)Lz80/s1;", "Lu60/e;", OrcaKeys.METADATA, "l", "(Lu60/e;)Z", "Lt60/g;", "b", "()Lt60/g;", "customerHasSavedPaymentMethods", "Ls60/a;", "a", "(Z)Ls60/a;", "Lu60/k$a;", "arguments", "", "Li90/d0;", IntegerTokenConverter.CONVERTER_KEY, "(Lu60/e;Lu60/k$a;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class y implements u60.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f118071a = new y();

    private y() {
    }

    private final MandateTextElement k(String merchantName, m60.k signupMode, boolean canChangeSaveForFutureUse) {
        float fG;
        IdentifierSpec identifierSpecA = IdentifierSpec.INSTANCE.a("card_mandate");
        int i11 = n70.x.D;
        if (signupMode == m60.k.AlongsideSaveForFutureUse) {
            fG = w4.h.g(0);
        } else if (signupMode == m60.k.InsteadOfSaveForFutureUse) {
            fG = w4.h.g(4);
        } else {
            fG = canChangeSaveForFutureUse ? w4.h.g(6) : w4.h.g(2);
        }
        return new MandateTextElement(identifierSpecA, i11, p013kotlin.collections.v.e(merchantName), fG, null, 16, null);
    }

    private final boolean l(PaymentMethodMetadata metadata) {
        return t60.f.a(PaymentMethod.p.Card.code, metadata.getPaymentMethodSaveConsentBehavior(), metadata.getStripeIntent(), metadata.getHasCustomerConfiguration());
    }

    @Override // u60.k.d
    public FormHeaderInformation a(boolean customerHasSavedPaymentMethods) {
        return FormHeaderInformation.b(b().c(), x30.d.a(customerHasSavedPaymentMethods ? w80.n.H : w80.n.G), false, 0, null, null, false, 60, null);
    }

    @Override // u60.k.d
    public SupportedPaymentMethod b() {
        return new SupportedPaymentMethod(w.f118059a, null, w80.n.W, w80.k.f121484o, true, null, 34, null);
    }

    @Override // u60.k
    public SupportedPaymentMethod d(u60.c cVar, List<SharedDataSpec> list) {
        return u60.k.d.a.e(this, cVar, list);
    }

    @Override // u60.k
    public List<p010i90.d0> g(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, u60.k.a aVar) {
        return u60.k.d.a.c(this, cVar, paymentMethodMetadata, list, aVar);
    }

    @Override // u60.k
    public boolean h(u60.c cVar, List<SharedDataSpec> list) {
        return u60.k.d.a.a(this, cVar, list);
    }

    @Override // u60.k.d
    public List<p010i90.d0> i(PaymentMethodMetadata metadata, u60.k.a arguments) {
        m60.k signupMode;
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = metadata.getBillingDetailsCollectionConfiguration();
        List listC = p013kotlin.collections.v.c();
        p010i90.d0 d0VarD = x.d(arguments.d(), billingDetailsCollectionConfiguration.d(), billingDetailsCollectionConfiguration.f());
        if (d0VarD != null) {
            listC.add(d0VarD);
        }
        listC.add(new z80.h0(arguments.getCardAccountRangeRepositoryFactory(), arguments.d(), billingDetailsCollectionConfiguration.e(), arguments.getCbcEligibility(), IdentifierSpec.INSTANCE.a("card_details"), null, 32, null));
        if (billingDetailsCollectionConfiguration.getAddress() != com.stripe.android.paymentsheet.y.BillingDetailsCollectionConfiguration.a.Never) {
            listC.add(x.c(x.e(billingDetailsCollectionConfiguration.getAddress()), arguments.d(), arguments.j()));
        }
        y yVar = f118071a;
        boolean zL = yVar.l(metadata);
        if (zL) {
            listC.add(new SaveForFutureUseElement(arguments.getSaveForFutureUseInitialValue(), arguments.getMerchantName()));
        }
        if (metadata.getLinkInlineConfiguration() == null || arguments.getLinkConfigurationCoordinator() == null) {
            signupMode = null;
        } else {
            listC.add(new w60.a(metadata.getLinkInlineConfiguration(), arguments.getLinkConfigurationCoordinator(), arguments.g()));
            signupMode = metadata.getLinkInlineConfiguration().getSignupMode();
        }
        if (metadata.w()) {
            listC.add(yVar.k(metadata.getMerchantName(), signupMode, zL));
        }
        return p013kotlin.collections.v.a(listC);
    }

    @Override // u60.k
    public FormHeaderInformation j(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z11) {
        return u60.k.d.a.d(this, cVar, paymentMethodMetadata, list, z11);
    }
}
