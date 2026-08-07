package org.chromium.support_lib_boundary;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
