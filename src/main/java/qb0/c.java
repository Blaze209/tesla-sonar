package qb0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f105316b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<SharedPreferences.Editor> f105317a = new ArrayList<>();

    public static synchronized c a() {
        try {
            if (f105316b == null) {
                f105316b = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f105316b;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("non_secure", 0);
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("secure", 0);
    }

    public static SharedPreferences h(Context context) {
        return context.getSharedPreferences("svc_data", 0);
    }

    public long c(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(str, 0L);
    }

    public Set<String> d(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getStringSet(str, null);
    }

    public String e(String str, SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        try {
            return sharedPreferences.getString(str, null);
        } catch (Exception unused) {
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.containsKey(str)) {
                return all.get(str).toString();
            }
            return null;
        }
    }

    public Set<String> f(String str, SharedPreferences sharedPreferences, Set<String> set) {
        return sharedPreferences.getStringSet(str, set);
    }

    public long i(String str, long j11, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(str, j11);
        editorEdit.apply();
        return j11;
    }

    public Set<String> j(String str, Set<String> set, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet(str, set);
        editorEdit.apply();
        return set;
    }

    public void k(String str, Set<String> set, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet(str, set);
        editorEdit.commit();
    }
}
