package v1;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "Lv1/m0;", "insets", "a", "(Landroidx/compose/ui/d;Lv1/m0;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f117571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            super(1);
            this.f117571c = m0Var;
        }

        public final void a(q1 q1Var) {
            q1Var.b("insetsBottomHeight");
            q1Var.getProperties().a("insets", this.f117571c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv1/m0;", "Lw4/d;", "it", "", "a", "(Lv1/m0;Lw4/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<m0, w4.d, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f117572c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(m0 m0Var, w4.d dVar) {
            return Integer.valueOf(m0Var.b(dVar));
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, m0 m0Var) {
        return dVar.g(new l(m0Var, o1.b() ? new a(m0Var) : o1.a(), b.f117572c));
    }
}
