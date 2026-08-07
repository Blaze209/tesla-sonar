package w1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Map;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.EmptyCoroutineContext;
import z3.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Lw1/a0;", "c", "(IILr2/l;II)Lw1/a0;", "Lw4/h;", "a", Gender.FEMALE, "DeltaThresholdForScrollAnimation", "Lw1/r;", "b", "Lw1/r;", "EmptyLazyListMeasureResult", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f120334a = w4.h.g(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f120335b = new r(null, 0, false, BitmapDescriptorFactory.HUE_RED, new a(), BitmapDescriptorFactory.HUE_RED, false, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), w4.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null), w4.c.b(0, 0, 0, 0, 15, null), p013kotlin.collections.v.m(), 0, 0, 0, false, p021s1.p.Vertical, 0, 0, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw1/a0;", "b", "()Lw1/a0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f120339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120340d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12) {
            super(0);
            this.f120339c = i11;
            this.f120340d = i12;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0(this.f120339c, this.f120340d);
        }
    }

    public static final a0 c(int i11, int i12, p020r2.l lVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if (p020r2.o.J()) {
            p020r2.o.S(1470655220, i13, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Object[] objArr = new Object[0];
        a3.j<a0, ?> jVarA = a0.INSTANCE.a();
        boolean z11 = ((((i13 & 14) ^ 6) > 4 && lVar.r(i11)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && lVar.r(i12)) || (i13 & 48) == 32);
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new b(i11, i12);
            lVar.B(objI);
        }
        a0 a0Var = (a0) a3.b.c(objArr, jVarA, null, (wn0.a) objI, lVar, 0, 4);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return a0Var;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"w1/b0$a", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "a", "I", "getWidth", "()I", Snapshot.WIDTH, "b", "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "c", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<z3.a, Integer> alignmentLines = v0.i();

        a() {
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getF126685b() {
            return this.height;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getF126684a() {
            return this.width;
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.alignmentLines;
        }

        @Override // z3.j0
        public void k() {
        }
    }
}
