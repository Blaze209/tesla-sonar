package w1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;
import p024x1.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lw1/m;", "Lw1/l;", "Lw1/a0;", "state", "Lw1/j;", "intervalContent", "Landroidx/compose/foundation/lazy/a;", "itemScope", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "<init>", "(Lw1/a0;Lw1/j;Landroidx/compose/foundation/lazy/a;Landroidx/compose/foundation/lazy/layout/c;)V", "", "index", "", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "f", "(ILjava/lang/Object;Lr2/l;I)V", "c", "(I)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "b", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lw1/a0;", "Lw1/j;", "Landroidx/compose/foundation/lazy/a;", "g", "()Landroidx/compose/foundation/lazy/a;", "Landroidx/compose/foundation/lazy/layout/c;", "e", "()Landroidx/compose/foundation/lazy/layout/c;", "itemCount", "", "h", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j intervalContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.a itemScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.c keyIndexMap;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f120359d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-824725566, i11, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            j jVar = m.this.intervalContent;
            int i12 = this.f120359d;
            m mVar = m.this;
            x1.d.a<i> aVar = jVar.h().get(i12);
            aVar.c().a().invoke(mVar.getItemScope(), Integer.valueOf(i12 - aVar.getStartIndex()), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f120362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f120363f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Object obj, int i12) {
            super(2);
            this.f120361d = i11;
            this.f120362e = obj;
            this.f120363f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            m.this.f(this.f120361d, this.f120362e, lVar, k2.a(this.f120363f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public m(a0 a0Var, j jVar, androidx.compose.foundation.lazy.a aVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.state = a0Var;
        this.intervalContent = jVar;
        this.itemScope = aVar;
        this.keyIndexMap = cVar;
    }

    @Override // p024x1.t
    public int a() {
        return this.intervalContent.i();
    }

    @Override // p024x1.t
    public int b(Object key) {
        return getKeyIndexMap().b(key);
    }

    @Override // p024x1.t
    public Object c(int index) {
        Object objC = getKeyIndexMap().c(index);
        return objC == null ? this.intervalContent.j(index) : objC;
    }

    @Override // p024x1.t
    public Object d(int index) {
        return this.intervalContent.g(index);
    }

    @Override // w1.l
    /* JADX INFO: renamed from: e, reason: from getter */
    public androidx.compose.foundation.lazy.layout.c getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m) {
            return p013kotlin.jvm.internal.s.f(this.intervalContent, ((m) other).intervalContent);
        }
        return false;
    }

    @Override // p024x1.t
    public void f(int i11, Object obj, p020r2.l lVar, int i12) {
        int i13;
        int i14;
        Object obj2;
        p020r2.l lVarV = lVar.v(-462424778);
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
                p020r2.o.S(-462424778, i13, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            i14 = i11;
            obj2 = obj;
            d0.a(obj2, i14, this.state.getPinnedItems(), z2.c.e(-824725566, true, new a(i11), lVarV, 54), lVarV, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(i14, obj2, i12));
        }
    }

    @Override // w1.l
    /* JADX INFO: renamed from: g, reason: from getter */
    public androidx.compose.foundation.lazy.a getItemScope() {
        return this.itemScope;
    }

    @Override // w1.l
    public List<Integer> h() {
        return this.intervalContent.k();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
