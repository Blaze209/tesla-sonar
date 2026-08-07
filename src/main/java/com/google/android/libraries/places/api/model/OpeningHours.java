package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.internal.zziy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpeningHours implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public OpeningHours build() {
            OpeningHours openingHoursZza = zza();
            Iterator<String> it = openingHoursZza.getWeekdayText().iterator();
            while (it.hasNext()) {
                zzig.zzi(!TextUtils.isEmpty(it.next()), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(zziy.zzk(openingHoursZza.getPeriods()));
            setWeekdayText(zziy.zzk(openingHoursZza.getWeekdayText()));
            return zza();
        }

        @RecentlyNonNull
        public abstract List<Period> getPeriods();

        @RecentlyNonNull
        public abstract List<String> getWeekdayText();

        @RecentlyNonNull
        public abstract Builder setPeriods(@RecentlyNonNull List<Period> list);

        @RecentlyNonNull
        public abstract Builder setWeekdayText(@RecentlyNonNull List<String> list);

        abstract OpeningHours zza();
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzk zzkVar = new zzk();
        zzkVar.setPeriods(new ArrayList());
        zzkVar.setWeekdayText(new ArrayList());
        return zzkVar;
    }

    @RecentlyNonNull
    public abstract List<Period> getPeriods();

    @RecentlyNonNull
    public abstract List<String> getWeekdayText();
}
