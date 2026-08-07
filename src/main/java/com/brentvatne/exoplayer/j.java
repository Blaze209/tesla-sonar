package com.brentvatne.exoplayer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u001e\u0010\"R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010$¨\u0006&"}, d2 = {"Lcom/brentvatne/exoplayer/j;", "Lcom/brentvatne/exoplayer/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "initialBitrate", "<init>", "(Landroid/content/Context;Ljava/lang/Long;)V", "bitrate", "Ls8/i;", "e", "(Ljava/lang/Long;)Ls8/i;", "Ljn0/h0;", "c", "(J)V", "", "minLoadRetryCount", "Landroidx/media3/exoplayer/upstream/b;", "a", "(I)Landroidx/media3/exoplayer/upstream/b;", "Landroid/content/Context;", "b", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "h", "(Ljava/lang/Long;)V", "Ls8/i;", "bandWidthMeter", "", DateTokenConverter.CONVERTER_KEY, "Z", "f", "()Z", "(Z)V", "disableDisconnectError", "()Ls8/i;", "bandwidthMeter", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Long initialBitrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s8.i bandWidthMeter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disableDisconnectError;

    public j(Context context, Long l11) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        this.initialBitrate = l11;
        this.bandWidthMeter = e(getInitialBitrate());
    }

    private final s8.i e(Long bitrate) {
        s8.i iVarA = new s8.i.b(this.context).c(bitrate != null ? bitrate.longValue() : 1000000L).a();
        p013kotlin.jvm.internal.s.j(iVarA, "build(...)");
        return iVarA;
    }

    @Override // com.brentvatne.exoplayer.y
    public androidx.media3.exoplayer.upstream.b a(int minLoadRetryCount) {
        return getDisableDisconnectError() ? new z(minLoadRetryCount) : new androidx.media3.exoplayer.upstream.a(minLoadRetryCount);
    }

    @Override // com.brentvatne.exoplayer.y
    /* JADX INFO: renamed from: b, reason: from getter */
    public s8.i getBandWidthMeter() {
        return this.bandWidthMeter;
    }

    @Override // com.brentvatne.exoplayer.y
    public void c(long bitrate) {
        Long initialBitrate = getInitialBitrate();
        if (initialBitrate != null && initialBitrate.longValue() == bitrate) {
            return;
        }
        h(Long.valueOf(bitrate));
        this.bandWidthMeter = e(Long.valueOf(bitrate));
    }

    @Override // com.brentvatne.exoplayer.y
    public void d(boolean z11) {
        this.disableDisconnectError = z11;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getDisableDisconnectError() {
        return this.disableDisconnectError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Long getInitialBitrate() {
        return this.initialBitrate;
    }

    public void h(Long l11) {
        this.initialBitrate = l11;
    }

    public /* synthetic */ j(Context context, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : l11);
    }
}
