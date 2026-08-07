package bv;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f18118b = null;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18120b;

        private b() {
            int iP = com.google.firebase.crashlytics.internal.common.i.p(f.this.f18117a, "com.google.firebase.crashlytics.unity_version", InquiryField.StringField.TYPE);
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f18119a = null;
                    this.f18120b = null;
                    return;
                } else {
                    this.f18119a = "Flutter";
                    this.f18120b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f18119a = "Unity";
            String string = f.this.f18117a.getResources().getString(iP);
            this.f18120b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f18117a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f18117a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f18117a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f18118b == null) {
            this.f18118b = new b();
        }
        return this.f18118b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.i.p(context, "com.google.firebase.crashlytics.unity_version", InquiryField.StringField.TYPE) != 0;
    }

    public String d() {
        return f().f18119a;
    }

    public String e() {
        return f().f18120b;
    }
}
