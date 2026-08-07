package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.l;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f10571a = new l() { // from class: j8.h
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List a(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.k(str, z11, z12);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f10572b = new l() { // from class: j8.i
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List a(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.o(l.f10571a.a(str, z11, z12));
        }
    };

    List<j> a(String str, boolean z11, boolean z12);
}
