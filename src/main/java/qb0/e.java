package qb0;

import android.content.Context;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
public class e {
    public static void a(Context context) {
        if ("5".equals(m.j().h("SCHEMA_ID"))) {
            String strH = m.j().h("_SSO_REFRESH_TOKEN");
            String strH2 = m.j().h("_SSO_ID_TOKEN");
            if (strH == null || strH2 == null) {
                return;
            }
            a.q().H(strH);
            a.q().l(strH2);
        }
    }
}
