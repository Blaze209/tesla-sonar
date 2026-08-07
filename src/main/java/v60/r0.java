package v60;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.List;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv60/r0;", "Lu60/k$d;", "<init>", "()V", "Lt60/g;", "b", "()Lt60/g;", "Lu60/e;", OrcaKeys.METADATA, "Lu60/k$a;", "arguments", "", "Li90/d0;", IntegerTokenConverter.CONVERTER_KEY, "(Lu60/e;Lu60/k$a;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class r0 implements u60.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f118033a = new r0();

    private r0() {
    }

    @Override // u60.k.d
    public FormHeaderInformation a(boolean z11) {
        return u60.k.d.a.b(this, z11);
    }

    @Override // u60.k.d
    public SupportedPaymentMethod b() {
        return new SupportedPaymentMethod(q0.f118026a, null, w80.n.f121511g0, w80.k.f121492w, false, null, 50, null);
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
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        return new t60.b(arguments).e(t60.a.Name).e(t60.a.Email).b(SectionElement.Companion.c(SectionElement.INSTANCE, new SimpleTextElement(companion.o(), new p010i90.r1(new p010i90.q1(Integer.valueOf(w80.n.C), o4.x.INSTANCE.b(), o4.y.INSTANCE.g(), null, 8, null), true, arguments.d().get(companion.o()))), null, 2, null)).a();
    }

    @Override // u60.k
    public FormHeaderInformation j(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z11) {
        return u60.k.d.a.d(this, cVar, paymentMethodMetadata, list, z11);
    }
}
