package kotlinx.coroutines.slf4j;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlinx.coroutines.ThreadContextElement;
import org.slf4j.MDC;
import p013kotlin.Metadata;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00040\u00012\u00020\u0005:\u0001\u0015B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext;", "Lkotlinx/coroutines/ThreadContextElement;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "contextMap", "<init>", "(Ljava/util/Map;)V", "Ljn0/h0;", "setCurrent", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/Map;", "oldState", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;)V", "Ljava/util/Map;", "getContextMap", "()Ljava/util/Map;", "Key", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MDCContext extends AbstractCoroutineContextElement implements ThreadContextElement<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, String> contextMap;

    /* JADX INFO: renamed from: kotlinx.coroutines.slf4j.MDCContext$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/slf4j/MDCContext;", "<init>", "()V", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<MDCContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MDCContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void setCurrent(Map<String, String> contextMap) {
        if (contextMap == null) {
            MDC.clear();
        } else {
            MDC.setContextMap(contextMap);
        }
    }

    public final Map<String, String> getContextMap() {
        return this.contextMap;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(CoroutineContext coroutineContext, Map<String, ? extends String> map) {
        restoreThreadContext2(coroutineContext, (Map<String, String>) map);
    }

    public /* synthetic */ MDCContext(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MDC.getCopyOfContextMap() : map);
    }

    /* JADX INFO: renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(CoroutineContext context, Map<String, String> oldState) {
        setCurrent(oldState);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public Map<String, ? extends String> updateThreadContext(CoroutineContext context) {
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        setCurrent(this.contextMap);
        return copyOfContextMap;
    }

    public MDCContext(Map<String, String> map) {
        super(INSTANCE);
        this.contextMap = map;
    }
}
