package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f40264a = new l() { // from class: tr.c
        @Override // com.google.android.exoplayer2.mediacodec.l
        public final List a(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.t(str, z11, z12);
        }
    };

    List<k> a(String str, boolean z11, boolean z12);
}
