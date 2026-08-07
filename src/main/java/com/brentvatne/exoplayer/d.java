package com.brentvatne.exoplayer;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/brentvatne/exoplayer/d;", "", "<init>", "()V", "Lvi/b;", "bufferConfig", "Lp7/y$g$a;", "b", "(Lvi/b;)Lp7/y$g$a;", "Lvi/i$b;", OrcaKeys.METADATA, "Lp7/e0;", "a", "(Lvi/i$b;)Lp7/e0;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20289a = new d();

    private d() {
    }

    public static final p7.e0 a(vi.i.b metadata) {
        if (metadata != null) {
            return new p7.e0.b().q0(metadata.getTitle()).o0(metadata.getSubtitle()).W(metadata.getDescription()).Q(metadata.getArtist()).S(metadata.getImageUri()).J();
        }
        return null;
    }

    public static final p7.y.g.a b(vi.b bufferConfig) {
        p013kotlin.jvm.internal.s.k(bufferConfig, "bufferConfig");
        p7.y.g.a aVar = new p7.y.g.a();
        vi.b.C2555b live = bufferConfig.getLive();
        if (bufferConfig.getLive().getMaxOffsetMs() >= 0) {
            aVar.g(live.getMaxOffsetMs());
        }
        if (bufferConfig.getLive().getMaxPlaybackSpeed() >= BitmapDescriptorFactory.HUE_RED) {
            aVar.h(live.getMaxPlaybackSpeed());
        }
        if (bufferConfig.getLive().getTargetOffsetMs() >= 0) {
            aVar.k(live.getTargetOffsetMs());
        }
        if (bufferConfig.getLive().getMinOffsetMs() >= 0) {
            aVar.i(live.getMinOffsetMs());
        }
        if (bufferConfig.getLive().getMinPlaybackSpeed() >= BitmapDescriptorFactory.HUE_RED) {
            aVar.j(live.getMinPlaybackSpeed());
        }
        return aVar;
    }
}
