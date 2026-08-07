package z3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lz3/a1;", "Lb4/g0$f;", "<init>", "()V", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a1 extends b4.g0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f126641b = new a1();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f126643c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0 w0Var) {
            super(1);
            this.f126643c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.p(aVar, this.f126643c, 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<w0> f126644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends w0> list) {
            super(1);
            this.f126644c = list;
        }

        public final void a(w0.a aVar) {
            List<w0> list = this.f126644c;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                w0.a.p(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    private a1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends h0> list, long j11) {
        if (list.isEmpty()) {
            return k0.N1(k0Var, w4.b.n(j11), w4.b.m(j11), null, a.f126642c, 4, null);
        }
        if (list.size() == 1) {
            w0 w0VarX0 = list.get(0).x0(j11);
            return k0.N1(k0Var, w4.c.i(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()), w4.c.h(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()), null, new b(w0VarX0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).x0(j11));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < size2; i12++) {
            w0 w0Var = (w0) arrayList.get(i12);
            iMax = Math.max(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), iMax);
            iMax2 = Math.max(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iMax2);
        }
        return k0.N1(k0Var, w4.c.i(j11, iMax), w4.c.h(j11, iMax2), null, new c(arrayList), 4, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f126642c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }

        public final void a(w0.a aVar) {
        }
    }
}
