package lv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f90789a;

    public a(jv.g gVar) {
        this.f90789a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f90789a;
    }

    public JSONObject b() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        bv.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.i.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e = e11;
                        bv.g.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    bv.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                com.google.firebase.crashlytics.internal.common.i.f(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            com.google.firebase.crashlytics.internal.common.i.f(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j11, JSONObject jSONObject) throws Throwable {
        bv.g.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j11);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e11) {
                    e = e11;
                    fileWriter = fileWriter2;
                    bv.g.f().e("Failed to cache settings", e);
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
