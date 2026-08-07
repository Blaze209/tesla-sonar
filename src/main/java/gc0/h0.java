package gc0;

import com.squareup.wire.ProtoAdapter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.h0, still in use, count: 1, list:
  (r0v0 gc0.h0) from 0x0219: CONSTRUCTOR 
  (wrap co0.d:0x0211: INVOKE (wrap java.lang.Class:0x020f: CONST_CLASS  A[WRAPPED] (LINE:528) gc0.h0.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:530))
  (wrap com.squareup.wire.o:0x0215: SGET  A[WRAPPED] (LINE:534) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
  (r0v0 gc0.h0)
 A[MD:(co0.d<gc0.h0>, com.squareup.wire.o, gc0.h0):void (m), WRAPPED] (LINE:538) call: gc0.h0.a.<init>(co0.d, com.squareup.wire.o, gc0.h0):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b4\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, d2 = {"Lgc0/h0;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "MediaSourceType_None", "MediaSourceType_AM", "MediaSourceType_FM", "MediaSourceType_XM", "MediaSourceType_Slacker", "MediaSourceType_LocalFiles", "MediaSourceType_iPod", "MediaSourceType_Bluetooth", "MediaSourceType_AuxIn", "MediaSourceType_DAB", "MediaSourceType_Rdio", "MediaSourceType_Spotify", "MediaSourceType_USRadio", "MediaSourceType_EURadio", "MediaSourceType_MediaFile", "MediaSourceType_TuneIn", "MediaSourceType_Stingray", "MediaSourceType_SiriusXM", "MediaSourceType_Tidal", "MediaSourceType_QQMusic", "MediaSourceType_QQMusic2", "MediaSourceType_Ximalaya", "MediaSourceType_OnlineRadio", "MediaSourceType_OnlineRadio2", "MediaSourceType_NetEaseMusic", "MediaSourceType_AppleMusic", "MediaSourceType_ApplePodcasts", "MediaSourceType_Audible", "MediaSourceType_AmazonMusic", "MediaSourceType_YouTubeMusic", "MediaSourceType_SiriusXmWeb", "MediaSourceType_Yunting", "MediaSourceType_TuneInWeb", "MediaSourceType_Kugou", "MediaSourceType_Vohico", "MediaSourceType_Browser", "MediaSourceType_Theater", "MediaSourceType_Game", "MediaSourceType_Tutorial", "MediaSourceType_Toybox", "MediaSourceType_RecentsFavorites", "MediaSourceType_HomeApps", "MediaSourceType_Search", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 implements com.squareup.wire.p {
    MediaSourceType_None(0),
    MediaSourceType_AM(1),
    MediaSourceType_FM(2),
    MediaSourceType_XM(3),
    MediaSourceType_Slacker(5),
    MediaSourceType_LocalFiles(6),
    MediaSourceType_iPod(7),
    MediaSourceType_Bluetooth(8),
    MediaSourceType_AuxIn(9),
    MediaSourceType_DAB(10),
    MediaSourceType_Rdio(11),
    MediaSourceType_Spotify(12),
    MediaSourceType_USRadio(13),
    MediaSourceType_EURadio(14),
    MediaSourceType_MediaFile(16),
    MediaSourceType_TuneIn(17),
    MediaSourceType_Stingray(18),
    MediaSourceType_SiriusXM(19),
    MediaSourceType_Tidal(20),
    MediaSourceType_QQMusic(21),
    MediaSourceType_QQMusic2(22),
    MediaSourceType_Ximalaya(23),
    MediaSourceType_OnlineRadio(24),
    MediaSourceType_OnlineRadio2(25),
    MediaSourceType_NetEaseMusic(26),
    MediaSourceType_AppleMusic(27),
    MediaSourceType_ApplePodcasts(36),
    MediaSourceType_Audible(37),
    MediaSourceType_AmazonMusic(38),
    MediaSourceType_YouTubeMusic(39),
    MediaSourceType_SiriusXmWeb(40),
    MediaSourceType_Yunting(41),
    MediaSourceType_TuneInWeb(42),
    MediaSourceType_Kugou(43),
    MediaSourceType_Vohico(44),
    MediaSourceType_Browser(28),
    MediaSourceType_Theater(29),
    MediaSourceType_Game(30),
    MediaSourceType_Tutorial(31),
    MediaSourceType_Toybox(32),
    MediaSourceType_RecentsFavorites(33),
    MediaSourceType_HomeApps(34),
    MediaSourceType_Search(35);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<h0> ADAPTER = new com.squareup.wire.a<h0>(p013kotlin.jvm.internal.o0.b(h0.class), com.squareup.wire.o.PROTO_3, new h0(0)) { // from class: gc0.h0.a
        @Override // com.squareup.wire.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h0 d(int value) {
            return h0.INSTANCE.a(value);
        }
    };

    /* JADX INFO: renamed from: gc0.h0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/h0$b;", "", "<init>", "()V", "", "value", "Lgc0/h0;", "a", "(I)Lgc0/h0;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h0 a(int value) {
            switch (value) {
                case 0:
                    return h0.MediaSourceType_None;
                case 1:
                    return h0.MediaSourceType_AM;
                case 2:
                    return h0.MediaSourceType_FM;
                case 3:
                    return h0.MediaSourceType_XM;
                case 4:
                case 15:
                default:
                    return null;
                case 5:
                    return h0.MediaSourceType_Slacker;
                case 6:
                    return h0.MediaSourceType_LocalFiles;
                case 7:
                    return h0.MediaSourceType_iPod;
                case 8:
                    return h0.MediaSourceType_Bluetooth;
                case 9:
                    return h0.MediaSourceType_AuxIn;
                case 10:
                    return h0.MediaSourceType_DAB;
                case 11:
                    return h0.MediaSourceType_Rdio;
                case 12:
                    return h0.MediaSourceType_Spotify;
                case 13:
                    return h0.MediaSourceType_USRadio;
                case 14:
                    return h0.MediaSourceType_EURadio;
                case 16:
                    return h0.MediaSourceType_MediaFile;
                case 17:
                    return h0.MediaSourceType_TuneIn;
                case 18:
                    return h0.MediaSourceType_Stingray;
                case 19:
                    return h0.MediaSourceType_SiriusXM;
                case 20:
                    return h0.MediaSourceType_Tidal;
                case 21:
                    return h0.MediaSourceType_QQMusic;
                case 22:
                    return h0.MediaSourceType_QQMusic2;
                case 23:
                    return h0.MediaSourceType_Ximalaya;
                case 24:
                    return h0.MediaSourceType_OnlineRadio;
                case 25:
                    return h0.MediaSourceType_OnlineRadio2;
                case 26:
                    return h0.MediaSourceType_NetEaseMusic;
                case 27:
                    return h0.MediaSourceType_AppleMusic;
                case 28:
                    return h0.MediaSourceType_Browser;
                case 29:
                    return h0.MediaSourceType_Theater;
                case 30:
                    return h0.MediaSourceType_Game;
                case 31:
                    return h0.MediaSourceType_Tutorial;
                case 32:
                    return h0.MediaSourceType_Toybox;
                case 33:
                    return h0.MediaSourceType_RecentsFavorites;
                case 34:
                    return h0.MediaSourceType_HomeApps;
                case 35:
                    return h0.MediaSourceType_Search;
                case 36:
                    return h0.MediaSourceType_ApplePodcasts;
                case 37:
                    return h0.MediaSourceType_Audible;
                case 38:
                    return h0.MediaSourceType_AmazonMusic;
                case 39:
                    return h0.MediaSourceType_YouTubeMusic;
                case 40:
                    return h0.MediaSourceType_SiriusXmWeb;
                case 41:
                    return h0.MediaSourceType_Yunting;
                case 42:
                    return h0.MediaSourceType_TuneInWeb;
                case 43:
                    return h0.MediaSourceType_Kugou;
                case 44:
                    return h0.MediaSourceType_Vohico;
            }
        }

        private Companion() {
        }
    }

    static {
    }

    private h0(int i11) {
        super(str, i);
        this.value = i11;
    }

    public static final h0 fromValue(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<h0> getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}
