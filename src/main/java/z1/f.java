package z1;

import b4.j;
import b4.k;
import j3.i;
import j3.n;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.u;
import w4.s;
import z3.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb4/j;", "Lj3/i;", "rect", "Ljn0/h0;", "a", "(Lb4/j;Lj3/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/ScrollIntoView")
public final /* synthetic */ class f {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/i;", "b", "()Lj3/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f126440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f126441d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, v vVar) {
            super(0);
            this.f126440c = iVar;
            this.f126441d = vVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            i iVar = this.f126440c;
            if (iVar != null) {
                return iVar;
            }
            v vVar = this.f126441d;
            if (!vVar.b0()) {
                vVar = null;
            }
            if (vVar != null) {
                return n.c(s.d(vVar.e()));
            }
            return null;
        }
    }

    public static final Object a(j jVar, i iVar, Continuation<? super h0> continuation) {
        if (!jVar.getNode().getIsAttached()) {
            return h0.f84049a;
        }
        v vVarK = k.k(jVar);
        z1.a aVarC = androidx.compose.foundation.relocation.b.c(jVar);
        if (aVarC == null) {
            return h0.f84049a;
        }
        Object objX1 = aVarC.x1(vVarK, new a(iVar, vVarK), continuation);
        return objX1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX1 : h0.f84049a;
    }

    public static /* synthetic */ Object b(j jVar, i iVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = null;
        }
        return e.a(jVar, iVar, continuation);
    }
}
