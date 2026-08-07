package rg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class h implements pg.a {
    @Override // pg.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zB = xh.d.b(context);
        tg.a.c("getOAID", "isSupported", Boolean.valueOf(zB));
        if (zB) {
            return xh.d.a(context);
        }
        return null;
    }
}
