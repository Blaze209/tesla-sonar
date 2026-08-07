package rg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class i implements pg.a {
    @Override // pg.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zB = mh.a.b();
        tg.a.c("getOAID", "isSupported", Boolean.valueOf(zB));
        if (zB) {
            return mh.a.c(context);
        }
        return null;
    }
}
