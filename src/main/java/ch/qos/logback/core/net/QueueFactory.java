package ch.qos.logback.core.net;

import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public class QueueFactory {
    public <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int i11) {
        if (i11 < 1) {
            i11 = 1;
        }
        return new LinkedBlockingDeque<>(i11);
    }
}
