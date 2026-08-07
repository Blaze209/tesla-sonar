package p019p1;

import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l0;
import p020r2.o;
import p020r2.y3;
import p1.n0.a;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", AnnotatedPrivateKey.LABEL, "Lp1/n0;", "c", "(Ljava/lang/String;Lr2/l;II)Lp1/n0;", "T", "Lp1/q;", "V", "initialValue", "targetValue", "Lp1/p1;", "typeConverter", "Lp1/m0;", "animationSpec", "Lr2/y3;", "b", "(Lp1/n0;Ljava/lang/Object;Ljava/lang/Object;Lp1/p1;Lp1/m0;Ljava/lang/String;Lr2/l;II)Lr2/y3;", "", "a", "(Lp1/n0;FFLp1/m0;Ljava/lang/String;Lr2/l;II)Lr2/y3;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f100561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0.a<T, V> f100562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f100563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m0<T> f100564f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t11, n0.a<T, V> aVar, T t12, m0<T> m0Var) {
            super(0);
            this.f100561c = t11;
            this.f100562d = aVar;
            this.f100563e = t12;
            this.f100564f = m0Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void b() {
            if (s.f(this.f100561c, this.f100562d.k()) && s.f(this.f100563e, this.f100562d.n())) {
                return;
            }
            this.f100562d.B(this.f100561c, this.f100563e, this.f100564f);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f100565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0.a<T, V> f100566d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/o0$b$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f100567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0.a f100568b;

            public a(n0 n0Var, n0.a aVar) {
                this.f100567a = n0Var;
                this.f100568b = aVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100567a.j(this.f100568b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0 n0Var, n0.a<T, V> aVar) {
            super(1);
            this.f100565c = n0Var;
            this.f100566d = aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f100565c.f(this.f100566d);
            return new a(this.f100565c, this.f100566d);
        }
    }

    public static final y3<Float> a(n0 n0Var, float f11, float f12, m0<Float> m0Var, String str, p020r2.l lVar, int i11, int i12) {
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (o.J()) {
            o.S(-644770905, i11, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i13 = i11 << 3;
        y3<Float> y3VarB = b(n0Var, Float.valueOf(f11), Float.valueOf(f12), r1.e(p013kotlin.jvm.internal.l.f86526a), m0Var, str2, lVar, (i11 & 1022) | (57344 & i13) | (i13 & 458752), 0);
        if (o.J()) {
            o.R();
        }
        return y3VarB;
    }

    public static final <T, V extends q> y3<T> b(n0 n0Var, T t11, T t12, p1<T, V> p1Var, m0<T> m0Var, String str, p020r2.l lVar, int i11, int i12) {
        n0 n0Var2;
        Object obj;
        Object obj2;
        m0<T> m0Var2;
        if ((i12 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (o.J()) {
            o.S(-1062847727, i11, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            n0Var2 = n0Var;
            obj = t11;
            obj2 = t12;
            m0Var2 = m0Var;
            n0.a aVar = n0Var2.new a(obj, obj2, p1Var, m0Var2, str2);
            lVar.B(aVar);
            objI = aVar;
        } else {
            n0Var2 = n0Var;
            obj = t11;
            obj2 = t12;
            m0Var2 = m0Var;
        }
        n0.a aVar2 = (n0.a) objI;
        boolean z11 = true;
        boolean z12 = ((((i11 & 112) ^ 48) > 32 && lVar.K(obj)) || (i11 & 48) == 32) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.K(obj2)) || (i11 & KyberEngine.KyberPolyBytes) == 256);
        if ((((57344 & i11) ^ 24576) <= 16384 || !lVar.K(m0Var2)) && (i11 & 24576) != 16384) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objI2 = lVar.I();
        if (z13 || objI2 == companion.a()) {
            objI2 = new a(obj, aVar2, obj2, m0Var2);
            lVar.B(objI2);
        }
        Function0.i((wn0.a) objI2, lVar, 0);
        boolean zK = lVar.K(n0Var2);
        Object objI3 = lVar.I();
        if (zK || objI3 == companion.a()) {
            objI3 = new b(n0Var2, aVar2);
            lVar.B(objI3);
        }
        Function0.c(aVar2, (l) objI3, lVar, 6);
        if (o.J()) {
            o.R();
        }
        return aVar2;
    }

    public static final n0 c(String str, p020r2.l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (o.J()) {
            o.S(1013651573, i11, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = new n0(str);
            lVar.B(objI);
        }
        n0 n0Var = (n0) objI;
        n0Var.k(lVar, 0);
        if (o.J()) {
            o.R();
        }
        return n0Var;
    }
}
