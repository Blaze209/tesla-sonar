package fz;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lfz/i;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "toSurfaceRotation", "()I", "reversed", "()Lfz/i;", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "PORTRAIT", "LANDSCAPE_RIGHT", "PORTRAIT_UPSIDE_DOWN", "LANDSCAPE_LEFT", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum i implements h {
    PORTRAIT("portrait"),
    LANDSCAPE_RIGHT("landscape-right"),
    PORTRAIT_UPSIDE_DOWN("portrait-upside-down"),
    LANDSCAPE_LEFT("landscape-left");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lfz/i$a;", "", "Lfz/i;", "<init>", "()V", "", "rotationDegrees", "a", "(I)Lfz/i;", "rotation", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(int rotationDegrees) {
            if (45 <= rotationDegrees && rotationDegrees < 136) {
                return i.LANDSCAPE_LEFT;
            }
            if (135 > rotationDegrees || rotationDegrees >= 226) {
                return (225 > rotationDegrees || rotationDegrees >= 316) ? i.PORTRAIT : i.LANDSCAPE_RIGHT;
            }
            return i.PORTRAIT_UPSIDE_DOWN;
        }

        public final i b(int rotation) {
            if (rotation == 0) {
                return i.PORTRAIT;
            }
            if (rotation == 1) {
                return i.LANDSCAPE_RIGHT;
            }
            if (rotation != 2) {
                return rotation != 3 ? i.PORTRAIT : i.LANDSCAPE_LEFT;
            }
            return i.PORTRAIT_UPSIDE_DOWN;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66740a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.LANDSCAPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.PORTRAIT_UPSIDE_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66740a = iArr;
        }
    }

    i(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<i> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final i reversed() {
        int i11 = b.f66740a[ordinal()];
        if (i11 == 1) {
            return PORTRAIT;
        }
        if (i11 == 2) {
            return LANDSCAPE_RIGHT;
        }
        if (i11 == 3) {
            return PORTRAIT_UPSIDE_DOWN;
        }
        if (i11 == 4) {
            return LANDSCAPE_LEFT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int toSurfaceRotation() {
        int i11 = b.f66740a[ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 3;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
