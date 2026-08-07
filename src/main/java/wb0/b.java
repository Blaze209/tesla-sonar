package wb0;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lwb0/b;", "", "", "driveUnitChar", "<init>", "(Ljava/lang/String;IC)V", "C", "getDriveUnitChar", "()C", "", "isPreP2SX", "()Z", "Companion", "a", "SSingleStandard", "SSinglePerformance", "SXDualStandard", "SXDualPerformance", "P2DualMotor", "P2TripleMotor", "M3SingleStandard", "M3DualStandard", "M3DualPerformance", "MYSingleStandard", "MYDualStandard", "MYDualPerformance", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    SSingleStandard('1'),
    SSinglePerformance('3'),
    SXDualStandard('2'),
    SXDualPerformance('4'),
    P2DualMotor('5'),
    P2TripleMotor('6'),
    M3SingleStandard('A'),
    M3DualStandard('B'),
    M3DualPerformance('C'),
    MYSingleStandard('D'),
    MYDualStandard('E'),
    MYDualPerformance('F');

    private final char driveUnitChar;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wb0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwb0/b$a;", "", "<init>", "()V", "", "vin", "Lwb0/b;", "a", "(Ljava/lang/String;)Lwb0/b;", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String vin) {
            s.k(vin, "vin");
            if (vin.length() > 7) {
                char cCharAt = vin.charAt(7);
                for (b bVar : b.values()) {
                    if (bVar.getDriveUnitChar() == cCharAt) {
                        return bVar;
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: wb0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2611b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121655a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.SSingleStandard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SSinglePerformance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SXDualStandard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SXDualPerformance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f121655a = iArr;
        }
    }

    b(char c11) {
        this.driveUnitChar = c11;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final char getDriveUnitChar() {
        return this.driveUnitChar;
    }

    public final boolean isPreP2SX() {
        int i11 = C2611b.f121655a[ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4;
    }
}
