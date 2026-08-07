package y00;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import hr0.j;
import hr0.k;
import hr0.l;
import hr0.m;
import hr0.n;
import hr0.p;
import hr0.q;
import hr0.r;
import hr0.t;
import hr0.u;
import hr0.w;
import hr0.x;
import hr0.y;
import hr0.z;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010 J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010 J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010 J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b&\u0010'J-\u00100\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u0010\n\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b\n\u00104J\r\u00105\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u0003R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u00107R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010AR\u0016\u0010E\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010DR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u0016\u0010K\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010J¨\u0006L"}, d2 = {"Ly00/b;", "", "<init>", "()V", "Ljn0/h0;", "n", "Lhr0/f;", "b", "()Lhr0/f;", "", "a", "o", "(JJ)J", "Ly00/d;", "mp4Movie", "p", "(Ly00/d;)J", "movie", "Lhr0/l;", DateTokenConverter.CONVERTER_KEY, "(Ly00/d;)Lhr0/l;", "Ly00/i;", "track", "Lhr0/x;", "l", "(Ly00/i;Ly00/d;)Lhr0/x;", "Lfr0/b;", "e", "(Ly00/i;)Lfr0/b;", "Lhr0/q;", "stbl", "h", "(Ly00/i;Lhr0/q;)V", "k", IntegerTokenConverter.CONVERTER_KEY, "g", "j", "f", "c", "(Ly00/d;)Ly00/b;", "", "trackIndex", "Ljava/nio/ByteBuffer;", "byteBuf", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "isAudio", "q", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Z)V", "Landroid/media/MediaFormat;", "mediaFormat", "(Landroid/media/MediaFormat;Z)I", "m", "Ly00/c;", "Ly00/c;", "mdat", "Ly00/d;", "currentMp4Movie", "Ljava/io/FileOutputStream;", "Ljava/io/FileOutputStream;", "fos", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "fc", "J", "dataOffset", "wroteSinceLastMdat", "Z", "writeNewMdat", "Ljava/util/HashMap;", "", "Ljava/util/HashMap;", "track2SampleSizes", "Ljava/nio/ByteBuffer;", "sizeBuffer", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c mdat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d currentMp4Movie;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FileOutputStream fos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private FileChannel fc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long dataOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long wroteSinceLastMdat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writeNewMdat = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HashMap<i, long[]> track2SampleSizes = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer sizeBuffer;

    private final hr0.f b() {
        return new hr0.f("isom", 0L, v.p("isom", "iso2", "mp41"));
    }

    private final l d(d movie) {
        l lVar = new l();
        m mVar = new m();
        mVar.y(new Date());
        mVar.B(new Date());
        mVar.A(lr0.d.f90682j);
        long jP = p(movie);
        Iterator<i> it = movie.e().iterator();
        s.j(it, "iterator(...)");
        long j11 = 0;
        while (it.hasNext()) {
            i next = it.next();
            s.j(next, "next(...)");
            i iVar = next;
            long duration = (iVar.getDuration() * jP) / ((long) iVar.getTimeScale());
            if (duration > j11) {
                j11 = duration;
            }
        }
        mVar.z(j11);
        mVar.D(jP);
        mVar.C(movie.e().size() + 1);
        lVar.n(mVar);
        Iterator<i> it2 = movie.e().iterator();
        s.j(it2, "iterator(...)");
        while (it2.hasNext()) {
            i next2 = it2.next();
            s.j(next2, "next(...)");
            lVar.n(l(next2, movie));
        }
        return lVar;
    }

    private final fr0.b e(i track) {
        q qVar = new q();
        h(track, qVar);
        k(track, qVar);
        i(track, qVar);
        g(track, qVar);
        j(track, qVar);
        f(track, qVar);
        return qVar;
    }

    private final void f(i track, q stbl) {
        ArrayList arrayList = new ArrayList();
        Iterator<Sample> it = track.h().iterator();
        s.j(it, "iterator(...)");
        long size = -1;
        while (it.hasNext()) {
            Sample next = it.next();
            s.j(next, "next(...)");
            Sample sample = next;
            long offset = sample.getOffset();
            if (size != -1 && size != offset) {
                size = -1;
            }
            if (size == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            size = sample.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = arrayList.get(i11);
            s.j(obj, "get(...)");
            jArr[i11] = ((Number) obj).longValue();
        }
        t tVar = new t();
        tVar.s(jArr);
        stbl.n(tVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0053  */
    private final void g(i track, q stbl) {
        r rVar = new r();
        rVar.s(new LinkedList());
        int size = track.h().size();
        int i11 = -1;
        int i12 = 1;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Sample sample = track.h().get(i14);
            s.j(sample, "get(...)");
            Sample sample2 = sample;
            long offset = sample2.getOffset() + sample2.getSize();
            i13++;
            if (i14 != size - 1) {
                Sample sample3 = track.h().get(i14 + 1);
                s.j(sample3, "get(...)");
                if (offset != sample3.getOffset()) {
                    if (i11 != i13) {
                        rVar.r().add(new r.a(i12, i13, 1L));
                        i11 = i13;
                    }
                    i12++;
                    i13 = 0;
                }
            } else {
                if (i11 != i13) {
                    rVar.r().add(new r.a(i12, i13, 1L));
                    i11 = i13;
                }
                i12++;
                i13 = 0;
            }
        }
        stbl.n(rVar);
    }

    private final void h(i track, q stbl) {
        stbl.n(track.getSampleDescriptionBox());
    }

    private final void i(i track, q stbl) {
        long[] jArrI = track.i();
        if (jArrI != null) {
            if (jArrI.length == 0) {
                return;
            }
            hr0.v vVar = new hr0.v();
            vVar.r(jArrI);
            stbl.n(vVar);
        }
    }

    private final void j(i track, q stbl) {
        p pVar = new p();
        pVar.t(this.track2SampleSizes.get(track));
        stbl.n(pVar);
    }

    private final void k(i track, q stbl) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = track.g().iterator();
        s.j(it, "iterator(...)");
        w.a aVar = null;
        while (it.hasNext()) {
            Long next = it.next();
            s.j(next, "next(...)");
            long jLongValue = next.longValue();
            if (aVar == null || aVar.b() != jLongValue) {
                aVar = new w.a(1L, jLongValue);
                arrayList.add(aVar);
            } else {
                aVar.c(aVar.a() + 1);
            }
        }
        w wVar = new w();
        wVar.r(arrayList);
        stbl.n(wVar);
    }

    private final x l(i track, d movie) {
        x xVar = new x();
        y yVar = new y();
        yVar.D(true);
        yVar.G(true);
        yVar.F(true);
        yVar.I(track.getIsAudio() ? lr0.d.f90682j : movie.getMatrix());
        yVar.A(0);
        yVar.B(track.getCreationTime());
        yVar.C((track.getDuration() * p(movie)) / ((long) track.getTimeScale()));
        yVar.E(track.getHeight());
        yVar.M(track.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
        yVar.H(0);
        yVar.J(new Date());
        yVar.K(track.getTrackId() + 1);
        yVar.L(track.getVolume());
        xVar.n(yVar);
        hr0.i iVar = new hr0.i();
        xVar.n(iVar);
        j jVar = new j();
        jVar.w(track.getCreationTime());
        jVar.x(track.getDuration());
        jVar.z(track.getTimeScale());
        jVar.y("eng");
        iVar.n(jVar);
        hr0.g gVar = new hr0.g();
        gVar.u(track.getIsAudio() ? "SoundHandle" : "VideoHandle");
        gVar.t(track.getHandler());
        iVar.n(gVar);
        k kVar = new k();
        if (s.f(track.getHandler(), "vide")) {
            kVar.n(new z());
        } else if (s.f(track.getHandler(), "soun")) {
            kVar.n(new hr0.s());
        } else if (s.f(track.getHandler(), "text")) {
            kVar.n(new n());
        } else if (s.f(track.getHandler(), "subt")) {
            kVar.n(new u());
        } else if (s.f(track.getHandler(), "hint")) {
            kVar.n(new hr0.h());
        } else if (s.f(track.getHandler(), "sbtl")) {
            kVar.n(new n());
        }
        hr0.d dVar = new hr0.d();
        hr0.e eVar = new hr0.e();
        dVar.n(eVar);
        hr0.c cVar = new hr0.c();
        cVar.o(1);
        eVar.n(cVar);
        kVar.n(dVar);
        kVar.n(e(track));
        iVar.n(kVar);
        return xVar;
    }

    private final void n() throws IOException {
        FileChannel fileChannel = this.fc;
        FileOutputStream fileOutputStream = null;
        if (fileChannel == null) {
            s.B("fc");
            fileChannel = null;
        }
        long jPosition = fileChannel.position();
        FileChannel fileChannel2 = this.fc;
        if (fileChannel2 == null) {
            s.B("fc");
            fileChannel2 = null;
        }
        c cVar = this.mdat;
        if (cVar == null) {
            s.B("mdat");
            cVar = null;
        }
        fileChannel2.position(cVar.getDataOffset());
        c cVar2 = this.mdat;
        if (cVar2 == null) {
            s.B("mdat");
            cVar2 = null;
        }
        FileChannel fileChannel3 = this.fc;
        if (fileChannel3 == null) {
            s.B("fc");
            fileChannel3 = null;
        }
        cVar2.c(fileChannel3);
        FileChannel fileChannel4 = this.fc;
        if (fileChannel4 == null) {
            s.B("fc");
            fileChannel4 = null;
        }
        fileChannel4.position(jPosition);
        c cVar3 = this.mdat;
        if (cVar3 == null) {
            s.B("mdat");
            cVar3 = null;
        }
        cVar3.f(0L);
        c cVar4 = this.mdat;
        if (cVar4 == null) {
            s.B("mdat");
            cVar4 = null;
        }
        cVar4.e(0L);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            s.B("fos");
        } else {
            fileOutputStream = fileOutputStream2;
        }
        fileOutputStream.flush();
    }

    private final long o(long a11, long b11) {
        return b11 == 0 ? a11 : o(b11, a11 % b11);
    }

    private final long p(d mp4Movie) {
        long timeScale = !mp4Movie.e().isEmpty() ? mp4Movie.e().iterator().next().getTimeScale() : 0L;
        Iterator<i> it = mp4Movie.e().iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            i next = it.next();
            s.j(next, "next(...)");
            timeScale = o(next.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public final int a(MediaFormat mediaFormat, boolean isAudio) {
        s.k(mediaFormat, "mediaFormat");
        d dVar = this.currentMp4Movie;
        if (dVar == null) {
            s.B("currentMp4Movie");
            dVar = null;
        }
        return dVar.b(mediaFormat, isAudio);
    }

    public final b c(d mp4Movie) throws IOException {
        s.k(mp4Movie, "mp4Movie");
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        hr0.f fVarB = b();
        FileChannel fileChannel = this.fc;
        if (fileChannel == null) {
            s.B("fc");
            fileChannel = null;
        }
        fVarB.c(fileChannel);
        long size = this.dataOffset + fVarB.getSize();
        this.dataOffset = size;
        this.wroteSinceLastMdat = size;
        this.mdat = new c();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public final void m() throws IOException {
        c cVar = this.mdat;
        FileOutputStream fileOutputStream = null;
        if (cVar == null) {
            s.B("mdat");
            cVar = null;
        }
        if (cVar.getContentSize() != 0) {
            n();
        }
        d dVar = this.currentMp4Movie;
        if (dVar == null) {
            s.B("currentMp4Movie");
            dVar = null;
        }
        Iterator<i> it = dVar.e().iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            i next = it.next();
            s.j(next, "next(...)");
            i iVar = next;
            ArrayList<Sample> arrayListH = iVar.h();
            int size = arrayListH.size();
            long[] jArr = new long[size];
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = arrayListH.get(i11).getSize();
            }
            this.track2SampleSizes.put(iVar, jArr);
        }
        d dVar2 = this.currentMp4Movie;
        if (dVar2 == null) {
            s.B("currentMp4Movie");
            dVar2 = null;
        }
        l lVarD = d(dVar2);
        FileChannel fileChannel = this.fc;
        if (fileChannel == null) {
            s.B("fc");
            fileChannel = null;
        }
        lVarD.c(fileChannel);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            s.B("fos");
            fileOutputStream2 = null;
        }
        fileOutputStream2.flush();
        FileChannel fileChannel2 = this.fc;
        if (fileChannel2 == null) {
            s.B("fc");
            fileChannel2 = null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream3 = this.fos;
        if (fileOutputStream3 == null) {
            s.B("fos");
        } else {
            fileOutputStream = fileOutputStream3;
        }
        fileOutputStream.close();
    }

    public final void q(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean isAudio) throws IOException {
        boolean z11;
        s.k(byteBuf, "byteBuf");
        s.k(bufferInfo, "bufferInfo");
        FileOutputStream fileOutputStream = null;
        if (this.writeNewMdat) {
            c cVar = this.mdat;
            if (cVar == null) {
                s.B("mdat");
                cVar = null;
            }
            cVar.e(0L);
            FileChannel fileChannel = this.fc;
            if (fileChannel == null) {
                s.B("fc");
                fileChannel = null;
            }
            cVar.c(fileChannel);
            cVar.f(this.dataOffset);
            long j11 = 16;
            this.dataOffset += j11;
            this.wroteSinceLastMdat += j11;
            this.writeNewMdat = false;
        }
        c cVar2 = this.mdat;
        if (cVar2 == null) {
            s.B("mdat");
            cVar2 = null;
        }
        c cVar3 = this.mdat;
        if (cVar3 == null) {
            s.B("mdat");
            cVar3 = null;
        }
        cVar2.e(cVar3.getContentSize() + ((long) bufferInfo.size));
        long j12 = this.wroteSinceLastMdat + ((long) bufferInfo.size);
        this.wroteSinceLastMdat = j12;
        if (j12 >= 32768) {
            n();
            z11 = true;
            this.writeNewMdat = true;
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        d dVar = this.currentMp4Movie;
        if (dVar == null) {
            s.B("currentMp4Movie");
            dVar = null;
        }
        dVar.a(trackIndex, this.dataOffset, bufferInfo);
        if (isAudio) {
            byteBuf.position(bufferInfo.offset);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        } else {
            byteBuf.position(bufferInfo.offset + 4);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer = this.sizeBuffer;
            if (byteBuffer == null) {
                s.B("sizeBuffer");
                byteBuffer = null;
            }
            byteBuffer.position(0);
            ByteBuffer byteBuffer2 = this.sizeBuffer;
            if (byteBuffer2 == null) {
                s.B("sizeBuffer");
                byteBuffer2 = null;
            }
            byteBuffer2.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer3 = this.sizeBuffer;
            if (byteBuffer3 == null) {
                s.B("sizeBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.position(0);
            FileChannel fileChannel2 = this.fc;
            if (fileChannel2 == null) {
                s.B("fc");
                fileChannel2 = null;
            }
            ByteBuffer byteBuffer4 = this.sizeBuffer;
            if (byteBuffer4 == null) {
                s.B("sizeBuffer");
                byteBuffer4 = null;
            }
            fileChannel2.write(byteBuffer4);
        }
        FileChannel fileChannel3 = this.fc;
        if (fileChannel3 == null) {
            s.B("fc");
            fileChannel3 = null;
        }
        fileChannel3.write(byteBuf);
        this.dataOffset += (long) bufferInfo.size;
        if (z11) {
            FileOutputStream fileOutputStream2 = this.fos;
            if (fileOutputStream2 == null) {
                s.B("fos");
            } else {
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.flush();
        }
    }
}
