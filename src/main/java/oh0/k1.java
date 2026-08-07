package oh0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loh0/d0;", "", "b", "(Loh0/d0;)Ljava/lang/String;", "Loh0/b0;", "a", "(Loh0/d0;)Loh0/b0;", "permissions_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97421a;

        static {
            int[] iArr = new int[d0.values().length];
            try {
                iArr[d0.Camera.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.RecordAudio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.RoughLocation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.PreciseLocation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97421a = iArr;
        }
    }

    public static final b0 a(d0 d0Var) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        int i11 = a.f97421a[d0Var.ordinal()];
        if (i11 == 1) {
            return b0.Camera;
        }
        if (i11 == 2) {
            return b0.RecordAudio;
        }
        if (i11 == 3) {
            return b0.RoughLocation;
        }
        if (i11 == 4) {
            return b0.PreciseLocation;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(d0 d0Var) {
        p013kotlin.jvm.internal.s.k(d0Var, "<this>");
        int i11 = a.f97421a[d0Var.ordinal()];
        if (i11 == 1) {
            return "android.permission.CAMERA";
        }
        if (i11 == 2) {
            return "android.permission.RECORD_AUDIO";
        }
        if (i11 == 3) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (i11 == 4) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new NoWhenBranchMatchedException();
    }
}
