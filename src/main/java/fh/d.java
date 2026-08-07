package fh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import di.p;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f65963a;

    public interface a {
        void a(boolean z11, JSONObject jSONObject, String str);
    }

    public static boolean a(ai.a aVar, int i11, int i12, Intent intent) {
        if (i11 != 1010 || intent == null) {
            return false;
        }
        a aVar2 = f65963a;
        if (aVar2 == null) {
            return true;
        }
        f65963a = null;
        if (i12 == -1) {
            hh.a.b(aVar, "biz", "TbOk", intent.toUri(1));
            aVar2.a(true, p.t(intent), "OK");
        } else if (i12 != 0) {
            hh.a.g(aVar, "biz", "TbUnknown", "" + i12);
        } else {
            hh.a.b(aVar, "biz", "TbCancel", intent.toUri(1));
            aVar2.a(false, null, "CANCELED");
        }
        return true;
    }

    public static boolean b(ai.a aVar, Activity activity, int i11, String str, String str2, a aVar2) {
        try {
            hh.a.a(aVar, "biz", "TbStart");
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i11);
            f65963a = aVar2;
            return true;
        } catch (Throwable th2) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            hh.a.c(aVar, "biz", "TbActFail", th2);
            return false;
        }
    }

    public static boolean c(ai.a aVar, Context context) {
        return p.w(aVar, context, Collections.singletonList(new lh.b.C1902b("com.taobao.taobao", 0, "")), false);
    }
}
