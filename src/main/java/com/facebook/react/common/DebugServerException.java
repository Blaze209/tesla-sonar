package com.facebook.react.common;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;
import qk.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0010B)\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/common/DebugServerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "description", "fileName", "", "lineNumber", "column", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "(Ljava/lang/String;)V", "detailMessage", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getOriginalMessage", "()Ljava/lang/String;", "originalMessage", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugServerException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22327c = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String originalMessage;

    /* JADX INFO: renamed from: com.facebook.react.common.DebugServerException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/common/DebugServerException$a;", "", "<init>", "()V", "", "fullFileName", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", ImagesContract.URL, AnalyticsAttribute.Reason, "", "t", "Lcom/facebook/react/common/DebugServerException;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/common/DebugServerException;", "extra", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/common/DebugServerException;", "str", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/common/DebugServerException;", "GENERIC_ERROR_MESSAGE", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String fullFileName) {
            List listM;
            List<String> listM2 = new q("/").m(fullFileName, 0);
            if (listM2.isEmpty()) {
                listM = v.m();
            } else {
                ListIterator<String> listIterator = listM2.listIterator(listM2.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM = v.d1(listM2, listIterator.nextIndex() + 1);
                    }
                }
                listM = v.m();
            }
            return (String) n.U0((String[]) listM.toArray(new String[0]));
        }

        public final DebugServerException a(String url, String reason, String extra, Throwable t11) {
            s.k(url, "url");
            s.k(reason, "reason");
            s.k(extra, "extra");
            return new DebugServerException(reason + t.V(DebugServerException.f22327c, "<PORT>", String.valueOf(Uri.parse(url).getPort()), false, 4, null) + extra, t11);
        }

        public final DebugServerException b(String url, String reason, Throwable t11) {
            s.k(url, "url");
            s.k(reason, "reason");
            return a(url, reason, "", t11);
        }

        public final DebugServerException c(String url, String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    s.j(string2, "getString(...)");
                    s.h(string);
                    return new DebugServerException(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e11) {
                    a.J("ReactNative", "Could not parse DebugServerException from: " + str, e11);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DebugServerException(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, i12);
    }

    public static final DebugServerException b(String str, String str2, String str3, Throwable th2) {
        return INSTANCE.a(str, str2, str3, th2);
    }

    public static final DebugServerException c(String str, String str2, Throwable th2) {
        return INSTANCE.b(str, str2, th2);
    }

    public static final DebugServerException d(String str, String str2) {
        return INSTANCE.c(str, str2);
    }

    private DebugServerException(String str, String str2, int i11, int i12) {
        super(str + "\n  at " + str2 + ":" + i11 + ":" + i12);
        this.originalMessage = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugServerException(String description) {
        super(description);
        s.k(description, "description");
        this.originalMessage = description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugServerException(String detailMessage, Throwable th2) {
        super(detailMessage, th2);
        s.k(detailMessage, "detailMessage");
        this.originalMessage = detailMessage;
    }
}
