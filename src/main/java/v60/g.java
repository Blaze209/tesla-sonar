package v60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import p013kotlin.Metadata;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lv60/g;", "Lu60/c;", "<init>", "()V", "", "hasIntentToSetup", "", "Lu60/a;", "b", "(Z)Ljava/util/Set;", "Lu60/e;", OrcaKeys.METADATA, DateTokenConverter.CONVERTER_KEY, "(Lu60/e;)Z", "Lu60/k;", "c", "()Lu60/k;", "Lcom/stripe/android/model/v0$p;", "Lcom/stripe/android/model/v0$p;", "getType", "()Lcom/stripe/android/model/v0$p;", "type", "Z", "a", "()Z", "supportedAsSavedPaymentMethod", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements u60.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f117963a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final PaymentMethod.p type = PaymentMethod.p.Alma;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean supportedAsSavedPaymentMethod = false;

    private g() {
    }

    @Override // u60.c
    public boolean a() {
        return supportedAsSavedPaymentMethod;
    }

    @Override // u60.c
    public Set<u60.a> b(boolean hasIntentToSetup) {
        return p013kotlin.collections.d1.c(u60.a.UnsupportedForSetup);
    }

    @Override // u60.c
    public u60.k c() {
        return h.f117972a;
    }

    @Override // u60.c
    public boolean d(PaymentMethodMetadata metadata) {
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return false;
    }

    @Override // u60.c
    public PaymentMethod.p getType() {
        return type;
    }
}
