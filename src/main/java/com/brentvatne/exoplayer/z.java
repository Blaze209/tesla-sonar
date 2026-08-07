package com.brentvatne.exoplayer;

import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.location.DeviceOrientationRequest;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/brentvatne/exoplayer/z;", "Landroidx/media3/exoplayer/upstream/a;", "", "minLoadRetryCount", "<init>", "(I)V", "Landroidx/media3/exoplayer/upstream/b$c;", "loadErrorInfo", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/media3/exoplayer/upstream/b$c;)J", "dataType", "b", "(I)I", "I", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends androidx.media3.exoplayer.upstream.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minLoadRetryCount;

    public z(int i11) {
        super(i11);
        this.minLoadRetryCount = i11;
    }

    @Override // androidx.media3.exoplayer.upstream.a, androidx.media3.exoplayer.upstream.b
    public int b(int dataType) {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.a, androidx.media3.exoplayer.upstream.b
    public long d(androidx.media3.exoplayer.upstream.b.c loadErrorInfo) {
        p013kotlin.jvm.internal.s.k(loadErrorInfo, "loadErrorInfo");
        String message = loadErrorInfo.f11164c.getMessage();
        if ((loadErrorInfo.f11164c instanceof HttpDataSource$HttpDataSourceException) && message != null && (p013kotlin.jvm.internal.s.f(message, "Unable to connect") || p013kotlin.jvm.internal.s.f(message, "Software caused connection abort"))) {
            return 1000L;
        }
        int i11 = loadErrorInfo.f11165d;
        if (i11 < this.minLoadRetryCount) {
            return Math.min(((long) (i11 - 1)) * 1000, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        }
        return -9223372036854775807L;
    }
}
