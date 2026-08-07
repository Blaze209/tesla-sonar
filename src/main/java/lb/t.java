package lb;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llb/t;", "Lua/b;", "Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "Lza/c;", "db", "Ljn0/h0;", "b", "(Lza/c;)V", "c", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends ua.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context mContext, int i11, int i12) {
        super(i11, i12);
        p013kotlin.jvm.internal.s.k(mContext, "mContext");
        this.mContext = mContext;
    }

    @Override // ua.b
    public void b(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        if (this.endVersion >= 10) {
            db2.h2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.mContext.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
