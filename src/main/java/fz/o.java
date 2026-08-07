package fz;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lfz/o;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "toCaptureMode", "()I", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "SPEED", "BALANCED", "QUALITY", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum o implements h {
    SPEED("speed"),
    BALANCED("balanced"),
    QUALITY("quality");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/o$a;", "", "Lfz/o;", "<init>", "()V", "", "unionValue", "a", "(Ljava/lang/String;)Lfz/o;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public o a(String unionValue) {
            if (unionValue != null) {
                int iHashCode = unionValue.hashCode();
                if (iHashCode != -1924829944) {
                    if (iHashCode != 109641799) {
                        if (iHashCode == 651215103 && unionValue.equals("quality")) {
                            return o.QUALITY;
                        }
                    } else if (unionValue.equals("speed")) {
                        return o.SPEED;
                    }
                } else if (unionValue.equals("balanced")) {
                    return o.BALANCED;
                }
            }
            return o.BALANCED;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66743a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66743a = iArr;
        }
    }

    o(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<o> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final int toCaptureMode() {
        int i11 = b.f66743a[ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 0;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i12;
    }
}
