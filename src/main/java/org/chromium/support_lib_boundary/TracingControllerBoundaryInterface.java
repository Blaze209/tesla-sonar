package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i11, Collection<String> collection, int i12);

    boolean stop(OutputStream outputStream, Executor executor);
}
