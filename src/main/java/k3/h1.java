package k3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lk3/h1;", "", "<init>", "()V", "Lj3/m;", "size", "Lk3/r3;", "p", "", "alpha", "Ljn0/h0;", "a", "(JLk3/r3;F)V", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "b", "Lk3/c4;", "Lk3/h4;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    /* JADX INFO: renamed from: k3.h1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0012\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0016\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J*\u0010\u0018\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lk3/h1$a;", "", "<init>", "()V", "", "Lk3/p1;", "colors", "Lj3/g;", "start", "end", "Lk3/l4;", "tileMode", "Lk3/h1;", "c", "(Ljava/util/List;JJI)Lk3/h1;", "", "startX", "endX", "a", "(Ljava/util/List;FFI)Lk3/h1;", "startY", "endY", "g", "center", "e", "(Ljava/util/List;J)Lk3/h1;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h1 b(Companion companion, List list, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = l4.INSTANCE.a();
            }
            return companion.a(list, f11, f12, i11);
        }

        public static /* synthetic */ h1 d(Companion companion, List list, long j11, long j12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j11 = j3.g.INSTANCE.c();
            }
            long j13 = j11;
            if ((i12 & 4) != 0) {
                j12 = j3.g.INSTANCE.a();
            }
            long j14 = j12;
            if ((i12 & 8) != 0) {
                i11 = l4.INSTANCE.a();
            }
            return companion.c(list, j13, j14, i11);
        }

        public static /* synthetic */ h1 f(Companion companion, List list, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = j3.g.INSTANCE.b();
            }
            return companion.e(list, j11);
        }

        public static /* synthetic */ h1 h(Companion companion, List list, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = l4.INSTANCE.a();
            }
            return companion.g(list, f11, f12, i11);
        }

        public final h1 a(List<p1> colors, float startX, float endX, int tileMode) {
            return c(colors, j3.h.a(startX, BitmapDescriptorFactory.HUE_RED), j3.h.a(endX, BitmapDescriptorFactory.HUE_RED), tileMode);
        }

        public final h1 c(List<p1> colors, long start, long end, int tileMode) {
            return new m3(colors, null, start, end, tileMode, null);
        }

        public final h1 e(List<p1> colors, long center) {
            return new k4(center, colors, null, null);
        }

        public final h1 g(List<p1> colors, float startY, float endY, int tileMode) {
            return c(colors, j3.h.a(BitmapDescriptorFactory.HUE_RED, startY), j3.h.a(BitmapDescriptorFactory.HUE_RED, endY), tileMode);
        }

        private Companion() {
        }
    }

    public /* synthetic */ h1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long size, r3 p11, float alpha);

    private h1() {
        this.intrinsicSize = j3.m.INSTANCE.a();
    }
}
