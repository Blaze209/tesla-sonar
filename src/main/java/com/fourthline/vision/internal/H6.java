package com.fourthline.vision.internal;

import android.view.Surface;
import com.fourthline.core.internal.Try;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface H6 {
    Object start(List<? extends Surface> list, Continuation<? super Try<jn0.h0>> continuation);

    void stop();
}
