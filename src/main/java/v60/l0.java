package v60;

import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.ArrayList;
import java.util.List;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv60/l0;", "Lu60/k$c;", "<init>", "()V", "Lz80/g2;", "sharedDataSpec", "Lt60/g;", "c", "(Lz80/g2;)Lt60/g;", "Lu60/e;", OrcaKeys.METADATA, "Lt60/h;", "transformSpecToElements", "", "Li90/d0;", "f", "(Lu60/e;Lz80/g2;Lt60/h;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class l0 implements u60.k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f117997a = new l0();

    private l0() {
    }

    @Override // u60.k.c
    public SupportedPaymentMethod c(SharedDataSpec sharedDataSpec) {
        p013kotlin.jvm.internal.s.k(sharedDataSpec, "sharedDataSpec");
        return new SupportedPaymentMethod(k0.f117990a, sharedDataSpec, w80.n.f121505d0, w80.k.f121490u, false, null, 48, null);
    }

    @Override // u60.k
    public SupportedPaymentMethod d(u60.c cVar, List<SharedDataSpec> list) {
        return u60.k.c.a.f(this, cVar, list);
    }

    @Override // u60.k.c
    public FormHeaderInformation e(SharedDataSpec sharedDataSpec) {
        return u60.k.c.a.c(this, sharedDataSpec);
    }

    @Override // u60.k.c
    public List<p010i90.d0> f(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, t60.h transformSpecToElements) {
        List<IdentifierSpec> listM;
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        p013kotlin.jvm.internal.s.k(sharedDataSpec, "sharedDataSpec");
        p013kotlin.jvm.internal.s.k(transformSpecToElements, "transformSpecToElements");
        ArrayList<z80.e1> arrayListB = sharedDataSpec.b();
        if (metadata.w()) {
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            listM = p013kotlin.collections.v.p(companion.r(), companion.n());
        } else {
            listM = p013kotlin.collections.v.m();
        }
        return transformSpecToElements.a(arrayListB, listM);
    }

    @Override // u60.k
    public List<p010i90.d0> g(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, u60.k.a aVar) {
        return u60.k.c.a.d(this, cVar, paymentMethodMetadata, list, aVar);
    }

    @Override // u60.k
    public boolean h(u60.c cVar, List<SharedDataSpec> list) {
        return u60.k.c.a.a(this, cVar, list);
    }

    @Override // u60.k
    public FormHeaderInformation j(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z11) {
        return u60.k.c.a.e(this, cVar, paymentMethodMetadata, list, z11);
    }
}
