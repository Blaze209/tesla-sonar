package com.brentvatne.exoplayer;

import android.os.Binder;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/brentvatne/exoplayer/v;", "Landroid/os/Binder;", "Lcom/brentvatne/exoplayer/w0;", "service", "<init>", "(Lcom/brentvatne/exoplayer/w0;)V", "n", "Lcom/brentvatne/exoplayer/w0;", "a", "()Lcom/brentvatne/exoplayer/w0;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends Binder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final w0 service;

    public v(w0 service) {
        p013kotlin.jvm.internal.s.k(service, "service");
        this.service = service;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w0 getService() {
        return this.service;
    }
}
