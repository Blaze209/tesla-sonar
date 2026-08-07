package io.ktor.util.internal;

import ch.qos.logback.core.joran.action.ActionConst;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/internal/f;", "", "Lio/ktor/util/internal/d;", "Lio/ktor/util/internal/Node;", ActionConst.REF_ATTRIBUTE, "<init>", "(Lio/ktor/util/internal/d;)V", "", "toString", "()Ljava/lang/String;", "a", "Lio/ktor/util/internal/d;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final d ref;

    public f(d ref) {
        s.k(ref, "ref");
        this.ref = ref;
    }

    public String toString() {
        return "Removed[" + this.ref + ']';
    }
}
