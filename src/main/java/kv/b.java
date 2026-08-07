package kv;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.common.p0;
import gv.f0;
import hv.j;
import java.nio.charset.Charset;
import nq.h;
import pq.u;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f89407c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f89408d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f89409e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h<f0, byte[]> f89410f = new h() { // from class: kv.a
        @Override // nq.h
        public final Object apply(Object obj) {
            return b.f89407c.M((f0) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f89411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<f0, byte[]> f89412b;

    b(e eVar, h<f0, byte[]> hVar) {
        this.f89411a = eVar;
        this.f89412b = hVar;
    }

    public static b b(Context context, lv.j jVar, p0 p0Var) {
        u.f(context);
        nq.j jVarH = u.c().h(new com.google.android.datatransport.cct.a(f89408d, f89409e));
        nq.c cVarB = nq.c.b("json");
        h<f0, byte[]> hVar = f89410f;
        return new b(new e(jVarH.a("FIREBASE_CRASHLYTICS_REPORT", f0.class, cVarB, hVar), jVar.a(), p0Var), hVar);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(str.charAt(i11));
            if (str2.length() > i11) {
                sb2.append(str2.charAt(i11));
            }
        }
        return sb2.toString();
    }

    @NonNull
    public Task<c0> c(@NonNull c0 c0Var, boolean z11) {
        return this.f89411a.i(c0Var, z11).getTask();
    }
}
