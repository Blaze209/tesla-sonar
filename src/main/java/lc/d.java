package lc;

import ch.qos.logback.core.joran.action.Action;
import ec.g0;
import ec.h0;
import okio.i0;
import p013kotlin.Metadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llc/d;", "Llc/c;", "Lokio/i0;", "Lec/g0;", "<init>", "()V", "data", "Lrc/n;", "options", "b", "(Lokio/i0;Lrc/n;)Lec/g0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c<i0, g0> {
    @Override // lc.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 a(i0 data, Options options) {
        return h0.b(Action.FILE_ATTRIBUTE, null, data.toString(), null, null, null, 58, null);
    }
}
