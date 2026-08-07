package p012k90;

import bo0.n;
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
import v1.y;
import wn0.l;
import wn0.p;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.q;
import z3.r;
import z3.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lk90/e;", "Lz3/i0;", "", "singleLine", "", "animationProgress", "Lv1/y;", "paddingValues", "<init>", "(ZFLv1/y;)V", "", "Lz3/q;", "measurables", "", Snapshot.HEIGHT, "Lkotlin/Function2;", "intrinsicMeasurer", "h", "(Ljava/util/List;ILwn0/p;)I", "Lz3/r;", Snapshot.WIDTH, "f", "(Lz3/r;Ljava/util/List;ILwn0/p;)I", "Lz3/k0;", "Lz3/h0;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/r;Ljava/util/List;I)I", "j", DateTokenConverter.CONVERTER_KEY, "g", "a", "Z", "b", Gender.FEMALE, "Lv1/y;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class e implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y paddingValues;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "w", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f85553c = new a();

        a() {
            super(2);
        }

        public final Integer a(q intrinsicMeasurable, int i11) {
            s.k(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.V(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "h", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f85554c = new b();

        b() {
            super(2);
        }

        public final Integer a(q intrinsicMeasurable, int i11) {
            s.k(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.t0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f85555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f85556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f85557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f85558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f85559g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f85560h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f85561i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w0 f85562j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ w0 f85563k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ e f85564l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f85565m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f85566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ k0 f85567o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0 w0Var, int i11, int i12, int i13, int i14, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, e eVar, int i15, int i16, k0 k0Var) {
            super(1);
            this.f85555c = w0Var;
            this.f85556d = i11;
            this.f85557e = i12;
            this.f85558f = i13;
            this.f85559g = i14;
            this.f85560h = w0Var2;
            this.f85561i = w0Var3;
            this.f85562j = w0Var4;
            this.f85563k = w0Var5;
            this.f85564l = eVar;
            this.f85565m = i15;
            this.f85566n = i16;
            this.f85567o = k0Var;
        }

        public final void a(w0.a layout) {
            s.k(layout, "$this$layout");
            if (this.f85555c == null) {
                p012k90.d.o(layout, this.f85558f, this.f85559g, this.f85560h, this.f85561i, this.f85562j, this.f85563k, this.f85564l.singleLine, this.f85567o.getDensity(), this.f85564l.paddingValues);
                return;
            }
            int iF = n.f(this.f85556d - this.f85557e, 0);
            p012k90.d.n(layout, this.f85558f, this.f85559g, this.f85560h, this.f85555c, this.f85561i, this.f85562j, this.f85563k, this.f85564l.singleLine, iF, this.f85566n + this.f85565m, this.f85564l.animationProgress, this.f85567o.getDensity());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "w", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f85568c = new d();

        d() {
            super(2);
        }

        public final Integer a(q intrinsicMeasurable, int i11) {
            s.k(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.m0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    /* JADX INFO: renamed from: k90.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/q;", "intrinsicMeasurable", "", "h", "a", "(Lz3/q;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class C1822e extends u implements p<q, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1822e f85569c = new C1822e();

        C1822e() {
            super(2);
        }

        public final Integer a(q intrinsicMeasurable, int i11) {
            s.k(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.s0(i11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(q qVar, Integer num) {
            return a(qVar, num.intValue());
        }
    }

    public e(boolean z11, float f11, y paddingValues) {
        s.k(paddingValues, "paddingValues");
        this.singleLine = z11;
        this.animationProgress = f11;
        this.paddingValues = paddingValues;
    }

    private final int f(r rVar, List<? extends q> list, int i11, p<? super q, ? super Integer, Integer> pVar) {
        q qVar;
        q qVar2;
        int iT0;
        int iIntValue;
        q qVar3;
        int iIntValue2;
        q qVar4;
        int size = list.size();
        int i12 = 0;
        while (true) {
            qVar = null;
            if (i12 >= size) {
                qVar2 = null;
                break;
            }
            qVar2 = list.get(i12);
            if (s.f(p012k90.d.l(qVar2), "Leading")) {
                break;
            }
            i12++;
        }
        q qVar5 = qVar2;
        if (qVar5 != null) {
            iT0 = i11 - qVar5.t0(Integer.MAX_VALUE);
            iIntValue = pVar.invoke(qVar5, Integer.valueOf(i11)).intValue();
        } else {
            iT0 = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                qVar3 = null;
                break;
            }
            qVar3 = list.get(i13);
            if (s.f(p012k90.d.l(qVar3), "Trailing")) {
                break;
            }
            i13++;
        }
        q qVar6 = qVar3;
        if (qVar6 != null) {
            iT0 -= qVar6.t0(Integer.MAX_VALUE);
            iIntValue2 = pVar.invoke(qVar6, Integer.valueOf(i11)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                qVar4 = null;
                break;
            }
            qVar4 = list.get(i14);
            if (s.f(p012k90.d.l(qVar4), "Label")) {
                break;
            }
            i14++;
        }
        q qVar7 = qVar4;
        int iIntValue3 = qVar7 != null ? pVar.invoke(qVar7, Integer.valueOf(iT0)).intValue() : 0;
        int size4 = list.size();
        for (int i15 = 0; i15 < size4; i15++) {
            q qVar8 = list.get(i15);
            if (s.f(p012k90.d.l(qVar8), "TextField")) {
                int iIntValue4 = pVar.invoke(qVar8, Integer.valueOf(iT0)).intValue();
                int size5 = list.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    q qVar9 = list.get(i16);
                    if (s.f(p012k90.d.l(qVar9), "Hint")) {
                        qVar = qVar9;
                        break;
                    }
                }
                q qVar10 = qVar;
                return p012k90.d.j(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, qVar10 != null ? pVar.invoke(qVar10, Integer.valueOf(iT0)).intValue() : 0, p012k90.a.d(), rVar.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int h(List<? extends q> measurables, int height, p<? super q, ? super Integer, Integer> intrinsicMeasurer) {
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar5 = measurables.get(i11);
            if (s.f(p012k90.d.l(qVar5), "TextField")) {
                int iIntValue = intrinsicMeasurer.invoke(qVar5, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i12 = 0;
                while (true) {
                    qVar = null;
                    if (i12 >= size2) {
                        qVar2 = null;
                        break;
                    }
                    qVar2 = measurables.get(i12);
                    if (s.f(p012k90.d.l(qVar2), "Label")) {
                        break;
                    }
                    i12++;
                }
                q qVar6 = qVar2;
                int iIntValue2 = qVar6 != null ? intrinsicMeasurer.invoke(qVar6, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        qVar3 = null;
                        break;
                    }
                    qVar3 = measurables.get(i13);
                    if (s.f(p012k90.d.l(qVar3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                q qVar7 = qVar3;
                int iIntValue3 = qVar7 != null ? intrinsicMeasurer.invoke(qVar7, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        qVar4 = null;
                        break;
                    }
                    qVar4 = measurables.get(i14);
                    if (s.f(p012k90.d.l(qVar4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                q qVar8 = qVar4;
                int iIntValue4 = qVar8 != null ? intrinsicMeasurer.invoke(qVar8, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    q qVar9 = measurables.get(i15);
                    if (s.f(p012k90.d.l(qVar9), "Hint")) {
                        qVar = qVar9;
                        break;
                    }
                }
                q qVar10 = qVar;
                return p012k90.d.k(iIntValue4, iIntValue3, iIntValue, iIntValue2, qVar10 != null ? intrinsicMeasurer.invoke(qVar10, Integer.valueOf(height)).intValue() : 0, p012k90.a.d());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        z3.h0 h0Var;
        z3.h0 h0Var2;
        z3.h0 h0Var3;
        int iG0;
        z3.h0 h0Var4;
        e eVar = this;
        k0 measure = k0Var;
        List<? extends z3.h0> measurables = list;
        s.k(measure, "$this$measure");
        s.k(measurables, "measurables");
        int iI1 = measure.i1(eVar.paddingValues.getTop());
        int iI2 = measure.i1(eVar.paddingValues.getBottom());
        int iI3 = measure.i1(p012k90.d.f85539a);
        long jD = w4.b.d(j11, 0, 0, 0, 0, 10, null);
        int size = measurables.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                h0Var = null;
                break;
            }
            h0Var = measurables.get(i11);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var), "Leading")) {
                break;
            }
            i11++;
        }
        z3.h0 h0Var5 = h0Var;
        w0 w0VarX0 = h0Var5 != null ? h0Var5.x0(jD) : null;
        int iP = p012k90.d.p(w0VarX0);
        int size2 = measurables.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                h0Var2 = null;
                break;
            }
            h0Var2 = measurables.get(i12);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var2), "Trailing")) {
                break;
            }
            i12++;
        }
        z3.h0 h0Var6 = h0Var2;
        w0 w0VarX1 = h0Var6 != null ? h0Var6.x0(w4.c.p(jD, -iP, 0, 2, null)) : null;
        int i13 = -iI2;
        int i14 = -(iP + p012k90.d.p(w0VarX1));
        long jO = w4.c.o(jD, i14, i13);
        int size3 = measurables.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                h0Var3 = null;
                break;
            }
            h0Var3 = measurables.get(i15);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var3), "Label")) {
                break;
            }
            i15++;
        }
        z3.h0 h0Var7 = h0Var3;
        w0 w0VarX2 = h0Var7 != null ? h0Var7.x0(jO) : null;
        if (w0VarX2 != null) {
            iG0 = w0VarX2.g0(z3.b.b());
            if (iG0 == Integer.MIN_VALUE) {
                iG0 = w0VarX2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            }
        } else {
            iG0 = 0;
        }
        int iMax = Math.max(iG0, iI1);
        long jO2 = w4.c.o(w4.b.d(j11, 0, 0, 0, 0, 11, null), i14, w0VarX2 != null ? (i13 - iI3) - iMax : (-iI1) - iI2);
        int size4 = measurables.size();
        int i16 = 0;
        while (i16 < size4) {
            z3.h0 h0Var8 = measurables.get(i16);
            if (s.f(androidx.compose.ui.layout.a.a(h0Var8), "TextField")) {
                w0 w0VarX3 = h0Var8.x0(jO2);
                long jD2 = w4.b.d(jO2, 0, 0, 0, 0, 14, null);
                int size5 = measurables.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        h0Var4 = null;
                        break;
                    }
                    h0Var4 = measurables.get(i17);
                    if (s.f(androidx.compose.ui.layout.a.a(h0Var4), "Hint")) {
                        break;
                    }
                    i17++;
                    measurables = list;
                }
                z3.h0 h0Var9 = h0Var4;
                w0 w0VarX4 = h0Var9 != null ? h0Var9.x0(jD2) : null;
                int iK = p012k90.d.k(p012k90.d.p(w0VarX0), p012k90.d.p(w0VarX1), w0VarX3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), p012k90.d.p(w0VarX2), p012k90.d.p(w0VarX4), j11);
                int iJ = p012k90.d.j(w0VarX3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), w0VarX2 != null, iMax, p012k90.d.m(w0VarX0), p012k90.d.m(w0VarX1), p012k90.d.m(w0VarX4), j11, measure.getDensity(), eVar.paddingValues);
                return k0.N1(k0Var, iK, iJ, null, new c(w0VarX2, iI1, iG0, iK, iJ, w0VarX3, w0VarX4, w0VarX0, w0VarX1, eVar, iMax, iI3, measure), 4, null);
            }
            i16++;
            eVar = this;
            measure = k0Var;
            measurables = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // z3.i0
    public int d(r rVar, List<? extends q> measurables, int i11) {
        s.k(rVar, "<this>");
        s.k(measurables, "measurables");
        return h(measurables, i11, b.f85554c);
    }

    @Override // z3.i0
    public int g(r rVar, List<? extends q> measurables, int i11) {
        s.k(rVar, "<this>");
        s.k(measurables, "measurables");
        return h(measurables, i11, C1822e.f85569c);
    }

    @Override // z3.i0
    public int i(r rVar, List<? extends q> measurables, int i11) {
        s.k(rVar, "<this>");
        s.k(measurables, "measurables");
        return f(rVar, measurables, i11, a.f85553c);
    }

    @Override // z3.i0
    public int j(r rVar, List<? extends q> measurables, int i11) {
        s.k(rVar, "<this>");
        s.k(measurables, "measurables");
        return f(rVar, measurables, i11, d.f85568c);
    }
}
