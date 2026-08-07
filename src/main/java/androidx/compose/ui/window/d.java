package androidx.compose.ui.window;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
public final class d implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6355a = new d();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f6357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var) {
            super(1);
            this.f6357c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f6357c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<w0> f6358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends w0> list) {
            super(1);
            this.f6358c = list;
        }

        public final void a(w0.a aVar) {
            int iO = v.o(this.f6358c);
            if (iO < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                w0.a aVar2 = aVar;
                w0.a.l(aVar2, this.f6358c.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                if (i11 == iO) {
                    return;
                }
                i11++;
                aVar = aVar2;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Override // z3.i0
    public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        int i11;
        int i12;
        int size = list.size();
        if (size == 0) {
            return k0.N1(k0Var, 0, 0, null, a.f6356c, 4, null);
        }
        int i13 = 0;
        if (size == 1) {
            w0 w0VarX0 = list.get(0).x0(j11);
            return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new b(w0VarX0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            arrayList.add(list.get(i14).x0(j11));
        }
        int iO = v.o(arrayList);
        if (iO >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                w0 w0Var = (w0) arrayList.get(i13);
                iMax = Math.max(iMax, w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
                iMax2 = Math.max(iMax2, w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
                if (i13 == iO) {
                    break;
                }
                i13++;
            }
            i11 = iMax;
            i12 = iMax2;
        } else {
            i11 = 0;
            i12 = 0;
        }
        return k0.N1(k0Var, i11, i12, null, new c(arrayList), 4, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6356c = new a();

        public a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }

        public final void a(w0.a aVar) {
        }
    }
}
