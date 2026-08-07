package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/i;", "Lv1/c;", "<init>", "()V", "Landroidx/compose/ui/d;", "Ld3/c;", "alignment", "a", "(Landroidx/compose/ui/d;Ld3/c;)Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements v1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f4585a = new i();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3.c f4586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d3.c cVar) {
            super(1);
            this.f4586c = cVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("align");
            q1Var.c(this.f4586c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {
        public b() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("matchParentSize");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    private i() {
    }

    @Override // v1.c
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, d3.c cVar) {
        return dVar.g(new BoxChildDataElement(cVar, false, o1.b() ? new a(cVar) : o1.a()));
    }

    @Override // v1.c
    public androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return dVar.g(new BoxChildDataElement(d3.c.INSTANCE.e(), true, o1.b() ? new b() : o1.a()));
    }
}
