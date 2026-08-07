package z30;

import android.util.Log;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lz30/f;", "", "<init>", "()V", "", "className", "", "b", "(Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "c", "a", "()Ljava/lang/String;", "pluginType", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f126810a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String TAG = f.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String pluginType;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lz30/f$a;", "", "", "className", "pluginName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "getPluginName", "ReactNative", "Flutter", "Cordova", "Unity", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        ReactNative("com.facebook.react.bridge.NativeModule", "react-native"),
        Flutter("io.flutter.embedding.engine.FlutterEngine", "flutter"),
        Cordova("org.apache.cordova.CordovaActivity", "cordova"),
        Unity("com.unity3d.player.UnityPlayerActivity", "unity");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String className;
        private final String pluginName;

        a(String str, String str2) {
            this.className = str;
            this.pluginName = str2;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPluginName() {
            return this.pluginName;
        }
    }

    static {
        a next;
        Iterator<a> it = a.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!f126810a.b(next.getClassName()));
        a aVar = next;
        pluginType = aVar != null ? aVar.getPluginName() : null;
    }

    private f() {
    }

    private final boolean b(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e11) {
            Log.d(TAG, className + " not found: " + e11);
            return false;
        }
    }

    public final String a() {
        return pluginType;
    }
}
