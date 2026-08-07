package com.fourthline.core.internal;

import java.util.Calendar;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/internal/TimestampProviderInternal;", "Lcom/fourthline/core/internal/TimestampProvider;", "<init>", "()V", "currentTime", "Ljava/util/Date;", "getCurrentTime", "()Ljava/util/Date;", "currentTimestamp", "", "getCurrentTimestamp", "()J", "currentCalendar", "Ljava/util/Calendar;", "getCurrentCalendar", "()Ljava/util/Calendar;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimestampProviderInternal implements TimestampProvider {
    @Override // com.fourthline.core.internal.TimestampProvider
    public Calendar getCurrentCalendar() {
        Calendar calendar = Calendar.getInstance();
        s.j(calendar, "getInstance(...)");
        return calendar;
    }

    @Override // com.fourthline.core.internal.TimestampProvider
    public Date getCurrentTime() {
        return new Date();
    }

    @Override // com.fourthline.core.internal.TimestampProvider
    public long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }
}
