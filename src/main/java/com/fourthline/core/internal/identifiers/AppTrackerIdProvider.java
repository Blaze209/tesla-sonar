package com.fourthline.core.internal.identifiers;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/core/internal/identifiers/AppTrackerIdProvider;", "Lcom/fourthline/core/internal/identifiers/PersistedIdentifierProvider;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppTrackerIdProvider extends PersistedIdentifierProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTrackerIdProvider(Context context) {
        super(context, "appTrackerId");
        s.k(context, "context");
    }
}
