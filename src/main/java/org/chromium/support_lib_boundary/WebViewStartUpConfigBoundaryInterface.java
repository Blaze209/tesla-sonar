package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
