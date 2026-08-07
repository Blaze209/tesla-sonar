package q1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.ProgressBarRangeInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/d;", "", "value", "Lbo0/e;", "valueRange", "", "steps", "b", "(Landroidx/compose/ui/d;FLbo0/e;I)Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f104328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ bo0.e<Float> f104329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f104330e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, bo0.e<Float> eVar, int i11) {
            super(1);
            this.f104328c = f11;
            this.f104329d = eVar;
            this.f104330e = i11;
        }

        public final void a(g4.y yVar) {
            g4.v.j0(yVar, new ProgressBarRangeInfo(((Number) bo0.n.r(Float.valueOf(this.f104328c), this.f104329d)).floatValue(), this.f104329d, this.f104330e));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f104331c = new b();

        b() {
            super(1);
        }

        public final void a(g4.y yVar) {
            g4.v.j0(yVar, ProgressBarRangeInfo.INSTANCE.a());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar) {
        return g4.o.c(dVar, true, b.f104331c);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, bo0.e<Float> eVar, int i11) {
        return g4.o.c(dVar, true, new a(f11, eVar, i11));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f11, bo0.e eVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            eVar = bo0.n.b(BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return b(dVar, f11, eVar, i11);
    }
}
