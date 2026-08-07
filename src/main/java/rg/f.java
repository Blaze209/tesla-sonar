package rg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class f implements pg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108139a = false;

    @Override // pg.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f108139a) {
            ih.a.c(context);
            this.f108139a = true;
        }
        boolean zA = ih.a.a();
        tg.a.c("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return ih.a.b(context);
        }
        return null;
    }
}
