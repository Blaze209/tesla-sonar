package s2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p020r2.SlotWriter;
import p020r2.a3;
import p020r2.j1;
import p020r2.j2;
import p020r2.k1;
import p020r2.l2;
import p020r2.q2;
import p020r2.r1;
import p020r2.r2;
import p020r2.s2;
import z2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:#\u000f\u001b\u001e\u001d\u0014\u0017 !\"#$%&'()*+,-./0123456789:;<B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019\u0082\u0001!=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"Ls2/d;", "", "", "ints", "objects", "<init>", "(II)V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/d$t;", "f", "toString", "()Ljava/lang/String;", "I", "b", "()I", DateTokenConverter.CONVERTER_KEY, "c", "name", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "Ls2/d$a;", "Ls2/d$b;", "Ls2/d$c;", "Ls2/d$d;", "Ls2/d$e;", "Ls2/d$f;", "Ls2/d$g;", "Ls2/d$h;", "Ls2/d$i;", "Ls2/d$j;", "Ls2/d$k;", "Ls2/d$l;", "Ls2/d$m;", "Ls2/d$n;", "Ls2/d$o;", "Ls2/d$p;", "Ls2/d$r;", "Ls2/d$s;", "Ls2/d$u;", "Ls2/d$v;", "Ls2/d$w;", "Ls2/d$x;", "Ls2/d$y;", "Ls2/d$z;", "Ls2/d$a0;", "Ls2/d$b0;", "Ls2/d$c0;", "Ls2/d$d0;", "Ls2/d$e0;", "Ls2/d$f0;", "Ls2/d$g0;", "Ls2/d$h0;", "Ls2/d$i0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int ints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int objects;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$a;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f109707c = new a();

        private a() {
            super(1, 0, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.D(eVar.b(q.a(0)));
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "distance" : super.e(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$a0;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f109708c = new a0();

        /* JADX WARN: Illegal instructions before constructor call */
        private a0() {
            int i11 = 1;
            super(0, i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            q2Var.e((wn0.a) eVar.a(t.a(0)));
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "effect" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$b;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f109709c = new b();

        private b() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(0));
            Object objA = eVar.a(t.a(1));
            if (objA instanceof s2) {
                q2Var.d(((s2) objA).getWrapped());
            }
            slotWriter.G(dVar, objA);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "anchor";
            }
            return t.b(parameter, t.a(1)) ? "value" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$b0;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b0 f109710c = new b0();

        /* JADX WARN: Illegal instructions before constructor call */
        private b0() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.Z0();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$c;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f109711c = new c();

        private c() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            IntRef intRef = (IntRef) eVar.a(t.a(1));
            int element = intRef != null ? intRef.getElement() : 0;
            s2.a aVar = (s2.a) eVar.a(t.a(0));
            if (element > 0) {
                fVar = new r1(fVar, element);
            }
            aVar.b(fVar, slotWriter, q2Var);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "changes";
            }
            return t.b(parameter, t.a(1)) ? "effectiveNodeIndex" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$c0;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c0 f109712c = new c0();

        private c0() {
            super(1, 0, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            int iB = eVar.b(q.a(0));
            int iG0 = slotWriter.g0();
            int parent = slotWriter.getParent();
            int iG1 = slotWriter.g1(parent);
            int iF1 = slotWriter.f1(parent);
            for (int iMax = Math.max(iG1, iF1 - iB); iMax < iF1; iMax++) {
                Object obj = slotWriter.slots[slotWriter.R(iMax)];
                if (obj instanceof s2) {
                    q2Var.a(((s2) obj).getWrapped(), iG0 - iMax, -1, -1);
                } else if (obj instanceof j2) {
                    ((j2) obj).x();
                }
            }
            slotWriter.n1(iB);
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "count" : super.e(parameter);
        }
    }

    /* JADX INFO: renamed from: s2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$d;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2327d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2327d f109713c = new C2327d();

        private C2327d() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            int element = ((IntRef) eVar.a(t.a(0))).getElement();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i12 = element + i11;
                fVar.g(i12, obj);
                fVar.f(i12, obj);
            }
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "effectiveNodeIndex";
            }
            return t.b(parameter, t.a(1)) ? "nodes" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ls2/d$d0;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/d$t;", "f", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f109714c = new d0();

        private d0() {
            super(1, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            int iF;
            int iG0;
            Object objA = eVar.a(t.a(0));
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            if (objA instanceof s2) {
                q2Var.d(((s2) objA).getWrapped());
            }
            int iF2 = slotWriter.F(dVar);
            Object objU0 = slotWriter.U0(iF2, iB, objA);
            if (!(objU0 instanceof s2)) {
                if (objU0 instanceof j2) {
                    ((j2) objU0).x();
                    return;
                }
                return;
            }
            int iG1 = slotWriter.g0() - slotWriter.d1(iF2, iB);
            s2 s2Var = (s2) objU0;
            p020r2.d after = s2Var.getAfter();
            if (after == null || !after.b()) {
                iF = -1;
                iG0 = -1;
            } else {
                iF = slotWriter.F(after);
                iG0 = slotWriter.g0() - slotWriter.e1(iF);
            }
            q2Var.a(s2Var.getWrapped(), iG1, iF, iG0);
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "groupSlotIndex" : super.e(parameter);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "value";
            }
            return t.b(parameter, t.a(1)) ? "anchor" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$e;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f109715c = new e();

        private e() {
            super(0, 4, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            k1 k1Var = (k1) eVar.a(t.a(2));
            k1 k1Var2 = (k1) eVar.a(t.a(3));
            p020r2.q qVar = (p020r2.q) eVar.a(t.a(1));
            j1 j1VarN = (j1) eVar.a(t.a(0));
            if (j1VarN == null && (j1VarN = qVar.n(k1Var)) == null) {
                p020r2.o.t("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<p020r2.d> listA0 = slotWriter.A0(1, j1VarN.getSlotTable(), 2);
            j2.Companion companion = j2.INSTANCE;
            p020r2.e0 composition = k1Var2.getComposition();
            p013kotlin.jvm.internal.s.i(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.a(slotWriter, listA0, (l2) composition);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "resolvedState";
            }
            if (t.b(parameter, t.a(1))) {
                return "resolvedCompositionContext";
            }
            if (t.b(parameter, t.a(2))) {
                return "from";
            }
            return t.b(parameter, t.a(3)) ? "to" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$e0;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f109716c = new e0();

        /* JADX WARN: Illegal instructions before constructor call */
        private e0() {
            int i11 = 1;
            super(0, i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.r1(eVar.a(t.a(0)));
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "data" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$f;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f109717c = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        private f() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p020r2.o.u(slotWriter, q2Var);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$f0;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f109718c = new f0();

        private f0() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            ((wn0.p) eVar.a(t.a(1))).invoke(fVar.b(), eVar.a(t.a(0)));
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "value";
            }
            return t.b(parameter, t.a(1)) ? "block" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$g;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f109719c = new g();

        private g() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            IntRef intRef = (IntRef) eVar.a(t.a(0));
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(1));
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.b(s2.f.e(slotWriter, dVar, fVar));
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "effectiveNodeIndexOut";
            }
            return t.b(parameter, t.a(1)) ? "anchor" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ls2/d$g0;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/d$t;", "f", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f109720c = new g0();

        /* JADX WARN: Illegal instructions before constructor call */
        private g0() {
            int i11 = 1;
            super(i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            Object objA = eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            if (objA instanceof s2) {
                q2Var.d(((s2) objA).getWrapped());
            }
            Object objV0 = slotWriter.V0(iB, objA);
            if (objV0 instanceof s2) {
                q2Var.a(((s2) objV0).getWrapped(), slotWriter.g0() - slotWriter.d1(slotWriter.getCurrentGroup(), iB), -1, -1);
            } else if (objV0 instanceof j2) {
                ((j2) objV0).x();
            }
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "groupSlotIndex" : super.e(parameter);
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$h;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f109721c = new h();

        /* JADX WARN: Illegal instructions before constructor call */
        private h() {
            int i11 = 1;
            super(0, i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(t.a(0))) {
                fVar.h(obj);
            }
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "nodes" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$h0;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h0 f109722c = new h0();

        private h0() {
            super(1, 0, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            int iB = eVar.b(q.a(0));
            for (int i11 = 0; i11 < iB; i11++) {
                fVar.i();
            }
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "count" : super.e(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$i;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f109723c = new i();

        private i() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            ((wn0.l) eVar.a(t.a(0))).invoke((p020r2.p) eVar.a(t.a(1)));
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "anchor";
            }
            return t.b(parameter, t.a(1)) ? "composition" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$i0;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i0 extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f109724c = new i0();

        /* JADX WARN: Illegal instructions before constructor call */
        private i0() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            Object objB = fVar.b();
            p013kotlin.jvm.internal.s.i(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((p020r2.k) objB).k();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$j;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f109725c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.T();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$k;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f109726c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            s2.f.f(slotWriter, fVar, 0);
            slotWriter.T();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$l;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f109727c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i11 = 1;
            super(0, i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.W((p020r2.d) eVar.a(t.a(0)));
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$m;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f109728c = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.V(0);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ls2/d$n;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/d$t;", "f", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f109729c = new n();

        private n() {
            super(1, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            Object objInvoke = ((wn0.a) eVar.a(t.a(0))).invoke();
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.w1(dVar, objInvoke);
            fVar.f(iB, objInvoke);
            fVar.h(objInvoke);
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "insertIndex" : super.e(parameter);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "factory";
            }
            return t.b(parameter, t.a(1)) ? "groupAnchor" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$o;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f109730c = new o();

        private o() {
            super(0, 2, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            a3 a3Var = (a3) eVar.a(t.a(1));
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(0));
            slotWriter.I();
            slotWriter.x0(a3Var, dVar.d(a3Var), false);
            slotWriter.U();
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "anchor";
            }
            return t.b(parameter, t.a(1)) ? "from" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$p;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f109731c = new p();

        private p() {
            super(0, 3, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            a3 a3Var = (a3) eVar.a(t.a(1));
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(0));
            s2.c cVar = (s2.c) eVar.a(t.a(2));
            SlotWriter slotWriterW = a3Var.w();
            try {
                cVar.d(fVar, slotWriterW, q2Var);
                jn0.h0 h0Var = jn0.h0.f84049a;
                slotWriterW.L(true);
                slotWriter.I();
                slotWriter.x0(a3Var, dVar.d(a3Var), false);
                slotWriter.U();
            } catch (Throwable th2) {
                slotWriterW.L(false);
                throw th2;
            }
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "anchor";
            }
            if (t.b(parameter, t.a(1))) {
                return "from";
            }
            return t.b(parameter, t.a(2)) ? "fixups" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$r;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f109732c = new r();

        private r() {
            super(1, 0, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.y0(eVar.b(q.a(0)));
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "offset" : super.e(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$s;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class s extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f109733c = new s();

        private s() {
            super(3, 0, 2, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            fVar.e(eVar.b(q.a(0)), eVar.b(q.a(1)), eVar.b(q.a(2)));
        }

        @Override // s2.d
        public String e(int parameter) {
            if (q.b(parameter, q.a(0))) {
                return "from";
            }
            if (q.b(parameter, q.a(1))) {
                return "to";
            }
            return q.b(parameter, q.a(2)) ? "count" : super.e(parameter);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ls2/d$u;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/d$t;", "f", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f109734c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i11 = 1;
            super(i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p020r2.d dVar = (p020r2.d) eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            fVar.i();
            p013kotlin.jvm.internal.s.i(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            fVar.g(iB, slotWriter.E0(dVar));
        }

        @Override // s2.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "insertIndex" : super.e(parameter);
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "groupAnchor" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$v;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f109735c = new v();

        private v() {
            super(0, 3, 1, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            s2.f.g((p020r2.e0) eVar.a(t.a(0)), (p020r2.q) eVar.a(t.a(1)), (k1) eVar.a(t.a(2)), slotWriter);
        }

        @Override // s2.d
        public String f(int parameter) {
            if (t.b(parameter, t.a(0))) {
                return "composition";
            }
            if (t.b(parameter, t.a(1))) {
                return "parentCompositionContext";
            }
            return t.b(parameter, t.a(2)) ? "reference" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$w;", "Ls2/d;", "<init>", "()V", "Ls2/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f109736c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i11 = 1;
            super(0, i11, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            q2Var.d((r2) eVar.a(t.a(0)));
        }

        @Override // s2.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : super.f(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$x;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f109737c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            p020r2.o.M(slotWriter, q2Var);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ls2/d$y;", "Ls2/d;", "<init>", "()V", "Ls2/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f109738c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i11 = 2;
            super(i11, 0, i11, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            fVar.a(eVar.b(q.a(0)), eVar.b(q.a(1)));
        }

        @Override // s2.d
        public String e(int parameter) {
            if (q.b(parameter, q.a(0))) {
                return "removeIndex";
            }
            return q.b(parameter, q.a(1)) ? "count" : super.e(parameter);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls2/d$z;", "Ls2/d;", "<init>", "()V", "Ls2/e;", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "Ljn0/h0;", "a", "(Ls2/e;Lr2/f;Lr2/d3;Lr2/q2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f109739c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i11 = 0;
            super(i11, i11, 3, null);
        }

        @Override // s2.d
        public void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var) {
            slotWriter.R0();
        }
    }

    public /* synthetic */ d(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    public abstract void a(s2.e eVar, p020r2.f<?> fVar, SlotWriter slotWriter, q2 q2Var);

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInts() {
        return this.ints;
    }

    public final String c() {
        String strL = o0.b(getClass()).l();
        return strL == null ? "" : strL;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getObjects() {
        return this.objects;
    }

    public String e(int parameter) {
        return "IntParameter(" + parameter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public String f(int parameter) {
        return "ObjectParameter(" + parameter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public String toString() {
        return c();
    }

    private d(int i11, int i12) {
        this.ints = i11;
        this.objects = i12;
    }

    public /* synthetic */ d(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Ls2/d$q;", "", "", "offset", "a", "(I)I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class q {
        public static final boolean b(int i11, int i12) {
            return i11 == i12;
        }

        public static int a(int i11) {
            return i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0007"}, d2 = {"Ls2/d$t;", "T", "", "", "offset", "a", "(I)I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class t<T> {
        public static final boolean b(int i11, int i12) {
            return i11 == i12;
        }

        public static <T> int a(int i11) {
            return i11;
        }
    }
}
