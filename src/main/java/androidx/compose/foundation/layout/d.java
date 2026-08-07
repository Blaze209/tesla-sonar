package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4556d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f11, boolean z11) {
            super(1);
            this.f4555c = f11;
            this.f4556d = z11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("aspectRatio");
            q1Var.getProperties().a("ratio", Float.valueOf(this.f4555c));
            q1Var.getProperties().a("matchHeightConstraintsFirst", Boolean.valueOf(this.f4556d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, boolean z11) {
        return dVar.g(new AspectRatioElement(f11, z11, o1.b() ? new a(f11, z11) : o1.a()));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(dVar, f11, z11);
    }
}
