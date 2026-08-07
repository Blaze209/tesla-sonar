package rf0;

import android.content.Context;
import android.media.AudioManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import jn0.h0;
import jn0.m;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.l0;
import p013kotlin.collections.m0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0012\b&\u0018\u0000 \u00142\u00020\u0001:\u0002\u001f>BU\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f2\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\b2\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J3\u0010$\u001a\u00020\u001b2$\u0010#\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b0!j\u0002`\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001dJ\r\u0010'\u001a\u00020\u001b¢\u0006\u0004\b'\u0010\u001dJ\r\u0010(\u001a\u00020\u001b¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\bH\u0004¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000eH$¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u00020\u001bH$¢\u0006\u0004\b0\u0010\u001dRD\u00106\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b\u0018\u00010!j\u0004\u0018\u0001`\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010%R\"\u0010=\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010C\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010\u001d\u001a\u0004\b@\u0010AR$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010DR$\u0010H\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bF\u0010\u0017\"\u0004\bG\u0010 R(\u0010K\u001a\u0004\u0018\u00010\u000e2\b\u0010I\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010E\u001a\u0004\bJ\u0010\u0017R0\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000e0L2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000e0L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010W\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010+\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010+\"\u0004\bZ\u0010VR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bM\u0010bR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\bX\u0010cR$\u0010j\u001a\u00020e2\u0006\u0010f\u001a\u00020e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010g\"\u0004\bh\u0010iR$\u0010m\u001a\u00020e2\u0006\u0010f\u001a\u00020e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR$\u0010p\u001a\u00020e2\u0006\u0010f\u001a\u00020e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010g\"\u0004\bo\u0010iR$\u0010s\u001a\u00020e2\u0006\u0010f\u001a\u00020e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010g\"\u0004\br\u0010iR$\u0010v\u001a\u00020e2\u0006\u0010f\u001a\u00020e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010g\"\u0004\bu\u0010i¨\u0006w"}, d2 = {"Lrf0/a;", "Luf0/b$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "Luf0/b;", AnalyticsContext.Scanner, "", "loggingEnabled", "Lsf0/b;", "logger", "", "Ljava/lang/Class;", "Lrf0/c;", "preferredDeviceList", "Lrf0/d;", "audioDeviceManager", "<init>", "(Landroid/content/Context;Landroid/media/AudioManager$OnAudioFocusChangeListener;Luf0/b;ZLsf0/b;Ljava/util/List;Lrf0/d;)V", "m", "(Ljava/util/List;)Ljava/util/List;", "k", "()Lrf0/c;", "list", "p", "(Ljava/util/List;)Z", "Ljn0/h0;", "e", "()V", "audioDevice", "b", "(Lrf0/c;)V", "Lkotlin/Function2;", "Lcom/twilio/audioswitch/AudioDeviceChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "E", "(Lwn0/p;)V", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "f", "u", "D", "()Z", "wasListChanged", "s", "(ZLrf0/c;)V", "q", "r", "a", "Lwn0/p;", "getAudioDeviceChangeListener$audioswitch_release", "()Lwn0/p;", "setAudioDeviceChangeListener$audioswitch_release", "audioDeviceChangeListener", "Lrf0/a$c;", "Lrf0/a$c;", "getState$audioswitch_release", "()Lrf0/a$c;", "setState$audioswitch_release", "(Lrf0/a$c;)V", "state", "c", "Luf0/b;", "getDeviceScanner$audioswitch_release", "()Luf0/b;", "getDeviceScanner$audioswitch_release$annotations", "deviceScanner", "Ljava/util/List;", "Lrf0/c;", "o", "C", "userSelectedAudioDevice", "<set-?>", "n", "selectedAudioDevice", "Ljava/util/SortedSet;", "g", "Ljava/util/SortedSet;", "j", "()Ljava/util/SortedSet;", "availableUniqueAudioDevices", "h", "Z", "getManageAudioFocus", "B", "(Z)V", "manageAudioFocus", IntegerTokenConverter.CONVERTER_KEY, "getForceHandleAudioRouting", "A", "forceHandleAudioRouting", "Lsf0/b;", "l", "()Lsf0/b;", "setLogger$audioswitch_release", "(Lsf0/b;)V", "Lrf0/d;", "()Lrf0/d;", "()Ljava/util/List;", "availableAudioDevices", "", "value", "()I", "x", "(I)V", "audioMode", "getFocusMode", "z", "focusMode", "getAudioStreamType", "y", "audioStreamType", "getAudioAttributeUsageType", "w", "audioAttributeUsageType", "getAudioAttributeContentType", "v", "audioAttributeContentType", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public abstract class a implements uf0.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p<? super List<? extends rf0.c>, ? super rf0.c, h0> audioDeviceChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uf0.b deviceScanner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends Class<? extends rf0.c>> preferredDeviceList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private rf0.c userSelectedAudioDevice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private rf0.c selectedAudioDevice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private SortedSet<rf0.c> availableUniqueAudioDevices;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean manageAudioFocus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean forceHandleAudioRouting;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private sf0.b logger;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final rf0.d audioDeviceManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Lazy f108094l = m.b(C2295a.f108107c);

    /* JADX INFO: renamed from: rf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "Lrf0/c;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    static final class C2295a extends u implements wn0.a<List<? extends Class<? extends rf0.c>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2295a f108107c = new C2295a();

        C2295a() {
            super(0);
        }

        @Override // wn0.a
        public final List<? extends Class<? extends rf0.c>> invoke() {
            return v.p(rf0.c.BluetoothHeadset.class, rf0.c.WiredHeadset.class, rf0.c.Earpiece.class, rf0.c.Speakerphone.class);
        }
    }

    /* JADX INFO: renamed from: rf0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrf0/a$b;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lrf0/c;", "defaultPreferredDeviceList$delegate", "Lkotlin/Lazy;", "a", "()Ljava/util/List;", "defaultPreferredDeviceList", "", "VERSION", "Ljava/lang/String;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public final List<Class<? extends rf0.c>> a() {
            return (List) a.f108094l.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lrf0/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "ACTIVATED", "STOPPED", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public enum c {
        STARTED,
        ACTIVATED,
        STOPPED
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"rf0/a$d", "Lkotlin/collections/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
    public static final class d implements l0<Class<? extends rf0.c>, Class<? extends rf0.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f108108a;

        public d(Iterable iterable) {
            this.f108108a = iterable;
        }

        @Override // p013kotlin.collections.l0
        public Class<? extends rf0.c> a(Class<? extends rf0.c> element) {
            return element;
        }

        @Override // p013kotlin.collections.l0
        public Iterator<Class<? extends rf0.c>> b() {
            return this.f108108a.iterator();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrf0/c;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lrf0/c;)Z"}, k = 3, mv = {1, 4, 1})
    static final class e extends u implements l<rf0.c, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f108109c = new e();

        e() {
            super(1);
        }

        public final boolean a(rf0.c cVar) {
            return cVar instanceof rf0.c.Earpiece;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(rf0.c cVar) {
            return Boolean.valueOf(a(cVar));
        }
    }

    public a(Context context, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, uf0.b scanner, boolean z11, sf0.b logger, List<? extends Class<? extends rf0.c>> preferredDeviceList, rf0.d audioDeviceManager) {
        s.k(context, "context");
        s.k(audioFocusChangeListener, "audioFocusChangeListener");
        s.k(scanner, "scanner");
        s.k(logger, "logger");
        s.k(preferredDeviceList, "preferredDeviceList");
        s.k(audioDeviceManager, "audioDeviceManager");
        this.logger = logger;
        this.audioDeviceManager = audioDeviceManager;
        this.state = c.STOPPED;
        this.deviceScanner = scanner;
        this.manageAudioFocus = true;
        this.preferredDeviceList = m(preferredDeviceList);
        this.availableUniqueAudioDevices = new ConcurrentSkipListSet(new tf0.a(this.preferredDeviceList));
        this.logger.d("AudioSwitch", "AudioSwitch(1.2.0)");
        sf0.b bVar = this.logger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preferred device list = ");
        List<? extends Class<? extends rf0.c>> list = this.preferredDeviceList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        sb2.append(arrayList);
        bVar.d("AudioSwitch", sb2.toString());
    }

    private final void e() {
        this.deviceScanner.stop();
        this.audioDeviceChangeListener = null;
        this.state = c.STOPPED;
    }

    private final rf0.c k() {
        Object next;
        rf0.c cVar = this.userSelectedAudioDevice;
        if (cVar != null && this.deviceScanner.b(cVar)) {
            return cVar;
        }
        Iterator<T> it = this.availableUniqueAudioDevices.iterator();
        while (it.hasNext()) {
            next = it.next();
            rf0.c it2 = (rf0.c) next;
            uf0.b bVar = this.deviceScanner;
            s.j(it2, "it");
            if (bVar.b(it2)) {
                return (rf0.c) next;
            }
        }
        next = null;
        return (rf0.c) next;
    }

    private final List<Class<? extends rf0.c>> m(List<? extends Class<? extends rf0.c>> preferredDeviceList) {
        if (!p(preferredDeviceList)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!preferredDeviceList.isEmpty()) {
            Companion companion = INSTANCE;
            if (!s.f(preferredDeviceList, companion.a())) {
                List<Class<? extends rf0.c>> listP1 = v.p1(companion.a());
                listP1.removeAll(preferredDeviceList);
                int i11 = 0;
                for (Object obj : preferredDeviceList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        v.x();
                    }
                    listP1.add(i11, (Class) obj);
                    i11 = i12;
                }
                return listP1;
            }
        }
        return INSTANCE.a();
    }

    private final boolean p(List<? extends Class<? extends rf0.c>> list) {
        Map mapA = m0.a(new d(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }

    public static /* synthetic */ void t(a aVar, boolean z11, rf0.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectAudioDevice");
        }
        if ((i11 & 2) != 0) {
            cVar = aVar.k();
        }
        aVar.s(z11, cVar);
    }

    public final void A(boolean z11) {
        this.forceHandleAudioRouting = z11;
    }

    public final void B(boolean z11) {
        this.manageAudioFocus = z11;
    }

    protected final void C(rf0.c cVar) {
        this.userSelectedAudioDevice = cVar;
    }

    protected final boolean D() {
        int iH = h();
        return this.forceHandleAudioRouting || iH == 3 || iH == 2;
    }

    public final void E(p<? super List<? extends rf0.c>, ? super rf0.c, h0> listener) {
        s.k(listener, "listener");
        this.audioDeviceChangeListener = listener;
        if (b.f108110a[this.state.ordinal()] != 1) {
            this.logger.d("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
        } else {
            this.deviceScanner.a(this);
            this.state = c.STARTED;
        }
    }

    public final void F() {
        int i11 = b.f108111b[this.state.ordinal()];
        if (i11 == 1) {
            f();
            e();
        } else if (i11 == 2) {
            e();
        } else {
            if (i11 != 3) {
                return;
            }
            this.logger.d("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
        }
    }

    @Override // uf0.b.a
    public void b(rf0.c audioDevice) {
        s.k(audioDevice, "audioDevice");
        this.logger.d("AudioSwitch", "onDeviceConnected(" + audioDevice + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if ((audioDevice instanceof rf0.c.Earpiece) && i().contains(new rf0.c.WiredHeadset(null, 1, null))) {
            return;
        }
        boolean zAdd = this.availableUniqueAudioDevices.add(audioDevice);
        if (audioDevice instanceof rf0.c.WiredHeadset) {
            v.J(this.availableUniqueAudioDevices, e.f108109c);
        }
        t(this, zAdd, null, 2, null);
    }

    public final void d() {
        rf0.c cVar;
        int i11 = b.f108112c[this.state.ordinal()];
        if (i11 == 1) {
            this.audioDeviceManager.a();
            this.audioDeviceManager.f(false);
            if (this.manageAudioFocus) {
                this.audioDeviceManager.j();
            }
            rf0.c cVar2 = this.selectedAudioDevice;
            if (cVar2 != null) {
                cVar = D() ? cVar2 : null;
                if (cVar != null) {
                    q(cVar);
                }
            }
            this.state = c.ACTIVATED;
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                throw new IllegalStateException();
            }
            return;
        }
        rf0.c cVar3 = this.selectedAudioDevice;
        if (cVar3 != null) {
            cVar = D() ? cVar3 : null;
            if (cVar != null) {
                q(cVar);
            }
        }
    }

    public final void f() {
        if (b.f108113d[this.state.ordinal()] != 1) {
            return;
        }
        r();
        this.audioDeviceManager.g();
        this.state = c.STARTED;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final rf0.d getAudioDeviceManager() {
        return this.audioDeviceManager;
    }

    public final int h() {
        return this.audioDeviceManager.getAudioMode();
    }

    public final List<rf0.c> i() {
        return v.m1(this.availableUniqueAudioDevices);
    }

    public final SortedSet<rf0.c> j() {
        return this.availableUniqueAudioDevices;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final sf0.b getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final rf0.c getSelectedAudioDevice() {
        return this.selectedAudioDevice;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    protected final rf0.c getUserSelectedAudioDevice() {
        return this.userSelectedAudioDevice;
    }

    protected abstract void q(rf0.c audioDevice);

    protected abstract void r();

    protected final void s(boolean wasListChanged, rf0.c audioDevice) {
        p<? super List<? extends rf0.c>, ? super rf0.c, h0> pVar;
        if (s.f(this.selectedAudioDevice, audioDevice)) {
            if (!wasListChanged || (pVar = this.audioDeviceChangeListener) == null) {
                return;
            }
            pVar.invoke(v.m1(this.availableUniqueAudioDevices), this.selectedAudioDevice);
            return;
        }
        if (D()) {
            this.logger.d("AudioSwitch", "Current user selected AudioDevice = " + this.userSelectedAudioDevice);
            this.selectedAudioDevice = audioDevice;
            if (this.state == c.ACTIVATED) {
                d();
            }
        }
        p<? super List<? extends rf0.c>, ? super rf0.c, h0> pVar2 = this.audioDeviceChangeListener;
        if (pVar2 != null) {
            pVar2.invoke(v.m1(this.availableUniqueAudioDevices), this.selectedAudioDevice);
        }
    }

    public final void u(rf0.c audioDevice) {
        this.logger.d("AudioSwitch", "Selected AudioDevice = " + audioDevice);
        this.userSelectedAudioDevice = audioDevice;
        s(false, audioDevice);
    }

    public final void v(int i11) {
        this.audioDeviceManager.h(i11);
    }

    public final void w(int i11) {
        this.audioDeviceManager.i(i11);
    }

    public final void x(int i11) {
        this.audioDeviceManager.k(i11);
    }

    public final void y(int i11) {
        this.audioDeviceManager.l(i11);
    }

    public final void z(int i11) {
        this.audioDeviceManager.m(i11);
    }

    public /* synthetic */ a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, uf0.b bVar, boolean z11, sf0.b bVar2, List list, rf0.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        rf0.d dVar2;
        boolean z12 = (i11 & 8) != 0 ? true : z11;
        sf0.b cVar = (i11 & 16) != 0 ? new sf0.c(z12) : bVar2;
        if ((i11 & 64) != 0) {
            sf0.b bVar3 = cVar;
            Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (systemService != null) {
                dVar2 = new rf0.d(context, bVar3, (AudioManager) systemService, null, null, onAudioFocusChangeListener, 24, null);
                cVar = bVar3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
        } else {
            dVar2 = dVar;
        }
        this(context, onAudioFocusChangeListener, bVar, z12, cVar, list, dVar2);
    }
}
