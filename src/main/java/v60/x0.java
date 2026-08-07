package v60;

import java.util.List;
import p013kotlin.Metadata;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv60/x0;", "Lu60/k$c;", "<init>", "()V", "Lz80/g2;", "sharedDataSpec", "Lt60/g;", "c", "(Lz80/g2;)Lt60/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class x0 implements u60.k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f118069a = new x0();

    private x0() {
    }

    @Override // u60.k.c
    public SupportedPaymentMethod c(SharedDataSpec sharedDataSpec) {
        p013kotlin.jvm.internal.s.k(sharedDataSpec, "sharedDataSpec");
        return new SupportedPaymentMethod(w0.f118062a, sharedDataSpec, w80.n.f121515i0, w80.k.f121494y, false, null, 48, null);
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
    public List<p010i90.d0> f(PaymentMethodMetadata paymentMethodMetadata, SharedDataSpec sharedDataSpec, t60.h hVar) {
        return u60.k.c.a.b(this, paymentMethodMetadata, sharedDataSpec, hVar);
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
