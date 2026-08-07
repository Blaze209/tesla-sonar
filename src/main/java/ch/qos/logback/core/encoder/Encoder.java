package ch.qos.logback.core.encoder;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;

/* JADX INFO: loaded from: classes3.dex */
public interface Encoder<E> extends ContextAware, LifeCycle {
    byte[] encode(E e11);

    byte[] footerBytes();

    byte[] headerBytes();
}
