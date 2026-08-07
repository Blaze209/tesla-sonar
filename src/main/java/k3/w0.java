package k3;

import android.graphics.Path;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk3/t3;", "a", "()Lk3/t3;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Lk3/t3;", "", "message", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "Lk3/t3$b;", "Landroid/graphics/Path$Direction;", "e", "(Lk3/t3$b;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84885a;

        static {
            int[] iArr = new int[t3.b.values().length];
            try {
                iArr[t3.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t3.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84885a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t3 a() {
        return new r0(null, 1, 0 == true ? 1 : 0);
    }

    public static final t3 c(Path path) {
        return new r0(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction e(t3.b bVar) {
        int i11 = a.f84885a[bVar.ordinal()];
        if (i11 == 1) {
            return Path.Direction.CCW;
        }
        if (i11 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
