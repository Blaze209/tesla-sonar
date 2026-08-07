package fz;

import androidx.camera.view.PreviewView;
import dz.x0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lfz/n;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroidx/camera/view/PreviewView$c;", "toPreviewImplementationMode", "()Landroidx/camera/view/PreviewView$c;", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "SURFACE_VIEW", "TEXTURE_VIEW", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum n implements h {
    SURFACE_VIEW("surface-view"),
    TEXTURE_VIEW("texture-view");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/n$a;", "", "Lfz/n;", "<init>", "()V", "", "unionValue", "a", "(Ljava/lang/String;)Lfz/n;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n a(String unionValue) throws x0 {
            if (p013kotlin.jvm.internal.s.f(unionValue, "surface-view")) {
                return n.SURFACE_VIEW;
            }
            if (p013kotlin.jvm.internal.s.f(unionValue, "texture-view")) {
                return n.TEXTURE_VIEW;
            }
            throw new x0("androidPreviewViewType", unionValue);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66742a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.SURFACE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.TEXTURE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66742a = iArr;
        }
    }

    n(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final PreviewView.c toPreviewImplementationMode() {
        int i11 = b.f66742a[ordinal()];
        if (i11 == 1) {
            return PreviewView.c.PERFORMANCE;
        }
        if (i11 == 2) {
            return PreviewView.c.COMPATIBLE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
