package r30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr30/b;", "Lr30/j;", "Lr30/k;", "fraudDetectionDataRequestParamsFactory", "<init>", "(Lr30/k;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "Lr30/d;", "arg", "Lr30/i;", "a", "(Lr30/d;)Lr30/i;", "Lr30/k;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k fraudDetectionDataRequestParamsFactory;

    public b(k fraudDetectionDataRequestParamsFactory) {
        s.k(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory;
    }

    @Override // r30.j
    public i a(FraudDetectionData arg) {
        Map mapB = this.fraudDetectionDataRequestParamsFactory.b(arg);
        String guid = arg != null ? arg.getGuid() : null;
        if (guid == null) {
            guid = "";
        }
        return new i(mapB, guid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(new k(context));
        s.k(context, "context");
    }
}
