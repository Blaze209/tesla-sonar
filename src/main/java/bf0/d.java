package bf0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbf0/c;", "", "a", "(Lbf0/c;)Ljava/lang/String;", "tesla-ble_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17096a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.SERVICE_DISCOVERY_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.OS_DISCOVER_SERVICE_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SERVICE_DISCOVERY_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.CHARACTERISTIC_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.MAX_INDICATION_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17096a = iArr;
        }
    }

    public static final String a(c cVar) {
        s.k(cVar, "<this>");
        int i11 = a.f17096a[cVar.ordinal()];
        if (i11 == 1) {
            return "service discovery timeout";
        }
        if (i11 == 2) {
            return "gatt.discoverServices return false";
        }
        if (i11 == 3) {
            return "service discovery failure";
        }
        if (i11 == 4) {
            return "characteristics not found";
        }
        if (i11 == 5) {
            return "max indications failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
