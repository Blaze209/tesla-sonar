package y00;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import gr0.n;
import hr0.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import jn0.x;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\u000f\u0010 J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0017J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0002¢\u0006\u0004\b0\u0010,J\r\u00101\u001a\u00020\u0002¢\u0006\u0004\b1\u0010,J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0004\b5\u0010 J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00108R\u0016\u0010>\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010=R\u0016\u0010@\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010?R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010BR\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0014\u0010G\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010DR\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010DR\u0016\u0010K\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010MR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010PR\u0016\u0010R\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010M¨\u0006T"}, d2 = {"Ly00/i;", "", "", "id", "Landroid/media/MediaFormat;", "format", "", MediaStreamTrack.AUDIO_TRACK_KIND, "<init>", "(ILandroid/media/MediaFormat;Z)V", "Lgr0/e;", "o", "(Lgr0/e;)Lgr0/e;", "Lkr0/c;", "w", "h", "q", "(Lkr0/c;II)Lkr0/c;", "Lkr0/b;", "p", "(Lkr0/b;Landroid/media/MediaFormat;)Lkr0/b;", "", "k", "()J", "offset", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Ljn0/h0;", "a", "(JLandroid/media/MediaCodec$BufferInfo;)V", "Ljava/util/ArrayList;", "Ly00/g;", "()Ljava/util/ArrayList;", "c", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Lhr0/o;", "f", "()Lhr0/o;", "", IntegerTokenConverter.CONVERTER_KEY, "()[J", "j", "()I", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "m", "e", "", "l", "()F", "g", "n", "()Z", "J", "trackId", "Ljava/util/ArrayList;", "samples", "duration", "Ljava/lang/String;", "handler", "Lhr0/o;", "sampleDescriptionBox", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "syncSamples", "I", "timeScale", "Ljava/util/Date;", "creationTime", Snapshot.HEIGHT, Snapshot.WIDTH, Gender.FEMALE, "volume", "sampleDurations", "Z", "isAudio", "", "Ljava/util/Map;", "samplingFrequencyIndexMap", "lastPresentationTimeUs", "first", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long trackId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Sample> samples;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String handler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private o sampleDescriptionBox;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private LinkedList<Integer> syncSamples;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int timeScale;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Date creationTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float volume;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Long> sampleDurations;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isAudio;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, Integer> samplingFrequencyIndexMap;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long lastPresentationTimeUs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean first;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public i(int i11, MediaFormat format, boolean z11) {
        int i12;
        s.k(format, "format");
        this.samples = new ArrayList<>();
        this.creationTime = new Date();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.sampleDurations = arrayList;
        this.isAudio = z11;
        this.samplingFrequencyIndexMap = new HashMap();
        this.first = true;
        this.samplingFrequencyIndexMap = v0.m(x.a(96000, 0), x.a(88200, 1), x.a(64000, 2), x.a(48000, 3), x.a(44100, 4), x.a(32000, 5), x.a(24000, 6), x.a(22050, 7), x.a(16000, 8), x.a(12000, 9), x.a(11025, 10), x.a(Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED), 11));
        this.trackId = i11;
        if (z11) {
            arrayList.add(1024L);
            this.duration = 1024L;
            this.volume = 1.0f;
            this.timeScale = format.getInteger("sample-rate");
            this.handler = "soun";
            this.sampleDescriptionBox = new o();
            kr0.b bVarP = p(new kr0.b("mp4a"), format);
            ir0.b bVar = new ir0.b();
            gr0.h hVar = new gr0.h();
            hVar.i(0);
            n nVar = new n();
            nVar.h(2);
            hVar.j(nVar);
            gr0.e eVarO = o(new gr0.e());
            gr0.a aVar = new gr0.a();
            aVar.r(2);
            Integer num = this.samplingFrequencyIndexMap.get(Integer.valueOf((int) bVarP.I()));
            s.h(num);
            aVar.s(num.intValue());
            aVar.q(bVarP.H());
            eVarO.h(aVar);
            hVar.h(eVarO);
            bVar.u(hVar);
            bVarP.n(bVar);
            this.sampleDescriptionBox.n(bVarP);
            return;
        }
        arrayList.add(3015L);
        this.duration = 3015L;
        this.width = format.getInteger(Snapshot.WIDTH);
        this.height = format.getInteger(Snapshot.HEIGHT);
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        this.sampleDescriptionBox = new o();
        String string = format.getString("mime");
        if (!s.f(string, "video/avc")) {
            if (s.f(string, "video/mp4v")) {
                this.sampleDescriptionBox.n(q(new kr0.c("mp4v"), this.width, this.height));
                return;
            }
            return;
        }
        kr0.c cVarQ = q(new kr0.c("avc1"), this.width, this.height);
        jr0.a aVar2 = new jr0.a();
        ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
        aVar2.u(byteBuffer != null ? v.e(q.l(q.f109347a, byteBuffer, 4, 0, 4, null)) : null);
        ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
        aVar2.s(byteBuffer2 != null ? v.e(q.l(q.f109347a, byteBuffer2, 4, 0, 4, null)) : null);
        if (format.containsKey("level")) {
            int integer = format.getInteger("level");
            i12 = 1;
            if (integer != 1) {
                if (integer != 2) {
                    switch (integer) {
                        case 4:
                            aVar2.l(11);
                            break;
                        case 8:
                            aVar2.l(12);
                            break;
                        case 16:
                            aVar2.l(13);
                            break;
                        case 32:
                            aVar2.l(2);
                            break;
                        case 64:
                            aVar2.l(21);
                            break;
                        case 128:
                            aVar2.l(22);
                            break;
                        case 256:
                            aVar2.l(3);
                            break;
                        case 512:
                            aVar2.l(31);
                            break;
                        case 1024:
                            aVar2.l(32);
                            break;
                        case 2048:
                            aVar2.l(4);
                            break;
                        case 4096:
                            aVar2.l(41);
                            break;
                        case PKIFailureInfo.certRevoked /* 8192 */:
                            aVar2.l(42);
                            break;
                        case 16384:
                            aVar2.l(5);
                            break;
                        case 32768:
                            aVar2.l(51);
                            break;
                        case 65536:
                            aVar2.l(52);
                            break;
                        default:
                            aVar2.l(13);
                            break;
                    }
                } else {
                    aVar2.l(27);
                }
                i12 = 1;
            } else {
                aVar2.l(1);
            }
        } else {
            i12 = 1;
            aVar2.l(13);
        }
        aVar2.m(100);
        aVar2.o(-1);
        aVar2.n(-1);
        aVar2.p(-1);
        aVar2.q(i12);
        aVar2.r(3);
        aVar2.t(0);
        cVarQ.n(aVar2);
        this.sampleDescriptionBox.n(cVarQ);
    }

    private final gr0.e o(gr0.e eVar) {
        eVar.l(64);
        eVar.m(5);
        eVar.j(1536);
        eVar.k(96000L);
        eVar.i(96000L);
        return eVar;
    }

    private final kr0.b p(kr0.b bVar, MediaFormat mediaFormat) {
        bVar.J(mediaFormat.getInteger("channel-count"));
        bVar.T(mediaFormat.getInteger("sample-rate"));
        bVar.C(1);
        bVar.b0(16);
        return bVar;
    }

    private final kr0.c q(kr0.c cVar, int i11, int i12) {
        cVar.C(1);
        cVar.e0(24);
        cVar.k0(1);
        cVar.r0(72.0d);
        cVar.s0(72.0d);
        cVar.t0(i11);
        cVar.n0(i12);
        cVar.c0("AVC Coding");
        return cVar;
    }

    public final void a(long offset, MediaCodec.BufferInfo bufferInfo) {
        s.k(bufferInfo, "bufferInfo");
        boolean z11 = (this.isAudio || (bufferInfo.flags & 1) == 0) ? false : true;
        this.samples.add(new Sample(offset, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z11 && linkedList != null) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = j11 - this.lastPresentationTimeUs;
        this.lastPresentationTimeUs = j11;
        long j13 = ((j12 * ((long) this.timeScale)) + 500000) / 1000000;
        if (!this.first) {
            ArrayList<Long> arrayList = this.sampleDurations;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j13));
            this.duration += j13;
        }
        this.first = false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public final ArrayList<Long> g() {
        return this.sampleDurations;
    }

    public final ArrayList<Sample> h() {
        return this.samples;
    }

    public final long[] i() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null) {
            return null;
        }
        s.h(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList<Integer> linkedList2 = this.syncSamples;
        s.h(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList<Integer> linkedList3 = this.syncSamples;
        s.h(linkedList3);
        int size = linkedList3.size();
        for (int i11 = 0; i11 < size; i11++) {
            LinkedList<Integer> linkedList4 = this.syncSamples;
            s.h(linkedList4);
            jArr[i11] = linkedList4.get(i11).intValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTimeScale() {
        return this.timeScale;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsAudio() {
        return this.isAudio;
    }
}
