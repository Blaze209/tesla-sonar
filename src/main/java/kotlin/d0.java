package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.jvm.internal.u;
import w4.b;
import w4.n;
import wn0.l;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lb2/d0;", "Lz3/i0;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(Lwn0/a;)V", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "a", "Lwn0/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> shouldMeasureLinks;

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<z3.h0> f15482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f15483d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends z3.h0> list, d0 d0Var) {
            super(1);
            this.f15482c = list;
            this.f15483d = d0Var;
        }

        public final void a(w0.a aVar) {
            List listI = d.i(this.f15482c, this.f15483d.shouldMeasureLinks);
            if (listI != null) {
                int size = listI.size();
                for (int i11 = 0; i11 < size; i11++) {
                    p013kotlin.Pair pair = (p013kotlin.Pair) listI.get(i11);
                    w0 w0Var = (w0) pair.a();
                    wn0.a aVar2 = (wn0.a) pair.b();
                    w0.a.j(aVar, w0Var, aVar2 != null ? ((n) aVar2.invoke()).getPackedValue() : n.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public d0(wn0.a<Boolean> aVar) {
        this.shouldMeasureLinks = aVar;
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        return k0.N1(k0Var, b.l(j11), b.k(j11), null, new a(list, this), 4, null);
    }
}
