package p024x1;

import a3.d;
import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lx1/t;", "itemProvider", "Lx1/s0;", "La3/d;", "saveableStateHolder", "", "index", "", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "a", "(Lx1/t;Ljava/lang/Object;ILjava/lang/Object;Lr2/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f122659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f122660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f122661e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar, int i11, Object obj) {
            super(2);
            this.f122659c = tVar;
            this.f122660d = i11;
            this.f122661e = obj;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(980966366, i11, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.f122659c.f(this.f122660d, this.f122661e, lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f122662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f122663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f122664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f122665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f122666g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, Object obj, int i11, Object obj2, int i12) {
            super(2);
            this.f122662c = tVar;
            this.f122663d = obj;
            this.f122664e = i11;
            this.f122665f = obj2;
            this.f122666g = i12;
        }

        public final void a(l lVar, int i11) {
            s.a(this.f122662c, this.f122663d, this.f122664e, this.f122665f, lVar, k2.a(this.f122666g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, Object obj, int i11, Object obj2, l lVar, int i12) {
        int i13;
        l lVarV = lVar.v(1439843069);
        if ((i12 & 6) == 0) {
            i13 = (lVarV.n(tVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= lVarV.n(obj) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.r(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= lVarV.n(obj2) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1439843069, i13, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((d) obj).e(obj2, c.e(980966366, true, new a(tVar, i11, obj2), lVarV, 54), lVarV, 48);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(tVar, obj, i11, obj2, i12));
        }
    }
}
