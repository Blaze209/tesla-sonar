package z30;

import android.content.Context;
import android.content.pm.PackageInfo;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lz30/a;", "", "<init>", "()V", "Landroid/content/Context;", "Landroid/content/pm/PackageInfo;", "a", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "packageInfo", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f126806a = new a();

    private a() {
    }

    public final /* synthetic */ PackageInfo a(Context context) {
        Object objB;
        s.k(context, "<this>");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        return (PackageInfo) objB;
    }
}
