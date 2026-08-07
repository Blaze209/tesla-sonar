package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class k0 implements l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f43990g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f43991h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f43992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f43993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zv.f f43995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f43996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l0.a f43997f;

    public k0(Context context, String str, zv.f fVar, f0 f0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f43993b = context;
        this.f43994c = str;
        this.f43995d = fVar;
        this.f43996e = f0Var;
        this.f43992a = new m0();
    }

    @NonNull
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        bv.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @NonNull
    private static String e(@NonNull String str) {
        return f43990g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f43991h, "");
    }

    private boolean n() {
        l0.a aVar = this.f43997f;
        if (aVar != null) {
            return aVar.e() == null && this.f43996e.d();
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.common.l0
    @NonNull
    public synchronized l0.a a() {
        if (!n()) {
            return this.f43997f;
        }
        bv.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = i.q(this.f43993b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        bv.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f43996e.d()) {
            FirebaseInstallationId firebaseInstallationIdD = d(false);
            bv.g.f().i("Fetched Firebase Installation ID: " + firebaseInstallationIdD.getFid());
            if (firebaseInstallationIdD.getFid() == null) {
                firebaseInstallationIdD = new FirebaseInstallationId(string == null ? c() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdD.getFid(), string)) {
                this.f43997f = l0.a.a(l(sharedPreferencesQ), firebaseInstallationIdD);
            } else {
                this.f43997f = l0.a.a(b(firebaseInstallationIdD.getFid(), sharedPreferencesQ), firebaseInstallationIdD);
            }
        } else if (k(string)) {
            this.f43997f = l0.a.b(l(sharedPreferencesQ));
        } else {
            this.f43997f = l0.a.b(b(c(), sharedPreferencesQ));
        }
        bv.g.f().i("Install IDs: " + this.f43997f);
        return this.f43997f;
    }

    @NonNull
    public FirebaseInstallationId d(boolean z11) {
        String strB;
        ev.i.e();
        String str = null;
        if (z11) {
            try {
                strB = ((com.google.firebase.installations.f) Tasks.await(this.f43995d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e11) {
                bv.g.f().l("Error getting Firebase authentication token.", e11);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(this.f43995d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e12) {
            bv.g.f().l("Error getting Firebase installation id.", e12);
        }
        return new FirebaseInstallationId(str, strB);
    }

    public String f() {
        return this.f43994c;
    }

    public String g() {
        return this.f43992a.a(this.f43993b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
