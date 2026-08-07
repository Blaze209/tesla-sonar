package fz;

import dz.x0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lfz/x;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toExtension", "()Ljava/lang/String;", "Ljava/lang/String;", "getUnionValue", "Companion", "a", "MOV", "MP4", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum x implements h {
    MOV("mov"),
    MP4("mp4");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/x$a;", "", "Lfz/x;", "<init>", "()V", "", "unionValue", "a", "(Ljava/lang/String;)Lfz/x;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public x a(String unionValue) throws x0 {
            if (p013kotlin.jvm.internal.s.f(unionValue, "mov")) {
                return x.MOV;
            }
            if (p013kotlin.jvm.internal.s.f(unionValue, "mp4")) {
                return x.MP4;
            }
            if (unionValue == null) {
                unionValue = "(null)";
            }
            throw new x0("fileType", unionValue);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66759a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.MOV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66759a = iArr;
        }
    }

    x(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<x> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final String toExtension() {
        int i11 = b.f66759a[ordinal()];
        if (i11 == 1) {
            return ".mov";
        }
        if (i11 == 2) {
            return ".mp4";
        }
        throw new NoWhenBranchMatchedException();
    }
}
