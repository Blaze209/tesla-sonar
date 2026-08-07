package ch.qos.logback.core.spi;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface ComponentTracker<C> {
    public static final int DEFAULT_MAX_COMPONENTS = Integer.MAX_VALUE;
    public static final long DEFAULT_TIMEOUT = 1800000;

    Collection<C> allComponents();

    Set<String> allKeys();

    void endOfLife(String str);

    C find(String str);

    int getComponentCount();

    C getOrCreate(String str, long j11);

    void removeStaleComponents(long j11);
}
