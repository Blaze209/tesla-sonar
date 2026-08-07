package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzk extends OpeningHours.Builder {
    private List zza;
    private List zzb;

    zzk() {
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<Period> getPeriods() {
        List<Period> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"periods\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<String> getWeekdayText() {
        List<String> list = this.zzb;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"weekdayText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    final OpeningHours zza() {
        List list;
        List list2 = this.zza;
        if (list2 != null && (list = this.zzb) != null) {
            return new zzal(list2, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" periods");
        }
        if (this.zzb == null) {
            sb2.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
