package androidx.compose.ui;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "factory", "b", "(Landroidx/compose/ui/d;Lwn0/l;Lwn0/q;)Landroidx/compose/ui/d;", "Lr2/l;", "modifier", "e", "(Lr2/l;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d$b;", "it", "", "a", "(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<d.b, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5268c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(d.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/d;", "acc", "Landroidx/compose/ui/d$b;", "element", "a", "(Landroidx/compose/ui/d;Landroidx/compose/ui/d$b;)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<d, d.b, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.l f5269c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p020r2.l lVar) {
            super(2);
            this.f5269c = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(d dVar, d.b bVar) {
            boolean z11 = bVar instanceof androidx.compose.ui.b;
            d dVarD = bVar;
            if (z11) {
                q<d, p020r2.l, Integer, d> qVarI = ((androidx.compose.ui.b) bVar).i();
                s.i(qVarI, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                dVarD = c.d(this.f5269c, (d) ((q) u0.g(qVarI, 3)).invoke(d.INSTANCE, this.f5269c, 0));
            }
            return dVar.g(dVarD);
        }
    }

    public static final d b(d dVar, l<? super q1, h0> lVar, q<? super d, ? super p020r2.l, ? super Integer, ? extends d> qVar) {
        return dVar.g(new androidx.compose.ui.b(lVar, qVar));
    }

    public static /* synthetic */ d c(d dVar, l lVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = o1.a();
        }
        return b(dVar, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d d(p020r2.l lVar, d dVar) {
        if (dVar.a(a.f5268c)) {
            return dVar;
        }
        lVar.H(1219399079);
        d dVar2 = (d) dVar.b(d.INSTANCE, new b(lVar));
        lVar.T();
        return dVar2;
    }

    public static final d e(p020r2.l lVar, d dVar) {
        lVar.o(439770924);
        d dVarD = d(lVar, dVar);
        lVar.l();
        return dVarD;
    }
}
