package p025y1;

import androidx.compose.foundation.lazy.layout.c;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.w2;
import p024x1.d;
import p024x1.d0;
import p024x1.o;
import p024x1.t;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006%"}, d2 = {"Ly1/r;", "Lx1/t;", "Ly1/c0;", "state", "Lx1/o;", "Ly1/l;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "<init>", "(Ly1/c0;Lx1/o;Landroidx/compose/foundation/lazy/layout/c;)V", "", "index", "", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "f", "(ILjava/lang/Object;Lr2/l;I)V", "c", "(I)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ly1/c0;", "Lx1/o;", "Landroidx/compose/foundation/lazy/layout/c;", "Ly1/w;", DateTokenConverter.CONVERTER_KEY, "Ly1/w;", "pagerScopeImpl", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o<l> intervalContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c keyIndexMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w pagerScopeImpl = w.f124645a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124582d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f124582d = i11;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1142237095, i11, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
            }
            o oVar = r.this.intervalContent;
            int i12 = this.f124582d;
            r rVar = r.this;
            d.a aVar = oVar.h().get(i12);
            ((l) aVar.c()).a().invoke(rVar.pagerScopeImpl, Integer.valueOf(i12 - aVar.getStartIndex()), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
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

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f124585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f124586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Object obj, int i12) {
            super(2);
            this.f124584d = i11;
            this.f124585e = obj;
            this.f124586f = i12;
        }

        public final void a(l lVar, int i11) {
            r.this.f(this.f124584d, this.f124585e, lVar, k2.a(this.f124586f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public r(c0 c0Var, o<l> oVar, c cVar) {
        this.state = c0Var;
        this.intervalContent = oVar;
        this.keyIndexMap = cVar;
    }

    @Override // p024x1.t
    public int a() {
        return this.intervalContent.i();
    }

    @Override // p024x1.t
    public int b(Object key) {
        return this.keyIndexMap.b(key);
    }

    @Override // p024x1.t
    public Object c(int index) {
        Object objC = this.keyIndexMap.c(index);
        return objC == null ? this.intervalContent.j(index) : objC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof r) {
            return s.f(this.intervalContent, ((r) other).intervalContent);
        }
        return false;
    }

    @Override // p024x1.t
    public void f(int i11, Object obj, l lVar, int i12) {
        int i13;
        int i14;
        Object obj2;
        l lVarV = lVar.v(-1201380429);
        if ((i12 & 6) == 0) {
            i13 = (lVarV.r(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= lVarV.K(obj) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(this) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            i14 = i11;
            obj2 = obj;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1201380429, i13, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            i14 = i11;
            obj2 = obj;
            d0.a(obj2, i14, this.state.getPinnedPages(), z2.c.e(1142237095, true, new a(i11), lVarV, 54), lVarV, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(i14, obj2, i12));
        }
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
