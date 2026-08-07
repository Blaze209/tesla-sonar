package rj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR/\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lrj0/f;", "", "<init>", "()V", "Lp1/i;", "", "b", "Lp1/i;", "()Lp1/i;", "SpringAnimationSpec", "Lkotlin/Function1;", "Lrj0/h;", "c", "Lwn0/l;", "a", "()Lwn0/l;", "getMaximumFlingDistance$annotations", "MaximumFlingDistance", "Lkotlin/Function3;", "", DateTokenConverter.CONVERTER_KEY, "Lwn0/q;", "getSnapIndex", "()Lwn0/q;", "SnapIndex", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f108498a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p019p1.i<Float> SpringAnimationSpec = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final l<h, Float> MaximumFlingDistance = a.f108503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final q<h, Integer, Integer, Integer> SnapIndex = b.f108504c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f108502e = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrj0/h;", "it", "", "a", "(Lrj0/h;)Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0})
    static final class a extends u implements l<h, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f108503c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(h it) {
            s.k(it, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrj0/h;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "targetIndex", "a", "(Lrj0/h;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class b extends u implements q<h, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f108504c = new b();

        b() {
            super(3);
        }

        public final Integer a(h noName_0, int i11, int i12) {
            s.k(noName_0, "$noName_0");
            return Integer.valueOf(i12);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Integer invoke(h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    private f() {
    }

    public final l<h, Float> a() {
        return MaximumFlingDistance;
    }

    public final p019p1.i<Float> b() {
        return SpringAnimationSpec;
    }
}
