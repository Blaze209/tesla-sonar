package xi;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"Lxi/a;", "", "<init>", "()V", "", "_level", "", "_displayThread", "Ljn0/h0;", "e", "(IZ)V", "", "tag", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "msg", "c", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "f", "b", "I", "level", "Z", "displayThread", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f123581a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static int level = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean displayThread = true;

    private a() {
    }

    public static final void a(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (level <= 3) {
            Log.d(d(tag), c(msg));
        }
    }

    public static final void b(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (level <= 6) {
            Log.e(d(tag), c(msg));
        }
    }

    private static final String c(String msg) {
        if (!displayThread) {
            return msg;
        }
        return "[" + Thread.currentThread().getName() + "] " + msg;
    }

    private static final String d(String tag) {
        return "RNV" + tag;
    }

    public static final void e(int _level, boolean _displayThread) {
        level = _level;
        displayThread = _displayThread;
    }

    public static final void f(String tag, String msg) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        if (level <= 5) {
            Log.w(d(tag), c(msg));
        }
    }
}
