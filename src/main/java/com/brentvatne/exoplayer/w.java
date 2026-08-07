package com.brentvatne.exoplayer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/brentvatne/exoplayer/w;", "Lyi/b;", "Lvi/i;", "source", "Landroidx/media3/exoplayer/drm/i;", "drmSessionManager", "a", "(Lvi/i;Landroidx/media3/exoplayer/drm/i;)Landroidx/media3/exoplayer/drm/i;", "Landroidx/media3/datasource/a$a;", "mediaDataSourceFactory", DateTokenConverter.CONVERTER_KEY, "(Lvi/i;Landroidx/media3/datasource/a$a;)Landroidx/media3/datasource/a$a;", "Landroidx/media3/exoplayer/source/r$a;", "mediaSourceFactory", "b", "(Lvi/i;Landroidx/media3/exoplayer/source/r$a;Landroidx/media3/datasource/a$a;)Landroidx/media3/exoplayer/source/r$a;", "Lp7/y$c;", "mediaItemBuilder", "f", "(Lvi/i;Lp7/y$c;)Lp7/y$c;", "", "e", "(Lvi/i;)Z", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface w extends yi.b {
    androidx.media3.exoplayer.drm.i a(vi.i source, androidx.media3.exoplayer.drm.i drmSessionManager);

    androidx.media3.exoplayer.source.r.a b(vi.i source, androidx.media3.exoplayer.source.r.a mediaSourceFactory, androidx.media3.datasource.a.InterfaceC0192a mediaDataSourceFactory);

    androidx.media3.datasource.a.InterfaceC0192a d(vi.i source, androidx.media3.datasource.a.InterfaceC0192a mediaDataSourceFactory);

    boolean e(vi.i source);

    p7.y.c f(vi.i source, p7.y.c mediaItemBuilder);
}
