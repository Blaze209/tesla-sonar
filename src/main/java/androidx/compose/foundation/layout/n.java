package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/d;", "Lv1/w;", "intrinsicSize", "b", "(Landroidx/compose/ui/d;Lv1/w;)Landroidx/compose/ui/d;", "a", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.w f4603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1.w wVar) {
            super(1);
            this.f4603c = wVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b(Snapshot.HEIGHT);
            q1Var.getProperties().a("intrinsicSize", this.f4603c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.w f4604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1.w wVar) {
            super(1);
            this.f4604c = wVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b(Snapshot.WIDTH);
            q1Var.getProperties().a("intrinsicSize", this.f4604c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, v1.w wVar) {
        return dVar.g(new IntrinsicHeightElement(wVar, true, o1.b() ? new a(wVar) : o1.a()));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, v1.w wVar) {
        return dVar.g(new IntrinsicWidthElement(wVar, true, o1.b() ? new b(wVar) : o1.a()));
    }
}
