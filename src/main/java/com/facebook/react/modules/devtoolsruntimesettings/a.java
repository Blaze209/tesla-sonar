package com.facebook.react.modules.devtoolsruntimesettings;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/devtoolsruntimesettings/a;", "", "<init>", "()V", "", "a", "Z", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "shouldReloadAndProfile", "c", "recordChangeDescriptions", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean shouldReloadAndProfile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean recordChangeDescriptions;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRecordChangeDescriptions() {
        return this.recordChangeDescriptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldReloadAndProfile() {
        return this.shouldReloadAndProfile;
    }

    public final void c(boolean z11) {
        this.recordChangeDescriptions = z11;
    }

    public final void d(boolean z11) {
        this.shouldReloadAndProfile = z11;
    }
}
