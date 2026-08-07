package z3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010\u001f\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ#\u0010 \u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lz3/e;", "Lb4/b0;", "Lw4/r;", "lookaheadSize", "", "q1", "(J)Z", "Lz3/w0$a;", "Lz3/v;", "lookaheadCoordinates", "Y0", "(Lz3/w0$a;Lz3/v;)Z", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/f;", "k1", "(Lz3/f;Lz3/h0;J)Lz3/j0;", "Lz3/c;", "Lz3/q;", "", Snapshot.HEIGHT, "X", "(Lz3/c;Lz3/q;I)I", Snapshot.WIDTH, "X0", "O0", "T0", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface e extends b4.b0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/f;", "Lz3/h0;", "intrinsicMeasurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/f;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements b4.d1.a {
        a() {
        }

        @Override // b4.d1.a
        public final j0 a(f fVar, h0 h0Var, long j11) {
            return e.this.k1(fVar, h0Var, j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/f;", "Lz3/h0;", "intrinsicMeasurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/f;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class b implements b4.d1.a {
        b() {
        }

        @Override // b4.d1.a
        public final j0 a(f fVar, h0 h0Var, long j11) {
            return e.this.k1(fVar, h0Var, j11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f126710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0 w0Var) {
            super(1);
            this.f126710c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f126710c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/f;", "Lz3/h0;", "intrinsicMeasurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/f;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class d implements b4.d1.a {
        d() {
        }

        @Override // b4.d1.a
        public final j0 a(f fVar, h0 h0Var, long j11) {
            return e.this.k1(fVar, h0Var, j11);
        }
    }

    /* JADX INFO: renamed from: z3.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/f;", "Lz3/h0;", "intrinsicMeasurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/f;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class C2747e implements b4.d1.a {
        C2747e() {
        }

        @Override // b4.d1.a
        public final j0 a(f fVar, h0 h0Var, long j11) {
            return e.this.k1(fVar, h0Var, j11);
        }
    }

    default int O0(z3.c cVar, q qVar, int i11) {
        return b4.d1.f16047a.c(new b(), cVar, qVar, i11);
    }

    default int T0(z3.c cVar, q qVar, int i11) {
        return b4.d1.f16047a.a(new a(), cVar, qVar, i11);
    }

    default int X(z3.c cVar, q qVar, int i11) {
        return b4.d1.f16047a.g(new C2747e(), cVar, qVar, i11);
    }

    default int X0(z3.c cVar, q qVar, int i11) {
        return b4.d1.f16047a.e(new d(), cVar, qVar, i11);
    }

    default boolean Y0(w0.a aVar, v vVar) {
        return false;
    }

    @Override // b4.b0
    default j0 c(k0 k0Var, h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new c(w0VarX0), 4, null);
    }

    j0 k1(f fVar, h0 h0Var, long j11);

    boolean q1(long lookaheadSize);
}
