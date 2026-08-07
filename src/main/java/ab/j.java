package ab;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lab/j;", "Lza/d$c;", "<init>", "()V", "Lza/d$b;", "configuration", "Lza/d;", "a", "(Lza/d$b;)Lza/d;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements za.d.c {
    @Override // za.d.c
    public za.d a(za.d.b configuration) {
        s.k(configuration, "configuration");
        return new h(configuration.ch.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
