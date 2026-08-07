package h20;

import android.util.Log;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lh20/d;", "Ls20/d;", "<init>", "()V", "", "tag", "msg", "Ljn0/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements s20.d {
    @Override // s20.d
    public void a(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        Log.v(tag, msg);
    }

    @Override // s20.d
    public void b(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        Log.d(tag, msg);
    }

    @Override // s20.d
    public void c(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        Log.e(tag, msg);
    }
}
