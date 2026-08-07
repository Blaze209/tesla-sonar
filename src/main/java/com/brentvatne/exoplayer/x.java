package com.brentvatne.exoplayer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/brentvatne/exoplayer/x;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cacheSize", "Ljn0/h0;", "b", "(Landroid/content/Context;I)V", "Landroidx/media3/datasource/g;", "factory", "Landroidx/media3/datasource/a$a;", "a", "(Landroidx/media3/datasource/g;)Landroidx/media3/datasource/a$a;", "Landroidx/media3/datasource/cache/h;", "Landroidx/media3/datasource/cache/h;", "simpleCache", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f20439a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static androidx.media3.datasource.cache.h simpleCache;

    private x() {
    }

    public final androidx.media3.datasource.a.InterfaceC0192a a(androidx.media3.datasource.g factory) {
        p013kotlin.jvm.internal.s.k(factory, "factory");
        if (simpleCache == null) {
            return factory;
        }
        androidx.media3.datasource.cache.a.c cVar = new androidx.media3.datasource.cache.a.c();
        androidx.media3.datasource.cache.h hVar = simpleCache;
        p013kotlin.jvm.internal.s.h(hVar);
        androidx.media3.datasource.cache.a.c cVarE = cVar.d(hVar).e(factory);
        p013kotlin.jvm.internal.s.j(cVarE, "setUpstreamDataSourceFactory(...)");
        return cVarE;
    }

    public final void b(Context context, int cacheSize) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (simpleCache != null || cacheSize <= 0) {
            return;
        }
        long j11 = 1024;
        simpleCache = new androidx.media3.datasource.cache.h(new File(context.getCacheDir(), "RNVCache"), new w7.h(((long) cacheSize) * j11 * j11), new u7.b(context));
    }
}
