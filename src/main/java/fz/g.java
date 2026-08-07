package fz;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lfz/g;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "", "getRank", "()I", "rank", "Companion", "a", "LEGACY", "LIMITED", "EXTERNAL", "FULL", "LEVEL_3", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum g implements h {
    LEGACY("legacy"),
    LIMITED("limited"),
    EXTERNAL("limited"),
    FULL("full"),
    LEVEL_3("full");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/g$a;", "", "<init>", "()V", "", "hardwareLevel", "Lfz/g;", "a", "(I)Lfz/g;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int hardwareLevel) {
            if (hardwareLevel == 0) {
                return g.LIMITED;
            }
            if (hardwareLevel == 1) {
                return g.FULL;
            }
            if (hardwareLevel == 2) {
                return g.LEGACY;
            }
            if (hardwareLevel != 3) {
                return hardwareLevel != 4 ? g.LEGACY : g.EXTERNAL;
            }
            return g.LEVEL_3;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66739a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.LIMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.LEVEL_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f66739a = iArr;
        }
    }

    g(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    private final int getRank() {
        int i11 = b.f66739a[ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2 || i11 == 3) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 5) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }
}
