package p024x1;

import androidx.collection.n0;
import androidx.collection.o0;
import androidx.compose.foundation.lazy.layout.c;
import bo0.j;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lx1/k0;", "Landroidx/compose/foundation/lazy/layout/c;", "Lbo0/j;", "nearestRange", "Lx1/o;", "intervalContent", "<init>", "(Lbo0/j;Lx1/o;)V", "", Action.KEY_ATTRIBUTE, "", "b", "(Ljava/lang/Object;)I", "index", "c", "(I)Ljava/lang/Object;", "Landroidx/collection/n0;", "Landroidx/collection/n0;", "map", "", "[Ljava/lang/Object;", "keys", DateTokenConverter.CONVERTER_KEY, "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n0<Object> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] keys;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx1/d$a;", "Lx1/o$a;", "it", "Ljn0/h0;", "a", "(Lx1/d$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<d.a<? extends o.a>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f122635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f122636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.collection.h0<Object> f122637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f122638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, androidx.collection.h0<Object> h0Var, k0 k0Var) {
            super(1);
            this.f122635c = i11;
            this.f122636d = i12;
            this.f122637e = h0Var;
            this.f122638f = k0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0039  */
        public final void a(d.a<? extends o.a> aVar) {
            Object objA;
            l<Integer, Object> key = aVar.c().getKey();
            int iMax = Math.max(this.f122635c, aVar.getStartIndex());
            int iMin = Math.min(this.f122636d, (aVar.getStartIndex() + aVar.getSize()) - 1);
            if (iMax > iMin) {
                return;
            }
            while (true) {
                if (key == null) {
                    objA = i0.a(iMax);
                } else {
                    objA = key.invoke(Integer.valueOf(iMax - aVar.getStartIndex()));
                    if (objA == null) {
                        objA = i0.a(iMax);
                    }
                }
                this.f122637e.s(objA, iMax);
                this.f122638f.keys[iMax - this.f122638f.keysStartIndex] = objA;
                if (iMax == iMin) {
                    return;
                } else {
                    iMax++;
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(d.a<? extends o.a> aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public k0(j jVar, o<?> oVar) {
        d<Interval> dVarH = oVar.h();
        int first = jVar.getFirst();
        if (first < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(jVar.getLast(), dVarH.getSize() - 1);
        if (iMin < first) {
            this.map = o0.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i11 = (iMin - first) + 1;
            this.keys = new Object[i11];
            this.keysStartIndex = first;
            androidx.collection.h0 h0Var = new androidx.collection.h0(i11);
            dVarH.a(first, iMin, new a(first, iMin, h0Var, this));
            this.map = h0Var;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int b(Object key) {
        n0<Object> n0Var = this.map;
        int iB = n0Var.b(key);
        if (iB >= 0) {
            return n0Var.values[iB];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public Object c(int index) {
        Object[] objArr = this.keys;
        int i11 = index - this.keysStartIndex;
        if (i11 < 0 || i11 > n.u0(objArr)) {
            return null;
        }
        return objArr[i11];
    }
}
