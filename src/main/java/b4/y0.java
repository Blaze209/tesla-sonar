package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d$b;", "prev", "next", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;)I", "Landroidx/compose/ui/d$c;", "T", "Lb4/s0;", "node", "Ljn0/h0;", "f", "(Lb4/s0;Landroidx/compose/ui/d$c;)V", "Landroidx/compose/ui/d;", "Lt2/b;", "result", "e", "(Landroidx/compose/ui/d;Lt2/b;)Lt2/b;", "b4/y0$a", "a", "Lb4/y0$a;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f16314a;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b4/y0$a", "Landroidx/compose/ui/d$c;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends androidx.compose.ui.d.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d$b;", "element", "", "a", "(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<androidx.compose.ui.d.b, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t2.b<androidx.compose.ui.d.b> f16315c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t2.b<androidx.compose.ui.d.b> bVar) {
            super(1);
            this.f16315c = bVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.d.b bVar) {
            this.f16315c.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.n2(-1);
        f16314a = aVar;
    }

    public static final int d(androidx.compose.ui.d.b bVar, androidx.compose.ui.d.b bVar2) {
        if (p013kotlin.jvm.internal.s.f(bVar, bVar2)) {
            return 2;
        }
        return d3.b.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final t2.b<androidx.compose.ui.d.b> e(androidx.compose.ui.d dVar, t2.b<androidx.compose.ui.d.b> bVar) {
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d[bo0.n.f(bVar.getSize(), 16)], 0);
        bVar2.b(dVar);
        b bVar3 = null;
        while (bVar2.q()) {
            androidx.compose.ui.d dVar2 = (androidx.compose.ui.d) bVar2.v(bVar2.getSize() - 1);
            if (dVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) dVar2;
                bVar2.b(aVar.getInner());
                bVar2.b(aVar.getOuter());
            } else if (dVar2 instanceof androidx.compose.ui.d.b) {
                bVar.b(dVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                dVar2.a(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends androidx.compose.ui.d.c> void f(s0<T> s0Var, androidx.compose.ui.d.c cVar) {
        p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        s0Var.m(cVar);
    }
}
