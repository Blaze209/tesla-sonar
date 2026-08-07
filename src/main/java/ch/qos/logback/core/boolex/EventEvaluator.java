package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;

/* JADX INFO: loaded from: classes3.dex */
public interface EventEvaluator<E> extends ContextAware, LifeCycle {
    boolean evaluate(E e11);

    String getName();

    void setName(String str);
}
