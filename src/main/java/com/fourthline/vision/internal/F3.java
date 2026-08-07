package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public interface F3 {
    Pair<Long, List<MotionFrame>> trimMotionData(List<MotionFrame> list);
}
