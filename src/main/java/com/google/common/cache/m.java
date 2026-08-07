package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
interface m<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    m<K, V> getNext();

    m<K, V> getNextInAccessQueue();

    m<K, V> getNextInWriteQueue();

    m<K, V> getPreviousInAccessQueue();

    m<K, V> getPreviousInWriteQueue();

    g.y<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j11);

    void setNextInAccessQueue(m<K, V> mVar);

    void setNextInWriteQueue(m<K, V> mVar);

    void setPreviousInAccessQueue(m<K, V> mVar);

    void setPreviousInWriteQueue(m<K, V> mVar);

    void setValueReference(g.y<K, V> yVar);

    void setWriteTime(long j11);
}
