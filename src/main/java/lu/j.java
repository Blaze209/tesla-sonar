package lu;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.vending.licensing.ValidationException;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f90779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f90780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f90781c = null;

    public j(SharedPreferences sharedPreferences, h hVar) {
        this.f90779a = sharedPreferences;
        this.f90780b = hVar;
    }

    public void a() {
        SharedPreferences.Editor editor = this.f90781c;
        if (editor != null) {
            editor.commit();
            this.f90781c = null;
        }
    }

    public String b(String str, String str2) {
        String string = this.f90779a.getString(str, null);
        if (string != null) {
            try {
                return this.f90780b.b(string, str);
            } catch (ValidationException unused) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
            }
        }
        return str2;
    }

    public void c(String str, String str2) {
        if (this.f90781c == null) {
            SharedPreferences.Editor editorEdit = this.f90779a.edit();
            this.f90781c = editorEdit;
            editorEdit.apply();
        }
        this.f90781c.putString(str, this.f90780b.a(str2, str));
    }
}
