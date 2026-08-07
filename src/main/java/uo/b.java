package uo;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Luo/b;", "", "<init>", "()V", "", "message", "Lcom/facebook/react/bridge/ReadableArray;", "stack", "a", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "frame", "b", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "FILE_ID_PATTERN", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f116491a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Pattern FILE_ID_PATTERN = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private b() {
    }

    public static final String a(String message, ReadableArray stack) {
        s.k(message, "message");
        s.k(stack, "stack");
        StringBuilder sb2 = new StringBuilder(message);
        sb2.append(", stack:\n");
        int size = stack.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = stack.getMap(i11);
            if (map != null) {
                sb2.append(map.getString("methodName"));
                sb2.append("@");
                sb2.append(f116491a.b(map));
                if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                    sb2.append(map.getInt("lineNumber"));
                } else {
                    sb2.append(-1);
                }
                if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                    sb2.append(":");
                    sb2.append(map.getInt("column"));
                }
                sb2.append("\n");
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    private final String b(ReadableMap frame) {
        String string;
        if (!frame.hasKey(Action.FILE_ATTRIBUTE) || frame.isNull(Action.FILE_ATTRIBUTE) || frame.getType(Action.FILE_ATTRIBUTE) != ReadableType.String || (string = frame.getString(Action.FILE_ATTRIBUTE)) == null) {
            return "";
        }
        Matcher matcher = FILE_ID_PATTERN.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }
}
