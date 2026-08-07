package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyDefiner;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyDefinerBase extends ContextAwareBase implements PropertyDefiner {
    protected static String booleanAsStr(boolean z11) {
        return (z11 ? Boolean.TRUE : Boolean.FALSE).toString();
    }
}
