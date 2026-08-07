package z00;

import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-¨\u0006."}, d2 = {"Lz00/a;", "", "Landroid/net/Uri;", "forUri", "<init>", "(Landroid/net/Uri;)V", "Lcom/facebook/react/bridge/ReadableMap;", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/bridge/ReadableMap;", "", "name", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lz00/a;", "", "size", "k", "(Ljava/lang/Long;)Lz00/a;", "mimeType", "h", AnalyticsAttribute.Error, "g", "", "openableMimeTypes", "j", "([Ljava/lang/String;)Lz00/a;", "bookmark", "a", "(Landroid/net/Uri;)Lz00/a;", "bookmarkError", "b", "", "virtual", "l", "(Z)Lz00/a;", "c", "f", "()Z", "e", "()Landroid/net/Uri;", "Landroid/net/Uri;", "uri", "Ljava/lang/String;", "Ljava/lang/Long;", "metadataError", "[Ljava/lang/String;", "Ljava/lang/Boolean;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String mimeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String metadataError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String[] openableMimeTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String bookmark;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String bookmarkError;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Boolean virtual;

    public a(Uri forUri) {
        s.k(forUri, "forUri");
        this.uri = forUri;
    }

    private final ReadableMap d() {
        String lowerCase;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", this.name);
        writableMapCreateMap.putString("uri", this.uri.toString());
        Long l11 = this.size;
        if (l11 != null) {
            writableMapCreateMap.putDouble("size", l11.longValue());
        } else {
            writableMapCreateMap.putNull("size");
        }
        String str = this.mimeType;
        String lowerCase2 = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        writableMapCreateMap.putString("type", lowerCase);
        String str2 = this.mimeType;
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
            s.j(lowerCase2, "toLowerCase(...)");
        }
        writableMapCreateMap.putString("nativeType", lowerCase2);
        String[] strArr = this.openableMimeTypes;
        if (strArr != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str3 : strArr) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                writableMapCreateMap2.putString("mimeType", str3);
                writableMapCreateMap2.putString("extension", extensionFromMimeType);
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("convertibleToMimeTypes", writableArrayCreateArray);
        } else {
            writableMapCreateMap.putNull("convertibleToMimeTypes");
        }
        writableMapCreateMap.putString(AnalyticsAttribute.Error, this.metadataError);
        Boolean bool = this.virtual;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isVirtual", bool.booleanValue());
        } else {
            writableMapCreateMap.putNull("isVirtual");
        }
        String str4 = this.bookmark;
        if (str4 != null) {
            byte[] bytes = str4.getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            writableMapCreateMap.putString("bookmarkStatus", "success");
            writableMapCreateMap.putString("bookmark", strEncodeToString);
        } else {
            String str5 = this.bookmarkError;
            if (str5 != null) {
                writableMapCreateMap.putString("bookmarkStatus", AnalyticsAttribute.Error);
                writableMapCreateMap.putString("bookmarkError", str5);
            }
        }
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public final a a(Uri bookmark) {
        s.k(bookmark, "bookmark");
        this.bookmark = bookmark.toString();
        return this;
    }

    public final a b(String bookmarkError) {
        this.bookmarkError = bookmarkError;
        return this;
    }

    public final ReadableMap c() {
        return d();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean f() {
        return this.mimeType != null;
    }

    public final a g(String error) {
        this.metadataError = error;
        return this;
    }

    public final a h(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public final a i(String name) {
        this.name = name;
        return this;
    }

    public final a j(String[] openableMimeTypes) {
        this.openableMimeTypes = openableMimeTypes;
        return this;
    }

    public final a k(Long size) {
        this.size = size;
        return this;
    }

    public final a l(boolean virtual) {
        this.virtual = Boolean.valueOf(virtual);
        return this;
    }
}
