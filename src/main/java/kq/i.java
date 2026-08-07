package kq;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.o;
import p020r2.w2;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0018\u001a\u00020\u000e*\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001b\u001a\u00020\u000e*\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"", "Lkq/e;", "permissions", "Landroidx/lifecycle/Lifecycle$a;", "lifecycleEvent", "Ljn0/h0;", "b", "(Ljava/util/List;Landroidx/lifecycle/Lifecycle$a;Lr2/l;II)V", "Landroid/content/Context;", "Landroid/app/Activity;", "e", "(Landroid/content/Context;)Landroid/app/Activity;", "", "permission", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/String;)Z", "h", "(Landroid/app/Activity;Ljava/lang/String;)Z", "Lkq/g;", "g", "(Lkq/g;)Z", "isGranted$annotations", "(Lkq/g;)V", "isGranted", "f", "getShouldShowRationale$annotations", "shouldShowRationale", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lifecycle f89324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.p003lifecycle.u f89325d;

        /* JADX INFO: renamed from: kq.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kq/i$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1880a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Lifecycle f89326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.p003lifecycle.u f89327b;

            public C1880a(Lifecycle lifecycle, androidx.p003lifecycle.u uVar) {
                this.f89326a = lifecycle;
                this.f89327b = uVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f89326a.d(this.f89327b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Lifecycle lifecycle, androidx.p003lifecycle.u uVar) {
            super(1);
            this.f89324c = lifecycle;
            this.f89325d = uVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            this.f89324c.a(this.f89325d);
            return new C1880a(this.f89324c, this.f89325d);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<e> f89328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lifecycle.a f89329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f89330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f89331f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<e> list, Lifecycle.a aVar, int i11, int i12) {
            super(2);
            this.f89328c = list;
            this.f89329d = aVar;
            this.f89330e = i11;
            this.f89331f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            i.b(this.f89328c, this.f89329d, lVar, k2.a(this.f89330e | 1), this.f89331f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void b(final List<e> permissions, final Lifecycle.a aVar, p020r2.l lVar, int i11, int i12) {
        s.k(permissions, "permissions");
        p020r2.l lVarV = lVar.v(1533427666);
        if ((i12 & 2) != 0) {
            aVar = Lifecycle.a.ON_RESUME;
        }
        if (o.J()) {
            o.S(1533427666, i11, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:105)");
        }
        lVarV.H(-1664752182);
        boolean zN = lVarV.n(permissions);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new androidx.p003lifecycle.u() { // from class: kq.h
                @Override // androidx.p003lifecycle.u
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar2) {
                    i.c(aVar, permissions, lifecycleOwner, aVar2);
                }
            };
            lVarV.B(objI);
        }
        androidx.p003lifecycle.u uVar = (androidx.p003lifecycle.u) objI;
        lVarV.T();
        Lifecycle lifecycle = ((LifecycleOwner) lVarV.U(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        Function0.b(lifecycle, uVar, new a(lifecycle, uVar), lVarV, 72);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(permissions, aVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Lifecycle.a aVar, List permissions, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        s.k(permissions, "$permissions");
        s.k(lifecycleOwner, "<anonymous parameter 0>");
        s.k(event, "event");
        if (event == aVar) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (!s.f(eVar.getStatus(), g.b.f89321a)) {
                    eVar.c();
                }
            }
        }
    }

    public static final boolean d(Context context, String permission) {
        s.k(context, "<this>");
        s.k(permission, "permission");
        return androidx.core.content.b.checkSelfPermission(context, permission) == 0;
    }

    public static final Activity e(Context context) {
        s.k(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.j(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean f(g gVar) {
        s.k(gVar, "<this>");
        if (s.f(gVar, g.b.f89321a)) {
            return false;
        }
        if (gVar instanceof g.Denied) {
            return ((g.Denied) gVar).getShouldShowRationale();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean g(g gVar) {
        s.k(gVar, "<this>");
        return s.f(gVar, g.b.f89321a);
    }

    public static final boolean h(Activity activity, String permission) {
        s.k(activity, "<this>");
        s.k(permission, "permission");
        return androidx.core.app.b.i(activity, permission);
    }
}
