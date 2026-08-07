package expo.modules.calendar;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lexpo/modules/calendar/Recurrence;", "", "frequency", "", "interval", "", "endDate", "occurrence", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getFrequency", "()Ljava/lang/String;", "getInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndDate", "getOccurrence", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lexpo/modules/calendar/Recurrence;", "equals", "", "other", "hashCode", "toString", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recurrence {
    private final String endDate;
    private final String frequency;
    private final Integer interval;
    private final Integer occurrence;

    public Recurrence(String frequency, Integer num, String str, Integer num2) {
        s.k(frequency, "frequency");
        this.frequency = frequency;
        this.interval = num;
        this.endDate = str;
        this.occurrence = num2;
    }

    public static /* synthetic */ Recurrence copy$default(Recurrence recurrence, String str, Integer num, String str2, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recurrence.frequency;
        }
        if ((i11 & 2) != 0) {
            num = recurrence.interval;
        }
        if ((i11 & 4) != 0) {
            str2 = recurrence.endDate;
        }
        if ((i11 & 8) != 0) {
            num2 = recurrence.occurrence;
        }
        return recurrence.copy(str, num, str2, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOccurrence() {
        return this.occurrence;
    }

    public final Recurrence copy(String frequency, Integer interval, String endDate, Integer occurrence) {
        s.k(frequency, "frequency");
        return new Recurrence(frequency, interval, endDate, occurrence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recurrence)) {
            return false;
        }
        Recurrence recurrence = (Recurrence) other;
        return s.f(this.frequency, recurrence.frequency) && s.f(this.interval, recurrence.interval) && s.f(this.endDate, recurrence.endDate) && s.f(this.occurrence, recurrence.occurrence);
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final Integer getInterval() {
        return this.interval;
    }

    public final Integer getOccurrence() {
        return this.occurrence;
    }

    public int hashCode() {
        int iHashCode = this.frequency.hashCode() * 31;
        Integer num = this.interval;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.endDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.occurrence;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Recurrence(frequency=" + this.frequency + ", interval=" + this.interval + ", endDate=" + this.endDate + ", occurrence=" + this.occurrence + ")";
    }
}
