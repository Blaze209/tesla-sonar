package vf0;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f119288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f119289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f119290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f119291d;

    l(String str, String str2, Context context, String str3) {
        this.f119288a = str;
        this.f119289b = str2;
        this.f119290c = context;
        this.f119291d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strB;
        Context context;
        try {
            String str = String.format(this.f119288a, xf0.b.m(this.f119289b));
            xf0.j.b("uppay", "merUrl: " + str);
            wf0.d dVar = new wf0.d(str);
            String strB2 = xf0.b.b(this.f119290c);
            wf0.c cVar = new wf0.c(dVar, strB2);
            int iA = TextUtils.isEmpty(this.f119289b) ? 22 : cVar.a();
            if (iA == 0) {
                strB = cVar.b();
                context = this.f119290c;
            } else {
                if (iA != 22) {
                    return;
                }
                String str2 = String.format(this.f119288a, "conf_mode_02");
                xf0.j.b("uppay", "baseUrl: " + str2);
                dVar.d(str2);
                wf0.c cVar2 = new wf0.c(dVar, strB2);
                if (cVar2.a() != 0) {
                    return;
                }
                strB = cVar2.b();
                context = this.f119290c;
            }
            a.i(context, strB, this.f119291d);
        } catch (Exception unused) {
        }
    }
}
