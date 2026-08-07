package sf0;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lsf0/c;", "Lsf0/b;", "", "loggingEnabled", "<init>", "(Z)V", "", "tag", "a", "(Ljava/lang/String;)Ljava/lang/String;", "message", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "Z", "b", "()Z", "setLoggingEnabled", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean loggingEnabled;

    public c(boolean z11) {
        this.loggingEnabled = z11;
    }

    private final String a(String tag) {
        return "AS/" + tag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Override // sf0.b
    public void d(String tag, String message) {
        s.k(tag, "tag");
        s.k(message, "message");
        if (getLoggingEnabled()) {
            Log.d(a(tag), message);
        }
    }
}
