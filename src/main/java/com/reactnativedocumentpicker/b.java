package com.reactnativedocumentpicker;

import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativedocumentpicker/b;", "", "a", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.reactnativedocumentpicker.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/reactnativedocumentpicker/b$a;", "", "<init>", "()V", "", "isKnown", "", "preferredFilenameExtension", "mimeType", "Lcom/facebook/react/bridge/WritableMap;", "a", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "kind", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WritableMap a(boolean isKnown, String preferredFilenameExtension, String mimeType) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putNull("UTType");
            writableMapCreateMap.putBoolean("isKnown", isKnown);
            writableMapCreateMap.putString("preferredFilenameExtension", preferredFilenameExtension);
            writableMapCreateMap.putString("mimeType", mimeType);
            s.j(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final WritableMap b(String kind, String value) {
            boolean z11;
            s.k(kind, "kind");
            s.k(value, "value");
            if (s.f(kind, "mimeType")) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(value);
                z11 = extensionFromMimeType != null;
                if (extensionFromMimeType == null) {
                    value = null;
                }
                return a(z11, extensionFromMimeType, value);
            }
            if (!s.f(kind, "extension")) {
                return a(false, null, null);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(value);
            z11 = mimeTypeFromExtension != null;
            if (mimeTypeFromExtension == null) {
                value = null;
            }
            return a(z11, value, mimeTypeFromExtension);
        }

        private Companion() {
        }
    }
}
