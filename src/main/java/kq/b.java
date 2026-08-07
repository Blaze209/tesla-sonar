package kq;

import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "permissions", "Lkotlin/Function1;", "", "", "Ljn0/h0;", "onPermissionsResult", "Lkq/a;", "a", "(Ljava/util/List;Lwn0/l;Lr2/l;II)Lkq/a;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements l<Map<String, ? extends Boolean>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f89295c = new a();

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

    public static final kq.a a(List<String> permissions, l<? super Map<String, Boolean>, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        s.k(permissions, "permissions");
        lVar2.H(-57132327);
        if ((i12 & 2) != 0) {
            lVar = a.f89295c;
        }
        if (o.J()) {
            o.S(-57132327, i11, -1, "com.google.accompanist.permissions.rememberMultiplePermissionsState (MultiplePermissionsState.kt:36)");
        }
        kq.a aVarA = d.a(permissions, lVar, lVar2, (i11 & 112) | 8, 0);
        if (o.J()) {
            o.R();
        }
        lVar2.T();
        return aVarA;
    }
}
