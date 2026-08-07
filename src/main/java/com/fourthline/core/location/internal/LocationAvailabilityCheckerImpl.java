package com.fourthline.core.location.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.core.location.FourthlineLocationServicesHelper;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/core/location/internal/LocationAvailabilityCheckerImpl;", "Lcom/fourthline/core/location/internal/LocationAvailabilityChecker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "isLocationEnabled", "()Z", "a", "Landroid/content/Context;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationAvailabilityCheckerImpl implements LocationAvailabilityChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public LocationAvailabilityCheckerImpl(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    @Override // com.fourthline.core.location.internal.LocationAvailabilityChecker
    public boolean isLocationEnabled() {
        return FourthlineLocationServicesHelper.getLocationServicesEnabled(this.context);
    }
}
