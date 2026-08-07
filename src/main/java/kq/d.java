package kq;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestPermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l0;
import p020r2.o;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "permissions", "Lkotlin/Function1;", "", "", "Ljn0/h0;", "onPermissionsResult", "Lkq/a;", "a", "(Ljava/util/List;Lwn0/l;Lr2/l;II)Lkq/a;", "Lkq/e;", "b", "(Ljava/util/List;Lr2/l;I)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements l<Map<String, ? extends Boolean>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f89305c = new a();

        a() {
            super(1);
        }

        public final void a(Map<String, Boolean> it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Map<String, ? extends Boolean> map) {
            a(map);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kq.c f89306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.h<String[], Map<String, Boolean>> f89307d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kq/d$b$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kq.c f89308a;

            public a(kq.c cVar) {
                this.f89308a = cVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f89308a.e(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kq.c cVar, f.h<String[], Map<String, Boolean>> hVar) {
            super(1);
            this.f89306c = cVar;
            this.f89307d = hVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            this.f89306c.e(this.f89307d);
            return new a(this.f89306c);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "permissionsResult", "Ljn0/h0;", "a", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<Map<String, Boolean>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kq.c f89309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Map<String, Boolean>, h0> f89310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kq.c cVar, l<? super Map<String, Boolean>, h0> lVar) {
            super(1);
            this.f89309c = cVar;
            this.f89310d = lVar;
        }

        public final void a(Map<String, Boolean> permissionsResult) {
            s.k(permissionsResult, "permissionsResult");
            this.f89309c.f(permissionsResult);
            this.f89310d.invoke(permissionsResult);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Map<String, Boolean> map) {
            a(map);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: kq.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class C1879d extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kq.e f89311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.h<String, Boolean> f89312d;

        /* JADX INFO: renamed from: kq.d$d$a */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kq/d$d$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kq.e f89313a;

            public a(kq.e eVar) {
                this.f89313a = eVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f89313a.d(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1879d(kq.e eVar, f.h<String, Boolean> hVar) {
            super(1);
            this.f89311c = eVar;
            this.f89312d = hVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            this.f89311c.d(this.f89312d);
            return new a(this.f89311c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements l<Boolean, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kq.e f89314c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(kq.e eVar) {
            super(1);
            this.f89314c = eVar;
        }

        public final void a(boolean z11) {
            this.f89314c.c();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return h0.f84049a;
        }
    }

    public static final kq.a a(List<String> permissions, l<? super Map<String, Boolean>, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        s.k(permissions, "permissions");
        lVar2.H(-2044770427);
        if ((i12 & 2) != 0) {
            lVar = a.f89305c;
        }
        if (o.J()) {
            o.S(-2044770427, i11, -1, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)");
        }
        List<kq.e> listB = b(permissions, lVar2, 8);
        i.b(listB, null, lVar2, 8, 2);
        lVar2.H(-1585748799);
        boolean zN = lVar2.n(permissions);
        Object objI = lVar2.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new kq.c(listB);
            lVar2.B(objI);
        }
        kq.c cVar = (kq.c) objI;
        lVar2.T();
        ActivityResultContracts$RequestMultiplePermissions activityResultContracts$RequestMultiplePermissions = new ActivityResultContracts$RequestMultiplePermissions();
        lVar2.H(-1585748493);
        boolean zN2 = ((((i11 & 112) ^ 48) > 32 && lVar2.K(lVar)) || (i11 & 48) == 32) | lVar2.n(cVar);
        Object objI2 = lVar2.I();
        if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new c(cVar, lVar);
            lVar2.B(objI2);
        }
        lVar2.T();
        f.h hVarA = f.c.a(activityResultContracts$RequestMultiplePermissions, (l) objI2, lVar2, 8);
        Function0.b(cVar, hVarA, new b(cVar, hVarA), lVar2, f.h.f63722c << 3);
        if (o.J()) {
            o.R();
        }
        lVar2.T();
        return cVar;
    }

    private static final List<kq.e> b(List<String> list, p020r2.l lVar, int i11) {
        Object obj;
        lVar.H(992349447);
        if (o.J()) {
            o.S(992349447, i11, -1, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        Activity activityE = i.e(context);
        lVar.H(-1458104306);
        boolean zN = lVar.n(list);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            obj = objI;
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new kq.e((String) it.next(), context, activityE));
            }
            lVar.B(arrayList);
            obj = arrayList;
        }
        obj = objI;
        List<kq.e> list3 = (List) obj;
        lVar.T();
        for (kq.e eVar : list3) {
            lVar.M(-1458104076, eVar.getPermission());
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
            lVar.H(-1458103836);
            boolean zN2 = lVar.n(eVar);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new e(eVar);
                lVar.B(objI2);
            }
            lVar.T();
            f.h hVarA = f.c.a(activityResultContracts$RequestPermission, (l) objI2, lVar, 8);
            Function0.c(hVarA, new C1879d(eVar, hVarA), lVar, f.h.f63722c);
            lVar.S();
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return list3;
    }
}
