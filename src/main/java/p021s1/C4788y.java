package p021s1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import wn0.l;

/* JADX INFO: renamed from: s1.y, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Ls1/x;", "a", "(Lwn0/l;)Ls1/x;", "b", "(Lwn0/l;Lr2/l;I)Ls1/x;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C4788y {

    /* JADX INFO: renamed from: s1.y$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<l<Float, Float>> f109635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(y3<? extends l<? super Float, Float>> y3Var) {
            super(1);
            this.f109635c = y3Var;
        }

        public final Float a(float f11) {
            return this.f109635c.getValue().invoke(Float.valueOf(f11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    public static final x a(l<? super Float, Float> lVar) {
        return new h(lVar);
    }

    public static final x b(l<? super Float, Float> lVar, p020r2.l lVar2, int i11) {
        if (o.J()) {
            o.S(-180460798, i11, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        y3 y3VarO = n3.o(lVar, lVar2, i11 & 14);
        Object objI = lVar2.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = a(new a(y3VarO));
            lVar2.B(objI);
        }
        x xVar = (x) objI;
        if (o.J()) {
            o.R();
        }
        return xVar;
    }
}
