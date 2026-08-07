package androidx.compose.animation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;
import w4.r;
import w4.s;
import w4.t;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.q;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/b;", "Lz3/i0;", "Landroidx/compose/animation/e;", "rootScope", "<init>", "(Landroidx/compose/animation/e;)V", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "g", "(Lz3/r;Ljava/util/List;I)I", Snapshot.WIDTH, "j", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "a", "Landroidx/compose/animation/e;", "()Landroidx/compose/animation/e;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e<?> rootScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0[] f4008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f4009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0[] w0VarArr, b bVar, int i11, int i12) {
            super(1);
            this.f4008c = w0VarArr;
            this.f4009d = bVar;
            this.f4010e = i11;
            this.f4011f = i12;
        }

        public final void a(w0.a aVar) {
            w0.a aVar2;
            w0[] w0VarArr = this.f4008c;
            b bVar = this.f4009d;
            int i11 = this.f4010e;
            int i12 = this.f4011f;
            int length = w0VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                w0 w0Var = w0VarArr[i13];
                if (w0Var != null) {
                    long jA = bVar.a().getContentAlignment().a(s.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()), s.a(i11, i12), t.Ltr);
                    aVar2 = aVar;
                    w0.a.h(aVar2, w0Var, w4.n.h(jA), w4.n.i(jA), BitmapDescriptorFactory.HUE_RED, 4, null);
                } else {
                    aVar2 = aVar;
                }
                i13++;
                aVar = aVar2;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public b(e<?> eVar) {
        this.rootScope = eVar;
    }

    public final e<?> a() {
        return this.rootScope;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00db A[SYNTHETIC] */
    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        w0 w0Var;
        w0 w0Var2;
        int i11;
        int iG;
        int iU0;
        int i12;
        s0 it;
        w0 w0Var3;
        int i13;
        int i14;
        int size = list.size();
        w0[] w0VarArr = new w0[size];
        long jA = r.INSTANCE.a();
        int size2 = list.size();
        int iF = 0;
        int i15 = 0;
        while (true) {
            w0Var = null;
            if (i15 >= size2) {
                break;
            }
            z3.h0 h0Var = list.get(i15);
            Object parentData = h0Var.getParentData();
            e.a aVar = parentData instanceof e.a ? (e.a) parentData : null;
            if (aVar != null && aVar.i()) {
                w0 w0VarX0 = h0Var.x0(j11);
                long jA2 = s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
                h0 h0Var2 = h0.f84049a;
                w0VarArr[i15] = w0VarX0;
                jA = jA2;
            }
            i15++;
        }
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            z3.h0 h0Var3 = list.get(i16);
            if (w0VarArr[i16] == null) {
                w0VarArr[i16] = h0Var3.x0(j11);
            }
        }
        if (!k0Var.d1()) {
            if (size == 0) {
                w0Var2 = null;
            } else {
                w0Var2 = w0VarArr[0];
                int iU1 = p013kotlin.collections.n.u0(w0VarArr);
                if (iU1 != 0) {
                    int i17 = w0Var2 != null ? w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0;
                    s0 it2 = new bo0.j(1, iU1).iterator();
                    while (it2.hasNext()) {
                        w0 w0Var4 = w0VarArr[it2.nextInt()];
                        int i18 = w0Var4 != null ? w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0;
                        if (i17 < i18) {
                            w0Var2 = w0Var4;
                            i17 = i18;
                        }
                    }
                }
            }
            if (w0Var2 != null) {
                iG = w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            } else {
                i11 = 0;
            }
            if (k0Var.d1()) {
                iF = r.f(jA);
            } else {
                if (size != 0) {
                    w0Var = w0VarArr[0];
                    iU0 = p013kotlin.collections.n.u0(w0VarArr);
                    if (iU0 != 0) {
                        if (w0Var != null) {
                            i12 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        } else {
                            i12 = 0;
                        }
                        it = new bo0.j(1, iU0).iterator();
                        while (it.hasNext()) {
                            w0Var3 = w0VarArr[it.nextInt()];
                            if (w0Var3 != null) {
                                i13 = w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                            } else {
                                i13 = 0;
                            }
                            if (i12 < i13) {
                                w0Var = w0Var3;
                                i12 = i13;
                            }
                        }
                    }
                }
                if (w0Var != null) {
                    iF = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                }
            }
            i14 = iF;
            if (!k0Var.d1()) {
                this.rootScope.w(s.a(i11, i14));
            }
            return k0.N1(k0Var, i11, i14, null, new a(w0VarArr, this, i11, i14), 4, null);
        }
        iG = r.g(jA);
        i11 = iG;
        if (k0Var.d1()) {
            iF = r.f(jA);
        } else {
            if (size != 0) {
                w0Var = w0VarArr[0];
                iU0 = p013kotlin.collections.n.u0(w0VarArr);
                if (iU0 != 0) {
                    if (w0Var != null) {
                        i12 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    } else {
                        i12 = 0;
                    }
                    it = new bo0.j(1, iU0).iterator();
                    while (it.hasNext()) {
                        w0Var3 = w0VarArr[it.nextInt()];
                        if (w0Var3 != null) {
                            i13 = w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        } else {
                            i13 = 0;
                        }
                        if (i12 < i13) {
                            w0Var = w0Var3;
                            i12 = i13;
                        }
                    }
                }
            }
            if (w0Var != null) {
                iF = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            }
        }
        i14 = iF;
        if (!k0Var.d1()) {
            this.rootScope.w(s.a(i11, i14));
        }
        return k0.N1(k0Var, i11, i14, null, new a(w0VarArr, this, i11, i14), 4, null);
    }

    @Override // z3.i0
    public int d(z3.r rVar, List<? extends q> list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).t0(i11));
            int iO = v.o(list);
            int i12 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).t0(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iO) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z3.i0
    public int g(z3.r rVar, List<? extends q> list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).s0(i11));
            int iO = v.o(list);
            int i12 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).s0(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iO) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z3.i0
    public int i(z3.r rVar, List<? extends q> list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).V(i11));
            int iO = v.o(list);
            int i12 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).V(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iO) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // z3.i0
    public int j(z3.r rVar, List<? extends q> list, int i11) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).m0(i11));
            int iO = v.o(list);
            int i12 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i12).m0(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == iO) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
