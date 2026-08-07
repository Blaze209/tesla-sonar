package vi;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n¨\u0006\u001c"}, d2 = {"Lvi/g;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "language", "b", "f", "j", "title", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "h", "()Landroid/net/Uri;", "l", "(Landroid/net/Uri;)V", "uri", DateTokenConverter.CONVERTER_KEY, "g", "k", "type", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f119428f = "language";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f119429g = "title";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f119430h = "uri";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f119431i = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* JADX INFO: renamed from: vi.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lvi/g$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/g;", "e", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/g;", "", "SIDELOAD_TEXT_TRACK_LANGUAGE", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SIDELOAD_TEXT_TRACK_TITLE", "b", "SIDELOAD_TEXT_TRACK_URI", DateTokenConverter.CONVERTER_KEY, "SIDELOAD_TEXT_TRACK_TYPE", "c", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return g.f119428f;
        }

        public final String b() {
            return g.f119429g;
        }

        public final String c() {
            return g.f119431i;
        }

        public final String d() {
            return g.f119430h;
        }

        public final g e(ReadableMap src) {
            g gVar = new g();
            if (src == null) {
                return gVar;
            }
            gVar.i(xi.b.g(src, a()));
            gVar.j(xi.b.h(src, b(), ""));
            gVar.l(Uri.parse(xi.b.h(src, d(), "")));
            gVar.k(xi.b.h(src, c(), ""));
            return gVar;
        }

        private Companion() {
        }
    }

    public g() {
        Uri EMPTY = Uri.EMPTY;
        s.j(EMPTY, "EMPTY");
        this.uri = EMPTY;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final void i(String str) {
        this.language = str;
    }

    public final void j(String str) {
        this.title = str;
    }

    public final void k(String str) {
        this.type = str;
    }

    public final void l(Uri uri) {
        s.k(uri, "<set-?>");
        this.uri = uri;
    }
}
