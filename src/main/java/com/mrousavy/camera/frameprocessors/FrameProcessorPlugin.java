package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@in.a
public abstract class FrameProcessorPlugin {
    @Keep
    @in.a
    public abstract Object callback(@NonNull Frame frame, Map<String, Object> map);
}
