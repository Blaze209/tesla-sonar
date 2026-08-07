package bm;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lbm/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "toString", "()Ljava/lang/String;", "I", "getValue", "()I", "Companion", "a", "UNKNOWN", "REQUESTED", "INTERMEDIATE_AVAILABLE", "SUCCESS", "ERROR", "EMPTY_EVENT", "RELEASED", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private static final e[] VALUES = values();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17778a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INTERMEDIATE_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17778a = iArr;
        }
    }

    e(int i11) {
        this.value = i11;
    }

    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i11 = b.f17778a[ordinal()];
        if (i11 == 1) {
            return "requested";
        }
        if (i11 == 2) {
            return "success";
        }
        if (i11 == 3) {
            return "intermediate_available";
        }
        if (i11 != 4) {
            return i11 != 5 ? "unknown" : "released";
        }
        return AnalyticsAttribute.Error;
    }
}
