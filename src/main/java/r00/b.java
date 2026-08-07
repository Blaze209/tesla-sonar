package r00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import ezvcard.property.Gender;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0005\u0013\u0014\u000e\f\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0013\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010@\u001a\u0004\b\f\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lr00/b;", "", "<init>", "()V", "Lr00/b$b;", "a", "Lr00/b$b;", "()Lr00/b$b;", "k", "(Lr00/b$b;)V", "compressionMethod", "", "b", "I", "e", "()I", "o", "(I)V", "maxWidth", "c", DateTokenConverter.CONVERTER_KEY, "n", "maxHeight", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "q", "(Ljava/lang/Integer;)V", "progressDivider", "", Gender.FEMALE, "h", "()F", "r", "(F)V", "quality", "Lr00/b$c;", "f", "Lr00/b$c;", "()Lr00/b$c;", "m", "(Lr00/b$c;)V", "input", "Lr00/b$d;", "Lr00/b$d;", "()Lr00/b$d;", "p", "(Lr00/b$d;)V", "output", "", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "uuid", "Lr00/b$e;", IntegerTokenConverter.CONVERTER_KEY, "Lr00/b$e;", "()Lr00/b$e;", "s", "(Lr00/b$e;)V", "returnableOutputType", "", "Z", "()Z", "l", "(Z)V", "disablePngTransparency", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private EnumC2258b compressionMethod = EnumC2258b.auto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxWidth = 1280;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxHeight = 1280;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer progressDivider = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float quality = 0.8f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c input = c.uri;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d output = d.jpg;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String uuid = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private e returnableOutputType = e.uri;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean disablePngTransparency;

    /* JADX INFO: renamed from: r00.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr00/b$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lr00/b;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lr00/b;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final b a(ReadableMap map) {
            s.k(map, "map");
            b bVar = new b();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                switch (strNextKey.hashCode()) {
                    case -1524972519:
                        if (strNextKey.equals("disablePngTransparency")) {
                            bVar.l(map.getBoolean(strNextKey));
                        }
                        break;
                    case -1005512447:
                        if (strNextKey.equals("output")) {
                            String string = map.getString(strNextKey);
                            s.h(string);
                            bVar.p(d.valueOf(string));
                        }
                        break;
                    case -906066005:
                        if (strNextKey.equals("maxHeight")) {
                            bVar.n(map.getInt(strNextKey));
                        }
                        break;
                    case 3601339:
                        if (strNextKey.equals("uuid")) {
                            bVar.t(map.getString(strNextKey));
                        }
                        break;
                    case 100358090:
                        if (strNextKey.equals("input")) {
                            String string2 = map.getString(strNextKey);
                            s.h(string2);
                            bVar.m(c.valueOf(string2));
                        }
                        break;
                    case 291107303:
                        if (strNextKey.equals("compressionMethod")) {
                            String string3 = map.getString(strNextKey);
                            s.h(string3);
                            bVar.k(EnumC2258b.valueOf(string3));
                        }
                        break;
                    case 400381634:
                        if (strNextKey.equals("maxWidth")) {
                            bVar.o(map.getInt(strNextKey));
                        }
                        break;
                    case 583437356:
                        if (strNextKey.equals("progressDivider")) {
                            bVar.q(Integer.valueOf(map.getInt(strNextKey)));
                        }
                        break;
                    case 651215103:
                        if (strNextKey.equals("quality")) {
                            bVar.r((float) map.getDouble(strNextKey));
                        }
                        break;
                    case 1418077701:
                        if (strNextKey.equals("returnableOutputType")) {
                            String string4 = map.getString(strNextKey);
                            s.h(string4);
                            bVar.s(e.valueOf(string4));
                        }
                        break;
                }
            }
            return bVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: r00.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lr00/b$b;", "", "<init>", "(Ljava/lang/String;I)V", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "manual", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC2258b {
        auto,
        manual;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<EnumC2258b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lr00/b$c;", "", "<init>", "(Ljava/lang/String;I)V", "base64", "uri", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        base64,
        uri;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lr00/b$d;", "", "<init>", "(Ljava/lang/String;I)V", "png", "jpg", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        png,
        jpg;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lr00/b$e;", "", "<init>", "(Ljava/lang/String;I)V", "base64", "uri", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum e {
        base64,
        uri;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC2258b getCompressionMethod() {
        return this.compressionMethod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisablePngTransparency() {
        return this.disablePngTransparency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getOutput() {
        return this.output;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getProgressDivider() {
        return this.progressDivider;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e getReturnableOutputType() {
        return this.returnableOutputType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final void k(EnumC2258b enumC2258b) {
        s.k(enumC2258b, "<set-?>");
        this.compressionMethod = enumC2258b;
    }

    public final void l(boolean z11) {
        this.disablePngTransparency = z11;
    }

    public final void m(c cVar) {
        s.k(cVar, "<set-?>");
        this.input = cVar;
    }

    public final void n(int i11) {
        this.maxHeight = i11;
    }

    public final void o(int i11) {
        this.maxWidth = i11;
    }

    public final void p(d dVar) {
        s.k(dVar, "<set-?>");
        this.output = dVar;
    }

    public final void q(Integer num) {
        this.progressDivider = num;
    }

    public final void r(float f11) {
        this.quality = f11;
    }

    public final void s(e eVar) {
        s.k(eVar, "<set-?>");
        this.returnableOutputType = eVar;
    }

    public final void t(String str) {
        this.uuid = str;
    }
}
