package y00;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u001e\u0010%\u001a\n #*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(¨\u0006*"}, d2 = {"Ly00/d;", "", "<init>", "()V", "Llr0/d;", DateTokenConverter.CONVERTER_KEY, "()Llr0/d;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljn0/h0;", "f", "(Ljava/io/File;)V", "", "angle", "g", "(I)V", "Ljava/util/ArrayList;", "Ly00/i;", "e", "()Ljava/util/ArrayList;", "c", "()Ljava/io/File;", "trackIndex", "", "offset", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "a", "(IJLandroid/media/MediaCodec$BufferInfo;)V", "Landroid/media/MediaFormat;", "mediaFormat", "", "isAudio", "b", "(Landroid/media/MediaFormat;Z)I", "kotlin.jvm.PlatformType", "Llr0/d;", "matrix", "Ljava/util/ArrayList;", "tracks", "Ljava/io/File;", "cacheFile", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private lr0.d matrix = lr0.d.f90682j;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<i> tracks = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private File cacheFile;

    public final void a(int trackIndex, long offset, MediaCodec.BufferInfo bufferInfo) {
        s.k(bufferInfo, "bufferInfo");
        if (trackIndex < 0 || trackIndex >= this.tracks.size()) {
            return;
        }
        i iVar = this.tracks.get(trackIndex);
        s.j(iVar, "get(...)");
        iVar.a(offset, bufferInfo);
    }

    public final int b(MediaFormat mediaFormat, boolean isAudio) {
        s.k(mediaFormat, "mediaFormat");
        ArrayList<i> arrayList = this.tracks;
        arrayList.add(new i(arrayList.size(), mediaFormat, isAudio));
        return this.tracks.size() - 1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final File getCacheFile() {
        return this.cacheFile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lr0.d getMatrix() {
        return this.matrix;
    }

    public final ArrayList<i> e() {
        return this.tracks;
    }

    public final void f(File file) {
        s.k(file, "file");
        this.cacheFile = file;
    }

    public final void g(int angle) {
        if (angle == 0) {
            this.matrix = lr0.d.f90682j;
            return;
        }
        if (angle == 90) {
            this.matrix = lr0.d.f90683k;
        } else if (angle == 180) {
            this.matrix = lr0.d.f90684l;
        } else {
            if (angle != 270) {
                return;
            }
            this.matrix = lr0.d.f90685m;
        }
    }
}
