package rb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.crypto.InvalidVehiclePublicKeyException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrb0/j;", "Lrb0/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "unsignedMessage", "vehicleKey", "additionalData", "Lsc0/b;", "domain", "Lrb0/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc0/b;)Lrb0/g;", "b", "Landroid/content/Context;", "c", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: rb0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrb0/j$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lrb0/f;", "a", "(Landroid/content/Context;)Lrb0/f;", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            return new j(applicationContext, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107505a;

        static {
            int[] iArr = new int[sc0.b.values().length];
            try {
                iArr[sc0.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc0.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sc0.b.DOMAIN_AUTHD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sc0.b.DOMAIN_BROADCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f107505a = iArr;
        }
    }

    public /* synthetic */ j(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @Override // rb0.f
    public SignedMessageResponse a(String unsignedMessage, String vehicleKey, String additionalData, sc0.b domain) throws InvalidVehiclePublicKeyException {
        h.a aVar;
        s.k(unsignedMessage, "unsignedMessage");
        s.k(vehicleKey, "vehicleKey");
        s.k(additionalData, "additionalData");
        s.k(domain, "domain");
        Context context = this.context;
        switch (b.f107505a[domain.ordinal()]) {
            case 1:
                aVar = h.a.VCSEC;
                break;
            case 2:
                aVar = h.a.CAR;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException("unsupported domain " + domain);
            default:
                throw new NoWhenBranchMatchedException();
        }
        Map<String, Object> mapA = h.a(context, unsignedMessage, vehicleKey, additionalData, aVar);
        s.j(mapA, "signMessage(...)");
        Object obj = mapA.get("success");
        s.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = mapA.get("signedMessage");
        byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
        Object obj3 = mapA.get("nonce");
        byte[] bArr2 = obj3 instanceof byte[] ? (byte[]) obj3 : null;
        Object obj4 = mapA.get("tag");
        byte[] bArr3 = obj4 instanceof byte[] ? (byte[]) obj4 : null;
        Object obj5 = mapA.get(AnalyticsAttribute.Error);
        return new SignedMessageResponse(zBooleanValue, bArr, bArr2, bArr3, obj5 instanceof String ? (String) obj5 : null);
    }

    private j(Context context) {
        this.context = context;
    }
}
