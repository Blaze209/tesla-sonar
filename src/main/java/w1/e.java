package w1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0019\u001a\u00020\u000e2\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010$\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001e¨\u0006%"}, d2 = {"Lw1/e;", "Lx1/h;", "Lw1/a0;", "state", "<init>", "(Lw1/a0;)V", "Lw1/p;", "layoutInfo", "", "h", "(Lw1/p;)I", "Ls1/u;", "index", "scrollOffset", "Ljn0/h0;", "b", "(Ls1/u;II)V", "targetIndex", "", "f", "(I)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lw1/a0;", DateTokenConverter.CONVERTER_KEY, "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "e", "lastVisibleItemIndex", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements p024x1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 state;

    public e(a0 a0Var) {
        this.state = a0Var;
    }

    private final int h(p layoutInfo) {
        List<k> listJ = layoutInfo.j();
        int size = listJ.size();
        int size2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            size2 += listJ.get(i11).getSize();
        }
        return (size2 / listJ.size()) + layoutInfo.getMainAxisItemSpacing();
    }

    @Override // p024x1.h
    public int a() {
        return this.state.x().getTotalItemsCount();
    }

    @Override // p024x1.h
    public void b(p021s1.u uVar, int i11, int i12) {
        this.state.O(i11, i12, true);
    }

    @Override // p024x1.h
    public Object c(wn0.p<? super p021s1.u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objF = p021s1.x.f(this.state, null, pVar, continuation, 1, null);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
    }

    @Override // p024x1.h
    public int d() {
        return this.state.s();
    }

    @Override // p024x1.h
    public int e() {
        k kVar = (k) p013kotlin.collections.v.C0(this.state.x().j());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    @Override // p024x1.h
    public float f(int targetIndex) {
        k kVar;
        p pVarX = this.state.x();
        if (pVarX.j().isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        List<k> listJ = pVarX.j();
        int size = listJ.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                kVar = null;
                break;
            }
            kVar = listJ.get(i11);
            if (kVar.getIndex() == targetIndex) {
                break;
            }
            i11++;
        }
        k kVar2 = kVar;
        return kVar2 == null ? (h(pVarX) * (targetIndex - d())) - g() : kVar2.getOffset();
    }

    @Override // p024x1.h
    public int g() {
        return this.state.t();
    }
}
