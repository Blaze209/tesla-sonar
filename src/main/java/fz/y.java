package fz;

import dz.x0;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lfz/y;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mode", "", "isAtLeast", "(Lfz/y;)Z", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "", "getScore", "()I", "score", "Companion", "a", "OFF", "STANDARD", "CINEMATIC", "CINEMATIC_EXTENDED", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum y implements h {
    OFF(DebugKt.DEBUG_PROPERTY_VALUE_OFF),
    STANDARD("standard"),
    CINEMATIC("cinematic"),
    CINEMATIC_EXTENDED("cinematic-extended");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/y$a;", "", "Lfz/y;", "<init>", "()V", "", "unionValue", "a", "(Ljava/lang/String;)Lfz/y;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public y a(String unionValue) throws x0 {
            if (unionValue != null) {
                switch (unionValue.hashCode()) {
                    case -1348796151:
                        if (unionValue.equals("cinematic-extended")) {
                            return y.CINEMATIC_EXTENDED;
                        }
                        break;
                    case 109935:
                        if (unionValue.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            return y.OFF;
                        }
                        break;
                    case 3005871:
                        if (unionValue.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                            return y.OFF;
                        }
                        break;
                    case 1312628413:
                        if (unionValue.equals("standard")) {
                            return y.STANDARD;
                        }
                        break;
                    case 1598495741:
                        if (unionValue.equals("cinematic")) {
                            return y.CINEMATIC;
                        }
                        break;
                }
            }
            throw new x0("videoStabilizationMode", unionValue);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66760a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CINEMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.CINEMATIC_EXTENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66760a = iArr;
        }
    }

    y(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<y> getEntries() {
        return $ENTRIES;
    }

    private final int getScore() {
        int i11 = b.f66760a[ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final boolean isAtLeast(y mode) {
        p013kotlin.jvm.internal.s.k(mode, "mode");
        return getScore() >= mode.getScore();
    }
}
