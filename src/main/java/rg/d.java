package rg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d implements pg.a {
    @Override // pg.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zA = kh.b.a();
        tg.a.c("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return kh.b.b(context);
        }
        return null;
    }
}
