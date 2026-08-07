package tk0;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J%\u0010\u0007\u001a\u00028\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ltk0/i;", "", "TConfig", "TPlugin", "Lkotlin/Function1;", "Ljn0/h0;", "block", "a", "(Lwn0/l;)Ljava/lang/Object;", "plugin", "Lok0/a;", "scope", "b", "(Ljava/lang/Object;Lok0/a;)V", "Ldl0/a;", "getKey", "()Ldl0/a;", Action.KEY_ATTRIBUTE, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i<TConfig, TPlugin> {
    TPlugin a(wn0.l<? super TConfig, h0> block);

    void b(TPlugin plugin, ok0.a scope);

    dl0.a<TPlugin> getKey();
}
