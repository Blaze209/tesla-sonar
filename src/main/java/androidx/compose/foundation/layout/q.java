package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lw4/h;", "x", "y", "b", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lw4/d;", "Lw4/n;", "offset", "a", "(Landroidx/compose/ui/d;Lwn0/l;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4609d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, float f12) {
            super(1);
            this.f4608c = f11;
            this.f4609d = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("offset");
            q1Var.getProperties().a("x", w4.h.d(this.f4608c));
            q1Var.getProperties().a("y", w4.h.d(this.f4609d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<w4.d, w4.n> f4610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super w4.d, w4.n> lVar) {
            super(1);
            this.f4610c = lVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("offset");
            q1Var.getProperties().a("offset", this.f4610c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, wn0.l<? super w4.d, w4.n> lVar) {
        return dVar.g(new OffsetPxModifier(lVar, true, new b(lVar)));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new OffsetModifierElement(f11, f12, true, new a(f11, f12), null));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        return b(dVar, f11, f12);
    }
}
