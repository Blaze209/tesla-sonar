package tb;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import sb.Preference;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f113104a;

    public x(WorkDatabase workDatabase) {
        this.f113104a = workDatabase;
    }

    public static void c(Context context, za.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j12 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.beginTransaction();
            try {
                cVar.h2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                cVar.h2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j12)});
                sharedPreferences.edit().clear().apply();
                cVar.g2();
            } finally {
                cVar.n2();
            }
        }
    }

    public long a() {
        Long lB = this.f113104a.e().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f113104a.e().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j11) {
        this.f113104a.e().a(new Preference("last_cancel_all_time_ms", Long.valueOf(j11)));
    }

    public void e(long j11) {
        this.f113104a.e().a(new Preference("last_force_stop_ms", Long.valueOf(j11)));
    }

    public void f(boolean z11) {
        this.f113104a.e().a(new Preference("reschedule_needed", z11));
    }
}
