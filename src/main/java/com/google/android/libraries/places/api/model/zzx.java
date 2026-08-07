package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzx extends TimeOfWeek {
    private final DayOfWeek zza;
    private final LocalTime zzb;

    zzx(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (dayOfWeek == null) {
            throw new NullPointerException("Null day");
        }
        this.zza = dayOfWeek;
        if (localTime == null) {
            throw new NullPointerException("Null time");
        }
        this.zzb = localTime;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            if (this.zza.equals(timeOfWeek.getDay()) && this.zzb.equals(timeOfWeek.getTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return "TimeOfWeek{day=" + this.zza.toString() + ", time=" + this.zzb.toString() + "}";
    }
}
