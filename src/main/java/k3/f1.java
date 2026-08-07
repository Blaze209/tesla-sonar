package k3;

import android.graphics.BlendModeColorFilter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lk3/f1;", "", "<init>", "()V", "Lk3/p1;", "color", "Lk3/b1;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "a", "(JI)Landroid/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "Lk3/c1;", "b", "(Landroid/graphics/BlendModeColorFilter;)Lk3/c1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f84779a = new f1();

    private f1() {
    }

    public final BlendModeColorFilter a(long color, int blendMode) {
        e1.a();
        return d1.a(r1.k(color), d0.a(blendMode));
    }

    public final BlendModeColorFilter b(BlendModeColorFilter androidBlendModeColorFilter) {
        return new BlendModeColorFilter(r1.b(androidBlendModeColorFilter.getColor()), d0.b(androidBlendModeColorFilter.getMode()), androidBlendModeColorFilter, null);
    }
}
