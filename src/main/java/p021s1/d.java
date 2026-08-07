package p021s1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p019p1.i;
import p019p1.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ls1/d;", "", "", "offset", "size", "containerSize", "b", "(FFF)F", "Lp1/i;", "a", "()Lp1/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f109455a;

    /* JADX INFO: renamed from: s1.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls1/d$a;", "", "<init>", "()V", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lp1/i;", "b", "Lp1/i;", "c", "()Lp1/i;", "DefaultScrollAnimationSpec", "Ls1/d;", "Ls1/d;", "()Ls1/d;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f109455a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final i<Float> DefaultScrollAnimationSpec = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final d DefaultBringIntoViewSpec = new C2323a();

        /* JADX INFO: renamed from: s1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s1/d$a$a", "Ls1/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2323a implements d {
            C2323a() {
            }
        }

        private Companion() {
        }

        public final float a(float offset, float size, float containerSize) {
            float f11 = size + offset;
            if (offset >= BitmapDescriptorFactory.HUE_RED && f11 <= containerSize) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (offset < BitmapDescriptorFactory.HUE_RED && f11 > containerSize) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11 - containerSize;
            return Math.abs(offset) < Math.abs(f12) ? offset : f12;
        }

        public final d b() {
            return DefaultBringIntoViewSpec;
        }

        public final i<Float> c() {
            return DefaultScrollAnimationSpec;
        }
    }

    default i<Float> a() {
        return INSTANCE.c();
    }

    default float b(float offset, float size, float containerSize) {
        return INSTANCE.a(offset, size, containerSize);
    }
}
