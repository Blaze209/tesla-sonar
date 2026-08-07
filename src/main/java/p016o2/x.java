package p016o2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import j3.m;
import j3.n;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lo2/x;", "Lz3/i0;", "Lkotlin/Function1;", "Lj3/m;", "Ljn0/h0;", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Lv1/y;", "paddingValues", "<init>", "(Lwn0/l;ZFLv1/y;)V", "Lz3/r;", "", "Lz3/q;", "measurables", "", Snapshot.HEIGHT, "Lkotlin/Function2;", "intrinsicMeasurer", "h", "(Lz3/r;Ljava/util/List;ILwn0/p;)I", Snapshot.WIDTH, "f", "Lz3/k0;", "Lz3/h0;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/r;Ljava/util/List;I)I", "j", DateTokenConverter.CONVERTER_KEY, "g", "a", "Lwn0/l;", "b", "Z", Gender.FEMALE, "Lv1/y;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class x implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<m, h0> onLabelMeasured;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y paddingValues;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "w", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96299c = new a();

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
        public static final b f96300c = new b();

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
        final /* synthetic */ int f96301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f96303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f96304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0 f96305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f96306h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f96307i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w0 f96308j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w0 f96309k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ w0 f96310l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w0 f96311m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ x f96312n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ k0 f96313o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, x xVar, k0 k0Var) {
            super(1);
            this.f96301c = i11;
            this.f96302d = i12;
            this.f96303e = w0Var;
            this.f96304f = w0Var2;
            this.f96305g = w0Var3;
            this.f96306h = w0Var4;
            this.f96307i = w0Var5;
            this.f96308j = w0Var6;
            this.f96309k = w0Var7;
            this.f96310l = w0Var8;
            this.f96311m = w0Var9;
            this.f96312n = xVar;
            this.f96313o = k0Var;
        }

        public final void a(w0.a aVar) {
            w.l(aVar, this.f96301c, this.f96302d, this.f96303e, this.f96304f, this.f96305g, this.f96306h, this.f96307i, this.f96308j, this.f96309k, this.f96310l, this.f96311m, this.f96312n.animationProgress, this.f96312n.singleLine, this.f96313o.getDensity(), this.f96313o.getLayoutDirection(), this.f96312n.paddingValues);
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
        public static final d f96314c = new d();

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
        public static final e f96315c = new e();

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

    /* JADX WARN: Multi-variable type inference failed */
    public x(l<? super m, h0> lVar, boolean z11, float f11, y yVar) {
        this.onLabelMeasured = lVar;
        this.singleLine = z11;
        this.animationProgress = f11;
        this.paddingValues = yVar;
    }

    private final int f(r rVar, List<? extends q> list, int i11, p<? super q, ? super Integer, Integer> pVar) {
        q qVar;
        int iN;
        int iIntValue;
        q qVar2;
        int iIntValue2;
        q qVar3;
        q qVar4;
        int iIntValue3;
        q qVar5;
        int i12;
        q qVar6;
        q qVar7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                qVar = null;
                break;
            }
            qVar = list.get(i13);
            if (s.f(j.l(qVar), "Leading")) {
                break;
            }
            i13++;
        }
        q qVar8 = qVar;
        if (qVar8 != null) {
            iN = w.n(i11, qVar8.t0(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(qVar8, Integer.valueOf(i11)).intValue();
        } else {
            iN = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                qVar2 = null;
                break;
            }
            qVar2 = list.get(i14);
            if (s.f(j.l(qVar2), "Trailing")) {
                break;
            }
            i14++;
        }
        q qVar9 = qVar2;
        if (qVar9 != null) {
            iN = w.n(iN, qVar9.t0(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(qVar9, Integer.valueOf(i11)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                qVar3 = null;
                break;
            }
            qVar3 = list.get(i15);
            if (s.f(j.l(qVar3), "Label")) {
                break;
            }
            i15++;
        }
        q qVar10 = qVar3;
        int iIntValue4 = qVar10 != null ? pVar.invoke(qVar10, Integer.valueOf(y4.b.c(iN, i11, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                qVar4 = null;
                break;
            }
            qVar4 = list.get(i16);
            if (s.f(j.l(qVar4), "Prefix")) {
                break;
            }
            i16++;
        }
        q qVar11 = qVar4;
        if (qVar11 != null) {
            iIntValue3 = pVar.invoke(qVar11, Integer.valueOf(iN)).intValue();
            iN = w.n(iN, qVar11.t0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                qVar5 = null;
                break;
            }
            qVar5 = list.get(i17);
            if (s.f(j.l(qVar5), "Suffix")) {
                break;
            }
            i17++;
        }
        q qVar12 = qVar5;
        if (qVar12 != null) {
            int iIntValue5 = pVar.invoke(qVar12, Integer.valueOf(iN)).intValue();
            iN = w.n(iN, qVar12.t0(Integer.MAX_VALUE));
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            q qVar13 = list.get(i18);
            if (s.f(j.l(qVar13), "TextField")) {
                int iIntValue6 = pVar.invoke(qVar13, Integer.valueOf(iN)).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        qVar6 = null;
                        break;
                    }
                    qVar6 = list.get(i19);
                    if (s.f(j.l(qVar6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                q qVar14 = qVar6;
                int iIntValue7 = qVar14 != null ? pVar.invoke(qVar14, Integer.valueOf(iN)).intValue() : 0;
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        qVar7 = null;
                        break;
                    }
                    q qVar15 = list.get(i21);
                    if (s.f(j.l(qVar15), "Supporting")) {
                        qVar7 = qVar15;
                        break;
                    }
                    i21++;
                }
                q qVar16 = qVar7;
                return w.h(iIntValue, iIntValue2, iIntValue3, i12, iIntValue6, iIntValue4, iIntValue7, qVar16 != null ? pVar.invoke(qVar16, Integer.valueOf(i11)).intValue() : 0, this.animationProgress, j.s(), rVar.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int h(r rVar, List<? extends q> list, int i11, p<? super q, ? super Integer, Integer> pVar) {
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVar5;
        q qVar6;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar7 = list.get(i12);
            if (s.f(j.l(qVar7), "TextField")) {
                int iIntValue = pVar.invoke(qVar7, Integer.valueOf(i11)).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    qVar = null;
                    if (i13 >= size2) {
                        qVar2 = null;
                        break;
                    }
                    qVar2 = list.get(i13);
                    if (s.f(j.l(qVar2), "Label")) {
                        break;
                    }
                    i13++;
                }
                q qVar8 = qVar2;
                int iIntValue2 = qVar8 != null ? pVar.invoke(qVar8, Integer.valueOf(i11)).intValue() : 0;
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        qVar3 = null;
                        break;
                    }
                    qVar3 = list.get(i14);
                    if (s.f(j.l(qVar3), "Trailing")) {
                        break;
                    }
                    i14++;
                }
                q qVar9 = qVar3;
                int iIntValue3 = qVar9 != null ? pVar.invoke(qVar9, Integer.valueOf(i11)).intValue() : 0;
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        qVar4 = null;
                        break;
                    }
                    qVar4 = list.get(i15);
                    if (s.f(j.l(qVar4), "Leading")) {
                        break;
                    }
                    i15++;
                }
                q qVar10 = qVar4;
                int iIntValue4 = qVar10 != null ? pVar.invoke(qVar10, Integer.valueOf(i11)).intValue() : 0;
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        qVar5 = null;
                        break;
                    }
                    qVar5 = list.get(i16);
                    if (s.f(j.l(qVar5), "Prefix")) {
                        break;
                    }
                    i16++;
                }
                q qVar11 = qVar5;
                int iIntValue5 = qVar11 != null ? pVar.invoke(qVar11, Integer.valueOf(i11)).intValue() : 0;
                int size6 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size6) {
                        qVar6 = null;
                        break;
                    }
                    qVar6 = list.get(i17);
                    if (s.f(j.l(qVar6), "Suffix")) {
                        break;
                    }
                    i17++;
                }
                q qVar12 = qVar6;
                int iIntValue6 = qVar12 != null ? pVar.invoke(qVar12, Integer.valueOf(i11)).intValue() : 0;
                int size7 = list.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    q qVar13 = list.get(i18);
                    if (s.f(j.l(qVar13), "Hint")) {
                        qVar = qVar13;
                        break;
                    }
                }
                q qVar14 = qVar;
                return w.i(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, qVar14 != null ? pVar.invoke(qVar14, Integer.valueOf(i11)).intValue() : 0, this.animationProgress, j.s(), rVar.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        z3.h0 h0Var;
        z3.h0 h0Var2;
        z3.h0 h0Var3;
        z3.h0 h0Var4;
        w0 w0Var;
        z3.h0 h0Var5;
        z3.h0 h0Var6;
        z3.h0 h0Var7;
        x xVar = this;
        k0 k0Var2 = k0Var;
        int iI1 = k0Var2.i1(xVar.paddingValues.getBottom());
        long jD = w4.b.d(j11, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                h0Var = null;
                break;
            }
            h0Var = list.get(i11);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var), "Leading")) {
                break;
            }
            i11++;
        }
        z3.h0 h0Var8 = h0Var;
        w0 w0VarX0 = h0Var8 != null ? h0Var8.x0(jD) : null;
        int iV = j.v(w0VarX0);
        int iMax = Math.max(0, j.t(w0VarX0));
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                h0Var2 = null;
                break;
            }
            h0Var2 = list.get(i12);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var2), "Trailing")) {
                break;
            }
            i12++;
        }
        z3.h0 h0Var9 = h0Var2;
        w0 w0VarX1 = h0Var9 != null ? h0Var9.x0(w4.c.p(jD, -iV, 0, 2, null)) : null;
        int iV2 = iV + j.v(w0VarX1);
        int iMax2 = Math.max(iMax, j.t(w0VarX1));
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                h0Var3 = null;
                break;
            }
            h0Var3 = list.get(i13);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var3), "Prefix")) {
                break;
            }
            i13++;
        }
        z3.h0 h0Var10 = h0Var3;
        w0 w0VarX2 = h0Var10 != null ? h0Var10.x0(w4.c.p(jD, -iV2, 0, 2, null)) : null;
        int iV3 = iV2 + j.v(w0VarX2);
        int iMax3 = Math.max(iMax2, j.t(w0VarX2));
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                h0Var4 = null;
                break;
            }
            h0Var4 = list.get(i14);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var4), "Suffix")) {
                break;
            }
            i14++;
        }
        z3.h0 h0Var11 = h0Var4;
        w0 w0VarX3 = h0Var11 != null ? h0Var11.x0(w4.c.p(jD, -iV3, 0, 2, null)) : null;
        int iV4 = iV3 + j.v(w0VarX3);
        int iMax4 = Math.max(iMax3, j.t(w0VarX3));
        int iI2 = k0Var2.i1(xVar.paddingValues.c(k0Var2.getLayoutDirection())) + k0Var2.i1(xVar.paddingValues.b(k0Var2.getLayoutDirection()));
        int i15 = -iV4;
        int i16 = -iI1;
        long jO = w4.c.o(jD, y4.b.c(i15 - iI2, -iI2, xVar.animationProgress), i16);
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                w0Var = w0VarX0;
                h0Var5 = null;
                break;
            }
            h0Var5 = list.get(i17);
            int i18 = i17;
            w0Var = w0VarX0;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var5), "Label")) {
                break;
            }
            i17 = i18 + 1;
            w0VarX0 = w0Var;
        }
        z3.h0 h0Var12 = h0Var5;
        w0 w0VarX4 = h0Var12 != null ? h0Var12.x0(jO) : null;
        xVar.onLabelMeasured.invoke(m.c(w0VarX4 != null ? n.a(w0VarX4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) : m.INSTANCE.b()));
        int size6 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size6) {
                h0Var6 = null;
                break;
            }
            h0Var6 = list.get(i19);
            int i21 = size6;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var6), "Supporting")) {
                break;
            }
            i19++;
            size6 = i21;
        }
        z3.h0 h0Var13 = h0Var6;
        int iM0 = h0Var13 != null ? h0Var13.m0(w4.b.n(j11)) : 0;
        int iMax5 = Math.max(j.t(w0VarX4) / 2, k0Var2.i1(xVar.paddingValues.getTop()));
        long jD2 = w4.b.d(w4.c.o(j11, i15, (i16 - iMax5) - iM0), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        w0 w0Var2 = w0VarX2;
        int i22 = 0;
        while (i22 < size7) {
            int i23 = size7;
            z3.h0 h0Var14 = list.get(i22);
            w0 w0Var3 = w0VarX3;
            w0 w0Var4 = w0VarX1;
            if (s.f(androidx.compose.ui.layout.a.a(h0Var14), "TextField")) {
                w0 w0VarX5 = h0Var14.x0(jD2);
                long jD3 = w4.b.d(jD2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size8) {
                        h0Var7 = null;
                        break;
                    }
                    h0Var7 = list.get(i24);
                    int i25 = size8;
                    int i26 = i24;
                    if (s.f(androidx.compose.ui.layout.a.a(h0Var7), "Hint")) {
                        break;
                    }
                    i24 = i26 + 1;
                    size8 = i25;
                }
                z3.h0 h0Var15 = h0Var7;
                w0 w0VarX6 = h0Var15 != null ? h0Var15.x0(jD3) : null;
                int iMax6 = Math.max(iMax4, Math.max(j.t(w0VarX5), j.t(w0VarX6)) + iMax5 + iI1);
                int i27 = w.i(j.v(w0Var), j.v(w0Var4), j.v(w0Var2), j.v(w0Var3), w0VarX5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), j.v(w0VarX4), j.v(w0VarX6), xVar.animationProgress, j11, k0Var2.getDensity(), xVar.paddingValues);
                int i28 = i27;
                w0 w0VarX7 = h0Var13 != null ? h0Var13.x0(w4.b.d(w4.c.p(jD, 0, -iMax6, 1, null), 0, i27, 0, 0, 9, null)) : null;
                int iT = j.t(w0VarX7);
                int iH = w.h(j.t(w0Var), j.t(w0Var4), j.t(w0Var2), j.t(w0Var3), w0VarX5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), j.t(w0VarX4), j.t(w0VarX6), j.t(w0VarX7), xVar.animationProgress, j11, k0Var2.getDensity(), xVar.paddingValues);
                int i29 = iH - iT;
                int size9 = list.size();
                int i31 = 0;
                while (i31 < size9) {
                    z3.h0 h0Var16 = list.get(i31);
                    if (s.f(androidx.compose.ui.layout.a.a(h0Var16), "Container")) {
                        int i32 = i28;
                        return k0.N1(k0Var, i32, iH, null, new c(iH, i32, w0Var, w0Var4, w0Var2, w0Var3, w0VarX5, w0VarX4, w0VarX6, h0Var16.x0(w4.c.a(i28 != Integer.MAX_VALUE ? i28 : 0, i28, i29 != Integer.MAX_VALUE ? i29 : 0, i29)), w0VarX7, xVar, k0Var2), 4, null);
                    }
                    i31++;
                    xVar = this;
                    k0Var2 = k0Var;
                    i28 = i28;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i22++;
            xVar = this;
            k0Var2 = k0Var;
            w0VarX1 = w0Var4;
            size7 = i23;
            w0VarX3 = w0Var3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public int d(r rVar, List<? extends q> list, int i11) {
        return h(rVar, list, i11, b.f96300c);
    }

    @Override // z3.i0
    public int g(r rVar, List<? extends q> list, int i11) {
        return h(rVar, list, i11, e.f96315c);
    }

    @Override // z3.i0
    public int i(r rVar, List<? extends q> list, int i11) {
        return f(rVar, list, i11, a.f96299c);
    }

    @Override // z3.i0
    public int j(r rVar, List<? extends q> list, int i11) {
        return f(rVar, list, i11, d.f96314c);
    }
}
