package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z11);

    void setAllowFileAccess(boolean z11);

    void setBlockNetworkLoads(boolean z11);

    void setCacheMode(int i11);

    void setIncludeCookiesOnIntercept(boolean z11);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
