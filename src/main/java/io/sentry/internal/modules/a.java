package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b> f80671e;

    public a(List<b> list, ILogger iLogger) {
        super(iLogger);
        this.f80671e = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.f80671e.iterator();
        while (it.hasNext()) {
            Map<String, String> mapA = it.next().a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
