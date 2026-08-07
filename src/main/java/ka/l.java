package ka;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p011ja.d0;
import p011ja.n;
import p011ja.r;
import p011ja.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lja/n;", "Lr2/y3;", "Lja/k;", DateTokenConverter.CONVERTER_KEY, "(Lja/n;Lr2/l;I)Lr2/y3;", "", "Lja/d0;", "Lja/r;", "navigators", "Lja/w;", "e", "([Lja/d0;Lr2/l;I)Lja/w;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)Lja/w;", "La3/j;", "a", "(Landroid/content/Context;)La3/j;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Lja/w;", "it", "Landroid/os/Bundle;", "a", "(La3/l;Lja/w;)Landroid/os/Bundle;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<a3.l, w, Bundle> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f85657c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(a3.l lVar, w wVar) {
            return wVar.n0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "it", "Lja/w;", "a", "(Landroid/os/Bundle;)Lja/w;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Bundle, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f85658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f85658c = context;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Bundle bundle) {
            w wVarC = l.c(this.f85658c);
            wVarC.l0(bundle);
            return wVarC;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/w;", "b", "()Lja/w;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f85659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f85659c = context;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return l.c(this.f85659c);
        }
    }

    private static final a3.j<w, ?> a(Context context) {
        return a3.k.a(a.f85657c, new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w c(Context context) {
        w wVar = new w(context);
        wVar.get_navigatorProvider().b(new d(wVar.get_navigatorProvider()));
        wVar.get_navigatorProvider().b(new e());
        wVar.get_navigatorProvider().b(new i());
        return wVar;
    }

    public static final y3<p011ja.k> d(n nVar, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(-120375203, i11, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        y3<p011ja.k> y3VarA = n3.a(nVar.E(), null, null, lVar, 48, 2);
        if (o.J()) {
            o.R();
        }
        return y3VarA;
    }

    public static final w e(d0<? extends r>[] d0VarArr, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(-312215566, i11, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        Object[] objArrCopyOf = Arrays.copyOf(d0VarArr, d0VarArr.length);
        a3.j<w, ?> jVarA = a(context);
        boolean zK = lVar.K(context);
        Object objI = lVar.I();
        if (zK || objI == p020r2.l.INSTANCE.a()) {
            objI = new c(context);
            lVar.B(objI);
        }
        w wVar = (w) a3.b.c(objArrCopyOf, jVarA, null, (wn0.a) objI, lVar, 0, 4);
        for (d0<? extends r> d0Var : d0VarArr) {
            wVar.get_navigatorProvider().b(d0Var);
        }
        if (o.J()) {
            o.R();
        }
        return wVar;
    }
}
