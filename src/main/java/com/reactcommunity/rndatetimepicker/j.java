package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Calendar f48335a = Calendar.getInstance();

    public j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            this.f48335a.setTimeInMillis(bundle.getLong("value"));
        }
        this.f48335a.setTimeZone(d.m(bundle));
    }

    public int a() {
        return this.f48335a.get(5);
    }

    public int b() {
        return this.f48335a.get(11);
    }

    public int c() {
        return this.f48335a.get(12);
    }

    public int d() {
        return this.f48335a.get(2);
    }

    public Long e() {
        return Long.valueOf(this.f48335a.getTimeInMillis());
    }

    public int f() {
        return this.f48335a.get(1);
    }
}
