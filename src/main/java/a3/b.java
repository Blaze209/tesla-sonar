package a3;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.n3;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"", "T", "", "inputs", "La3/j;", "saver", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function0;", "init", "c", "([Ljava/lang/Object;La3/j;Ljava/lang/String;Lwn0/a;Lr2/l;II)Ljava/lang/Object;", "La3/g;", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(La3/g;Ljava/lang/Object;)V", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "", "a", "I", "MaxSupportedRadix", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f57a = 36;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f58c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j<T, ? extends Object> f59d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f60e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f61f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f62g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object[] f63h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, j<T, ? extends Object> jVar, g gVar, String str, T t11, Object[] objArr) {
            super(0);
            this.f58c = cVar;
            this.f59d = jVar;
            this.f60e = gVar;
            this.f61f = str;
            this.f62g = t11;
            this.f63h = objArr;
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
            this.f58c.f(this.f59d, this.f60e, this.f61f, this.f62g, this.f63h);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> T c(Object[] objArr, j<T, ? extends Object> jVar, String str, wn0.a<? extends T> aVar, p020r2.l lVar, int i11, int i12) {
        Object[] objArr2;
        T t11;
        Object objF;
        if ((i12 & 2) != 0) {
            jVar = k.b();
        }
        j<T, ? extends Object> jVar2 = jVar;
        int i13 = i12 & 4;
        T tInvoke = null;
        if (i13 != 0) {
            str = null;
        }
        if (o.J()) {
            o.S(441892779, i11, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int iA = p020r2.j.a(lVar, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(iA, p013kotlin.text.a.a(f57a));
            s.j(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        s.i(jVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        g gVar = (g) lVar.U(i.d());
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            if (gVar != null && (objF = gVar.f(str2)) != null) {
                tInvoke = jVar2.a(objF);
            }
            if (tInvoke == null) {
                tInvoke = aVar.invoke();
            }
            objArr2 = objArr;
            Object cVar = new c(jVar2, gVar, str2, tInvoke, objArr2);
            lVar.B(cVar);
            objI = cVar;
        } else {
            objArr2 = objArr;
        }
        c cVar2 = (c) objI;
        Object objD = cVar2.d(objArr2);
        if (objD == null) {
            objD = aVar.invoke();
        }
        boolean zK = lVar.K(cVar2) | ((((i11 & 112) ^ 48) > 32 && lVar.K(jVar2)) || (i11 & 48) == 32) | lVar.K(gVar) | lVar.n(str2) | lVar.K(objD) | lVar.K(objArr2);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            Object[] objArr3 = objArr2;
            t11 = (T) objD;
            Object aVar2 = new a(cVar2, jVar2, gVar, str2, t11, objArr3);
            lVar.B(aVar2);
            objI2 = aVar2;
        } else {
            t11 = (T) objD;
        }
        Function0.i((wn0.a) objI2, lVar, 0);
        if (o.J()) {
            o.R();
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g gVar, Object obj) {
        String strB;
        if (obj == null || gVar.a(obj)) {
            return;
        }
        if (obj instanceof b3.g) {
            b3.g gVar2 = (b3.g) obj;
            if (gVar2.e() == n3.j() || gVar2.e() == n3.q() || gVar2.e() == n3.n()) {
                strB = "MutableState containing " + gVar2.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strB = b(obj);
        }
        throw new IllegalArgumentException(strB);
    }
}
