package w1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p024x1.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lw1/a;", "Lw1/v;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Lw1/u;", "", "delta", "Lw1/p;", "layoutInfo", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lw1/u;FLw1/p;)V", "a", "(Lw1/u;Lw1/p;)V", "Lx1/l0;", "firstVisibleItemIndex", "b", "(Lx1/l0;I)V", "I", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "c", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.d.b currentPrefetchHandle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    public a(int i11) {
        this.nestedPrefetchItemCount = i11;
    }

    @Override // w1.v
    public void a(u uVar, p pVar) {
        if (this.indexToPrefetch == -1 || pVar.j().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((k) p013kotlin.collections.v.A0(pVar.j())).getIndex() + 1 : ((k) p013kotlin.collections.v.o0(pVar.j())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            androidx.compose.foundation.lazy.layout.d.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    @Override // w1.v
    public void b(l0 l0Var, int i11) {
        int i12 = this.nestedPrefetchItemCount;
        for (int i13 = 0; i13 < i12; i13++) {
            l0Var.a(i11 + i13);
        }
    }

    @Override // w1.v
    public void d(u uVar, float f11, p pVar) {
        androidx.compose.foundation.lazy.layout.d.b bVar;
        androidx.compose.foundation.lazy.layout.d.b bVar2;
        androidx.compose.foundation.lazy.layout.d.b bVar3;
        if (pVar.j().isEmpty()) {
            return;
        }
        boolean z11 = f11 < BitmapDescriptorFactory.HUE_RED;
        int index = z11 ? ((k) p013kotlin.collections.v.A0(pVar.j())).getIndex() + 1 : ((k) p013kotlin.collections.v.o0(pVar.j())).getIndex() - 1;
        if (index < 0 || index >= pVar.h()) {
            return;
        }
        if (index != this.indexToPrefetch) {
            if (this.wasScrollingForward != z11 && (bVar3 = this.currentPrefetchHandle) != null) {
                bVar3.cancel();
            }
            this.wasScrollingForward = z11;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = uVar.a(index);
        }
        if (!z11) {
            if (pVar.d() - ((k) p013kotlin.collections.v.o0(pVar.j())).getOffset() >= f11 || (bVar = this.currentPrefetchHandle) == null) {
                return;
            }
            bVar.b();
            return;
        }
        k kVar = (k) p013kotlin.collections.v.A0(pVar.j());
        if (((kVar.getOffset() + kVar.getSize()) + pVar.i()) - pVar.e() >= (-f11) || (bVar2 = this.currentPrefetchHandle) == null) {
            return;
        }
        bVar2.b();
    }
}
