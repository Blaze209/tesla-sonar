package u60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu60/c;", "", "Lu60/e;", OrcaKeys.METADATA, "", DateTokenConverter.CONVERTER_KEY, "(Lu60/e;)Z", "hasIntentToSetup", "", "Lu60/a;", "b", "(Z)Ljava/util/Set;", "Lu60/k;", "c", "()Lu60/k;", "Lcom/stripe/android/model/v0$p;", "getType", "()Lcom/stripe/android/model/v0$p;", "type", "a", "()Z", "supportedAsSavedPaymentMethod", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {
    boolean a();

    Set<a> b(boolean hasIntentToSetup);

    k c();

    boolean d(PaymentMethodMetadata metadata);

    PaymentMethod.p getType();
}
