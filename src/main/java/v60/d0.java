package v60;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import s60.FormHeaderInformation;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.ExternalPaymentMethodSpec;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv60/d0;", "Lu60/k$d;", "Lz80/a1;", "externalPaymentMethodSpec", "<init>", "(Lz80/a1;)V", "Lt60/g;", "b", "()Lt60/g;", "Lu60/e;", OrcaKeys.METADATA, "Lu60/k$a;", "arguments", "", "Li90/d0;", IntegerTokenConverter.CONVERTER_KEY, "(Lu60/e;Lu60/k$a;)Ljava/util/List;", "a", "Lz80/a1;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d0 implements u60.k.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f117948b = ExternalPaymentMethodSpec.f127345e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExternalPaymentMethodSpec externalPaymentMethodSpec;

    public d0(ExternalPaymentMethodSpec externalPaymentMethodSpec) {
        p013kotlin.jvm.internal.s.k(externalPaymentMethodSpec, "externalPaymentMethodSpec");
        this.externalPaymentMethodSpec = externalPaymentMethodSpec;
    }

    @Override // u60.k.d
    public FormHeaderInformation a(boolean z11) {
        return u60.k.d.a.b(this, z11);
    }

    @Override // u60.k.d
    public SupportedPaymentMethod b() {
        return new SupportedPaymentMethod(this.externalPaymentMethodSpec.getType(), x30.d.b(this.externalPaymentMethodSpec.getLabel()), 0, this.externalPaymentMethodSpec.getLightImageUrl(), this.externalPaymentMethodSpec.getDarkImageUrl(), false, (x30.c) null, 64, (DefaultConstructorMarker) null);
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
        return new t60.b(arguments).a();
    }

    @Override // u60.k
    public FormHeaderInformation j(u60.c cVar, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z11) {
        return u60.k.d.a.d(this, cVar, paymentMethodMetadata, list, z11);
    }
}
