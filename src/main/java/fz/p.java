package fz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableMap;
import gz.OutputFile;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfz/p;", "", "Lgz/e;", Action.FILE_ATTRIBUTE, "Lfz/w;", "videoCodec", "<init>", "(Lgz/e;Lfz/w;)V", "a", "Lgz/e;", "()Lgz/e;", "b", "Lfz/w;", "getVideoCodec", "()Lfz/w;", "c", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputFile file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w videoCodec;

    /* JADX INFO: renamed from: fz.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfz/p$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lfz/p;", "a", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Lfz/p;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(Context context, ReadableMap map) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(map, "map");
            File fileA = map.hasKey("path") ? gz.c.INSTANCE.a(map.getString("path")) : context.getCacheDir();
            x xVarA = map.hasKey("fileType") ? x.INSTANCE.a(map.getString("fileType")) : x.MOV;
            w wVarA = map.hasKey("videoCodec") ? w.INSTANCE.a(map.getString("videoCodec")) : w.H264;
            p013kotlin.jvm.internal.s.h(fileA);
            return new p(new OutputFile(context, fileA, xVarA.toExtension()), wVarA);
        }

        private Companion() {
        }
    }

    public p(OutputFile file, w videoCodec) {
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(videoCodec, "videoCodec");
        this.file = file;
        this.videoCodec = videoCodec;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OutputFile getFile() {
        return this.file;
    }
}
