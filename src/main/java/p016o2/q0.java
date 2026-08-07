package p016o2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.List;
import java.util.NoSuchElementException;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p2.j;
import v1.y;
import wn0.l;
import wn0.p;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.q;
import z3.r;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lo2/q0;", "Lz3/i0;", "", "singleLine", "", "animationProgress", "Lv1/y;", "paddingValues", "<init>", "(ZFLv1/y;)V", "", "Lz3/q;", "measurables", "", Snapshot.HEIGHT, "Lkotlin/Function2;", "intrinsicMeasurer", "h", "(Ljava/util/List;ILwn0/p;)I", "Lz3/r;", Snapshot.WIDTH, "f", "(Lz3/r;Ljava/util/List;ILwn0/p;)I", "Lz3/k0;", "Lz3/h0;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/r;Ljava/util/List;I)I", "j", DateTokenConverter.CONVERTER_KEY, "g", "a", "Z", "b", Gender.FEMALE, "Lv1/y;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y paddingValues;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "w", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96069c = new a();

        a() {
            super(2);
        }

        public final Integer a(q qVar, int i11) {
            return Integer.valueOf(qVar.V(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "h", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96070c = new b();

        b() {
            super(2);
        }

        public final Integer a(q qVar, int i11) {
            return Integer.valueOf(qVar.t0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f96071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f96074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0 f96075g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f96076h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f96077i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w0 f96078j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w0 f96079k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ w0 f96080l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w0 f96081m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q0 f96082n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f96083o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ k0 f96084p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0 w0Var, int i11, int i12, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, q0 q0Var, int i13, k0 k0Var) {
            super(1);
            this.f96071c = w0Var;
            this.f96072d = i11;
            this.f96073e = i12;
            this.f96074f = w0Var2;
            this.f96075g = w0Var3;
            this.f96076h = w0Var4;
            this.f96077i = w0Var5;
            this.f96078j = w0Var6;
            this.f96079k = w0Var7;
            this.f96080l = w0Var8;
            this.f96081m = w0Var9;
            this.f96082n = q0Var;
            this.f96083o = i13;
            this.f96084p = k0Var;
        }

        public final void a(w0.a aVar) {
            w0 w0Var = this.f96071c;
            if (w0Var == null) {
                p0.j(aVar, this.f96072d, this.f96073e, this.f96074f, this.f96075g, this.f96076h, this.f96077i, this.f96078j, this.f96079k, this.f96080l, this.f96081m, this.f96082n.singleLine, this.f96084p.getDensity(), this.f96082n.paddingValues);
                return;
            }
            int i11 = this.f96072d;
            int i12 = this.f96073e;
            w0 w0Var2 = this.f96074f;
            w0 w0Var3 = this.f96075g;
            w0 w0Var4 = this.f96076h;
            w0 w0Var5 = this.f96077i;
            w0 w0Var6 = this.f96078j;
            w0 w0Var7 = this.f96079k;
            w0 w0Var8 = this.f96080l;
            w0 w0Var9 = this.f96081m;
            boolean z11 = this.f96082n.singleLine;
            int i13 = this.f96083o;
            p0.i(aVar, i11, i12, w0Var2, w0Var, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9, z11, i13, i13 + this.f96071c.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), this.f96082n.animationProgress, this.f96084p.getDensity());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "w", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f96085c = new d();

        d() {
            super(2);
        }

        public final Integer a(q qVar, int i11) {
            return Integer.valueOf(qVar.m0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "h", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f96086c = new e();

        e() {
            super(2);
        }

        public final Integer a(q qVar, int i11) {
            return Integer.valueOf(qVar.s0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    public q0(boolean z11, float f11, y yVar) {
        this.singleLine = z11;
        this.animationProgress = f11;
        this.paddingValues = yVar;
    }

    private final int f(r rVar, List<? extends q> list, int i11, p<? super q, ? super Integer, Integer> pVar) {
        q qVar;
        int i12;
        int iL;
        int iIntValue;
        q qVar2;
        int iIntValue2;
        q qVar3;
        q qVar4;
        int iIntValue3;
        q qVar5;
        int i13;
        q qVar6;
        q qVar7;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                qVar = null;
                break;
            }
            qVar = list.get(i14);
            if (s.f(j.l(qVar), "Leading")) {
                break;
            }
            i14++;
        }
        q qVar8 = qVar;
        if (qVar8 != null) {
            i12 = i11;
            iL = p0.l(i12, qVar8.t0(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(qVar8, Integer.valueOf(i12)).intValue();
        } else {
            i12 = i11;
            iL = i12;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                qVar2 = null;
                break;
            }
            qVar2 = list.get(i15);
            if (s.f(j.l(qVar2), "Trailing")) {
                break;
            }
            i15++;
        }
        q qVar9 = qVar2;
        if (qVar9 != null) {
            iL = p0.l(iL, qVar9.t0(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(qVar9, Integer.valueOf(i12)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                qVar3 = null;
                break;
            }
            qVar3 = list.get(i16);
            if (s.f(j.l(qVar3), "Label")) {
                break;
            }
            i16++;
        }
        q qVar10 = qVar3;
        int iIntValue4 = qVar10 != null ? pVar.invoke(qVar10, Integer.valueOf(iL)).intValue() : 0;
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                qVar4 = null;
                break;
            }
            qVar4 = list.get(i17);
            if (s.f(j.l(qVar4), "Prefix")) {
                break;
            }
            i17++;
        }
        q qVar11 = qVar4;
        if (qVar11 != null) {
            iIntValue3 = pVar.invoke(qVar11, Integer.valueOf(iL)).intValue();
            iL = p0.l(iL, qVar11.t0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                qVar5 = null;
                break;
            }
            qVar5 = list.get(i18);
            if (s.f(j.l(qVar5), "Suffix")) {
                break;
            }
            i18++;
        }
        q qVar12 = qVar5;
        if (qVar12 != null) {
            int iIntValue5 = pVar.invoke(qVar12, Integer.valueOf(iL)).intValue();
            iL = p0.l(iL, qVar12.t0(Integer.MAX_VALUE));
            i13 = iIntValue5;
        } else {
            i13 = 0;
        }
        int size6 = list.size();
        for (int i19 = 0; i19 < size6; i19++) {
            q qVar13 = list.get(i19);
            if (s.f(j.l(qVar13), "TextField")) {
                int iIntValue6 = pVar.invoke(qVar13, Integer.valueOf(iL)).intValue();
                int size7 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size7) {
                        qVar6 = null;
                        break;
                    }
                    qVar6 = list.get(i21);
                    if (s.f(j.l(qVar6), "Hint")) {
                        break;
                    }
                    i21++;
                }
                q qVar14 = qVar6;
                int iIntValue7 = qVar14 != null ? pVar.invoke(qVar14, Integer.valueOf(iL)).intValue() : 0;
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        qVar7 = null;
                        break;
                    }
                    qVar7 = list.get(i22);
                    if (s.f(j.l(qVar7), "Supporting")) {
                        break;
                    }
                    i22++;
                }
                q qVar15 = qVar7;
                return p0.g(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i13, iIntValue7, qVar15 != null ? pVar.invoke(qVar15, Integer.valueOf(i12)).intValue() : 0, this.animationProgress, j.s(), rVar.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int h(List<? extends q> measurables, int height, p<? super q, ? super Integer, Integer> intrinsicMeasurer) {
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVar5;
        q qVar6;
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar7 = measurables.get(i11);
            if (s.f(j.l(qVar7), "TextField")) {
                int iIntValue = intrinsicMeasurer.invoke(qVar7, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i12 = 0;
                while (true) {
                    qVar = null;
                    if (i12 >= size2) {
                        qVar2 = null;
                        break;
                    }
                    qVar2 = measurables.get(i12);
                    if (s.f(j.l(qVar2), "Label")) {
                        break;
                    }
                    i12++;
                }
                q qVar8 = qVar2;
                int iIntValue2 = qVar8 != null ? intrinsicMeasurer.invoke(qVar8, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        qVar3 = null;
                        break;
                    }
                    qVar3 = measurables.get(i13);
                    if (s.f(j.l(qVar3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                q qVar9 = qVar3;
                int iIntValue3 = qVar9 != null ? intrinsicMeasurer.invoke(qVar9, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        qVar4 = null;
                        break;
                    }
                    qVar4 = measurables.get(i14);
                    if (s.f(j.l(qVar4), "Prefix")) {
                        break;
                    }
                    i14++;
                }
                q qVar10 = qVar4;
                int iIntValue4 = qVar10 != null ? intrinsicMeasurer.invoke(qVar10, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        qVar5 = null;
                        break;
                    }
                    qVar5 = measurables.get(i15);
                    if (s.f(j.l(qVar5), "Suffix")) {
                        break;
                    }
                    i15++;
                }
                q qVar11 = qVar5;
                int iIntValue5 = qVar11 != null ? intrinsicMeasurer.invoke(qVar11, Integer.valueOf(height)).intValue() : 0;
                int size6 = measurables.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        qVar6 = null;
                        break;
                    }
                    qVar6 = measurables.get(i16);
                    if (s.f(j.l(qVar6), "Leading")) {
                        break;
                    }
                    i16++;
                }
                q qVar12 = qVar6;
                int iIntValue6 = qVar12 != null ? intrinsicMeasurer.invoke(qVar12, Integer.valueOf(height)).intValue() : 0;
                int size7 = measurables.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    q qVar13 = measurables.get(i17);
                    if (s.f(j.l(qVar13), "Hint")) {
                        qVar = qVar13;
                        break;
                    }
                }
                q qVar14 = qVar;
                return p0.h(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, qVar14 != null ? intrinsicMeasurer.invoke(qVar14, Integer.valueOf(height)).intValue() : 0, j.s());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        z3.h0 h0Var;
        z3.h0 h0Var2;
        long j12;
        w0 w0VarX0;
        z3.h0 h0Var3;
        z3.h0 h0Var4;
        int i11;
        w0 w0VarX1;
        w0 w0Var;
        z3.h0 h0Var5;
        w0 w0Var2;
        z3.h0 h0Var6;
        w0 w0Var3;
        z3.h0 h0Var7;
        q0 q0Var = this;
        k0 k0Var2 = k0Var;
        List<? extends z3.h0> list2 = list;
        int iI1 = k0Var2.i1(q0Var.paddingValues.getTop());
        int iI2 = k0Var2.i1(q0Var.paddingValues.getBottom());
        long jD = w4.b.d(j11, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                h0Var = null;
                break;
            }
            h0Var = list2.get(i12);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var), "Leading")) {
                break;
            }
            i12++;
        }
        z3.h0 h0Var8 = h0Var;
        w0 w0VarX2 = h0Var8 != null ? h0Var8.x0(jD) : null;
        int iV = j.v(w0VarX2);
        int iMax = Math.max(0, j.t(w0VarX2));
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                h0Var2 = null;
                break;
            }
            h0Var2 = list2.get(i13);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var2), "Trailing")) {
                break;
            }
            i13++;
        }
        z3.h0 h0Var9 = h0Var2;
        if (h0Var9 != null) {
            j12 = jD;
            w0VarX0 = h0Var9.x0(w4.c.p(j12, -iV, 0, 2, null));
        } else {
            j12 = jD;
            w0VarX0 = null;
        }
        int iV2 = iV + j.v(w0VarX0);
        int iMax2 = Math.max(iMax, j.t(w0VarX0));
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                h0Var3 = null;
                break;
            }
            h0Var3 = list2.get(i14);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var3), "Prefix")) {
                break;
            }
            i14++;
        }
        z3.h0 h0Var10 = h0Var3;
        w0 w0VarX3 = h0Var10 != null ? h0Var10.x0(w4.c.p(j12, -iV2, 0, 2, null)) : null;
        int iV3 = iV2 + j.v(w0VarX3);
        int iMax3 = Math.max(iMax2, j.t(w0VarX3));
        int size4 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                h0Var4 = null;
                break;
            }
            h0Var4 = list2.get(i15);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var4), "Suffix")) {
                break;
            }
            i15++;
        }
        z3.h0 h0Var11 = h0Var4;
        if (h0Var11 != null) {
            i11 = iV3;
            w0VarX1 = h0Var11.x0(w4.c.p(j12, -iV3, 0, 2, null));
        } else {
            i11 = iV3;
            w0VarX1 = null;
        }
        int iV4 = j.v(w0VarX1) + i11;
        int iMax4 = Math.max(iMax3, j.t(w0VarX1));
        int i16 = -iV4;
        long jO = w4.c.o(j12, i16, -iI2);
        int size5 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                w0Var = w0VarX1;
                h0Var5 = null;
                break;
            }
            h0Var5 = list2.get(i17);
            int i18 = i17;
            w0Var = w0VarX1;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var5), "Label")) {
                break;
            }
            i17 = i18 + 1;
            w0VarX1 = w0Var;
        }
        z3.h0 h0Var12 = h0Var5;
        w0 w0VarX4 = h0Var12 != null ? h0Var12.x0(jO) : null;
        int size6 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size6) {
                w0Var2 = w0VarX4;
                h0Var6 = null;
                break;
            }
            h0Var6 = list2.get(i19);
            w0Var2 = w0VarX4;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var6), "Supporting")) {
                break;
            }
            i19++;
            w0VarX4 = w0Var2;
        }
        z3.h0 h0Var13 = h0Var6;
        int iM0 = h0Var13 != null ? h0Var13.m0(w4.b.n(j11)) : 0;
        int iT = j.t(w0Var2) + iI1;
        long j13 = j12;
        long jO2 = w4.c.o(w4.b.d(j11, 0, 0, 0, 0, 11, null), i16, ((-iT) - iI2) - iM0);
        int size7 = list2.size();
        int i21 = 0;
        while (i21 < size7) {
            z3.h0 h0Var14 = list2.get(i21);
            int i22 = size7;
            int i23 = iT;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var14), "TextField")) {
                w0 w0VarX5 = h0Var14.x0(jO2);
                long jD2 = w4.b.d(jO2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size8) {
                        w0Var3 = w0VarX5;
                        h0Var7 = null;
                        break;
                    }
                    h0Var7 = list2.get(i24);
                    w0Var3 = w0VarX5;
                    int i25 = size8;
                    if (s.f(androidx.compose.ui.layout.a.a(h0Var7), "Hint")) {
                        break;
                    }
                    i24++;
                    size8 = i25;
                    w0VarX5 = w0Var3;
                }
                z3.h0 h0Var15 = h0Var7;
                w0 w0VarX6 = h0Var15 != null ? h0Var15.x0(jD2) : null;
                int iMax5 = Math.max(iMax4, Math.max(j.t(w0Var3), j.t(w0VarX6)) + i23 + iI2);
                int iH = p0.h(j.v(w0VarX2), j.v(w0VarX0), j.v(w0VarX3), j.v(w0Var), w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), j.v(w0Var2), j.v(w0VarX6), j11);
                int i26 = iH;
                w0 w0VarX7 = h0Var13 != null ? h0Var13.x0(w4.b.d(w4.c.p(j13, 0, -iMax5, 1, null), 0, iH, 0, 0, 9, null)) : null;
                int iT2 = j.t(w0VarX7);
                int iG = p0.g(w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), j.t(w0Var2), j.t(w0VarX2), j.t(w0VarX0), j.t(w0VarX3), j.t(w0Var), j.t(w0VarX6), j.t(w0VarX7), q0Var.animationProgress, j11, k0Var2.getDensity(), q0Var.paddingValues);
                int i27 = iG - iT2;
                int size9 = list2.size();
                int i28 = 0;
                while (i28 < size9) {
                    z3.h0 h0Var16 = list2.get(i28);
                    int i29 = iG;
                    if (s.f(androidx.compose.ui.layout.a.a(h0Var16), "Container")) {
                        int i31 = i26;
                        return k0.N1(k0Var, i31, i29, null, new c(w0Var2, i31, i29, w0Var3, w0VarX6, w0VarX2, w0VarX0, w0VarX3, w0Var, h0Var16.x0(w4.c.a(i26 != Integer.MAX_VALUE ? i26 : 0, i26, i27 != Integer.MAX_VALUE ? i27 : 0, i27)), w0VarX7, q0Var, iI1, k0Var2), 4, null);
                    }
                    i28++;
                    i26 = i26;
                    iG = i29;
                    q0Var = this;
                    k0Var2 = k0Var;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i21++;
            q0Var = this;
            k0Var2 = k0Var;
            iT = i23;
            jO2 = jO2;
            size7 = i22;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public int d(r rVar, List<? extends q> list, int i11) {
        return h(list, i11, b.f96070c);
    }

    @Override // z3.i0
    public int g(r rVar, List<? extends q> list, int i11) {
        return h(list, i11, e.f96086c);
    }

    @Override // z3.i0
    public int i(r rVar, List<? extends q> list, int i11) {
        return f(rVar, list, i11, a.f96069c);
    }

    @Override // z3.i0
    public int j(r rVar, List<? extends q> list, int i11) {
        return f(rVar, list, i11, d.f96085c);
    }
}
