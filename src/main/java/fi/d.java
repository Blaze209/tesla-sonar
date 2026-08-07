package fi;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f66005a;

    public d(Bundle bundle) {
        this.f66005a = bundle;
    }

    public boolean a() {
        return this.f66005a.getBoolean("google_play_instant");
    }

    public long b() {
        return this.f66005a.getLong("install_begin_timestamp_seconds");
    }

    public String c() {
        return this.f66005a.getString("install_referrer");
    }

    public long d() {
        return this.f66005a.getLong("referrer_click_timestamp_seconds");
    }
}
