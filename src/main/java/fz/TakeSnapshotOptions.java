package fz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableMap;
import gz.OutputFile;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fz.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0017"}, d2 = {"Lfz/t;", "", "Lgz/e;", Action.FILE_ATTRIBUTE, "", "quality", "<init>", "(Lgz/e;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz/e;", "()Lgz/e;", "b", "I", "c", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TakeSnapshotOptions {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OutputFile file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quality;

    /* JADX INFO: renamed from: fz.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfz/t$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lfz/t;", "a", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Lfz/t;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TakeSnapshotOptions a(Context context, ReadableMap map) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(map, "map");
            int i11 = map.hasKey("quality") ? map.getInt("quality") : 100;
            File fileA = map.hasKey("path") ? gz.c.INSTANCE.a(map.getString("path")) : context.getCacheDir();
            p013kotlin.jvm.internal.s.h(fileA);
            return new TakeSnapshotOptions(new OutputFile(context, fileA, ".jpg"), i11);
        }

        private Companion() {
        }
    }

    public TakeSnapshotOptions(OutputFile file, int i11) {
        p013kotlin.jvm.internal.s.k(file, "file");
        this.file = file;
        this.quality = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OutputFile getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TakeSnapshotOptions)) {
            return false;
        }
        TakeSnapshotOptions takeSnapshotOptions = (TakeSnapshotOptions) other;
        return p013kotlin.jvm.internal.s.f(this.file, takeSnapshotOptions.file) && this.quality == takeSnapshotOptions.quality;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + Integer.hashCode(this.quality);
    }

    public String toString() {
        return "TakeSnapshotOptions(file=" + this.file + ", quality=" + this.quality + ")";
    }
}
