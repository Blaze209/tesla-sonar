package k3;

import android.graphics.ColorFilter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lk3/q1;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "a", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ColorFilter nativeColorFilter;

    /* JADX INFO: renamed from: k3.q1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lk3/q1$a;", "", "<init>", "()V", "Lk3/p1;", "color", "Lk3/b1;", "blendMode", "Lk3/q1;", "a", "(JI)Lk3/q1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ q1 b(Companion companion, long j11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = b1.INSTANCE.z();
            }
            return companion.a(j11, i11);
        }

        public final q1 a(long color, int blendMode) {
            return new BlendModeColorFilter(color, blendMode, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public q1(ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
