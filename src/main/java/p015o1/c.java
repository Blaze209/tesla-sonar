package p015o1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;
import w4.r;
import w4.s;
import wn0.l;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.q;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lo1/c;", "Lz3/i0;", "Lo1/f;", "scope", "<init>", "(Lo1/f;)V", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "g", "(Lz3/r;Ljava/util/List;I)I", Snapshot.WIDTH, "j", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "a", "Lo1/f;", "getScope", "()Lo1/f;", "", "b", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<w0> f95582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends w0> list) {
            super(1);
            this.f95582c = list;
        }

        public final void a(w0.a aVar) {
            List<w0> list = this.f95582c;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                w0.a.h(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public c(f fVar) {
        this.scope = fVar;
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).x0(j11));
        }
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i12 = ((w0) obj).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            int iO = v.o(arrayList);
            if (1 <= iO) {
                int i13 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i13);
                    int i14 = ((w0) obj3).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                    if (i12 < i14) {
                        obj = obj3;
                        i12 = i14;
                    }
                    if (i13 == iO) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            obj = null;
        }
        w0 w0Var = (w0) obj;
        int i15 = w0Var != null ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int i16 = ((w0) obj4).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            int iO2 = v.o(arrayList);
            if (1 <= iO2) {
                int i17 = 1;
                while (true) {
                    Object obj5 = arrayList.get(i17);
                    int i18 = ((w0) obj5).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    if (i16 < i18) {
                        obj4 = obj5;
                        i16 = i18;
                    }
                    if (i17 == iO2) {
                        break;
                    }
                    i17++;
                }
            }
            obj2 = obj4;
        }
        w0 w0Var2 = (w0) obj2;
        int i19 = w0Var2 != null ? w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : 0;
        if (k0Var.d1()) {
            this.hasLookaheadOccurred = true;
            this.scope.a().setValue(r.b(s.a(i15, i19)));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.a().setValue(r.b(s.a(i15, i19)));
        }
        return k0.N1(k0Var, i15, i19, null, new a(arrayList), 4, null);
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
