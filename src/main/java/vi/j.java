package vi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lvi/j;", "", "<init>", "()V", "", "value", "a", "I", "h", "()I", OrcaFlavourKeys.FONT_SIZE, "b", "k", "paddingLeft", "c", "l", "paddingRight", DateTokenConverter.CONVERTER_KEY, "m", "paddingTop", "e", "j", "paddingBottom", "", "f", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "opacity", "", "g", "Z", "getSubtitlesFollowVideo", "()Z", "subtitlesFollowVideo", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int paddingLeft;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int paddingRight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int paddingTop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int paddingBottom;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int fontSize = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float opacity = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean subtitlesFollowVideo = true;

    /* JADX INFO: renamed from: vi.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lvi/j$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/j;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/j;", "", "PROP_FONT_SIZE_TRACK", "Ljava/lang/String;", "PROP_PADDING_BOTTOM", "PROP_PADDING_TOP", "PROP_PADDING_LEFT", "PROP_PADDING_RIGHT", "PROP_OPACITY", "PROP_SUBTITLES_FOLLOW_VIDEO", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(ReadableMap src) {
            j jVar = new j();
            jVar.fontSize = xi.b.e(src, OrcaFlavourKeys.FONT_SIZE, -1);
            jVar.paddingBottom = xi.b.e(src, "paddingBottom", 0);
            jVar.paddingTop = xi.b.e(src, "paddingTop", 0);
            jVar.paddingLeft = xi.b.e(src, "paddingLeft", 0);
            jVar.paddingRight = xi.b.e(src, "paddingRight", 0);
            jVar.opacity = xi.b.d(src, "opacity", 1.0f);
            jVar.subtitlesFollowVideo = xi.b.b(src, "subtitlesFollowVideo", true);
            return jVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPaddingRight() {
        return this.paddingRight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPaddingTop() {
        return this.paddingTop;
    }
}
